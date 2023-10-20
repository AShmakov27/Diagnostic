package com.diplom.mkp_mbsy_diagnostic.viewmodel

import android.widget.Toast
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.diplom.mkp_mbsy_diagnostic.data.UsbCommunicationModel
import com.diplom.mkp_mbsy_diagnostic.model.Header
import com.diplom.mkp_mbsy_diagnostic.model.Message_16
import com.diplom.mkp_mbsy_diagnostic.model.Message_20
import com.diplom.mkp_mbsy_diagnostic.model.Message_62
import dagger.hilt.android.lifecycle.HiltViewModel
import java.io.ByteArrayOutputStream
import java.io.ObjectOutputStream


@HiltViewModel
class MBSYViewModel(
    private val usbCommunicationModel: UsbCommunicationModel
) : ViewModel() {

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

    fun sendArrayOfMessages(start: Int, end: Int) {
        for (i in start..end) {
            val message = Message_16(1u, 1u, 1u, 1u, i.toUShort(), 0u)
            val data = objectToByteArray(message)
            val sentBytes = usbCommunicationModel.sendDataToUSB(data)
        }
    }

    @Composable
    fun SendMessage16(MB_id: String) {
        val message = Message_16(1u, 1u, 1u, 1u, MB_id.toUShort(), 0u)
        val data = objectToByteArray(message)
        val sentBytes = usbCommunicationModel.sendDataToUSB(data)

        // Обработка результата отправки
        if (sentBytes >= 0) {
            Toast.makeText(LocalContext.current, "Сообщение отправлено", Toast.LENGTH_SHORT).show()
        } else {
            Toast.makeText(LocalContext.current, "Сообщение неотправлено", Toast.LENGTH_SHORT).show()
        }
    }

    @Composable
    fun SendMessage20(MB_id: String) {
        val message = Message_20(1u, 1u, 1u, 1u, MB_id.toUShort(), 0u)
        val data = objectToByteArray(message)
        val sentBytes = usbCommunicationModel.sendDataToUSB(data)

        // Обработка результата отправки
        if (sentBytes >= 0) {
            Toast.makeText(LocalContext.current, "Сообщение отправлено", Toast.LENGTH_SHORT).show()
        } else {
            Toast.makeText(LocalContext.current, "Сообщение неотправлено", Toast.LENGTH_SHORT).show()
        }
    }

    @Composable
    fun SendMessage62(MB_id: String) {
        val message = Message_62(1u, 1u, 1u, 1u, MB_id.toUShort(), 0u)
        val data = objectToByteArray(message)
        val sentBytes = usbCommunicationModel.sendDataToUSB(data)

        // Обработка результата отправки
        if (sentBytes >= 0) {
            Toast.makeText(LocalContext.current, "Сообщение отправлено", Toast.LENGTH_SHORT).show()
        } else {
            Toast.makeText(LocalContext.current, "Сообщение неотправлено", Toast.LENGTH_SHORT).show()
        }
    }

    fun objectToByteArray(obj: Header): ByteArray {
        val byteArrayOutputStream = ByteArrayOutputStream()
        val objectOutputStream = ObjectOutputStream(byteArrayOutputStream)
        objectOutputStream.writeObject(obj)
        objectOutputStream.flush()
        return byteArrayOutputStream.toByteArray()
    }
}