package com.diplom.mkp_mbsy_diagnostic.data

interface UsbCommunicationRepository {
    fun initializeUsbDevice(vendorId: Int, productId: Int): Boolean
    fun sendDataToUSB(data: ByteArray): Int
    fun readDataFromUSB(bufferSize: Int): ByteArray
    fun closeUSBConnection()
}