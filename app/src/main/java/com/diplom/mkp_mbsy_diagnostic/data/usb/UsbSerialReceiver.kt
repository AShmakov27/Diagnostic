package com.diplom.mkp_mbsy_diagnostic.data.usb

import android.util.Log
import com.felhr.usbserial.UsbSerialInterface
import java.io.UnsupportedEncodingException

class UsbSerialReceiver: UsbSerialInterface.UsbReadCallback {

    private var _received = ByteArray(20)

    val received: ByteArray
        get() = _received

    override fun onReceivedData(data: ByteArray?) {
        data?.let {
            try {
                Log.i("Read", "message from arduino: $data")
                _received = data
            } catch (e: UnsupportedEncodingException) {
                e.printStackTrace()
                Log.e("Read", "Encoding problem occurred when reading the serial message: $e")
            } catch (e: Exception) {
                Log.e("Read", "Unknown error occurred when reading the serial message: $e")
            }
        } ?: run {
            Log.e("Read", "Message was null")
        }
    }
}