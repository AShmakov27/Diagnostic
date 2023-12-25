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
        var startIndex = 0
        var count_read = 0
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
                find4BytesInArray(fileBytes, byteArrayOf(0x42, 0x41, 0x42, 0x00), dedIndex)
            val bodyEndIndex = if (nextBabIndex != -1) nextBabIndex else fileBytes.size

            val body = fileBytes.copyOfRange(dedIndex + 4, bodyEndIndex)
            val year = BigInteger(byteArrayOf(header[9], header[8])).toInt()
            val moth = header[10].toInt()
            val day = header[14].toInt()
            val hour = header[16]
            val minute = header[18]
            val second = header[20]
            val nano = BigInteger(byteArrayOf(header[23], header[22])).toInt()
            val date = "${day}.${moth}.${year}  ${hour}:${minute}:${second}.${nano}"
            readed.add(
                MsgFromLog(
                    pos = count_read,
                    ID = header[0].toUInt(),
                    size = header[4].toInt(),
                    date_time = date,
                    incoming_message = header[header.size - 1],
                    msg_data = body
                )
            )
            data.value = readed

            startIndex = bodyEndIndex
            count_read += 1
        }
    }

    fun onFilePathsListChange(context: Context, uri: Uri) {
        val input = context.contentResolver.openInputStream(uri)
        if (input != null) {
            val bytes = input.readBytes()
            extractRecords(bytes)
            input.close()
        }
    }
}