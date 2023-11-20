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
import com.diplom.mkp_mbsy_diagnostic.data.usb.MBSYMessage
import com.diplom.mkp_mbsy_diagnostic.data.usb.Message_16
import com.diplom.mkp_mbsy_diagnostic.data.usb.Message_20
import com.diplom.mkp_mbsy_diagnostic.data.usb.Message_62
import com.diplom.mkp_mbsy_diagnostic.utils.MSSLog.WorkMSSFile
import com.diplom.mkp_mbsy_diagnostic.utils.Message_16toByteArray
import com.diplom.mkp_mbsy_diagnostic.utils.Message_20toByteArray
import com.diplom.mkp_mbsy_diagnostic.utils.Message_62toByteArray
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
    private val usbCommunicationRepository: UsbCommunicationRepository,
    private val WorkMSSFile: WorkMSSFile
) : ViewModel() {

    val messages = ArrayList<MBSYMessage>()
    val data_list = MutableLiveData<List<MBSYMessage>>()
    var connected = false

    override fun onCleared() {
        super.onCleared()
        if (connected) {
            disconnect()
        }
        WorkMSSFile.Close()
    }

    fun initializeUsbDevice() = usbCommunicationRepository.initializeUsbDevice()

    fun disconnect() = usbCommunicationRepository.disconnect()

    fun getGrantedDevice() = usbCommunicationRepository.getGrantedDevice()

    fun openDeviceAndPort(device: UsbDevice) = viewModelScope.launch {
        usbCommunicationRepository.openDeviceAndPort(device)
    }

    fun ConnectToUsb(context: Context, lcowner: LifecycleOwner) {
        getGrantedDevice().observe(lcowner) { device ->
            openDeviceAndPort(device)
        }
        if (initializeUsbDevice()) {
            connected = true
            Log.d("Connection", "Device connected")
            Toast.makeText(context, "Передатчик подключен", Toast.LENGTH_SHORT).show()
        } else {
            connected = false
            Log.e("Connection", "Device not connected")
            Toast.makeText(context, "Передатчик не подключен", Toast.LENGTH_SHORT).show()
        }
        WorkMSSFile.Open(context, "Test", 1, 1)
    }

    fun getLiveOutput(context: Context): Boolean {
        val liveOutput = usbCommunicationRepository.getLiveOutput()
        when (liveOutput[1].toInt()) {
            17 -> {
                val parsed = byteArrayToMessage_17(liveOutput)
                if (parsed != null) {
                    val index = data_list.value?.indexOfFirst { it.Mes17.MB_id == parsed.MB_id }
                    if (index != null) {
                        if (index != -1) {
                            messages[index].Mes17 = parsed
                            messages[index].count_receive += 1
                            data_list.value = messages
                            Toast.makeText(context, "Тип сообщения: ${liveOutput[1].toInt()}", Toast.LENGTH_SHORT).show()
                            Toast.makeText(context, "Сообщение в списке обновлено", Toast.LENGTH_SHORT).show()
                            Log.d("Receiving", "Message type ${liveOutput[1].toInt()} read and added in list")
                            return true
                        } else {
                            val newMes = MBSYMessage(parsed, null, null)
                            newMes.count_send += 1
                            newMes.count_receive += 1
                            messages.add(newMes)
                            data_list.value = messages
                            Toast.makeText(context, "Тип сообщения: ${liveOutput[1].toInt()}", Toast.LENGTH_SHORT).show()
                            Toast.makeText(context, "Сообщение добавлено в список", Toast.LENGTH_SHORT).show()
                            Log.d("Receiving", "Message type ${liveOutput[1].toInt()} read and added in list")
                            return true
                        }
                    }
                    WorkMSSFile.Write(liveOutput[1].toUInt(), liveOutput.size, 0, liveOutput)
                }
            }

            21 -> {
                val parsed = byteArrayToMessage_21(liveOutput)
                if (parsed != null) {
                    val index = data_list.value?.indexOfFirst { it.Mes17.MB_id == parsed.MB_id }
                    if (index != null) {
                        if (index != -1) {
                            messages[index].Mes21 = parsed
                            messages[index].count_receive += 1
                            data_list.value = messages
                            Toast.makeText(context, "Тип сообщения: ${liveOutput[1].toInt()}", Toast.LENGTH_SHORT).show()
                            Toast.makeText(context, "Сообщение в списке обновлено", Toast.LENGTH_SHORT).show()
                            Log.d("Receiving", "Message type ${liveOutput[1].toInt()} read and added in list")
                            return true
                        }
                    }
                    WorkMSSFile.Write(liveOutput[1].toUInt(), liveOutput.size, 0, liveOutput)
                }
            }

            63 -> {
                val parsed = byteArrayToMessage_63(liveOutput)
                if (parsed != null) {
                    val index = data_list.value?.indexOfFirst { it.Mes17.MB_id == parsed.MB_id }
                    if (index != null) {
                        if (index != -1) {
                            messages[index].Mes63 = parsed
                            messages[index].count_receive += 1
                            data_list.value = messages
                            Toast.makeText(context, "Тип сообщения: ${liveOutput[1].toInt()}", Toast.LENGTH_SHORT).show()
                            Toast.makeText(context, "Сообщение в списке обновлено", Toast.LENGTH_SHORT).show()
                            Log.d("Receiving", "Message type ${liveOutput[1].toInt()} read and added in list")
                            return true
                        }
                    }
                    WorkMSSFile.Write(liveOutput[1].toUInt(), liveOutput.size, 0, liveOutput)
                }
            }
        }
        Log.e("Receiving", "Message not read")
        return false
    }

    fun SendArrayOfMessages(start: Int, end: Int, context: Context) {
        if (connected) {
            for (i in start..end) {
                SendMessage16(context = context, MB_id = i.toString())
            }
        } else {
            Log.e("Sending", "Unable to send messages, USB device not connected")
        }
    }

    fun SendMessage16(context: Context, MB_id: String) {
        val message = Message_16(1, 16, 1, 1, MB_id.toUShort(), 0u)
        val data = Message_16toByteArray(message)
        if (usbCommunicationRepository.serialWrite(data)) {
            Toast.makeText(context, "Сообщение на МБСУ №$MB_id отправлено", Toast.LENGTH_SHORT).show()
            val index = data_list.value?.indexOfFirst { it.Mes17.MB_id == MB_id.toUShort() }
            if (index != null) {
                if (index != -1) {
                    messages[index].count_send += 1
                    data_list.value = messages
                }
            }
            Log.d("Sending", "Message sent")
            WorkMSSFile.Write(data[1].toUInt(), data.size, 1, data)
        } else {
            Toast.makeText(context, "Сообщение неотправлено", Toast.LENGTH_SHORT).show()
            Log.e("Sending", "Message not sent")
        }
    }

    fun SendMessage20(context: Context, MB_id: String) {
        val message = Message_20(1, 20, 1, 1, MB_id.toUShort(), 0u)
        val data = Message_20toByteArray(message)
        if (usbCommunicationRepository.serialWrite(data)) {
            Toast.makeText(context, "Сообщение на МБСУ №$MB_id отправлено", Toast.LENGTH_SHORT)
                .show()
            val index = data_list.value?.indexOfFirst { it.Mes17.MB_id == MB_id.toUShort() }
            if (index != null) {
                if (index != -1) {
                    messages[index].count_send += 1
                    data_list.value = messages
                }
            }
            Log.d("Sending", "Message sent")
            WorkMSSFile.Write(data[1].toUInt(), data.size, 1, data)
        } else {
            Toast.makeText(context, "Сообщение неотправлено", Toast.LENGTH_SHORT).show()
            Log.e("Sending", "Message not sent")
        }
    }

    fun SendMessage62(context: Context, MB_id: String) {
        val message = Message_62(1, 62, 1, 1, MB_id.toUShort(), 0u)
        val data = Message_62toByteArray(message)
        if (usbCommunicationRepository.serialWrite(data)) {
            Toast.makeText(context, "Сообщение на МБСУ №$MB_id отправлено", Toast.LENGTH_SHORT)
                .show()
            val index = data_list.value?.indexOfFirst { it.Mes17.MB_id == MB_id.toUShort() }
            if (index != null) {
                if (index != -1) {
                    messages[index].count_send += 1
                    data_list.value = messages
                }
            }
            Log.d("Sending", "Message sent")
            WorkMSSFile.Write(data[1].toUInt(), data.size, 1, data)
        } else {
            Toast.makeText(context, "Сообщение неотправлено", Toast.LENGTH_SHORT).show()
            Log.e("Sending", "Message not sent")
        }
    }
}