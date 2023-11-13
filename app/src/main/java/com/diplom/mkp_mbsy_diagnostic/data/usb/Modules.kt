package com.diplom.mkp_mbsy_diagnostic.data.usb

import android.app.Application
import android.content.Context
import android.hardware.usb.UsbManager
import com.diplom.mkp_mbsy_diagnostic.data.UsbCommunicationRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object ContextModule {
    @Provides
    fun provideContext(
        app: Application
    ): Context = app.applicationContext
}

@Module
@InstallIn(SingletonComponent::class)
object UsbPermissionBroadcastReceiverModule {
    @Provides
    fun provideUsbPermissionBroadcastReceiver() = UsbPermissionBroadcastReceiver()
}

@Module
@InstallIn(SingletonComponent::class)
object UsbSerialReceiverModule {
    @Provides
    fun providesUsbSerialReceiver() = UsbSerialReceiver()
}

@Module
@InstallIn(SingletonComponent::class)
object UsbCommunicationModule {
    @Provides
    fun provideUsbCommunicationRepository(
        context: Context,
        UsbPermReceiver: UsbPermissionBroadcastReceiver,
        UsbSerialReceiver: UsbSerialReceiver
    ): UsbCommunicationRepository {
        return UsbCommunicationRepositoryImpl(
            context,
            UsbPermReceiver,
            UsbSerialReceiver
        )
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