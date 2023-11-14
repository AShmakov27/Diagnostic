package com.diplom.mkp_mbsy_diagnostic.viewmodel

import android.content.Context
import android.hardware.usb.UsbDevice
import android.util.Log
import android.widget.Toast
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.diplom.mkp_mbsy_diagnostic.data.UsbCommunicationRepository
import com.diplom.mkp_mbsy_diagnostic.data.usb.Header
import com.diplom.mkp_mbsy_diagnostic.data.usb.MBSYMessage
import com.diplom.mkp_mbsy_diagnostic.data.usb.Message_16
import com.diplom.mkp_mbsy_diagnostic.data.usb.Message_17
import com.diplom.mkp_mbsy_diagnostic.data.usb.Message_20
import com.diplom.mkp_mbsy_diagnostic.data.usb.Message_21
import com.diplom.mkp_mbsy_diagnostic.data.usb.Message_62
import com.diplom.mkp_mbsy_diagnostic.data.usb.Message_63
import com.diplom.mkp_mbsy_diagnostic.utils.byteArrayToMessage_17
import com.diplom.mkp_mbsy_diagnostic.utils.byteArrayToMessage_21
import com.diplom.mkp_mbsy_diagnostic.utils.byteArrayToMessage_63
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import java.io.ByteArrayOutputStream
import java.io.ObjectOutputStream
import javax.inject.Inject


@HiltViewModel
class MBSYViewModel @Inject constructor(
    private val usbCommunicationRepository: UsbCommunicationRepository
) : ViewModel() {

    val message = ArrayList<MBSYMessage>()
    var data_list = MutableLiveData<List<MBSYMessage>>()
    var connected = false

    init {
        viewModelScope.launch {
            /*
            getGrantedDevice().observe(lcowner) { device ->
                openDeviceAndPort(device)
            }
            */
            if (initializeUsbDevice()) {
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
            disconnect()
        }
    }

    fun initializeUsbDevice() = usbCommunicationRepository.initializeUsbDevice()

    fun disconnect() = usbCommunicationRepository.disconnect()

    fun getGrantedDevice() = usbCommunicationRepository.getGrantedDevice()

    fun openDeviceAndPort(device: UsbDevice) = viewModelScope.launch {
        usbCommunicationRepository.openDeviceAndPort(device)

    }
    /*
    fun SendArrayOfMessages(start: Int, end: Int, context: Context) {
        if (connected) {
            for (i in start..end) {
                SendMessage16(context = context, MB_id = i.toString())
            }
        } else {
            Log.d("Sending", "Unable to send messages, USB device not connected")
        }
    }

    fun SendMessage16(context: Context, MB_id: String) {
        val message = Message_16(1, 1, 1, 1, MB_id.toUShort(), 0u)
        val data = objectToByteArray(message)
        val sentBytes = usbCommunicationRepository.sendDataToUSB(data)

        if (sentBytes >= 0) {
            Toast.makeText(context, "Сообщение на МБСУ №$MB_id отправлено", Toast.LENGTH_SHORT)
                .show()
            val index = data_list.value?.indexOfFirst { it.Mes17.MB_id == MB_id.toUShort() }
            if (index != null) {
                if (index != -1) {
                    val list = data_list.value ?: mutableListOf()
                    list[index].count_send += 1
                    data_list.value = list
                }
            }
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
        val message = Message_20(1, 1, 1, 1, MB_id.toUShort(), 0u)
        val data = objectToByteArray(message)
        val sentBytes = usbCommunicationRepository.sendDataToUSB(data)

        if (sentBytes >= 0) {
            Toast.makeText(context, "Сообщение на МБСУ №$MB_id отправлено", Toast.LENGTH_SHORT)
                .show()
            val index = data_list.value?.indexOfFirst { it.Mes17.MB_id == MB_id.toUShort() }
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

    fun SendMessage62(context: Context, MB_id: String) {
        val message = Message_62(1, 1, 1, 1, MB_id.toUShort(), 0u)
        val data = objectToByteArray(message)
        val sentBytes = usbCommunicationRepository.sendDataToUSB(data)

        if (sentBytes >= 0) {
            Toast.makeText(context, "Сообщение на МБСУ №$MB_id отправлено", Toast.LENGTH_SHORT)
                .show()
            val index = data_list.value?.indexOfFirst { it.Mes17.MB_id == MB_id.toUShort() }
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

    fun pushMes17inList(mes_17: Message_17) {
        val index = data_list.value?.indexOfFirst { it.Mes17.MB_id == mes_17.MB_id }
        if (index != null) {
            if (index != -1) {
                val list = data_list.value ?: mutableListOf()
                list[index].Mes17 = mes_17
                list[index].count_receive += 1
                data_list.value = list
            } else {
                val newMes = MBSYMessage(mes_17, null, null)
                newMes.count_send += 1
                newMes.count_receive += 1
                val list = data_list.value ?: mutableListOf()
                list.add(newMes)
                data_list.value = list
            }
        }
    }

    fun pushMes21inList(mes_21: Message_21) {
        val index = data_list.value?.indexOfFirst { it.Mes17.MB_id == mes_21.MB_id }
        if (index != null) {
            if (index != -1) {
                val list = data_list.value ?: mutableListOf()
                list[index].Mes21 = mes_21
                list[index].count_receive += 1
                data_list.value = list
            }
        }
    }

    fun pushMes63inList(mes_63: Message_63) {
        val index = data_list.value?.indexOfFirst { it.Mes17.MB_id == mes_63.MB_id }
        if (index != null) {
            if (index != -1) {
                val list = data_list.value ?: mutableListOf()
                list[index].Mes63 = mes_63
                list[index].count_receive += 1
                data_list.value = list
            }
        }
    }
    */
    fun objectToByteArray(obj: Header): ByteArray {
        val byteArrayOutputStream = ByteArrayOutputStream()
        val objectOutputStream = ObjectOutputStream(byteArrayOutputStream)
        objectOutputStream.writeObject(obj)
        objectOutputStream.flush()
        return byteArrayOutputStream.toByteArray()
    }
}