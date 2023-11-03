package com.diplom.mkp_mbsy_diagnostic.data.usb

import android.app.Application
import android.content.Context
import android.hardware.usb.UsbManager
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object UsbCommunicationModule {
    @Provides
    fun provideUsbCommunicationModel(usbManager: UsbManager): UsbCommunicationModel {
        return UsbCommunicationModel(usbManager)
    }
}

@Module
@InstallIn(SingletonComponent::class)
object UsbManagerModule {
    @Provides
    fun provideUsbManager(application: Application): UsbManager {
        return application.getSystemService(Context.USB_SERVICE) as UsbManager
    }
}