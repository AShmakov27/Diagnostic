package com.diplom.mkp_mbsy_diagnostic.viewmodel

import android.content.Context
import android.hardware.usb.UsbDevice
import android.util.Log
import android.widget.Toast
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.diplom.mkp_mbsy_diagnostic.data.UsbCommunicationRepository
import com.diplom.mkp_mbsy_diagnostic.data.usb.Header
import com.diplom.mkp_mbsy_diagnostic.utils.byteArrayToHeader
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class TestViewModel @Inject constructor(
    private val usbCommunicationRepository: UsbCommunicationRepository
) : ViewModel() {

    val messages = ArrayList<Header>()
    val data_list = MutableLiveData<List<Header>>()

    var connected = false

    override fun onCleared() {
        super.onCleared()
        if (connected) {
            disconnect()
        }
    }

    fun initializeUsbDevice() = usbCommunicationRepository.initializeUsbDevice()

    fun disconnect() = usbCommunicationRepository.disconnect()

    fun getGrantedDevice() = usbCommunicationRepository.getGrantedDevice()

    fun openDeviceAndPort(device: UsbDevice) = viewModelScope.launch {
        usbCommunicationRepository.openDeviceAndPort(device)

    }

    fun serialWrite(data: ByteArray): Boolean {
        return usbCommunicationRepository.serialWrite(data)
    }


    fun getLiveOutput(context: Context): Boolean {

        val liveOutput = usbCommunicationRepository.getLiveOutput()
        Toast.makeText(context, "Получено: $liveOutput", Toast.LENGTH_SHORT).show()
        val parsed = byteArrayToHeader(liveOutput)
        Toast.makeText(context, "Декодировано в: $parsed", Toast.LENGTH_SHORT).show()
        if (parsed != null) {
            messages.add(parsed)
            data_list.value = messages
            Toast.makeText(context, "Сообщение добавлено в список", Toast.LENGTH_SHORT).show()
            return true
        }
        return false
    }

    fun TestReading(context: Context, lcowner: LifecycleOwner) {
        getGrantedDevice().observe(lcowner) { device ->
            openDeviceAndPort(device)
        }
        if (initializeUsbDevice()) {
            connected = true
            Log.d("Connection", "Device connected")
            Toast.makeText(context, "Передатчик подключен", Toast.LENGTH_SHORT).show()
            if (getLiveOutput(context)) {
                Log.d("Reading", "Message received")
                Toast.makeText(context, "Сообщение прочитано", Toast.LENGTH_SHORT).show()
            } else {
                Log.e("Reading", "Message not received")
                Toast.makeText(context, "Сообщение не прочитано", Toast.LENGTH_SHORT).show()
            }
        } else {
            connected = false
            Log.d("Connection", "Device not connected")
            Toast.makeText(context, "Передатчик не подключен", Toast.LENGTH_SHORT).show()
        }
    }

}