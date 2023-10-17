package com.diplom.mkp_mbsy_diagnostic.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.diplom.mkp_mbsy_diagnostic.data.UsbCommunicationModel

class MBSYViewModel(private val usbCommunicationModel: UsbCommunicationModel) : ViewModel() {

    private val usbDataLiveData = MutableLiveData<ByteArray>()

    fun initializeUsbDevice(vendorId: Int, productId: Int): Boolean {
        return usbCommunicationModel.initializeUsbDevice(vendorId, productId)
    }

    fun readDataFromUsb(bufferSize: Int) {
        val data = usbCommunicationModel.readDataFromUSB(bufferSize)
        usbDataLiveData.postValue(data)
    }

    fun getUsbDataLiveData(): LiveData<ByteArray> {
        return usbDataLiveData
    }

    fun closeUsbConnection() {
        usbCommunicationModel.closeUSBConnection()
    }

    fun sendMessage16() {
        //val message =
        //val data = message.toByteArray(Charsets.UTF_8)
        //val sentBytes = usbCommunicationModel.sendDataToUSB(data)

        // Обработка результата отправки
    }

    fun sendMessage20() {
        //val message =
        //val data = message.toByteArray(Charsets.UTF_8)
        //val sentBytes = usbCommunicationModel.sendDataToUSB(data)

        // Обработка результата отправки
    }

    fun sendMessage62() {
        //val message =
        //val data = message.toByteArray(Charsets.UTF_8)
        //val sentBytes = usbCommunicationModel.sendDataToUSB(data)

        // Обработка результата отправки
    }

    fun byteArrayToString(data: ByteArray): String {
        return String(data, Charsets.UTF_8)
    }
}