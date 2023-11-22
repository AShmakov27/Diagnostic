package com.diplom.mkp_mbsy_diagnostic.utils

import com.diplom.mkp_mbsy_diagnostic.data.usb.Message_16
import com.diplom.mkp_mbsy_diagnostic.data.usb.Message_20
import com.diplom.mkp_mbsy_diagnostic.data.usb.Message_38
import com.diplom.mkp_mbsy_diagnostic.data.usb.Message_54
import com.diplom.mkp_mbsy_diagnostic.data.usb.Message_62
import java.nio.ByteBuffer
import java.nio.ByteOrder
import java.time.LocalDateTime

fun Message_16toByteArray(message: Message_16): ByteArray {
    val buffer = ByteBuffer.allocate(8)
    buffer.order(ByteOrder.LITTLE_ENDIAN)

    buffer.put(message.id_head)
    buffer.put(message.id)
    buffer.put(message.LoSumm)
    buffer.put(message.HiSumm)

    buffer.putShort(message.MB_id.toShort())
    buffer.putShort(message.MK_id.toShort())

    return buffer.array()
}

fun Message_20toByteArray(message: Message_20): ByteArray {
    val buffer = ByteBuffer.allocate(8)
    buffer.order(ByteOrder.LITTLE_ENDIAN)

    buffer.put(message.id_head)
    buffer.put(message.id)
    buffer.put(message.LoSumm)
    buffer.put(message.HiSumm)

    buffer.putShort(message.MB_id.toShort())
    buffer.putShort(message.MK_id.toShort())

    return buffer.array()
}

fun Message_38toByteArray(message: Message_38): ByteArray {
    val buffer = ByteBuffer.allocate(8)
    buffer.order(ByteOrder.LITTLE_ENDIAN)

    buffer.put(message.id_head)
    buffer.put(message.id)
    buffer.put(message.LoSumm)
    buffer.put(message.HiSumm)

    buffer.putShort(message.MB_id.toShort())
    buffer.putShort(message.MK_id.toShort())

    return buffer.array()
}

@OptIn(ExperimentalUnsignedTypes::class)
fun Message_54toByteArray(message: Message_54): ByteArray {
    val buffer = ByteBuffer.allocate(48)
    buffer.order(ByteOrder.LITTLE_ENDIAN)

    buffer.put(message.id_head)
    buffer.put(message.id)
    buffer.put(message.LoSumm)
    buffer.put(message.HiSumm)

    buffer.putShort(message.MB_id.toShort())
    buffer.putShort(message.MK_id.toShort())

    for (value in message.Underminning0) {
        buffer.putShort(value.toShort())
    }

    return buffer.array()
}

fun Message_62toByteArray(message: Message_62): ByteArray {
    val buffer = ByteBuffer.allocate(8)
    buffer.order(ByteOrder.LITTLE_ENDIAN)

    buffer.put(message.id_head)
    buffer.put(message.id)
    buffer.put(message.LoSumm)
    buffer.put(message.HiSumm)

    buffer.putShort(message.MB_id.toShort())
    buffer.putShort(message.MK_id.toShort())

    return buffer.array()
}

fun DateTimetoByteArray(time: LocalDateTime): ByteArray {
    val buffer = ByteBuffer.allocate(16)
    buffer.order(ByteOrder.LITTLE_ENDIAN)

    buffer.putShort(time.year.toShort())
    buffer.putShort(time.month.value.toShort())
    buffer.putShort(time.dayOfWeek.value.toShort())
    buffer.putShort(time.dayOfMonth.toShort())
    buffer.putShort(time.hour.toShort())
    buffer.putShort(time.minute.toShort())
    buffer.putShort(time.second.toShort())
    buffer.putShort((time.nano / 1000000).toShort())

    return buffer.array()
}