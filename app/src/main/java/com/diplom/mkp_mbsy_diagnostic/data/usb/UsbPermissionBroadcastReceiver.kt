package com.diplom.mkp_mbsy_diagnostic.data.usb

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.hardware.usb.UsbDevice
import android.hardware.usb.UsbManager
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

class UsbPermissionBroadcastReceiver: BroadcastReceiver() {

    private val _liveGrantedDevice = MutableLiveData<UsbDevice>()

    val liveGrantedDevice: LiveData<UsbDevice>
        get() = _liveGrantedDevice

    override fun onReceive(context: Context?, intent: Intent?) {
        when (intent?.action) {
            "com.android.example.USB_PERMISSION" -> {
                val device: UsbDevice? = intent.getParcelableExtra(UsbManager.EXTRA_DEVICE)
                val permissionGranted = intent
                    .getBooleanExtra(UsbManager.EXTRA_PERMISSION_GRANTED, false)

                if (permissionGranted) {
                    Log.i("Permission", "USB permission granted by the user")
                    device?.let { _liveGrantedDevice.postValue(it) }
                } else {
                    Log.e("Permission", "USB permission was probably denied by the user")
                }
            }
        }
    }
}
