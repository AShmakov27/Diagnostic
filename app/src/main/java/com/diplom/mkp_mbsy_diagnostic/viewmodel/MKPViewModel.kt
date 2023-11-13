package com.diplom.mkp_mbsy_diagnostic.viewmodel

import android.content.Context
import android.util.Log
import android.widget.Toast
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.diplom.mkp_mbsy_diagnostic.data.usb.Header
import com.diplom.mkp_mbsy_diagnostic.data.usb.MKPMessage
import com.diplom.mkp_mbsy_diagnostic.data.usb.Message_20
import com.diplom.mkp_mbsy_diagnostic.data.usb.Message_21
import com.diplom.mkp_mbsy_diagnostic.data.usb.Message_38
import com.diplom.mkp_mbsy_diagnostic.data.usb.Message_39
import com.diplom.mkp_mbsy_diagnostic.data.usb.Message_54
import com.diplom.mkp_mbsy_diagnostic.data.usb.Message_62
import com.diplom.mkp_mbsy_diagnostic.data.usb.Message_63
import com.diplom.mkp_mbsy_diagnostic.utils.byteArrayToMessage_21
import com.diplom.mkp_mbsy_diagnostic.utils.byteArrayToMessage_39
import com.diplom.mkp_mbsy_diagnostic.utils.byteArrayToMessage_63
import com.diplom.mkp_mbsy_diagnostic.data.UsbCommunicationRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import java.io.ByteArrayOutputStream
import java.io.ObjectOutputStream
import javax.inject.Inject

@HiltViewModel
class MKPViewModel @Inject constructor(
    private val usbCommunicationRepository: UsbCommunicationRepository
) : ViewModel() {

    var data_list = MutableLiveData(mutableListOf<MKPMessage>())
    var connected = false
    /*
    init {
        viewModelScope.launch {
            if (initializeUsbDevice(1234)) {
                connected = true
                Log.d("Connection", "Device connected")
            } else {
                connected = false
                Log.d("Connection", "Device not connected")
            }
        }
    }

    override fun onCleared() {
        super.onCleared()
        if (connected) {
            closeUsbConnection()
        }
    }

    fun initializeUsbDevice(vendorId: Int): Boolean {
        return usbCommunicationRepository.initializeUsbDevice(vendorId)
    }

    fun readDataFromUsb(bufferSize: Int): ByteArray {
        val data = usbCommunicationRepository.readDataFromUSB(bufferSize)
        return data
    }

    fun closeUsbConnection() {
        usbCommunicationRepository.closeUSBConnection()
        Log.d("Connection", "Connection closed")
    }

    fun SendArrayOfMessages(MB_id: String, start: Int, end: Int, context: Context) {
        if (connected) {
            for (i in start..end) {
                //Надо узнать что кидается первым пакетом на МКП
                /*SendMessage16(context = context,MB_id = i.toString())*/
            }
        } else {
            Log.d("Sending", "Unable to send messages, USB device not connected")
        }
    }

    fun SendMessage20(context: Context, MB_id: String, MK_id: String) {
        val message = Message_20(1, 1, 1, 1, MB_id.toUShort(), MK_id.toUShort())
        val data = objectToByteArray(message)
        val sentBytes = usbCommunicationRepository.sendDataToUSB(data)

        if (sentBytes >= 0) {
            Toast.makeText(context, "Сообщение на МКП №$MK_id отправлено", Toast.LENGTH_SHORT).show()
            val index = data_list.value?.indexOfFirst { it.Mes21.MK_id == MK_id.toUShort() }
            if (index != null) {
                if (index != -1) {
                    val list = data_list.value ?: mutableListOf()
                    list[index].count_send += 1
                    data_list.value = list
                }
            }
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

    fun SendMessage38(context: Context, MB_id: String, MK_id: String){
        val message = Message_38(1, 1, 1, 1, MB_id.toUShort(), MK_id.toUShort())
        val data = objectToByteArray(message)
        val sentBytes = usbCommunicationRepository.sendDataToUSB(data)

        if (sentBytes >= 0) {
            Toast.makeText(context, "Сообщение на МКП №$MK_id отправлено", Toast.LENGTH_SHORT).show()
            val index = data_list.value?.indexOfFirst { it.Mes21.MK_id == MK_id.toUShort() }
            if (index != null) {
                if (index != -1) {
                    val list = data_list.value ?: mutableListOf()
                    list[index].count_send += 1
                    data_list.value = list
                }
            }
            val bufferSize = 1024
            val received = readDataFromUsb(bufferSize)
            val parsed_mess = byteArrayToMessage_39(received)
            if (parsed_mess != null) {
                pushMes39inList(parsed_mess)
            }
        } else {
            Toast.makeText(context, "Сообщение неотправлено", Toast.LENGTH_SHORT).show()
        }
    }

    @OptIn(ExperimentalUnsignedTypes::class)
    fun SendMessage54(context: Context, MB_id: String, MK_id: String, Underminning0: UShortArray){
        val message = Message_54(1, 1, 1, 1, MB_id.toUShort(), MK_id.toUShort(), Underminning0)
        val data = objectToByteArray(message)
        val sentBytes = usbCommunicationRepository.sendDataToUSB(data)
        if (sentBytes >= 0) {
            Toast.makeText(context, "Сообщение на МКП №$MK_id отправлено", Toast.LENGTH_SHORT).show()
            val index = data_list.value?.indexOfFirst { it.Mes21.MK_id == MK_id.toUShort() }
            if (index != null) {
                if (index != -1) {
                    val list = data_list.value ?: mutableListOf()
                    list[index].count_send += 1
                    data_list.value = list
                }
            }
        } else {
            Toast.makeText(context, "Сообщение неотправлено", Toast.LENGTH_SHORT).show()
        }
    }

    fun SendMessage62(context: Context, MB_id: String, MK_id: String) {
        val message = Message_62(1, 1, 1, 1, MB_id.toUShort(), MK_id.toUShort())
        val data = objectToByteArray(message)
        val sentBytes = usbCommunicationRepository.sendDataToUSB(data)

        if (sentBytes >= 0) {
            Toast.makeText(context, "Сообщение на МКП №$MK_id отправлено", Toast.LENGTH_SHORT).show()
            val index = data_list.value?.indexOfFirst { it.Mes21.MK_id == MK_id.toUShort() }
            if (index != null) {
                if (index != -1) {
                    val list = data_list.value ?: mutableListOf()
                    list[index].count_send += 1
                    data_list.value = list
                }
            }
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

    fun pushMes21inList(mes_21: Message_21) {
        val index = data_list.value?.indexOfFirst { it.Mes21.MB_id == mes_21.MB_id }
        if (index != null) {
            if (index != -1) {
                val list = data_list.value ?: mutableListOf()
                list[index].Mes21 = mes_21
                list[index].count_receive += 1
                data_list.value = list
            } else {
                val newMes = MKPMessage(mes_21, null, null)
                newMes.count_send += 1
                newMes.count_receive += 1
                val list = data_list.value ?: mutableListOf()
                list.add(newMes)
                data_list.value = list
            }
        }
    }

    fun pushMes39inList(mes_39: Message_39) {
        val index = data_list.value?.indexOfFirst { it.Mes21.MB_id == mes_39.MB_id }
        if (index != null) {
            if (index != -1) {
                val list = data_list.value ?: mutableListOf()
                list[index].Mes39 = mes_39
                list[index].count_receive += 1
                data_list.value = list
            }
        }
    }

    fun pushMes63inList(mes_63: Message_63) {
        val index = data_list.value?.indexOfFirst { it.Mes21.MB_id == mes_63.MB_id }
        if (index != null) {
            if (index != -1) {
                val list = data_list.value ?: mutableListOf()
                list[index].Mes63 = mes_63
                list[index].count_receive += 1
                data_list.value = list
            }
        }
    }

    fun objectToByteArray(obj: Header): ByteArray {
        val byteArrayOutputStream = ByteArrayOutputStream()
        val objectOutputStream = ObjectOutputStream(byteArrayOutputStream)
        objectOutputStream.writeObject(obj)
        objectOutputStream.flush()
        return byteArrayOutputStream.toByteArray()
    }
    */
}