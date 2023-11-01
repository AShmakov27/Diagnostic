package com.diplom.mkp_mbsy_diagnostic.datamodel

import java.io.Serializable

open class Header(
    var id_head: UShort,
    var id: UShort,
    var LoSumm: UShort,
    var HiSumm: UShort
) : Serializable

class Message_16(
    id_head: UShort,
    id: UShort,
    LoSumm: UShort,
    HiSumm: UShort,
    var MB_id: UShort,
    var MK_id: UShort
) : Header(id_head, id, LoSumm, HiSumm)

class Message_17(
    id_head: UShort,
    id: UShort,
    LoSumm: UShort,
    HiSumm: UShort,
    var MB_id: UShort,
    var MK_id: UShort,
    var Version: Byte,
    var PodVersion: Byte,
    var Month: Byte,
    var Year: Byte
) : Header(id_head, id, LoSumm, HiSumm)

class Message_20(
    id_head: UShort,
    id: UShort,
    LoSumm: UShort,
    HiSumm: UShort,
    var MB_id: UShort,
    var MK_id: UShort
) : Header(id_head, id, LoSumm, HiSumm)

class Message_21(
    id_head: UShort,
    id: UShort,
    LoSumm: UShort,
    HiSumm: UShort,
    var MB_id: UShort,
    var MK_id: UShort,
    var KolErr: UShort,
    var Sec: UShort
) : Header(id_head, id, LoSumm, HiSumm)

class Message_38(
    id_head: UShort,
    id: UShort,
    LoSumm: UShort,
    HiSumm: UShort,
    var MB_id: UShort,
    var MK_id: UShort
) : Header(id_head, id, LoSumm, HiSumm)

class Message_39 @OptIn(ExperimentalUnsignedTypes::class) constructor(
    id_head: UShort,
    id: UShort,
    LoSumm: UShort,
    HiSumm: UShort,
    var MB_id: UShort,
    var MK_id: UShort,
    var Charge: UShortArray = UShortArray(20)
) : Header(id_head, id, LoSumm, HiSumm)

class Message_54 @OptIn(ExperimentalUnsignedTypes::class) constructor(
    id_head: UShort,
    id: UShort,
    LoSumm: UShort,
    HiSumm: UShort,
    var MB_id: UShort,
    var MK_id: UShort,
    var Underminning0: UShortArray = UShortArray(20)
) : Header(id_head, id, LoSumm, HiSumm)

class Message_62(
    id_head: UShort,
    id: UShort,
    LoSumm: UShort,
    HiSumm: UShort,
    var MB_id: UShort,
    var MK_id: UShort
) : Header(id_head, id, LoSumm, HiSumm)

class Message_63(
    id_head: UShort,
    id: UShort,
    LoSumm: UShort,
    HiSumm: UShort,
    var MB_id: UShort,
    var MK_id: UShort,
    var Param1: UShort,
    var Param2: UShort,
    var Param3: UShort,
    var Param4: UShort,
    var Param5: UShort,
    var Param6: UShort
) : Header(id_head, id, LoSumm, HiSumm)

class MBSYMessage(
    var Mes17: Message_17,
    var Mes21: Message_21?,
    var Mes63: Message_63?
) {
    var count_receive: Int = 0
    var count_send: Int = 0
}

class MKPMessage(
    var Mes21: Message_21,
    var Mes39: Message_39?,
    var Mes63: Message_63?,
) {
    var count_receive: Int = 0
    var count_send: Int = 0
}