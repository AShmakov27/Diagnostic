package com.diplom.mkp_mbsy_diagnostic.viewmodel

import android.content.Context
import android.hardware.usb.UsbDevice
import android.os.Handler
import android.os.Looper
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
import com.diplom.mkp_mbsy_diagnostic.utils.Message_16toByteArray
import com.diplom.mkp_mbsy_diagnostic.utils.byteArrayToHeader
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withContext
import javax.inject.Inject

@HiltViewModel
class TestViewModel @Inject constructor(
    private val usbCommunicationRepository: UsbCommunicationRepository,
    private val WorkMSSFile: WorkMSSFile
) : ViewModel() {

    private val handler = Handler(Looper.getMainLooper())
    private val interval = 1000

    val messages = ArrayList<Header>()
    val data_list = MutableLiveData<List<Header>>()

    var connected = false
    var head_id = 0
    var MB_id = 0

    private fun startRepeatingReading(context: Context) {
        getLiveOutput(context)

        handler.postDelayed({
            startRepeatingReading(context)
        }, interval.toLong())
    }

    override fun onCleared() {
        super.onCleared()
        if (connected) {
            disconnect()
            connected = false
        }
        WorkMSSFile.Close()
    }

    fun initializeUsbDevice() = usbCommunicationRepository.initializeUsbDevice()

    fun disconnect() = usbCommunicationRepository.disconnect()

    fun getGrantedDevice() = usbCommunicationRepository.getGrantedDevice()

    fun openDeviceAndPort(device: UsbDevice) = viewModelScope.launch {
        usbCommunicationRepository.openDeviceAndPort(device)
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
        WorkMSSFile.Open("CommMessages_pms", 1, 1)
        if (initializeUsbDevice()) {
            connected = true
            startRepeatingReading(context)
            Log.d("Connection", "Device connected")
            Toast.makeText(context, "Передатчик подключен", Toast.LENGTH_SHORT).show()
        } else {
            connected = false
            Log.e("Connection", "Device not connected")
            Toast.makeText(context, "Передатчик не подключен", Toast.LENGTH_SHORT).show()
        }
    }

    fun TestWriting(context: Context) {
        head_id += 1
        MB_id += 1
        val message = Message_16(head_id.toByte(), 16, 1, 1, MB_id.toUShort(), 0u)
        val data = Message_16toByteArray(message)
        if (usbCommunicationRepository.serialWrite(data)) {
            Toast.makeText(context, "Сообщение на МБСУ №$MB_id отправлено", Toast.LENGTH_SHORT).show()
            Log.d("Sending", "Message sent")
            WorkMSSFile.Write(data[1].toUInt(), data.size, 1, data)
        } else {
            Toast.makeText(context, "Сообщение неотправлено", Toast.LENGTH_SHORT).show()
            Log.e("Sending", "Message not sent")
        }
    }

    fun TestMSSWrite(number: Int) = runBlocking {
        withContext(Dispatchers.IO) {
            WorkMSSFile.Open("CommMessages_pms", 1, 1)
            for (i in 1..number) {
                val msgTest = Message_16(i.toByte(), 16, 1, 1, 20u, 20u)
                val bytear = Message_16toByteArray(msgTest)
                WorkMSSFile.Write(msgTest.id.toUInt(), bytear.size, 0, bytear)
            }
            WorkMSSFile.Close()
        }
    }
}