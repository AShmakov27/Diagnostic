package com.diplom.mkp_mbsy_diagnostic.utils.MSSLog

class MsgFromLog (
    var pos: Int,
    var ID: UInt,
    var size: Int,
    var date_time: String,
    var incoming_message: Byte,
    var msg_data: ByteArray
)
enum class Flag(val value: Int) {
    T_OP_UNDEF(0),
    T_OP_EQ(1)
}

class TStructField (
    var m_sName: String,
    var m_nEnumOp: Flag,
    var m_nEnumValue: IntArray,
    var m_sEnumValue: List<String>,
    var m_elseEnumValue: String
)