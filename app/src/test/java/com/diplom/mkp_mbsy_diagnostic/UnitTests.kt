package com.diplom.mkp_mbsy_diagnostic

import com.diplom.mkp_mbsy_diagnostic.data.usb.Message_16
import com.diplom.mkp_mbsy_diagnostic.data.usb.Message_17
import com.diplom.mkp_mbsy_diagnostic.data.usb.Message_20
import com.diplom.mkp_mbsy_diagnostic.data.usb.Message_21
import com.diplom.mkp_mbsy_diagnostic.data.usb.Message_38
import com.diplom.mkp_mbsy_diagnostic.data.usb.Message_39
import com.diplom.mkp_mbsy_diagnostic.data.usb.Message_54
import com.diplom.mkp_mbsy_diagnostic.data.usb.Message_62
import com.diplom.mkp_mbsy_diagnostic.data.usb.Message_63
import com.diplom.mkp_mbsy_diagnostic.utils.Message_16toByteArray
import com.diplom.mkp_mbsy_diagnostic.utils.Message_20toByteArray
import com.diplom.mkp_mbsy_diagnostic.utils.Message_38toByteArray
import com.diplom.mkp_mbsy_diagnostic.utils.Message_54toByteArray
import com.diplom.mkp_mbsy_diagnostic.utils.Message_62toByteArray
import com.diplom.mkp_mbsy_diagnostic.utils.byteArrayToMessage_17
import com.diplom.mkp_mbsy_diagnostic.utils.byteArrayToMessage_21
import com.diplom.mkp_mbsy_diagnostic.utils.byteArrayToMessage_39
import com.diplom.mkp_mbsy_diagnostic.utils.byteArrayToMessage_63
import com.diplom.mkp_mbsy_diagnostic.utils.byteArrayToUShortArray
import org.junit.Test

import org.junit.Assert.*
import java.util.BitSet

class UnitTests {
    @Test
    fun Parcer17_test() {
        val arr_17 = byteArrayOf(0x73, 0x11, 0x70, 0x43, 0x25, 0x00, 0x00, 0x00, 0x04, 0x03, 0x05, 0x14)
        val mess_17 = Message_17(115, 17, 112, 67, 37u, 0u, 4, 3, 5, 20)
        assertEquals(mess_17.id_head, byteArrayToMessage_17(arr_17)?.id_head)
        assertEquals(mess_17.id, byteArrayToMessage_17(arr_17)?.id)
        assertEquals(mess_17.LoSumm, byteArrayToMessage_17(arr_17)?.LoSumm)
        assertEquals(mess_17.HiSumm, byteArrayToMessage_17(arr_17)?.HiSumm)
        assertEquals(mess_17.MB_id, byteArrayToMessage_17(arr_17)?.MB_id)
        assertEquals(mess_17.MK_id, byteArrayToMessage_17(arr_17)?.MK_id)
        assertEquals(mess_17.Version, byteArrayToMessage_17(arr_17)?.Version)
        assertEquals(mess_17.PodVersion, byteArrayToMessage_17(arr_17)?.PodVersion)
        assertEquals(mess_17.Month, byteArrayToMessage_17(arr_17)?.Month)
        assertEquals(mess_17.Year, byteArrayToMessage_17(arr_17)?.Year)
    }

    @Test
    fun Parcer21_test() {
        val arr_21 = byteArrayOf(0x73, 0x11, 0x70, 0x43, 0x25, 0x00, 0x00, 0x00, 0x04, 0x00, 0x03, 0x00)
        val mess_21 = Message_21(115, 17, 112, 67, 37u, 0u, 4u, 3u)
        assertEquals(mess_21.id_head, byteArrayToMessage_21(arr_21)?.id_head)
        assertEquals(mess_21.id, byteArrayToMessage_21(arr_21)?.id)
        assertEquals(mess_21.LoSumm, byteArrayToMessage_21(arr_21)?.LoSumm)
        assertEquals(mess_21.HiSumm, byteArrayToMessage_21(arr_21)?.HiSumm)
        assertEquals(mess_21.MB_id, byteArrayToMessage_21(arr_21)?.MB_id)
        assertEquals(mess_21.MK_id, byteArrayToMessage_21(arr_21)?.MK_id)
        assertEquals(mess_21.KolErr, byteArrayToMessage_21(arr_21)?.KolErr)
        assertEquals(mess_21.Sec, byteArrayToMessage_21(arr_21)?.Sec)
    }

    @OptIn(ExperimentalUnsignedTypes::class)
    @Test
    fun Parcer39_test() {
        val arr_39 = byteArrayOf(0x73, 0x27, 0xB6.toByte(), 0xDC.toByte(), 0x25, 0x00, 0x58, 0x01, 0xFE.toByte(), 0xFF.toByte(), 0x0F, 0x00)
        val mess_39 = Message_39(115, 39, 182.toByte(), 220.toByte(), 37u, 344u, ushortArrayOf(65534u, 15u))
        assertEquals(mess_39.id_head, byteArrayToMessage_39(arr_39)?.id_head)
        assertEquals(mess_39.id, byteArrayToMessage_39(arr_39)?.id)
        assertEquals(mess_39.LoSumm, byteArrayToMessage_39(arr_39)?.LoSumm)
        assertEquals(mess_39.HiSumm, byteArrayToMessage_39(arr_39)?.HiSumm)
        assertEquals(mess_39.MB_id, byteArrayToMessage_39(arr_39)?.MB_id)
        assertEquals(mess_39.MK_id, byteArrayToMessage_39(arr_39)?.MK_id)
        assertEquals(mess_39.Charge[0], byteArrayToMessage_39(arr_39)?.Charge?.get(0))
        assertEquals(mess_39.Charge[1], byteArrayToMessage_39(arr_39)?.Charge?.get(1))
    }

    @Test
    fun Parcer63_test() {
        val arr_63 = byteArrayOf(0x73, 0x3F, 0x2A, 0x34, 0x25, 0x00, 0x00, 0x00, 0x82.toByte(), 0x00, 0x82.toByte(), 0x00, 0x00, 0x00, 0x64, 0x00, 0x00, 0x00, 0x27, 0x00)
        val mess_63 = Message_63(115,63,42,52,37u,0u,130u,130u,0u,100u,0u,39u)
        assertEquals(mess_63.id_head, byteArrayToMessage_63(arr_63)?.id_head)
        assertEquals(mess_63.id, byteArrayToMessage_63(arr_63)?.id)
        assertEquals(mess_63.LoSumm, byteArrayToMessage_63(arr_63)?.LoSumm)
        assertEquals(mess_63.HiSumm, byteArrayToMessage_63(arr_63)?.HiSumm)
        assertEquals(mess_63.MB_id, byteArrayToMessage_63(arr_63)?.MB_id)
        assertEquals(mess_63.MK_id, byteArrayToMessage_63(arr_63)?.MK_id)
        assertEquals(mess_63.Param1, byteArrayToMessage_63(arr_63)?.Param1)
        assertEquals(mess_63.Param2, byteArrayToMessage_63(arr_63)?.Param2)
        assertEquals(mess_63.Param3, byteArrayToMessage_63(arr_63)?.Param3)
        assertEquals(mess_63.Param4, byteArrayToMessage_63(arr_63)?.Param4)
        assertEquals(mess_63.Param5, byteArrayToMessage_63(arr_63)?.Param5)
        assertEquals(mess_63.Param6, byteArrayToMessage_63(arr_63)?.Param6)
    }

    @Test
    fun Message16ToArray_test() {
        val mess_16 = Message_16(115, 16, 11, 40, 37u, 0u)
        val arr_16 = byteArrayOf(0x73, 0x10, 0x0B, 0x28, 0x25, 0x00, 0x00, 0x00)
        assertEquals(arr_16.contentToString(), Message_16toByteArray(mess_16).contentToString())
    }

    @Test
    fun Message20ToArray_test() {
        val mess_20 = Message_20(115, 16, 11, 40, 37u, 0u)
        val arr_20 = byteArrayOf(0x73, 0x10, 0x0B, 0x28, 0x25, 0x00, 0x00, 0x00)
        assertEquals(arr_20.contentToString(), Message_20toByteArray(mess_20).contentToString())
    }

    @Test
    fun Message38ToArray_test() {
        val mess_38 = Message_38(115, 16, 11, 40, 37u, 0u)
        val arr_38 = byteArrayOf(0x73, 0x10, 0x0B, 0x28, 0x25, 0x00, 0x00, 0x00)
        assertEquals(arr_38.contentToString(), Message_38toByteArray(mess_38).contentToString())
    }

    @OptIn(ExperimentalUnsignedTypes::class)
    @Test
    fun Message54ToArray_test() {
        val mess_54 = Message_54(115, 16, 11, 40, 37u, 0u, ushortArrayOf(16384u, 0u))
        val arr_54 = byteArrayOf(0x73, 0x10, 0x0B, 0x28, 0x25, 0x00, 0x00, 0x00, 0x00, 0x40, 0x00, 0x00)
        assertEquals(arr_54.contentToString(), Message_54toByteArray(mess_54).contentToString())
    }

    @Test
    fun Message62ToArray_test() {
        val mess_62 = Message_62(115, 16, 11, 40, 37u, 0u)
        val arr_62 = byteArrayOf(0x73, 0x10, 0x0B, 0x28, 0x25, 0x00, 0x00, 0x00)
        assertEquals(arr_62.contentToString(), Message_62toByteArray(mess_62).contentToString())
    }

    @OptIn(ExperimentalUnsignedTypes::class)
    @Test
    fun createUnderminingArray_test() {
        var Underminning0 = UShortArray(2)
        for (i in Underminning0.indices) {
            Underminning0.set(index = i, value = 0u)
        }

        val Underminning0_bit = BitSet(32)
        Underminning0_bit.set(14, true)

        val arr = ByteArray(4)
        Underminning0_bit.toByteArray().copyInto(arr)
        Underminning0 = byteArrayToUShortArray(arr)

        val Underminning_true = ushortArrayOf(16384u, 0u)
        assertEquals(Underminning_true.contentToString(), Underminning0.contentToString())
    }
}