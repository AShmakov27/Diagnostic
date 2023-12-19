package com.diplom.mkp_mbsy_diagnostic.utils.MSSLog

import android.os.Environment
import android.util.Log
import com.diplom.mkp_mbsy_diagnostic.utils.DateTimetoByteArray
import java.io.File
import java.io.FileOutputStream
import java.time.LocalDateTime
import java.time.ZoneId

class structLabelFile {
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

class structLabelMessage {
    var baba:CharArray = CharArray(4)
    var ID: UInt = 0u
    var size: Int = 0
    var date_time = LocalDateTime.now(ZoneId.systemDefault())
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
                file!!.appendBytes(DateTimetoByteArray(labelMessage.date_time))
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

    fun Open(libfilename: String, mainversion: Int, smversion: Int): Boolean {
        val dir = File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOCUMENTS), "MBSY_MKPDiagnostic/MSSlog")
        if (open_close == emClose) {
            if (!dir.exists()) {
                dir.mkdirs()
                Log.d("MSSLog", "Dir created")
            }

            val labelFile = structLabelFile()
            libfilename.toCharArray(labelFile.libfilename)
            labelFile.mainversion = mainversion.toULong()
            labelFile.smversion = smversion.toULong()

            val date_time = LocalDateTime.now(ZoneId.systemDefault())
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