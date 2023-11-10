package com.diplom.mkp_mbsy_diagnostic.viewmodel

import android.content.Context
import android.util.Log
import android.widget.Toast
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.diplom.mkp_mbsy_diagnostic.data.UsbCommunicationRepository
import com.diplom.mkp_mbsy_diagnostic.data.usb.Message_16
import com.diplom.mkp_mbsy_diagnostic.utils.byteArrayToMessage_16
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class TestViewModel @Inject constructor(
    private val usbCommunicationRepository: UsbCommunicationRepository
) : ViewModel() {

    var data_parsed: Message_16? = null
    var connected = false

    init {
        viewModelScope.launch {

        }
    }

    override fun onCleared() {
        super.onCleared()
        if (connected) {
            closeUsbConnection()
        }
    }

    fun TestReading(context: Context) {
        if (initializeUsbDevice(0x1A86, 5678)) {
            connected = true
            Log.d("Connection", "Device connected")
            Toast.makeText(context, "Передатчик подключен", Toast.LENGTH_SHORT).show()
            val bufferSize = 1024
            val received = readDataFromUsb(bufferSize)
            data_parsed = byteArrayToMessage_16(received)
            Log.d("Reading", "Message received")
            Toast.makeText(context, "Сообщение прочитано", Toast.LENGTH_SHORT).show()
        } else {
            connected = false
            Log.d("Connection", "Device not connected")
            Toast.makeText(context, "Передатчик не подключен", Toast.LENGTH_SHORT).show()
        }
    }

    fun initializeUsbDevice(vendorId: Int, productId: Int): Boolean {
        return usbCommunicationRepository.initializeUsbDevice(vendorId, productId)
    }

    fun readDataFromUsb(bufferSize: Int): ByteArray {
        val data = usbCommunicationRepository.readDataFromUSB(bufferSize)
        return data
    }

    fun closeUsbConnection() {
        usbCommunicationRepository.closeUSBConnection()
        Log.d("Connection", "Connection closed")
    }
}