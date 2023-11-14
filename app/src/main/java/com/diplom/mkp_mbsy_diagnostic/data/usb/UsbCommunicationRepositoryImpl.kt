package com.diplom.mkp_mbsy_diagnostic.data.usb

import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.hardware.usb.UsbDevice
import android.hardware.usb.UsbDeviceConnection
import android.hardware.usb.UsbManager
import android.util.Log
import android.widget.Toast
import com.diplom.mkp_mbsy_diagnostic.data.UsbCommunicationRepository
import com.felhr.usbserial.UsbSerialDevice
import com.felhr.usbserial.UsbSerialInterface
import java.lang.IllegalStateException
import java.lang.NullPointerException
import javax.inject.Inject

class UsbCommunicationRepositoryImpl @Inject constructor(
    private val context: Context,
    private val UsbPermReceiver: UsbPermissionBroadcastReceiver,
    private val UsbSerialReceiver: UsbSerialReceiver
) : UsbCommunicationRepository {

    private var usbManager: UsbManager = context.getSystemService(Context.USB_SERVICE) as UsbManager
    private lateinit var usbConnection: UsbDeviceConnection
    private lateinit var serialPort: UsbSerialDevice

    override fun initializeUsbDevice(): Boolean {
        val deviceList = usbManager.deviceList
        Log.d("Connection", "Checking attached USB devices...")
        if (deviceList.isNotEmpty()) {
            for (device in deviceList) {
                val deviceVID = device.value.vendorId
                if (deviceVID == 0x1A86) {
                    connect(device)
                    Toast.makeText(context, "Arduino найдено.", Toast.LENGTH_SHORT).show()
                    return true
                } else {
                    Log.e("Connection", "Arduino Device not found.")
                    return false
                }
            }
        } else {
            Log.e("Connection", "No USB devices are attached")
        }
        return false
    }

    override fun connect(device: MutableMap.MutableEntry<String, UsbDevice>) {
        val permissionIntent = PendingIntent.getBroadcast(
            context,
            0,
            Intent("com.android.example.USB_PERMISSION"),
            PendingIntent.FLAG_MUTABLE or PendingIntent.FLAG_UPDATE_CURRENT
        )
        val filter = IntentFilter("com.android.example.USB_PERMISSION")
        context.registerReceiver(UsbPermReceiver, filter)
        usbManager.requestPermission(device.value, permissionIntent)
        Log.d("Permission", "Requested permission to access the USB device")
    }

    override fun disconnect() {
        try {
            usbConnection.close()
            Log.d("Connection", "Serial Connection Closed")
        } catch (e: UninitializedPropertyAccessException) {
            Log.e("Connection", "No device connection to close")
        } catch (e: Exception) {
            Log.e("Connection", "Device connection failed to close")
        }
    }

    override fun getGrantedDevice() = UsbPermReceiver.liveGrantedDevice

    override fun openDeviceAndPort(device: UsbDevice) {
        try {
            usbConnection = usbManager.openDevice(device)
            serialPort = UsbSerialDevice.createUsbSerialDevice(device, usbConnection)
        } catch (e: IllegalStateException) {
            Log.e("Connection", "Device connection was closed unexpectedly")
        } catch (e: NullPointerException) {
            Log.e("Connection", "Failed to open device connection.")
        } catch (e: Exception) {
            Log.e("Connection", "Failed to open device connection.")
        }
        if (::serialPort.isInitialized) {
            prepareSerialPort(serialPort)
        } else {
            Log.e("Connection", "Serial Port is null: The device might be disconnected.")
            usbConnection.close()
        }
    }

    private fun prepareSerialPort(serialPort: UsbSerialDevice) {
        serialPort.let {
            if (it.open()) {
                it.setBaudRate(9600)
                it.setDataBits(UsbSerialInterface.DATA_BITS_8)
                it.setStopBits(UsbSerialInterface.STOP_BITS_1)
                it.setParity(UsbSerialInterface.PARITY_NONE)
                it.setFlowControl(UsbSerialInterface.FLOW_CONTROL_OFF)
                it.read(UsbSerialReceiver)
                Log.d("Connection", "Serial Connection Opened")
            } else {
                Log.e("Connection", "Port not opened - There might be a problem with the serial connection to Arduino")
            }
        }
    }

    override fun serialWrite(data: ByteArray): Boolean {
        return try {
            if (::serialPort.isInitialized && data.isNotEmpty()) {
                serialPort.write(data)
                Log.d("Write", "Data sended")
                true
            } else {
                Log.e("Write", "Serial Port is null: The device might be disconnected.")
                false
            }
        } catch (e: Exception) {
            Log.e("Write", "Serial Write encountered an error: + $e")
            false
        }
    }

    override fun getLiveOutput(): ByteArray {
        return UsbSerialReceiver.received
    }
}