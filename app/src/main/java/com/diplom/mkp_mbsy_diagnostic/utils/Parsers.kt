package com.diplom.mkp_mbsy_diagnostic.utils

import com.diplom.mkp_mbsy_diagnostic.data.usb.Message_16
import com.diplom.mkp_mbsy_diagnostic.data.usb.Message_17
import com.diplom.mkp_mbsy_diagnostic.data.usb.Message_21
import com.diplom.mkp_mbsy_diagnostic.data.usb.Message_39
import com.diplom.mkp_mbsy_diagnostic.data.usb.Message_63

fun byteArrayToMessage_16(bytes: ByteArray): Message_16? {
    if (bytes.size != 8) {
        return null
    }

    val id_head = bytes[0]
    val id = bytes[1]
    val LoSumm = bytes[2]
    val HiSumm = bytes[3]
    val MB_id = ((bytes[5].toInt() shl 8) or bytes[4].toInt()).toUShort()
    val MK_id = ((bytes[7].toInt() shl 8) or bytes[6].toInt()).toUShort()

    return Message_16(id_head, id, LoSumm, HiSumm, MB_id, MK_id)
}

fun byteArrayToMessage_17(bytes: ByteArray): Message_17? {
    if (bytes.size != 12) {
        return null
    }

    val id_head = bytes[0]
    val id = bytes[1]
    val LoSumm = bytes[2]
    val HiSumm = bytes[3]
    val MB_id = ((bytes[5].toInt() shl 8) or bytes[4].toInt()).toUShort()
    val MK_id = ((bytes[7].toInt() shl 8) or bytes[6].toInt()).toUShort()
    val Version = bytes[8]
    val PodVersion = bytes[9]
    val Month = bytes[10]
    val Year = bytes[11]

    return Message_17(id_head, id, LoSumm, HiSumm, MB_id, MK_id, Version, PodVersion, Month, Year)
}

fun byteArrayToMessage_21(bytes: ByteArray): Message_21? {
    if (bytes.size != 12) {
        return null
    }

    val id_head = bytes[0]
    val id = bytes[1]
    val LoSumm = bytes[2]
    val HiSumm = bytes[3]
    val MB_id = ((bytes[5].toInt() shl 8) or bytes[4].toInt()).toUShort()
    val MK_id = ((bytes[7].toInt() shl 8) or bytes[6].toInt()).toUShort()
    val KolErr = ((bytes[9].toInt() shl 8) or bytes[8].toInt()).toUShort()
    val Sec = ((bytes[11].toInt() shl 8) or bytes[10].toInt()).toUShort()


    return Message_21(id_head, id, LoSumm, HiSumm, MB_id, MK_id, KolErr, Sec)
}

@OptIn(ExperimentalUnsignedTypes::class)
fun byteArrayToMessage_39(bytes: ByteArray): Message_39? {
    if (bytes.size != 48) {
        return null
    }

    val id_head = bytes[0]
    val id = bytes[1]
    val LoSumm = bytes[2]
    val HiSumm = bytes[3]
    val MB_id = ((bytes[5].toInt() shl 8) or bytes[4].toInt()).toUShort()
    val MK_id = ((bytes[7].toInt() shl 8) or bytes[6].toInt()).toUShort()
    val charge = byteArrayToUShortArray(bytes.copyOfRange(8, 48))

    return Message_39(id_head, id, LoSumm, HiSumm, MB_id, MK_id, charge)
}

fun byteArrayToMessage_63(bytes: ByteArray): Message_63? {
    if (bytes.size != 20) {
        return null
    }

    val id_head = bytes[0]
    val id = bytes[1]
    val LoSumm = bytes[2]
    val HiSumm = bytes[3]
    val MB_id = ((bytes[5].toInt() shl 8) or bytes[4].toInt()).toUShort()
    val MK_id = ((bytes[7].toInt() shl 8) or bytes[6].toInt()).toUShort()
    val param1 = ((bytes[9].toInt() shl 8) or bytes[8].toInt()).toUShort()
    val param2 = ((bytes[11].toInt() shl 8) or bytes[10].toInt()).toUShort()
    val param3 = ((bytes[13].toInt() shl 8) or bytes[12].toInt()).toUShort()
    val param4 = ((bytes[15].toInt() shl 8) or bytes[14].toInt()).toUShort()
    val param5 = ((bytes[17].toInt() shl 8) or bytes[16].toInt()).toUShort()
    val param6 = ((bytes[19].toInt() shl 8) or bytes[18].toInt()).toUShort()

    return Message_63(id_head, id, LoSumm, HiSumm, MB_id, MK_id, param1, param2, param3, param4, param5, param6)
}

@OptIn(ExperimentalUnsignedTypes::class)
fun byteArrayToUShortArray(byteArray: ByteArray): UShortArray {
    if (byteArray.size % 2 != 0) {
        throw IllegalArgumentException("ByteArray должен содержать четное количество байт для преобразования в UShortArray")
    }

    val ushortArray = UShortArray(byteArray.size / 2)

    for (i in 0 until byteArray.size step 2) {
        val value = (byteArray[i + 1].toInt() shl 8) or byteArray[i].toInt()
        ushortArray[i / 2] = value.toUShort()
    }

    return ushortArray
}