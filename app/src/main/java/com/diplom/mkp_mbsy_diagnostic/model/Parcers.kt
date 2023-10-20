package com.diplom.mkp_mbsy_diagnostic.model

fun byteArrayToMessage_17(bytes: ByteArray): Message_17? {
    if (bytes.size != 14) {
        return null
    }

    val id_head = bytes.copyOfRange(0, 2).toUShort()
    val id = bytes.copyOfRange(2, 4).toUShort()
    val LoSumm = bytes.copyOfRange(4, 6).toUShort()
    val HiSumm = bytes.copyOfRange(6, 8).toUShort()
    val MB_id = bytes.copyOfRange(8, 10).toUShort()
    val MK_id = bytes.copyOfRange(10, 12).toUShort()
    val Version = bytes[12]
    val PodVersion = bytes[13]
    val Month = bytes[14]
    val Year = bytes[15]

    return Message_17(id_head, id, LoSumm, HiSumm, MB_id, MK_id, Version, PodVersion, Month, Year)
}

fun byteArrayToMessage_21(bytes: ByteArray): Message_21? {
    if (bytes.size != 14) {
        return null
    }

    val id_head = bytes.copyOfRange(0, 2).toUShort()
    val id = bytes.copyOfRange(2, 4).toUShort()
    val LoSumm = bytes.copyOfRange(4, 6).toUShort()
    val HiSumm = bytes.copyOfRange(6, 8).toUShort()
    val MB_id = bytes.copyOfRange(8, 10).toUShort()
    val MK_id = bytes.copyOfRange(10, 12).toUShort()
    val KolErr = bytes.copyOfRange(12, 14).toUShort()
    val Sec = bytes.copyOfRange(14, 16).toUShort()

    return Message_21(id_head, id, LoSumm, HiSumm, MB_id, MK_id, KolErr, Sec)
}

fun byteArrayToMessage_39(bytes: ByteArray): Message_39? {
    if (bytes.size != 44) {
        return null
    }

    val id_head = bytes.copyOfRange(0, 2).toUShort()
    val id = bytes.copyOfRange(2, 4).toUShort()
    val LoSumm = bytes.copyOfRange(4, 6).toUShort()
    val HiSumm = bytes.copyOfRange(6, 8).toUShort()
    val MB_id = bytes.copyOfRange(8, 10).toUShort()
    val MK_id = bytes.copyOfRange(10, 12).toUShort()

    // Читаем 20 значений UShort из массива байт
    val charge = UShortArray(20)
    for (i in 0 until 20) {
        charge[i] = byteArrayToUShort(bytes.copyOfRange(12 + i * 2, 14 + i * 2))
    }

    return Message_39(id_head, id, LoSumm, HiSumm, MB_id, MK_id, charge)
}

fun byteArrayToMessage_63(bytes: ByteArray): Message_63? {
    if (bytes.size != 26) {
        return null
    }

    val id_head = byteArrayToUShort(bytes.copyOfRange(0, 2))
    val id = byteArrayToUShort(bytes.copyOfRange(2, 4))
    val LoSumm = byteArrayToUShort(bytes.copyOfRange(4, 6))
    val HiSumm = byteArrayToUShort(bytes.copyOfRange(6, 8))
    val MB_id = byteArrayToUShort(bytes.copyOfRange(8, 10))
    val MK_id = byteArrayToUShort(bytes.copyOfRange(10, 12))
    val param1 = bytes.copyOfRange(12, 14).toUShort()
    val param2 = bytes.copyOfRange(14, 16).toUShort()
    val param3 = bytes.copyOfRange(16, 18).toUShort()
    val param4 = bytes.copyOfRange(18, 20).toUShort()
    val param5 = byteArrayToUShort(bytes.copyOfRange(20, 22))
    val param6 = byteArrayToUShort(bytes.copyOfRange(22, 24))

    return Message_63(id_head, id, LoSumm, HiSumm, MB_id, MK_id, param1, param2, param3, param4, param5, param6)
}

fun byteArrayToUShort(byteArray: ByteArray): UShort {
    if (byteArray.size < 2) {
        throw IllegalArgumentException("ByteArray должен содержать как минимум 2 байта для преобразования в UShort")
    }
    val ushortValue: UShort = ((byteArray[1].toUShort() shl 8) or byteArray[0].toUShort()).toUShort()

    return ushortValue
}