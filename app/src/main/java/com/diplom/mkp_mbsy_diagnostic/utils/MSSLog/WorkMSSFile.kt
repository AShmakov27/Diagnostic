package com.diplom.mkp_mbsy_diagnostic.utils.MSSLog

import android.content.Context
import android.util.Log
import java.io.ByteArrayOutputStream
import java.io.File
import java.io.FileWriter
import java.io.ObjectOutputStream
import java.io.Serializable
import java.time.LocalDateTime

class structLabelFile: Serializable {
    var mss: String = "MSS"
    var libfilename: String = ""
    var mainversion: Int = 0
    var smversion: Int = 0
    var mssdata: String = "MSSDATA"
}

class structLabelMessage: Serializable {
    var baba: String = "BAB"
    var ID: UInt = 0u
    var size: Int = 0
    var date_time = LocalDateTime.now()
    var incoming_message: Byte = 0
    var deda: String = "DED"
}

class WorkMSSFile {
    enum class flags(val value: Byte) {
        emClose(10),
        emOPEN(11),
        emWRITE(21),
        emREAD(22),
        Zero(0)
    }

    var sFullname: String = ""
    var file: File? = null
    var open_close: flags = flags.emClose
    var write_read: flags = flags.Zero

    fun Write(id: UInt, size: Int, incoming_message: Byte, data: ByteArray): Boolean {
        if (open_close == flags.emClose) {
            return false
        }
        if (write_read == flags.emWRITE) {
            try {
                val labelMessage = structLabelMessage()
                labelMessage.ID = id
                labelMessage.size = size
                labelMessage.incoming_message = incoming_message
                val labelByteArray = LabelMessageToByteArray(labelMessage)
                val writer = FileWriter(file)
                writer.append(labelByteArray.toString())
                writer.append(data.toString())
                writer.flush()
                writer.close()
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
        val dir = File(context.filesDir, "MSSlog")
        if (open_close == flags.emClose) {
            val labelFile = structLabelFile()
            labelFile.libfilename = libfilename
            labelFile.mainversion = mainversion
            labelFile.smversion = smversion
            if (!dir.exists()) {
                dir.mkdir()
                Log.d("MSSLog", "Dir created")
            }
            val date_time = LocalDateTime.now()
            sFullname = "MSSlog_${date_time.year}_${date_time.month}_${date_time.dayOfMonth}-${date_time.hour}-${date_time.minute}-${date_time.second}.mss"
            file = File(dir, sFullname)
            open_close = flags.emOPEN
            write_read = flags.emWRITE
            val labelByteArray = LabelFileToByteArray(labelFile)
            val writer = FileWriter(file)
            writer.append(labelByteArray.toString())
            writer.flush()
            writer.close()
            Log.d("MSSLog", "File label added to MSS")
            return true
        }
        return false
    }

    fun Close() {
        if (open_close == flags.emOPEN) {
            open_close = flags.emClose
            file = null
        }
    }

    fun LabelMessageToByteArray(obj: structLabelMessage): ByteArray {
        val byteArrayOutputStream = ByteArrayOutputStream()
        val objectOutputStream = ObjectOutputStream(byteArrayOutputStream)
        objectOutputStream.writeObject(obj)
        objectOutputStream.flush()
        return byteArrayOutputStream.toByteArray()
    }

    fun LabelFileToByteArray(obj: structLabelFile): ByteArray {
        val byteArrayOutputStream = ByteArrayOutputStream()
        val objectOutputStream = ObjectOutputStream(byteArrayOutputStream)
        objectOutputStream.writeObject(obj)
        objectOutputStream.flush()
        return byteArrayOutputStream.toByteArray()
    }
}