package com.diplom.mkp_mbsy_diagnostic.datamodel

fun byteArrayToMessage_17(bytes: ByteArray): Message_17? {
    if (bytes.size != 16) {
        return null
    }

    val id_head = ((bytes[1].toInt() shl 8) or bytes[0].toInt()).toUShort()
    val id = ((bytes[3].toInt() shl 8) or bytes[2].toInt()).toUShort()
    val LoSumm = ((bytes[5].toInt() shl 8) or bytes[4].toInt()).toUShort()
    val HiSumm = ((bytes[7].toInt() shl 8) or bytes[6].toInt()).toUShort()
    val MB_id = ((bytes[9].toInt() shl 8) or bytes[8].toInt()).toUShort()
    val MK_id = ((bytes[11].toInt() shl 8) or bytes[10].toInt()).toUShort()
    val Version = bytes[12]
    val PodVersion = bytes[13]
    val Month = bytes[14]
    val Year = bytes[15]

    return Message_17(id_head, id, LoSumm, HiSumm, MB_id, MK_id, Version, PodVersion, Month, Year)
}

fun byteArrayToMessage_21(bytes: ByteArray): Message_21? {
    if (bytes.size != 16) {
        return null
    }

    val id_head = ((bytes[1].toInt() shl 8) or bytes[0].toInt()).toUShort()
    val id = ((bytes[3].toInt() shl 8) or bytes[2].toInt()).toUShort()
    val LoSumm = ((bytes[5].toInt() shl 8) or bytes[4].toInt()).toUShort()
    val HiSumm = ((bytes[7].toInt() shl 8) or bytes[6].toInt()).toUShort()
    val MB_id = ((bytes[9].toInt() shl 8) or bytes[8].toInt()).toUShort()
    val MK_id = ((bytes[11].toInt() shl 8) or bytes[10].toInt()).toUShort()
    val KolErr = ((bytes[13].toInt() shl 8) or bytes[12].toInt()).toUShort()
    val Sec = ((bytes[15].toInt() shl 8) or bytes[14].toInt()).toUShort()


    return Message_21(id_head, id, LoSumm, HiSumm, MB_id, MK_id, KolErr, Sec)
}

@OptIn(ExperimentalUnsignedTypes::class)
fun byteArrayToMessage_39(bytes: ByteArray): Message_39? {
    if (bytes.size != 52) {
        return null
    }

    val id_head = ((bytes[1].toInt() shl 8) or bytes[0].toInt()).toUShort()
    val id = ((bytes[3].toInt() shl 8) or bytes[2].toInt()).toUShort()
    val LoSumm = ((bytes[5].toInt() shl 8) or bytes[4].toInt()).toUShort()
    val HiSumm = ((bytes[7].toInt() shl 8) or bytes[6].toInt()).toUShort()
    val MB_id = ((bytes[9].toInt() shl 8) or bytes[8].toInt()).toUShort()
    val MK_id = ((bytes[11].toInt() shl 8) or bytes[10].toInt()).toUShort()
    val charge = byteArrayToUShortArray(bytes.copyOfRange(12, 52))

    return Message_39(id_head, id, LoSumm, HiSumm, MB_id, MK_id, charge)
}

fun byteArrayToMessage_63(bytes: ByteArray): Message_63? {
    if (bytes.size != 24) {
        return null
    }

    val id_head = ((bytes[1].toInt() shl 8) or bytes[0].toInt()).toUShort()
    val id = ((bytes[3].toInt() shl 8) or bytes[2].toInt()).toUShort()
    val LoSumm = ((bytes[5].toInt() shl 8) or bytes[4].toInt()).toUShort()
    val HiSumm = ((bytes[7].toInt() shl 8) or bytes[6].toInt()).toUShort()
    val MB_id = ((bytes[9].toInt() shl 8) or bytes[8].toInt()).toUShort()
    val MK_id = ((bytes[11].toInt() shl 8) or bytes[10].toInt()).toUShort()
    val param1 = ((bytes[13].toInt() shl 8) or bytes[12].toInt()).toUShort()
    val param2 = ((bytes[15].toInt() shl 8) or bytes[14].toInt()).toUShort()
    val param3 = ((bytes[17].toInt() shl 8) or bytes[16].toInt()).toUShort()
    val param4 = ((bytes[19].toInt() shl 8) or bytes[18].toInt()).toUShort()
    val param5 = ((bytes[21].toInt() shl 8) or bytes[20].toInt()).toUShort()
    val param6 = ((bytes[23].toInt() shl 8) or bytes[22].toInt()).toUShort()

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