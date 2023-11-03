package com.diplom.mkp_mbsy_diagnostic.data.usb

import android.hardware.usb.UsbDevice
import android.hardware.usb.UsbDeviceConnection
import android.hardware.usb.UsbEndpoint
import android.hardware.usb.UsbManager

class UsbCommunicationModel(private val usbManager: UsbManager) {
    private lateinit var usbDevice: UsbDevice
    private lateinit var usbConnection: UsbDeviceConnection
    private lateinit var usbEndpoint: UsbEndpoint

    fun initializeUsbDevice(vendorId: Int, productId: Int): Boolean {
        val deviceList = usbManager.deviceList
        for (entry in deviceList.entries) {
            val device = entry.value
            if (device.vendorId == vendorId && device.productId == productId) {
                usbDevice = device
                val usbInterface = usbDevice.getInterface(0)
                usbEndpoint = usbInterface.getEndpoint(0)
                usbConnection = usbManager.openDevice(usbDevice)
                usbConnection.claimInterface(usbInterface, true)
                return true
            }
        }
        return false
    }

    fun sendDataToUSB(data: ByteArray): Int {
        return usbConnection.bulkTransfer(usbEndpoint, data, data.size, TIMEOUT)
    }

    fun readDataFromUSB(bufferSize: Int): ByteArray {
        val buffer = ByteArray(bufferSize)
        usbConnection.bulkTransfer(usbEndpoint, buffer, bufferSize, TIMEOUT)
        return buffer
    }

    fun closeUSBConnection() {
        usbConnection.close()
    }

    companion object {
        private const val TIMEOUT = 1000
    }
}