package com.diplom.mkp_mbsy_diagnostic.model

class Message_16(
    var MB_id: UShort,
    var MK_id: UShort,
){}

class Message_17(
    var MB_id: UShort,
    var MK_id: UShort,
    var Version: Byte,
    var PodVersion: Byte,
    var Month: Byte,
    var Year: Byte
) {}

class Message_20(
    var MB_id: UShort,
    var MK_id: UShort,
){}

class Message_21(
    var MB_id: UShort,
    var MK_id: UShort,
    var KolErr: UShort,
    var Sec: UShort
){}

class Message_38(
    var MB_id: UShort,
    var MK_id: UShort,
){}

class Message_39 @OptIn(ExperimentalUnsignedTypes::class) constructor(
    var MB_id: UShort,
    var MK_id: UShort,
    var Charge: UShortArray = UShortArray(20)
) {}

class Message_54 @OptIn(ExperimentalUnsignedTypes::class) constructor(
    var MB_id: UShort,
    var MK_id: UShort,
    var Underminning0: UShortArray = UShortArray(20)
){}

class Message_62(
    var MB_id: UShort,
    var MK_id: UShort,

){}

class Message_63(
    var MB_id: UShort,
    var MK_id: UShort,
    var Param1: UShort,
    var Param2: UShort,
    var Param3: UShort,
    var Param4: UShort,
    var Param5: UShort,
    var Param6: UShort
) {}

class MBSYMessage(
    var Mes17: Message_17,
    var Mes21: Message_21,
    var Mes63: Message_63
){}

class MKPMessage(
    var Mes21: Message_21,
    var Mes39: Message_39,
    var Mes63: Message_63,
){}