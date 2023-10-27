package com.diplom.mkp_mbsy_diagnostic.viewmodel

import android.content.Context
import android.util.Log
import android.widget.Toast
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.diplom.mkp_mbsy_diagnostic.data.UsbCommunicationModel
import com.diplom.mkp_mbsy_diagnostic.model.Header
import com.diplom.mkp_mbsy_diagnostic.model.MBSYMessage
import com.diplom.mkp_mbsy_diagnostic.model.Message_16
import com.diplom.mkp_mbsy_diagnostic.model.Message_17
import com.diplom.mkp_mbsy_diagnostic.model.Message_20
import com.diplom.mkp_mbsy_diagnostic.model.Message_21
import com.diplom.mkp_mbsy_diagnostic.model.Message_62
import com.diplom.mkp_mbsy_diagnostic.model.Message_63
import com.diplom.mkp_mbsy_diagnostic.model.byteArrayToMessage_17
import com.diplom.mkp_mbsy_diagnostic.model.byteArrayToMessage_21
import com.diplom.mkp_mbsy_diagnostic.model.byteArrayToMessage_63
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import java.io.ByteArrayOutputStream
import java.io.ObjectOutputStream


@HiltViewModel
class MBSYViewModel(
    private val usbCommunicationModel: UsbCommunicationModel
) : ViewModel() {

    var data_list = mutableListOf<MBSYMessage>()

    init {
        viewModelScope.launch {
            if (/*initializeUsbDevice(vendor_id, product_id)*/ true) {
                Log.d("Connection", "Device connected")
            } else {
                Log.d("Connection", "Device not connected")
            }
        }
    }

    fun initializeUsbDevice(vendorId: Int, productId: Int): Boolean {
        return usbCommunicationModel.initializeUsbDevice(vendorId, productId)
    }

    fun readDataFromUsb(bufferSize: Int): ByteArray {
        val data = usbCommunicationModel.readDataFromUSB(bufferSize)
        return data
    }

    fun closeUsbConnection() {
        usbCommunicationModel.closeUSBConnection()
    }

    fun SendArrayOfMessages(start: Int, end: Int, context: Context) {
        for (i in start..end) {
            SendMessage16(context = context,MB_id = i.toString())
        }
    }

    fun SendMessage16(context: Context, MB_id: String) {
        val message = Message_16(1u, 1u, 1u, 1u, MB_id.toUShort(), 0u)
        val data = objectToByteArray(message)
        val sentBytes = usbCommunicationModel.sendDataToUSB(data)

        if (sentBytes >= 0) {
            Toast.makeText(context, "Сообщение на МБСУ №$MB_id отправлено", Toast.LENGTH_SHORT).show()
            val bufferSize = 1024
            val received = readDataFromUsb(bufferSize)
            val parsed_mess = byteArrayToMessage_17(received)
            if (parsed_mess != null) {
                pushMes17inList(parsed_mess)
            }
        } else {
            Toast.makeText(context, "Сообщение неотправлено", Toast.LENGTH_SHORT).show()
        }
    }

    fun SendMessage20(context: Context, MB_id: String) {
        val message = Message_20(1u, 1u, 1u, 1u, MB_id.toUShort(), 0u)
        val data = objectToByteArray(message)
        val sentBytes = usbCommunicationModel.sendDataToUSB(data)

        if (sentBytes >= 0) {
            Toast.makeText(context, "Сообщение на МБСУ №$MB_id отправлено", Toast.LENGTH_SHORT).show()
            val bufferSize = 1024
            val received = readDataFromUsb(bufferSize)
            val parsed_mess = byteArrayToMessage_21(received)
            if (parsed_mess != null) {
                pushMes21inList(parsed_mess)
            }
        } else {
            Toast.makeText(context, "Сообщение неотправлено", Toast.LENGTH_SHORT).show()
        }
    }

    fun SendMessage62(context: Context, MB_id: String) {
        val message = Message_62(1u, 1u, 1u, 1u, MB_id.toUShort(), 0u)
        val data = objectToByteArray(message)
        val sentBytes = usbCommunicationModel.sendDataToUSB(data)

        if (sentBytes >= 0) {
            Toast.makeText(context, "Сообщение на МБСУ №$MB_id отправлено", Toast.LENGTH_SHORT).show()
            val bufferSize = 1024
            val received = readDataFromUsb(bufferSize)
            val parsed_mess = byteArrayToMessage_63(received)
            if (parsed_mess != null) {
                pushMes63inList(parsed_mess)
            }
        } else {
            Toast.makeText(context, "Сообщение неотправлено", Toast.LENGTH_SHORT).show()
        }
    }

    fun pushMes17inList(mes_17: Message_17) {
        val index = data_list.indexOfFirst { it.Mes17.MB_id == mes_17.MB_id }
        if (index != -1) {
            data_list[index].Mes17 = mes_17
        } else {
            val newMes = MBSYMessage(mes_17, null, null)
            data_list.add(newMes)
        }
    }

    fun pushMes21inList(mes_21: Message_21) {
        val index = data_list.indexOfFirst { it.Mes17.MB_id == mes_21.MB_id }
        if (index != -1) {
            data_list[index].Mes21 = mes_21
        }
    }

    fun pushMes63inList(mes_63: Message_63) {
        val index = data_list.indexOfFirst { it.Mes17.MB_id == mes_63.MB_id }
        if (index != -1) {
            data_list[index].Mes63 = mes_63
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