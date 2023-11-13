package com.diplom.mkp_mbsy_diagnostic.data

import android.content.Context
import android.hardware.usb.UsbDevice
import androidx.lifecycle.LiveData

interface UsbCommunicationRepository {
    fun initializeUsbDevice(): Boolean
    fun connect(device: MutableMap.MutableEntry<String, UsbDevice>)
    fun disconnect()
    fun openDeviceAndPort(device: UsbDevice)
    fun serialWrite(data: ByteArray): Boolean
    fun getGrantedDevice(): LiveData<UsbDevice>
    fun getLiveOutput(): ByteArray
}