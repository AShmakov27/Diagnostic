package com.diplom.mkp_mbsy_diagnostic.utils

import com.diplom.mkp_mbsy_diagnostic.data.usb.Message_16
import com.diplom.mkp_mbsy_diagnostic.data.usb.Message_20
import com.diplom.mkp_mbsy_diagnostic.data.usb.Message_38
import com.diplom.mkp_mbsy_diagnostic.data.usb.Message_54
import com.diplom.mkp_mbsy_diagnostic.data.usb.Message_62
import java.nio.ByteBuffer

fun Message_16toByteArray(message: Message_16): ByteArray {
    val buffer = ByteBuffer.allocate(4 + 4 + 4) // 4 байта на каждое поле (id_head, id, LoSumm, HiSumm, MB_id, MK_id)

    buffer.put(message.id_head)
    buffer.put(message.id)
    buffer.put(message.LoSumm)
    buffer.put(message.HiSumm)

    buffer.putShort(message.MB_id.toShort())
    buffer.putShort(message.MK_id.toShort())

    return buffer.array()
}

fun Message_20toByteArray(message: Message_20): ByteArray {
    val buffer = ByteBuffer.allocate(4 + 4 + 4)

    buffer.put(message.id_head)
    buffer.put(message.id)
    buffer.put(message.LoSumm)
    buffer.put(message.HiSumm)

    buffer.putShort(message.MB_id.toShort())
    buffer.putShort(message.MK_id.toShort())

    return buffer.array()
}

fun Message_38toByteArray(message: Message_38): ByteArray {
    val buffer = ByteBuffer.allocate(4 + 4 + 4)

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
    val buffer = ByteBuffer.allocate(4 + 4 + 4 + 40)

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
    val buffer = ByteBuffer.allocate(4 + 4 + 4)

    buffer.put(message.id_head)
    buffer.put(message.id)
    buffer.put(message.LoSumm)
    buffer.put(message.HiSumm)

    buffer.putShort(message.MB_id.toShort())
    buffer.putShort(message.MK_id.toShort())

    return buffer.array()
}