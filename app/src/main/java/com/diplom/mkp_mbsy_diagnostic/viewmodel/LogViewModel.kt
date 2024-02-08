package com.diplom.mkp_mbsy_diagnostic.viewmodel

import android.content.Context
import android.net.Uri
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.diplom.mkp_mbsy_diagnostic.utils.MSSLog.MsgFromLog
import dagger.hilt.android.lifecycle.HiltViewModel
import java.math.BigInteger
import javax.inject.Inject

@HiltViewModel
class LogViewModel @Inject constructor() : ViewModel() {

    val data = MutableLiveData<List<MsgFromLog>>()
    var libName = ""

    override fun onCleared() {
        super.onCleared()
        data.value = emptyList()
    }

    fun find4BytesInArray(target: ByteArray, element: ByteArray, startPos: Int): Int {
        for (index in target.indices) {
            if (index >= startPos) {
                if (element[0] == target[index] && element[1] == target[index + 1] && element[2] == target[index + 2] && element[3] == target[index + 3]) {
                    return index
                }
            }
        }
        return -1
    }

    fun extractRecords(fileBytes: ByteArray) {
        val readed = ArrayList<MsgFromLog>()
        var startIndex = 295
        var count_read = 0
        var shift = 0
        data.value = emptyList()
        
        val fileheader = fileBytes.copyOfRange(fileBytes.indexOf('C'.code.toByte()), startIndex)
        libName = fileheader.copyOfRange(0, fileheader.indexOf(0)).toString(Charsets.UTF_8)

        while (startIndex < fileBytes.size) {
            val babIndex =
                find4BytesInArray(fileBytes, byteArrayOf(0x42, 0x41, 0x42, 0x00), startIndex)
            if (babIndex == -1) {
                break
            }

            val dedIndex =
                find4BytesInArray(fileBytes, byteArrayOf(0x44, 0x45, 0x44, 0x00), babIndex)
            if (dedIndex == -1) {
                break
            }

            val header = fileBytes.copyOfRange(babIndex + 4, dedIndex)

            val nextBabIndex =
                find4BytesInArray(fileBytes, byteArrayOf(0x42, 0x41, 0x42, 0x00), dedIndex + shift)
            val bodyEndIndex = if (nextBabIndex != -1) nextBabIndex else fileBytes.size

            val body = fileBytes.copyOfRange(dedIndex + 4, bodyEndIndex)

            readed.add(
                MsgFromLog(
                    pos = count_read,
                    ID = ((header[1].toUByte().toInt() shl 8) or header[0].toUByte().toInt()).toUInt(),
                    size = header[4].toInt(),
                    date_time = "${header[14].toInt()}.${header[10].toInt()}.${BigInteger(byteArrayOf(header[9], header[8])).toInt()}  ${header[16]}:${header[18]}:${header[20]}.${BigInteger(byteArrayOf(header[23], header[22])).toInt()}",
                    incoming_message = header[header.size - 1],
                    msg_data = body
                )
            )
            data.value = readed

            startIndex = bodyEndIndex
            shift = body.size + 4
            count_read += 1
        }
    }

    fun onFilePathsListChange(context: Context, uri: Uri) {
        val input = context.contentResolver.openInputStream(uri)
        if (input != null) {
            val bytes = input.readBytes()
            input.close()
            data.value = emptyList()
            extractRecords(bytes)
        }
    }
}