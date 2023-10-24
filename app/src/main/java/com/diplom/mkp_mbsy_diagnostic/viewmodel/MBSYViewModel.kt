package com.diplom.mkp_mbsy_diagnostic.viewmodel

import android.widget.Toast
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.platform.LocalContext
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.diplom.mkp_mbsy_diagnostic.data.UsbCommunicationModel
import com.diplom.mkp_mbsy_diagnostic.model.Header
import com.diplom.mkp_mbsy_diagnostic.model.MBSYMessage
import com.diplom.mkp_mbsy_diagnostic.model.Message_16
import com.diplom.mkp_mbsy_diagnostic.model.Message_20
import com.diplom.mkp_mbsy_diagnostic.model.Message_62
import com.diplom.mkp_mbsy_diagnostic.model.byteArrayToMessage_17
import com.diplom.mkp_mbsy_diagnostic.model.byteArrayToMessage_21
import com.diplom.mkp_mbsy_diagnostic.model.byteArrayToMessage_63
import dagger.hilt.android.lifecycle.HiltViewModel
import java.io.ByteArrayOutputStream
import java.io.ObjectOutputStream


@HiltViewModel
class MBSYViewModel(
    private val usbCommunicationModel: UsbCommunicationModel
) : ViewModel() {

    private val usbDataLiveData = MutableLiveData<ByteArray>()
    var data_list = mutableStateOf(emptyList<MBSYMessage>())

    fun initializeUsbDevice(vendorId: Int, productId: Int): Boolean {
        return usbCommunicationModel.initializeUsbDevice(vendorId, productId)
    }

    fun readDataFromUsb(bufferSize: Int): ByteArray {
        val data = usbCommunicationModel.readDataFromUSB(bufferSize)
        usbDataLiveData.postValue(data)
        return data
    }

    fun getUsbDataLiveData(): LiveData<ByteArray> {
        return usbDataLiveData
    }

    fun closeUsbConnection() {
        usbCommunicationModel.closeUSBConnection()
    }

    @Composable
    fun SendArrayOfMessages(start: Int, end: Int) {
        for (i in start..end) {
            SendMessage16(MB_id = i.toString())
        }
    }

    @Composable
    fun SendMessage16(MB_id: String) {
        val message = Message_16(1u, 1u, 1u, 1u, MB_id.toUShort(), 0u)
        val data = objectToByteArray(message)
        val sentBytes = usbCommunicationModel.sendDataToUSB(data)

        if (sentBytes >= 0) {
            Toast.makeText(LocalContext.current, "Сообщение на МБСУ №$MB_id отправлено", Toast.LENGTH_SHORT).show()
            val bufferSize = 1024
            val received = readDataFromUsb(bufferSize)
            var parsed_mess = byteArrayToMessage_17(received)
        } else {
            Toast.makeText(LocalContext.current, "Сообщение неотправлено", Toast.LENGTH_SHORT).show()
        }
    }

    @Composable
    fun SendMessage20(MB_id: String) {
        val message = Message_20(1u, 1u, 1u, 1u, MB_id.toUShort(), 0u)
        val data = objectToByteArray(message)
        val sentBytes = usbCommunicationModel.sendDataToUSB(data)

        if (sentBytes >= 0) {
            Toast.makeText(LocalContext.current, "Сообщение отправлено", Toast.LENGTH_SHORT).show()
            val bufferSize = 1024
            val received = readDataFromUsb(bufferSize)
            var parsed_mess = byteArrayToMessage_21(received)
        } else {
            Toast.makeText(LocalContext.current, "Сообщение неотправлено", Toast.LENGTH_SHORT).show()
        }
    }

    @Composable
    fun SendMessage62(MB_id: String) {
        val message = Message_62(1u, 1u, 1u, 1u, MB_id.toUShort(), 0u)
        val data = objectToByteArray(message)
        val sentBytes = usbCommunicationModel.sendDataToUSB(data)

        if (sentBytes >= 0) {
            Toast.makeText(LocalContext.current, "Сообщение отправлено", Toast.LENGTH_SHORT).show()
            val bufferSize = 1024
            val received = readDataFromUsb(bufferSize)
            var parsed_mess = byteArrayToMessage_63(received)
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