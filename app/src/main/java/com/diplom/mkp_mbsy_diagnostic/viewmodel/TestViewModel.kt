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
import com.diplom.mkp_mbsy_diagnostic.data.usb.Message_16
import com.diplom.mkp_mbsy_diagnostic.utils.MSSLog.WorkMSSFile
import com.diplom.mkp_mbsy_diagnostic.utils.byteArrayToHeader
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import java.io.ByteArrayOutputStream
import java.io.ObjectOutputStream
import javax.inject.Inject

@HiltViewModel
class TestViewModel @Inject constructor(
    private val usbCommunicationRepository: UsbCommunicationRepository,
    private val WorkMSSFile: WorkMSSFile
) : ViewModel() {

    val messages = ArrayList<Header>()
    val data_list = MutableLiveData<List<Header>>()

    var connected = false

    override fun onCleared() {
        super.onCleared()
        if (connected) {
            disconnect()
            WorkMSSFile.Close()
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
        val parsed = byteArrayToHeader(liveOutput)
        if (parsed != null) {
            messages.add(parsed)
            data_list.value = messages
            Toast.makeText(context, "Тип сообщения: ${liveOutput[1].toInt()}", Toast.LENGTH_SHORT).show()
            Toast.makeText(context, "Сообщение добавлено в список", Toast.LENGTH_SHORT).show()
            WorkMSSFile.Write(liveOutput[0].toUInt(), liveOutput.size, 0, liveOutput)
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
            } else {
                Log.e("Reading", "Message not received")
            }
        } else {
            connected = false
            Log.e("Connection", "Device not connected")
            Toast.makeText(context, "Передатчик не подключен", Toast.LENGTH_SHORT).show()
        }
        WorkMSSFile.Open(context, "CommMessages_pms", 1, 1)
        val msgTest = Message_16(1, 16, 1, 1, 20u, 20u)
        val bytear = objectToByteArray(msgTest)
        WorkMSSFile.Write(msgTest.id.toUInt(), bytear.size, 0, bytear)
    }

    fun objectToByteArray(obj: Header): ByteArray {
        val byteArrayOutputStream = ByteArrayOutputStream()
        val objectOutputStream = ObjectOutputStream(byteArrayOutputStream)
        objectOutputStream.writeObject(obj)
        objectOutputStream.flush()
        return byteArrayOutputStream.toByteArray()
    }
}