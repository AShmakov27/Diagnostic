package com.diplom.mkp_mbsy_diagnostic.utils.MSSLog

import android.content.Context
import android.os.Environment
import android.util.Log
import java.io.File
import java.io.FileOutputStream
import java.io.Serializable
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

class structLabelFile: Serializable {
    var mss: CharArray = CharArray(16)
    var libfilename: CharArray = CharArray(255)
    var mainversion: ULong = 0u
    var smversion: ULong = 0u
    var mssdata: CharArray = CharArray(16)

    init {
        "MSS".toCharArray(mss)
        "MMMMMMMMMMMM".toCharArray(mss, 4)
        "MSSDATA".toCharArray(mssdata)
        "MMMMMMMM".toCharArray(mssdata, 8)
    }
}

class structLabelMessage: Serializable {
    var baba:CharArray = CharArray(4)
    var ID: UInt = 0u
    var size: Int = 0
    val formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")
    var date_time = LocalDateTime.now().withNano(0).format(formatter)
    var incoming_message: Byte = 0
    var deda:CharArray = CharArray(4)

    init {
        "BAB".toCharArray(baba)
        "DED".toCharArray(deda)
    }
}

class WorkMSSFile {
    val emClose: Byte = 10
    val emOPEN: Byte = 11
    val emWRITE: Byte = 21
    val emREAD: Byte = 22

    var sFullname: String = ""
    var file: File? = null
    var open_close: Byte = emClose
    var write_read: Byte = 0

    fun Write(id: UInt, size: Int, incoming_message: Byte, data: ByteArray): Boolean {
        if (open_close == emClose) {
            return false
        }
        if (write_read == emWRITE) {
            try {
                val labelMessage = structLabelMessage()
                labelMessage.ID = id
                labelMessage.size = size
                labelMessage.incoming_message = incoming_message

                val messIDSIZEByteArray = ByteArray(8)
                messIDSIZEByteArray[0] = labelMessage.ID.toByte()
                messIDSIZEByteArray[4] = labelMessage.size.toByte()
                val messTypeByteArray = ByteArray(1)
                messTypeByteArray[0] = labelMessage.incoming_message

                file!!.appendBytes(labelMessage.baba.joinToString("").toByteArray())
                file!!.appendBytes(messIDSIZEByteArray)
                file!!.appendBytes(labelMessage.date_time.toString().toByteArray())
                file!!.appendBytes(messTypeByteArray)
                file!!.appendBytes(labelMessage.deda.joinToString("").toByteArray())
                file!!.appendBytes(data)

                Log.d("MSSLog", "Message label and data Added to MSS")
                return true
            } catch (e: Exception) {
                Log.e("MSSLog", "${e}")
                return false
            }
        }
        return false
    }

    fun Open(context: Context, libfilename: String, mainversion: Int, smversion: Int): Boolean {
        val dir = File(context.getExternalFilesDir(null), "MBSY_MKPDiagnostic/MSSlog")
        if (open_close == emClose) {
            if (!dir.exists()) {
                dir.mkdirs()
                Log.d("MSSLog", "Dir created")
            }

            val labelFile = structLabelFile()
            libfilename.toCharArray(labelFile.libfilename)
            labelFile.mainversion = mainversion.toULong()
            labelFile.smversion = smversion.toULong()

            val date_time = LocalDateTime.now()
            sFullname = "MSSlog_${date_time.year}_${date_time.month}_${date_time.dayOfMonth}-${date_time.hour}-${date_time.minute}-${date_time.second}.mss"
            file = File(dir, sFullname)
            open_close = emOPEN
            write_read = emWRITE

            val versionByteArray = ByteArray(8)
            versionByteArray[0] = labelFile.mainversion.toByte()
            versionByteArray[4] = labelFile.smversion.toByte()

            val writer = FileOutputStream(file)
            writer.write(labelFile.mss.joinToString("").toByteArray())
            writer.write(labelFile.libfilename.joinToString("").toByteArray())
            writer.write(versionByteArray)
            writer.write(labelFile.mssdata.joinToString("").toByteArray())
            writer.flush()
            writer.close()
            Log.d("MSSLog", "File label added to MSS")
            return true
        }
        return false
    }

    fun Close() {
        if (open_close == emOPEN) {
            open_close = emClose
            file = null
        }
    }
}

/*
struct structLabelFile
{
	char mss[16];
	char libfilename[255];
	DWORD version;
	DWORD smversion;
	char mssdata[16];

	structLabelFile() : version(0), smversion(0)
	{
		sprintf(mss, "MSS");
		memset(libfilename, 0, 255);
		sprintf(mssdata, "MSSDATA");
	}
};

struct structLabelMessage
{
	char baba[4];
    UINT ID;
    int Size;				// размера сообщения в байтах
    SYSTEMTIME date_time;
    BYTE incoming_message;	// 0-входящее, 1 - исходящее
	char deda[4];

	structLabelMessage() : ID(0), Size(0), incoming_message(0)
    {
		sprintf(baba, "BAB");
		memset(&date_time, 0, sizeof(SYSTEMTIME));
		sprintf(deda, "DED");
    }
};

class POLIGON_RESOURCE_API TMssFile
{
private:
    enum {emCLOSE = 10, emOPEN = 11, emWRITE = 21, emREAD = 22};
    //WORD firstWord;
    FILE *file;
    char sFullname[1024];
    BYTE open_close;
    BYTE write_read;
	DWORD GetStartupDirectory(LPCH lpBuffer, DWORD nSize);
	CRITICAL_SECTION write_section;

public:
	TMssFile();
	~TMssFile();
	bool __fastcall Write(const UINT _id, const int _size, BYTE _incoming_message, BYTE *_data);
	bool __fastcall Open(const char *_filedir, const char *filename, const char *libfilename, DWORD version, DWORD smversion );	//Если _filedir = NULL, то файл создается в директории с исполняемым файлом.
																																//Если _filedir = "INFILENAME", то имя файла уже содержит требуемую директорию
	//bool __fastcall Open ( const char *filename );
	void __fastcall Close();
};

TMssFile::TMssFile() : file(NULL), open_close(emCLOSE), write_read(0)
{
	memset(sFullname, 0, 1024);
}

TMssFile::~TMssFile()
{
	Close( );
}

bool __fastcall TMssFile::Open(const char *_filedir, const char *_filename, const char *libfilename, DWORD version, DWORD smversion)
{
	if (open_close == emCLOSE)
	{
		InitializeCriticalSection(&write_section);
		//char sOutBuf[4096];
		struct structLabelFile strLFile;
		SYSTEMTIME st;
		GetLocalTime(&st);
		char strdir[1024] = {0};
		char strname[1024] = {0};
		size_t len = 0;

		//Формируем имя MSS-файла
		if(_filedir)
			len = ::strlen(_filedir);
		if(!len)
			GetStartupDirectory(strdir, 1024);
		else if(::strcmp(_filedir, "INFILENAME"))
			strcpy(strdir, _filedir);

		len = 0;
		if(_filename)
			len = ::strlen(_filename);
		if(!len)
			GetStartupDirectory(strname, 1024);
		else
			strcpy(strname, _filename);

		sprintf( sFullname, "%s%s_%04d%02d%02d_%02d-%02d-%02d.mss", strdir, strname, st.wYear, st.wMonth, st.wDay, st.wHour, st.wMinute, st.wSecond );

		file = fopen( sFullname, "wb" ); //a+b
		if ( file == NULL ) return false;
		open_close = emOPEN;
		write_read = emWRITE;
		//setbuf(file, sOutBuf);

		//Пишем метку файла
		strcpy(strLFile.libfilename, libfilename);
		strLFile.version = version;
		strLFile.smversion = smversion;
		fwrite( &strLFile, sizeof( strLFile ), 1, file );
		//fflush(file);
	}

	return true;
}

void __fastcall TMssFile::Close( )
{
    if ( open_close == emOPEN ) {
		DeleteCriticalSection(&write_section);
        open_close = emCLOSE;
        fclose( file );
		file = NULL;
    }
}

bool __fastcall TMssFile::Write( const UINT _id, const int _size, BYTE _incoming_message, BYTE *_data )
{
    if(open_close == emCLOSE) return false;
	if(file == NULL) return false;

	if(write_read == emWRITE) {
		EnterCriticalSection(&write_section);
		structLabelMessage labelmess;
		labelmess.ID = _id;
		labelmess.Size = _size;
		GetLocalTime(&labelmess.date_time);
        labelmess.incoming_message	= _incoming_message;
		fwrite( &labelmess, sizeof( labelmess ), 1, file );
		fwrite( _data, sizeof( BYTE ), _size, file );
		LeaveCriticalSection(&write_section);
		//fflush(file);
		return true;
	}

	return false;
}

DWORD TMssFile::GetStartupDirectory(LPCH lpBuffer, DWORD nSize)
{
	DWORD res = 0;
	char *FileName = new char[nSize];
	char *cdev = new char[nSize];
	char *cpatch = new char[nSize];

	memset(FileName, 0, nSize);
	memset(cdev, 0, nSize);
	memset(cpatch, 0, nSize);

	//Получаем полное имя exe-шника
	DWORD dwRes = GetModuleFileName(NULL, FileName, nSize);
	if (dwRes < nSize){
		//Расчленяем полное имя
		::_splitpath(FileName, cdev, cpatch, NULL, NULL);
		sprintf(lpBuffer, "%s%s", cdev, cpatch);
		res = dwRes;
	}

	delete[] FileName;
	delete[] cdev;
	delete[] cpatch;
	return res;
}
*/