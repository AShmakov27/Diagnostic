package com.diplom.mkp_mbsy_diagnostic.utils.MSSLog

import java.nio.ByteBuffer
import java.nio.ByteOrder

fun PD_chooser_be(id: Int): List<TStructField>? {
    when (id) {
        10 -> return PD_10_be
        100 -> return PD_100_be
        110 -> return PD_110
        222 -> return PD_222
        223 -> return PD_223
        300 -> return PD_300
        305 -> return PD_305
        310 -> return PD_310
        315 -> return PD_315
        320 -> return PD_320
        321 -> return PD_321
        322 -> return PD_322
        323 -> return PD_323
        324 -> return PD_324
        325 -> return PD_325
        326 -> return PD_326
        400 -> return PD_400
        410 -> return PD_410
        411 -> return PD_411
        412 -> return PD_412
        500 -> return PD_500
        510 -> return PD_510
        511 -> return PD_511
        512 -> return PD_512
    }
    return null
}

fun process_data_be(id: Int, data: ByteArray):List<Comparable<*>>? {
    val msg: List<Comparable<*>>?
    when (id) {
        10 -> {
            msg = listOf(
                ((data[1].toUByte().toInt() shl 8) or data[0].toUByte().toInt()).toUShort(),
                data[2].toUByte(),
                ((data[4].toUByte().toInt() shl 8) or data[3].toUByte().toInt()).toUShort(),
                data[5].toUByte(),
                data[6].toUByte(),
                (ByteBuffer.wrap(data, 7, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt() and 0x00FFFFFF.toUInt() shr Integer.numberOfTrailingZeros(0x00FFFFFF)).toInt() * 0.01,
                ByteBuffer.wrap(data, 7, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt() and 0xFF000000.toUInt() shr Integer.numberOfTrailingZeros(0xFF000000.toInt()),
                data[11].toUByte().toUInt() and 0x000001.toUByte().toUInt() shr Integer.numberOfTrailingZeros(0x000001),
                data[11].toUByte().toUInt() and 0x000010.toUByte().toUInt() shr Integer.numberOfTrailingZeros(0x000010),
                data[11].toUByte().toUInt() and 0x000008.toUByte().toUInt() shr Integer.numberOfTrailingZeros(0x000008),

                ByteBuffer.wrap(data, 12, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt(),

                ByteBuffer.wrap(data, 16, 4).order(ByteOrder.LITTLE_ENDIAN).int * 0.0000001,
                ByteBuffer.wrap(data, 20, 4).order(ByteOrder.LITTLE_ENDIAN).int * 0.0000001,
                ByteBuffer.wrap(data, 24, 4).order(ByteOrder.LITTLE_ENDIAN).int * 0.01,

                ByteBuffer.wrap(data, 28, 4).order(ByteOrder.LITTLE_ENDIAN).int * 0.01,
                ByteBuffer.wrap(data, 32, 4).order(ByteOrder.LITTLE_ENDIAN).int * 0.01,
                ByteBuffer.wrap(data, 36, 4).order(ByteOrder.LITTLE_ENDIAN).int * 0.01
            )
            return msg
        }

        100 -> {
            msg = listOf(
                ((data[1].toUByte().toInt() shl 8) or data[0].toUByte().toInt()).toUShort(),
                data[2].toUByte(),

                data[3].toUByte(),
                data[4].toUByte(),
                ByteBuffer.wrap(data, 5, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt(),
                ByteBuffer.wrap(data, 9, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt(),
                ByteBuffer.wrap(data, 13, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt(),
                ByteBuffer.wrap(data, 17, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt(),

                ((data[22].toUByte().toInt() shl 8) or data[21].toUByte().toInt()).toUShort()
            )
            return msg
        }

        110 -> {
            msg = listOf(
                ((data[1].toUByte().toInt() shl 8) or data[0].toUByte().toInt()).toUShort(),
                data[2].toUByte(),
                ((data[4].toUByte().toInt() shl 8) or data[3].toUByte().toInt()).toUShort(),
                data[5].toUByte(),
                data[6].toUByte(),
                (ByteBuffer.wrap(data, 7, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt() and 0x00FFFFFF.toUInt() shr Integer.numberOfTrailingZeros(0x00FFFFFF)).toInt() * 0.01,
                ByteBuffer.wrap(data, 7, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt() and 0xFF000000.toUInt() shr Integer.numberOfTrailingZeros(0xFF000000.toInt()),
                data[11].toUByte().toUInt() and 0x000001.toUByte().toUInt() shr Integer.numberOfTrailingZeros(0x000001),
                data[11].toUByte().toUInt() and 0x000010.toUByte().toUInt() shr Integer.numberOfTrailingZeros(0x000010),
                data[11].toUByte().toUInt() and 0x000008.toUByte().toUInt() shr Integer.numberOfTrailingZeros(0x000008),

                ByteBuffer.wrap(data, 12, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt(),

                ByteBuffer.wrap(data, 16, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt().toInt() * 0.0000001,
                ByteBuffer.wrap(data, 20, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt().toInt() * 0.0000001,
                ByteBuffer.wrap(data, 24, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt().toInt() * 0.01,

                ByteBuffer.wrap(data, 28, 4).order(ByteOrder.LITTLE_ENDIAN).int * 0.01,
                ByteBuffer.wrap(data, 32, 4).order(ByteOrder.LITTLE_ENDIAN).int * 0.01,
                ByteBuffer.wrap(data, 36, 4).order(ByteOrder.LITTLE_ENDIAN).int * 0.01,
                ((data[41].toUByte().toInt() shl 8) or data[40].toUByte().toInt()).toUShort().toInt() * 0.01,
                ((data[43].toUByte().toInt() shl 8) or data[42].toUByte().toInt()).toShort() * 0.01,
                ((data[45].toUByte().toInt() shl 8) or data[44].toUByte().toInt()).toShort() * 0.01,
                ByteBuffer.wrap(data, 46, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt().toInt() * 0.01,
                ByteBuffer.wrap(data, 50, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt().toInt() * 0.01,

                ((data[55].toUByte().toInt() shl 8) or data[54].toUByte().toInt()).toShort() * 0.01,
                ((data[57].toUByte().toInt() shl 8) or data[56].toUByte().toInt()).toShort() * 0.01,
                ((data[59].toUByte().toInt() shl 8) or data[58].toUByte().toInt()).toShort() * 0.01,
                ((data[61].toUByte().toInt() shl 8) or data[60].toUByte().toInt()).toShort() * 0.01,
                ByteBuffer.wrap(data, 62, 4).order(ByteOrder.LITTLE_ENDIAN).int * 0.01,
                ((data[67].toUByte().toInt() shl 8) or data[66].toUByte().toInt()) * 0.01,
                ((data[69].toUByte().toInt() shl 8) or data[68].toUByte().toInt()).toUShort(),
                ((data[71].toUByte().toInt() shl 8) or data[70].toUByte().toInt()).toUShort(),
                ((data[73].toUByte().toInt() shl 8) or data[72].toUByte().toInt()).toUShort(),
                ((data[75].toUByte().toInt() shl 8) or data[74].toUByte().toInt()).toShort() * 0.1,
                ((data[77].toUByte().toInt() shl 8) or data[76].toUByte().toInt()).toShort() * 0.1,

                ByteBuffer.wrap(data, 78, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt(),

                ByteBuffer.wrap(data, 78, 4).order(ByteOrder.LITTLE_ENDIAN).int and 0x07 shr Integer.numberOfTrailingZeros(0x07),

                ByteBuffer.wrap(data, 78, 4).order(ByteOrder.LITTLE_ENDIAN).int and 0x38 shr Integer.numberOfTrailingZeros(0x38),

                ByteBuffer.wrap(data, 78, 4).order(ByteOrder.LITTLE_ENDIAN).int and 0x03C0 shr Integer.numberOfTrailingZeros(0x03C0),

                ByteBuffer.wrap(data, 78, 4).order(ByteOrder.LITTLE_ENDIAN).int and 0x03FC00 shr Integer.numberOfTrailingZeros(0x03FC00),

                ByteBuffer.wrap(data, 78, 4).order(ByteOrder.LITTLE_ENDIAN).int and 0x00040000 shr Integer.numberOfTrailingZeros(0x00040000),
                ByteBuffer.wrap(data, 78, 4).order(ByteOrder.LITTLE_ENDIAN).int and 0x00080000 shr Integer.numberOfTrailingZeros(0x00080000),
                ByteBuffer.wrap(data, 78, 4).order(ByteOrder.LITTLE_ENDIAN).int and 0x00100000 shr Integer.numberOfTrailingZeros(0x00100000),
                ByteBuffer.wrap(data, 78, 4).order(ByteOrder.LITTLE_ENDIAN).int and 0x00200000 shr Integer.numberOfTrailingZeros(0x00200000),
                ByteBuffer.wrap(data, 78, 4).order(ByteOrder.LITTLE_ENDIAN).int and 0x00400000 shr Integer.numberOfTrailingZeros(0x00400000),
                ByteBuffer.wrap(data, 78, 4).order(ByteOrder.LITTLE_ENDIAN).int and 0x00800000 shr Integer.numberOfTrailingZeros(0x00800000),
                ByteBuffer.wrap(data, 78, 4).order(ByteOrder.LITTLE_ENDIAN).int and 0x01000000 shr Integer.numberOfTrailingZeros(0x01000000),
                ByteBuffer.wrap(data, 78, 4).order(ByteOrder.LITTLE_ENDIAN).int and 0x02000000 shr Integer.numberOfTrailingZeros(0x02000000),
                ByteBuffer.wrap(data, 78, 4).order(ByteOrder.LITTLE_ENDIAN).int and 0x04000000 shr Integer.numberOfTrailingZeros(0x04000000),
                ByteBuffer.wrap(data, 78, 4).order(ByteOrder.LITTLE_ENDIAN).int and 0x08000000 shr Integer.numberOfTrailingZeros(0x08000000),
                ByteBuffer.wrap(data, 78, 4).order(ByteOrder.LITTLE_ENDIAN).int and 0x10000000 shr Integer.numberOfTrailingZeros(0x10000000),
                ByteBuffer.wrap(data, 78, 4).order(ByteOrder.LITTLE_ENDIAN).int and 0x20000000 shr Integer.numberOfTrailingZeros(0x20000000),
                ByteBuffer.wrap(data, 78, 4).order(ByteOrder.LITTLE_ENDIAN).int and 0x40000000 shr Integer.numberOfTrailingZeros(0x40000000),
                ByteBuffer.wrap(data, 78, 4).order(ByteOrder.LITTLE_ENDIAN).int and 0x80000000.toInt() shr Integer.numberOfTrailingZeros(0x80000000.toInt()),

                ByteBuffer.wrap(data, 82, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt(),

                ByteBuffer.wrap(data, 82, 4).order(ByteOrder.LITTLE_ENDIAN).int and 0x00000001 shr Integer.numberOfTrailingZeros(0x00000001),
                ByteBuffer.wrap(data, 82, 4).order(ByteOrder.LITTLE_ENDIAN).int and 0x00000002 shr Integer.numberOfTrailingZeros(0x00000002),
                ByteBuffer.wrap(data, 82, 4).order(ByteOrder.LITTLE_ENDIAN).int and 0x00000004 shr Integer.numberOfTrailingZeros(0x00000004),

                ByteBuffer.wrap(data, 82, 4).order(ByteOrder.LITTLE_ENDIAN).int and 0x00000008 shr Integer.numberOfTrailingZeros(0x00000008),
                ByteBuffer.wrap(data, 82, 4).order(ByteOrder.LITTLE_ENDIAN).int and 0x00000010 shr Integer.numberOfTrailingZeros(0x00000010),
                ByteBuffer.wrap(data, 82, 4).order(ByteOrder.LITTLE_ENDIAN).int and 0x00000020 shr Integer.numberOfTrailingZeros(0x00000020),
                ByteBuffer.wrap(data, 82, 4).order(ByteOrder.LITTLE_ENDIAN).int and 0x00000040 shr Integer.numberOfTrailingZeros(0x00000040),
                ByteBuffer.wrap(data, 82, 4).order(ByteOrder.LITTLE_ENDIAN).int and 0x00000080 shr Integer.numberOfTrailingZeros(0x00000080),
                ByteBuffer.wrap(data, 82, 4).order(ByteOrder.LITTLE_ENDIAN).int and 0x00000100 shr Integer.numberOfTrailingZeros(0x00000100),
                ByteBuffer.wrap(data, 82, 4).order(ByteOrder.LITTLE_ENDIAN).int and 0x00000200 shr Integer.numberOfTrailingZeros(0x00000200),
                ByteBuffer.wrap(data, 82, 4).order(ByteOrder.LITTLE_ENDIAN).int and 0x00000400 shr Integer.numberOfTrailingZeros(0x00000400),

                ByteBuffer.wrap(data, 82, 4).order(ByteOrder.LITTLE_ENDIAN).int and 0x02000000 shr Integer.numberOfTrailingZeros(0x02000000),
                ByteBuffer.wrap(data, 82, 4).order(ByteOrder.LITTLE_ENDIAN).int and 0x04000000 shr Integer.numberOfTrailingZeros(0x04000000),
                ByteBuffer.wrap(data, 82, 4).order(ByteOrder.LITTLE_ENDIAN).int and 0x08000000 shr Integer.numberOfTrailingZeros(0x08000000),
                ByteBuffer.wrap(data, 82, 4).order(ByteOrder.LITTLE_ENDIAN).int and 0x10000000 shr Integer.numberOfTrailingZeros(0x10000000),
                ByteBuffer.wrap(data, 82, 4).order(ByteOrder.LITTLE_ENDIAN).int and 0x20000000 shr Integer.numberOfTrailingZeros(0x20000000),
                ByteBuffer.wrap(data, 82, 4).order(ByteOrder.LITTLE_ENDIAN).int and 0x40000000 shr Integer.numberOfTrailingZeros(0x40000000),
                ByteBuffer.wrap(data, 82, 4).order(ByteOrder.LITTLE_ENDIAN).int and 0x80000000.toInt() shr Integer.numberOfTrailingZeros(0x80000000.toInt()),

                ByteBuffer.wrap(data, 86, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt()
            )
            return msg
        }

        222 -> {
            msg = listOf(
                ((data[1].toUByte().toInt() shl 8) or data[0].toUByte().toInt()).toUShort(),
                data[2].toUByte(),
                ((data[4].toUByte().toInt() shl 8) or data[3].toUByte().toInt()).toUShort(),
                data[5].toUByte(),
                data[6].toUByte(),
                (ByteBuffer.wrap(data, 7, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt() and 0x00FFFFFF.toUInt() shr Integer.numberOfTrailingZeros(0x00FFFFFF)).toInt() * 0.01,
                ByteBuffer.wrap(data, 7, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt() and 0xFF000000.toUInt() shr Integer.numberOfTrailingZeros(0xFF000000.toInt()),
                data[11].toUByte().toUInt() and 0x000010.toUByte().toUInt() shr Integer.numberOfTrailingZeros(0x000010),
                data[11].toUByte().toUInt() and 0x000008.toUByte().toUInt() shr Integer.numberOfTrailingZeros(0x000008),
                data[11].toUByte().toUInt() and 0x000001.toUByte().toUInt() shr Integer.numberOfTrailingZeros(0x000001),
                data[11].toUByte().toUInt() and 0x000002.toUByte().toUInt() shr Integer.numberOfTrailingZeros(0x000002),
                data[11].toUByte().toUInt() and 0x000004.toUByte().toUInt() shr Integer.numberOfTrailingZeros(0x000004),

                ((data[13].toUByte().toInt() shl 8) or data[12].toUByte().toInt()).toUShort(),
                ((data[15].toUByte().toInt() shl 8) or data[14].toUByte().toInt()).toUShort(),
                ByteBuffer.wrap(data, 16, 8).order(ByteOrder.LITTLE_ENDIAN).double,
                ByteBuffer.wrap(data, 24, 4).order(ByteOrder.LITTLE_ENDIAN).float,
                ByteBuffer.wrap(data, 28, 8).order(ByteOrder.LITTLE_ENDIAN).double,
                ByteBuffer.wrap(data, 36, 8).order(ByteOrder.LITTLE_ENDIAN).double,
                ByteBuffer.wrap(data, 44, 8).order(ByteOrder.LITTLE_ENDIAN).double,
                data[52].toUByte(),
                data[53].toUByte(),

                ((data[55].toUByte().toInt() shl 8) or data[54].toUByte().toInt()).toUShort(),
                ((data[57].toUByte().toInt() shl 8) or data[56].toUByte().toInt()).toUShort(),
                ByteBuffer.wrap(data, 58, 8).order(ByteOrder.LITTLE_ENDIAN).double,
                ByteBuffer.wrap(data, 66, 4).order(ByteOrder.LITTLE_ENDIAN).float,
                ByteBuffer.wrap(data, 70, 8).order(ByteOrder.LITTLE_ENDIAN).double,
                ByteBuffer.wrap(data, 78, 8).order(ByteOrder.LITTLE_ENDIAN).double,
                ByteBuffer.wrap(data, 86, 8).order(ByteOrder.LITTLE_ENDIAN).double,
                data[87].toUByte(),
                data[88].toUByte()
            )
            return msg
        }

        223 -> {
            msg = listOf(
                ((data[1].toUByte().toInt() shl 8) or data[0].toUByte().toInt()).toUShort(),
                data[2].toUByte(),
                ((data[4].toUByte().toInt() shl 8) or data[3].toUByte().toInt()).toUShort(),
                data[5].toUByte(),

                data[6].toUByte().toUInt() and 0x000001.toUByte().toUInt() shr Integer.numberOfTrailingZeros(0x000001),
                data[6].toUByte().toUInt() and 0x000002.toUByte().toUInt() shr Integer.numberOfTrailingZeros(0x000002),
                data[6].toUByte().toUInt() and 0x000004.toUByte().toUInt() shr Integer.numberOfTrailingZeros(0x000004),

                ((data[8].toUByte().toInt() shl 8) or data[7].toUByte().toInt()).toUShort(),
                ((data[10].toUByte().toInt() shl 8) or data[9].toUByte().toInt()).toUShort(),
                ByteBuffer.wrap(data, 11, 8).order(ByteOrder.LITTLE_ENDIAN).double,
                ByteBuffer.wrap(data, 19, 4).order(ByteOrder.LITTLE_ENDIAN).float,
                ByteBuffer.wrap(data, 23, 8).order(ByteOrder.LITTLE_ENDIAN).double,
                ByteBuffer.wrap(data, 31, 8).order(ByteOrder.LITTLE_ENDIAN).double,
                ByteBuffer.wrap(data, 39, 8).order(ByteOrder.LITTLE_ENDIAN).double,
                data[47].toUByte(),
                data[48].toUByte(),

                ((data[50].toUByte().toInt() shl 8) or data[49].toUByte().toInt()).toUShort(),
                ((data[52].toUByte().toInt() shl 8) or data[51].toUByte().toInt()).toUShort(),
                ByteBuffer.wrap(data, 53, 8).order(ByteOrder.LITTLE_ENDIAN).double,
                ByteBuffer.wrap(data, 61, 4).order(ByteOrder.LITTLE_ENDIAN).float,
                ByteBuffer.wrap(data, 65, 8).order(ByteOrder.LITTLE_ENDIAN).double,
                ByteBuffer.wrap(data, 73, 8).order(ByteOrder.LITTLE_ENDIAN).double,
                ByteBuffer.wrap(data, 81, 8).order(ByteOrder.LITTLE_ENDIAN).double,
                data[89].toUByte(),
                data[90].toUByte()
            )
            return msg
        }

        300 -> {
            msg = listOf(
                ((data[1].toUByte().toInt() shl 8) or data[0].toUByte().toInt()).toUShort(),
                data[2].toUByte(),
                ((data[4].toUByte().toInt() shl 8) or data[3].toUByte().toInt()).toUShort(),
                data[5].toUByte(),
                data[6].toUByte(),
                (ByteBuffer.wrap(data, 7, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt() and 0x00FFFFFF.toUInt() shr Integer.numberOfTrailingZeros(0x00FFFFFF)).toInt() * 0.01,
                ByteBuffer.wrap(data, 7, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt() and 0xFF000000.toUInt() shr Integer.numberOfTrailingZeros(0xFF000000.toInt()),
                data[11].toUByte().toUInt() and 0x000010.toUByte().toUInt() shr Integer.numberOfTrailingZeros(0x000010),
                data[11].toUByte().toUInt() and 0x000008.toUByte().toUInt() shr Integer.numberOfTrailingZeros(0x000008),

                ByteBuffer.wrap(data, 12, 4).order(ByteOrder.LITTLE_ENDIAN).int * 0.01,
                ByteBuffer.wrap(data, 16, 4).order(ByteOrder.LITTLE_ENDIAN).int * 0.01,
                ByteBuffer.wrap(data, 20, 4).order(ByteOrder.LITTLE_ENDIAN).int * 0.01,

                ByteBuffer.wrap(data, 24, 4).order(ByteOrder.LITTLE_ENDIAN).int * 0.01,
                ((data[29].toUByte().toInt() shl 8) or data[28].toUByte().toInt()).toUShort(),
                ByteBuffer.wrap(data, 30, 4).order(ByteOrder.LITTLE_ENDIAN).int * 0.01,
                ByteBuffer.wrap(data, 34, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt(),
                ByteBuffer.wrap(data, 38, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt(),
                ByteBuffer.wrap(data, 42, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt(),
                ByteBuffer.wrap(data, 46, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt(),
                ByteBuffer.wrap(data, 50, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt(),
                ByteBuffer.wrap(data, 54, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt(),

                ByteBuffer.wrap(data, 58, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt(),
                ByteBuffer.wrap(data, 58, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt() and 0x00800000.toUInt() shr Integer.numberOfTrailingZeros(0x00800000),
                ByteBuffer.wrap(data, 58, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt() and 0x01000000.toUInt() shr Integer.numberOfTrailingZeros(0x01000000),

                ByteBuffer.wrap(data, 58, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt() and 0x0000000F.toUInt() shr Integer.numberOfTrailingZeros(0x0000000F),

                ByteBuffer.wrap(data, 58, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt() and 0x00070000.toUInt() shr Integer.numberOfTrailingZeros(0x00070000),

                ByteBuffer.wrap(data, 58, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt() and 0x00380000.toUInt()  shr Integer.numberOfTrailingZeros(0x00380000),

                ByteBuffer.wrap(data, 62, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt(),
                ByteBuffer.wrap(data, 66, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt(),

                ByteBuffer.wrap(data, 70, 4).order(ByteOrder.LITTLE_ENDIAN).int * 0.01,
                ((data[75].toUByte().toInt() shl 8) or data[74].toUByte().toInt()).toShort() * 0.01,
                ((data[77].toUByte().toInt() shl 8) or data[76].toUByte().toInt()).toShort() * 0.01,

                ((data[79].toUByte().toInt() shl 8) or data[78].toUByte().toInt()).toShort() * 0.01,
                ((data[81].toUByte().toInt() shl 8) or data[80].toUByte().toInt()).toShort() * 0.01,
                ((data[83].toUByte().toInt() shl 8) or data[82].toUByte().toInt()).toShort() * 0.01,

                ((data[85].toUByte().toInt() shl 8) or data[84].toUByte().toInt()).toShort(),

                ((data[87].toUByte().toInt() shl 8) or data[86].toUByte().toInt()).toUShort(),
                ByteBuffer.wrap(data, 88, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt()
            )
            return msg
        }

        305 -> {
            msg = listOf(
                ((data[1].toUByte().toInt() shl 8) or data[0].toUByte().toInt()).toUShort(),
                data[2].toUByte(),
                ((data[4].toUByte().toInt() shl 8) or data[3].toUByte().toInt()).toUShort(),
                data[5].toUByte(),
                data[6].toUByte(),
                (ByteBuffer.wrap(data, 7, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt() and 0x00FFFFFF.toUInt() shr Integer.numberOfTrailingZeros(0x00FFFFFF)).toInt() * 0.01,
                ByteBuffer.wrap(data, 7, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt() and 0xFF000000.toUInt() shr Integer.numberOfTrailingZeros(0xFF000000.toInt()),
                data[11].toUByte().toUInt() and 0x000010.toUByte().toUInt() shr Integer.numberOfTrailingZeros(0x000010),
                data[11].toUByte().toUInt() and 0x000008.toUByte().toUInt() shr Integer.numberOfTrailingZeros(0x000008),

                ByteBuffer.wrap(data, 12, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt(),
                ByteBuffer.wrap(data, 16, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt(),
                ByteBuffer.wrap(data, 20, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt(),
                ByteBuffer.wrap(data, 24, 4).order(ByteOrder.LITTLE_ENDIAN).int * 0.01,
                ByteBuffer.wrap(data, 28, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt(),
                ((data[33].toUByte().toInt() shl 8) or data[32].toUByte().toInt()).toUShort(),

                ByteBuffer.wrap(data, 34, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt(),
                ByteBuffer.wrap(data, 38, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt(),
                ByteBuffer.wrap(data, 42, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt(),
                ByteBuffer.wrap(data, 46, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt(),
                ByteBuffer.wrap(data, 50, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt(),
                ByteBuffer.wrap(data, 54, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt(),
                ByteBuffer.wrap(data, 58, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt(),
                ByteBuffer.wrap(data, 62, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt(),
                ByteBuffer.wrap(data, 66, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt(),
                ByteBuffer.wrap(data, 70, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt(),
                ByteBuffer.wrap(data, 74, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt(),
                ((data[79].toUByte().toInt() shl 8) or data[78].toUByte().toInt()).toShort() * 0.1,
                ((data[81].toUByte().toInt() shl 8) or data[80].toUByte().toInt()).toShort() * 0.1
            )
            return msg
        }

        310 -> {
            msg = listOf(
                ((data[1].toUByte().toInt() shl 8) or data[0].toUByte().toInt()).toUShort(),
                data[2].toUByte(),
                ((data[4].toUByte().toInt() shl 8) or data[3].toUByte().toInt()).toUShort(),
                data[5].toUByte(),
                data[6].toUByte(),
                (ByteBuffer.wrap(data, 7, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt() and 0x00FFFFFF.toUInt() shr Integer.numberOfTrailingZeros(0x00FFFFFF)).toInt() * 0.01,
                ByteBuffer.wrap(data, 7, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt() and 0xFF000000.toUInt() shr Integer.numberOfTrailingZeros(0xFF000000.toInt()),
                data[11].toUByte().toUInt() and 0x000010.toUByte().toUInt() shr Integer.numberOfTrailingZeros(0x000010),
                data[11].toUByte().toUInt() and 0x000008.toUByte().toUInt() shr Integer.numberOfTrailingZeros(0x000008),

                ((data[13].toUByte().toInt() shl 8) or data[12].toUByte().toInt()).toShort() * 0.1,
                ((data[15].toUByte().toInt() shl 8) or data[14].toUByte().toInt()).toShort() * 0.1,
                ByteBuffer.wrap(data, 16, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt(),
                ByteBuffer.wrap(data, 20, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt(),
                ByteBuffer.wrap(data, 24, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt(),
                ByteBuffer.wrap(data, 28, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt(),
                ((data[33].toUByte().toInt() shl 8) or data[32].toUByte().toInt()).toUShort(),
                ByteBuffer.wrap(data, 34, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt(),
                ((data[39].toUByte().toInt() shl 8) or data[38].toUByte().toInt()).toUShort(),
                ((data[41].toUByte().toInt() shl 8) or data[40].toUByte().toInt()).toShort() * 0.1,
                ((data[43].toUByte().toInt() shl 8) or data[42].toUByte().toInt()).toShort() * 0.1,
                ((data[45].toUByte().toInt() shl 8) or data[44].toUByte().toInt()).toUShort(),
                ((data[47].toUByte().toInt() shl 8) or data[46].toUByte().toInt()).toShort()
            )
            return msg
        }

        315 -> {
            msg = listOf(
                ((data[1].toUByte().toInt() shl 8) or data[0].toUByte().toInt()).toUShort(),
                data[2].toUByte(),
                ((data[4].toUByte().toInt() shl 8) or data[3].toUByte().toInt()).toUShort(),
                data[5].toUByte(),
                data[6].toUByte(),
                (ByteBuffer.wrap(data, 7, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt() and 0x00FFFFFF.toUInt() shr Integer.numberOfTrailingZeros(0x00FFFFFF)).toInt() * 0.01,
                ByteBuffer.wrap(data, 7, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt() and 0xFF000000.toUInt() shr Integer.numberOfTrailingZeros(0xFF000000.toInt()),
                data[11].toUByte().toUInt() and 0x000010.toUByte().toUInt() shr Integer.numberOfTrailingZeros(0x000010),
                data[11].toUByte().toUInt() and 0x000008.toUByte().toUInt() shr Integer.numberOfTrailingZeros(0x000008),

                ByteBuffer.wrap(data, 12, 4).order(ByteOrder.LITTLE_ENDIAN).int,
                ByteBuffer.wrap(data, 16, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt(),
                ((data[21].toUByte().toInt() shl 8) or data[20].toUByte().toInt()).toShort() * 0.1,
                ((data[23].toUByte().toInt() shl 8) or data[22].toUByte().toInt()).toShort() * 0.1,
                ((data[25].toUByte().toInt() shl 8) or data[24].toUByte().toInt()).toShort() * 0.1,
                ((data[27].toUByte().toInt() shl 8) or data[26].toUByte().toInt()).toShort() * 0.1,
                ((data[29].toUByte().toInt() shl 8) or data[28].toUByte().toInt()).toShort() * 0.1,
                ((data[31].toUByte().toInt() shl 8) or data[30].toUByte().toInt()).toShort() * 0.1,
                ByteBuffer.wrap(data, 32, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt(),
                ByteBuffer.wrap(data, 36, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt(),
                ByteBuffer.wrap(data, 40, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt(),
                ((data[45].toUByte().toInt() shl 8) or data[44].toUByte().toInt()).toShort() * 0.1,
                ((data[47].toUByte().toInt() shl 8) or data[46].toUByte().toInt()).toShort() * 0.1,
                ((data[49].toUByte().toInt() shl 8) or data[48].toUByte().toInt()).toShort() * 0.1
            )
            return msg
        }

        320 -> {
            msg = listOf(
                ((data[1].toUByte().toInt() shl 8) or data[0].toUByte().toInt()).toUShort(),
                data[2].toUByte(),
                ((data[4].toUByte().toInt() shl 8) or data[3].toUByte().toInt()).toUShort(),
                data[5].toUByte(),

                ByteBuffer.wrap(data, 6, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt(),
                ByteBuffer.wrap(data, 10, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt(),
                ByteBuffer.wrap(data, 14, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt(),
                ((data[19].toUByte().toInt() shl 8) or data[18].toUByte().toInt()).toShort() * 0.01,
                ((data[21].toUByte().toInt() shl 8) or data[20].toUByte().toInt()).toShort() * 0.01,
                ((data[23].toUByte().toInt() shl 8) or data[22].toUByte().toInt()).toShort() * 0.01,
                ByteBuffer.wrap(data, 24, 4).order(ByteOrder.LITTLE_ENDIAN).int * 0.001,
                ByteBuffer.wrap(data, 28, 4).order(ByteOrder.LITTLE_ENDIAN).int * 0.001,
                ByteBuffer.wrap(data, 32, 4).order(ByteOrder.LITTLE_ENDIAN).int * 0.001,
                ByteBuffer.wrap(data, 36, 4).order(ByteOrder.LITTLE_ENDIAN).int * 0.1
            )
            return msg
        }

        321 -> {
            msg = listOf(
                ((data[1].toUByte().toInt() shl 8) or data[0].toUByte().toInt()).toUShort(),
                data[2].toUByte(),
                ((data[4].toUByte().toInt() shl 8) or data[3].toUByte().toInt()).toUShort(),
                data[5].toUByte(),

                ByteBuffer.wrap(data, 6, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt(),
                ByteBuffer.wrap(data, 10, 4).order(ByteOrder.LITTLE_ENDIAN).int * 0.0001,
                ByteBuffer.wrap(data, 14, 4).order(ByteOrder.LITTLE_ENDIAN).int * 0.0001,

                ByteBuffer.wrap(data, 18, 4).order(ByteOrder.LITTLE_ENDIAN).int * 0.1,
                ByteBuffer.wrap(data, 22, 4).order(ByteOrder.LITTLE_ENDIAN).int * 0.001,
                ((data[27].toUByte().toInt() shl 8) or data[26].toUByte().toInt()).toShort() * 0.1,
                ByteBuffer.wrap(data, 28, 4).order(ByteOrder.LITTLE_ENDIAN).int * 0.1,
                ByteBuffer.wrap(data, 32, 4).order(ByteOrder.LITTLE_ENDIAN).int * 0.001,
                ByteBuffer.wrap(data, 36, 4).order(ByteOrder.LITTLE_ENDIAN).int * 0.001,
                ((data[41].toUByte().toInt() shl 8) or data[40].toUByte().toInt()).toShort() * 0.01,
                ByteBuffer.wrap(data, 42, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt()
            )
            return msg
        }

        322 -> {
            msg = listOf(
                ((data[1].toUByte().toInt() shl 8) or data[0].toUByte().toInt()).toUShort(),
                data[2].toUByte(),
                ((data[4].toUByte().toInt() shl 8) or data[3].toUByte().toInt()).toUShort(),
                data[5].toUByte(),
                ByteBuffer.wrap(data, 6, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt(),
                ByteBuffer.wrap(data, 10, 4).order(ByteOrder.LITTLE_ENDIAN).int * 0.0001,
                ByteBuffer.wrap(data, 14, 4).order(ByteOrder.LITTLE_ENDIAN).int * 0.0001,

                ByteBuffer.wrap(data, 18, 4).order(ByteOrder.LITTLE_ENDIAN).int * 0.1,
                ((data[23].toUByte().toInt() shl 8) or data[22].toUByte().toInt()).toShort() * 0.1,
                ((data[25].toUByte().toInt() shl 8) or data[24].toUByte().toInt()).toShort() * 0.1,
                ByteBuffer.wrap(data, 26, 4).order(ByteOrder.LITTLE_ENDIAN).int * 0.1,
                ((data[31].toUByte().toInt() shl 8) or data[30].toUByte().toInt()).toShort() * 0.1,
                ByteBuffer.wrap(data, 32, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt(),
                ByteBuffer.wrap(data, 36, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt(),
                ByteBuffer.wrap(data, 40, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt(),
                ByteBuffer.wrap(data, 44, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt(),
                ByteBuffer.wrap(data, 48, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt()
            )
            return msg
        }

        323 -> {
            msg = listOf(
                ((data[1].toUByte().toInt() shl 8) or data[0].toUByte().toInt()).toUShort(),
                data[2].toUByte(),
                ((data[4].toUByte().toInt() shl 8) or data[3].toUByte().toInt()).toUShort(),
                data[5].toUByte(),
                ByteBuffer.wrap(data, 6, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt(),
                ByteBuffer.wrap(data, 10, 4).order(ByteOrder.LITTLE_ENDIAN).int * 0.0001,
                ByteBuffer.wrap(data, 14, 4).order(ByteOrder.LITTLE_ENDIAN).int * 0.0001,

                ByteBuffer.wrap(data, 18, 4).order(ByteOrder.LITTLE_ENDIAN).int * 0.1,
                ByteBuffer.wrap(data, 22, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt()
            )
            return msg
        }

        324 -> {
            msg = listOf(
                ((data[1].toUByte().toInt() shl 8) or data[0].toUByte().toInt()).toUShort(),
                data[2].toUByte(),
                ((data[4].toUByte().toInt() shl 8) or data[3].toUByte().toInt()).toUShort(),
                data[5].toUByte(),
                ByteBuffer.wrap(data, 6, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt(),
                ByteBuffer.wrap(data, 10, 4).order(ByteOrder.LITTLE_ENDIAN).int * 0.0001,
                ByteBuffer.wrap(data, 14, 4).order(ByteOrder.LITTLE_ENDIAN).int * 0.0001,

                ByteBuffer.wrap(data, 18, 4).order(ByteOrder.LITTLE_ENDIAN).int * 0.1
            )
            return msg
        }

        325 -> {
            msg = listOf(
                ((data[1].toUByte().toInt() shl 8) or data[0].toUByte().toInt()).toUShort(),
                data[2].toUByte(),
                ((data[4].toUByte().toInt() shl 8) or data[3].toUByte().toInt()).toUShort(),
                data[5].toUByte(),
                ByteBuffer.wrap(data, 6, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt(),
                ByteBuffer.wrap(data, 10, 4).order(ByteOrder.LITTLE_ENDIAN).int * 0.0001,
                ByteBuffer.wrap(data, 14, 4).order(ByteOrder.LITTLE_ENDIAN).int * 0.0001,

                ByteBuffer.wrap(data, 18, 4).order(ByteOrder.LITTLE_ENDIAN).int * 0.1,
                ByteBuffer.wrap(data, 22, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt()
            )
            return msg
        }

        326 -> {
            msg = listOf(
                ((data[1].toUByte().toInt() shl 8) or data[0].toUByte().toInt()).toUShort(),
                data[2].toUByte(),
                ((data[4].toUByte().toInt() shl 8) or data[3].toUByte().toInt()).toUShort(),
                data[5].toUByte(),
                ByteBuffer.wrap(data, 6, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt(),
                ByteBuffer.wrap(data, 10, 4).order(ByteOrder.LITTLE_ENDIAN).int * 0.0001,
                ByteBuffer.wrap(data, 14, 4).order(ByteOrder.LITTLE_ENDIAN).int * 0.0001,

                ByteBuffer.wrap(data, 18, 4).order(ByteOrder.LITTLE_ENDIAN).int * 0.1
            )
            return msg
        }

        400 -> {
            msg = listOf(
                ((data[1].toUByte().toInt() shl 8) or data[0].toUByte().toInt()).toUShort(),
                data[2].toUByte(),

                data[3].toUByte(),
                data[4].toUByte(),
                ByteBuffer.wrap(data, 5, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt(),

                ((data[10].toUByte().toInt() shl 8) or data[9].toUByte().toInt()).toUShort(),

                data[1].toUByte(),
                data[12].toUByte(),
                data[13].toUByte(),
                data[14].toUByte()
            )
            return msg
        }

        410 -> {
            msg = listOf(
                ((data[1].toUByte().toInt() shl 8) or data[0].toUByte().toInt()).toUShort(),
                data[2].toUByte(),
                ((data[4].toUByte().toInt() shl 8) or data[3].toUByte().toInt()).toUShort(),
                data[5].toUByte(),
                data[6].toUByte(),
                (ByteBuffer.wrap(data, 7, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt() and 0x00FFFFFF.toUInt() shr Integer.numberOfTrailingZeros(0x00FFFFFF)).toInt() * 0.01,
                ByteBuffer.wrap(data, 7, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt() and 0xFF000000.toUInt() shr Integer.numberOfTrailingZeros(0xFF000000.toInt()),
                data[11].toUByte().toUInt() and 0x000001.toUByte().toUInt() shr Integer.numberOfTrailingZeros(0x000001),
                data[11].toUByte().toUInt() and 0x000010.toUByte().toUInt() shr Integer.numberOfTrailingZeros(0x000010),
                data[11].toUByte().toUInt() and 0x000008.toUByte().toUInt() shr Integer.numberOfTrailingZeros(0x000008),
                data[11].toUByte().toUInt() and 0x000004.toUByte().toUInt() shr Integer.numberOfTrailingZeros(0x000004),

                ByteBuffer.wrap(data, 12, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt(),
                ByteBuffer.wrap(data, 16, 4).order(ByteOrder.LITTLE_ENDIAN).int * 0.0000001,
                ByteBuffer.wrap(data, 20, 4).order(ByteOrder.LITTLE_ENDIAN).int * 0.0000001,
                ByteBuffer.wrap(data, 24, 4).order(ByteOrder.LITTLE_ENDIAN).int * 0.01,
                ((data[41].toUByte().toInt() shl 8) or data[40].toUByte().toInt()).toShort() * 0.01,
                ((data[43].toUByte().toInt() shl 8) or data[42].toUByte().toInt()).toShort() * 90.0 / 16384.0,
                ((data[45].toUByte().toInt() shl 8) or data[44].toUByte().toInt()).toShort() * 90.0 / 16384.0,
                ((data[47].toUByte().toInt() shl 8) or data[46].toUByte().toInt()).toShort() * 4096.0 / 16384.0,

                ((data[49].toUByte().toInt() shl 8) or data[48].toUByte().toInt()).toShort() * 200.0 / 16384.0,
                ((data[51].toUByte().toInt() shl 8) or data[50].toUByte().toInt()).toShort() * 200.0 / 16384.0,
                ((data[53].toUByte().toInt() shl 8) or data[52].toUByte().toInt()).toShort() * 70.0 / 16384.0,
                ByteBuffer.wrap(data, 54, 4).order(ByteOrder.LITTLE_ENDIAN).int * 842.865 / 1073741824.0,
                ByteBuffer.wrap(data, 58, 4).order(ByteOrder.LITTLE_ENDIAN).int * 842.865 / 1073741824.0,
                ((data[63].toUByte().toInt() shl 8) or data[62].toUByte().toInt()).toShort() * 842.865 / 16384.0,
                ((data[65].toUByte().toInt() shl 8) or data[64].toUByte().toInt()).toShort() * 70.0 / 16384.0,
                ((data[67].toUByte().toInt() shl 8) or data[66].toUByte().toInt()).toShort() * 180.0 / 16384.0,
                ((data[69].toUByte().toInt() shl 8) or data[68].toUByte().toInt()).toShort() *  1.0 / 83.409,
                ((data[71].toUByte().toInt() shl 8) or data[70].toUByte().toInt()).toShort() *  1.0 / 83.409,
                ((data[73].toUByte().toInt() shl 8) or data[72].toUByte().toInt()).toShort() * 90.0 / 16384.0,
                ((data[75].toUByte().toInt() shl 8) or data[74].toUByte().toInt()).toShort() * 90.0 / 16384.0,
                ((data[77].toUByte().toInt() shl 8) or data[76].toUByte().toInt()).toShort() * 90.0 / 16384.0,
                ((data[79].toUByte().toInt() shl 8) or data[78].toUByte().toInt()).toShort() * 90.0 / 16384.0,

                ByteBuffer.wrap(data, 80, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt() and 0x00000100.toUInt() shr Integer.numberOfTrailingZeros(0x00000100),
                ByteBuffer.wrap(data, 80, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt() and 0x00000200.toUInt() shr Integer.numberOfTrailingZeros(0x00000200),
                ByteBuffer.wrap(data, 80, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt() and 0x00000400.toUInt() shr Integer.numberOfTrailingZeros(0x00000400),
                ByteBuffer.wrap(data, 80, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt() and 0x00000800.toUInt() shr Integer.numberOfTrailingZeros(0x00000800),

                ByteBuffer.wrap(data, 80, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt() and 0x0001F000.toUInt() shr Integer.numberOfTrailingZeros(0x0001F000),

                ByteBuffer.wrap(data, 80, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt() and 0x00060000.toUInt() shr Integer.numberOfTrailingZeros(0x00060000),

                ByteBuffer.wrap(data, 80, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt() and 0x00080000.toUInt() shr Integer.numberOfTrailingZeros(0x00080000),

                ByteBuffer.wrap(data, 80, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt() and 0x00100000.toUInt() shr Integer.numberOfTrailingZeros(0x00100000),

                ByteBuffer.wrap(data, 80, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt() and 0x00600000.toUInt() shr Integer.numberOfTrailingZeros(0x00600000),

                ByteBuffer.wrap(data, 80, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt() and 0x00800000.toUInt() shr Integer.numberOfTrailingZeros(0x00800000),
                ByteBuffer.wrap(data, 80, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt() and 0x01000000.toUInt() shr Integer.numberOfTrailingZeros(0x01000000),
                ByteBuffer.wrap(data, 80, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt() and 0x02000000.toUInt() shr Integer.numberOfTrailingZeros(0x02000000),
                ByteBuffer.wrap(data, 80, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt() and 0x04000000.toUInt() shr Integer.numberOfTrailingZeros(0x04000000),
                ByteBuffer.wrap(data, 80, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt() and 0x08000000.toUInt() shr Integer.numberOfTrailingZeros(0x08000000),
                ByteBuffer.wrap(data, 80, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt() and 0x10000000.toUInt() shr Integer.numberOfTrailingZeros(0x10000000),
                ByteBuffer.wrap(data, 80, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt() and 0x20000000.toUInt() shr Integer.numberOfTrailingZeros(0x20000000),

                ByteBuffer.wrap(data, 84, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt() and 0x00000100.toUInt() shr Integer.numberOfTrailingZeros(0x00000100),
                ByteBuffer.wrap(data, 84, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt() and 0x00000200.toUInt() shr Integer.numberOfTrailingZeros(0x00000200),
                ByteBuffer.wrap(data, 84, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt() and 0x00000C00.toUInt() shr Integer.numberOfTrailingZeros(0x00000C00),
                ByteBuffer.wrap(data, 84, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt() and 0x00001000.toUInt() shr Integer.numberOfTrailingZeros(0x00001000),
                ByteBuffer.wrap(data, 84, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt() and 0x00002000.toUInt() shr Integer.numberOfTrailingZeros(0x00002000),
                ByteBuffer.wrap(data, 84, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt() and 0x00004000.toUInt() shr Integer.numberOfTrailingZeros(0x00004000),
                ByteBuffer.wrap(data, 84, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt() and 0x00008000.toUInt() shr Integer.numberOfTrailingZeros(0x00008000),
                ByteBuffer.wrap(data, 84, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt() and 0x00010000.toUInt() shr Integer.numberOfTrailingZeros(0x00010000),
                ByteBuffer.wrap(data, 84, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt() and 0x00020000.toUInt() shr Integer.numberOfTrailingZeros(0x00020000),
                ByteBuffer.wrap(data, 84, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt() and 0x00200000.toUInt() shr Integer.numberOfTrailingZeros(0x00200000),
                ByteBuffer.wrap(data, 84, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt() and 0x00400000.toUInt() shr Integer.numberOfTrailingZeros(0x00400000),
                ByteBuffer.wrap(data, 84, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt() and 0x00040000.toUInt() shr Integer.numberOfTrailingZeros(0x00040000),
                ByteBuffer.wrap(data, 84, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt() and 0x00080000.toUInt() shr Integer.numberOfTrailingZeros(0x00080000),
                ByteBuffer.wrap(data, 84, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt() and 0x00100000.toUInt() shr Integer.numberOfTrailingZeros(0x00100000),
                ByteBuffer.wrap(data, 84, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt() and 0x00800000.toUInt() shr Integer.numberOfTrailingZeros(0x00800000),
                ByteBuffer.wrap(data, 84, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt() and 0x01000000.toUInt() shr Integer.numberOfTrailingZeros(0x01000000),
                ByteBuffer.wrap(data, 84, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt() and 0x02000000.toUInt() shr Integer.numberOfTrailingZeros(0x02000000),
                ByteBuffer.wrap(data, 84, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt() and 0x04000000.toUInt() shr Integer.numberOfTrailingZeros(0x04000000),
                ByteBuffer.wrap(data, 84, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt() and 0x08000000.toUInt() shr Integer.numberOfTrailingZeros(0x08000000),
                ByteBuffer.wrap(data, 84, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt() and 0x10000000.toUInt() shr Integer.numberOfTrailingZeros(0x10000000),
                ByteBuffer.wrap(data, 84, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt() and 0x20000000.toUInt() shr Integer.numberOfTrailingZeros(0x20000000),

                ByteBuffer.wrap(data, 88, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt() and 0x00000100.toUInt() shr Integer.numberOfTrailingZeros(0x00000100),
                ByteBuffer.wrap(data, 88, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt() and 0x00000200.toUInt() shr Integer.numberOfTrailingZeros(0x00000200),
                ByteBuffer.wrap(data, 88, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt() and 0x00001C00.toUInt() shr Integer.numberOfTrailingZeros(0x00001C00),
                ByteBuffer.wrap(data, 88, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt() and 0x00002000.toUInt() shr Integer.numberOfTrailingZeros(0x00002000),
                ByteBuffer.wrap(data, 88, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt() and 0x00004000.toUInt() shr Integer.numberOfTrailingZeros(0x00004000),
                ByteBuffer.wrap(data, 88, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt() and 0x00008000.toUInt() shr Integer.numberOfTrailingZeros(0x00008000),
                ByteBuffer.wrap(data, 88, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt() and 0x00070000.toUInt() shr Integer.numberOfTrailingZeros(0x00070000),
                ByteBuffer.wrap(data, 88, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt() and 0x00080000.toUInt() shr Integer.numberOfTrailingZeros(0x00080000),
                ByteBuffer.wrap(data, 88, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt() and 0x00100000.toUInt() shr Integer.numberOfTrailingZeros(0x00100000),
                ByteBuffer.wrap(data, 88, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt() and 0x00200000.toUInt() shr Integer.numberOfTrailingZeros(0x00200000),
                ByteBuffer.wrap(data, 88, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt() and 0x00400000.toUInt() shr Integer.numberOfTrailingZeros(0x00400000),
                ByteBuffer.wrap(data, 88, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt() and 0x00800000.toUInt() shr Integer.numberOfTrailingZeros(0x00800000),
                ByteBuffer.wrap(data, 88, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt() and 0x01000000.toUInt() shr Integer.numberOfTrailingZeros(0x01000000),
                ByteBuffer.wrap(data, 88, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt() and 0x02000000.toUInt() shr Integer.numberOfTrailingZeros(0x02000000),
                ByteBuffer.wrap(data, 88, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt() and 0x04000000.toUInt() shr Integer.numberOfTrailingZeros(0x04000000),
                ByteBuffer.wrap(data, 88, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt() and 0x08000000.toUInt() shr Integer.numberOfTrailingZeros(0x08000000),
                ByteBuffer.wrap(data, 88, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt() and 0x10000000.toUInt() shr Integer.numberOfTrailingZeros(0x10000000),
                ByteBuffer.wrap(data, 88, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt() and 0x20000000.toUInt() shr Integer.numberOfTrailingZeros(0x20000000),

                ByteBuffer.wrap(data, 28, 4).order(ByteOrder.LITTLE_ENDIAN).int * 0.01,
                ByteBuffer.wrap(data, 32, 4).order(ByteOrder.LITTLE_ENDIAN).int * 0.01,
                ByteBuffer.wrap(data, 36, 4).order(ByteOrder.LITTLE_ENDIAN).int * 0.01,

                ByteBuffer.wrap(data, 80, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt(),
                ByteBuffer.wrap(data, 84, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt(),
                ByteBuffer.wrap(data, 88, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt()
            )
            return msg
        }

        411 -> {
            msg = listOf(
                ((data[1].toUByte().toInt() shl 8) or data[0].toUByte().toInt()).toUShort(),
                data[2].toUByte(),
                ((data[4].toUByte().toInt() shl 8) or data[3].toUByte().toInt()).toUShort(),
                data[5].toUByte(),
                data[6].toUByte(),
                (ByteBuffer.wrap(data, 7, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt() and 0x00FFFFFF.toUInt() shr Integer.numberOfTrailingZeros(0x00FFFFFF)).toInt() * 0.01,
                ByteBuffer.wrap(data, 7, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt() and 0xFF000000.toUInt() shr Integer.numberOfTrailingZeros(0xFF000000.toInt()),
                data[11].toUByte().toUInt() and 0x000001.toUByte().toUInt() shr Integer.numberOfTrailingZeros(0x000001),
                data[11].toUByte().toUInt() and 0x000002.toUByte().toUInt() shr Integer.numberOfTrailingZeros(0x000002),
                data[11].toUByte().toUInt() and 0x000004.toUByte().toUInt() shr Integer.numberOfTrailingZeros(0x000004),
                data[11].toUByte().toUInt() and 0x000008.toUByte().toUInt() shr Integer.numberOfTrailingZeros(0x000008),
                data[11].toUByte().toUInt() and 0x000010.toUByte().toUInt() shr Integer.numberOfTrailingZeros(0x000010),
                data[11].toUByte().toUInt() and 0x000020.toUByte().toUInt() shr Integer.numberOfTrailingZeros(0x000020),
                data[11].toUByte().toUInt() and 0x000040.toUByte().toUInt() shr Integer.numberOfTrailingZeros(0x000040),
                data[11].toUByte().toUInt() and 0x000080.toUByte().toUInt() shr Integer.numberOfTrailingZeros(0x000080),

                ((data[15].toUByte().toInt() shl 8) or data[14].toUByte().toInt()).toShort() * 200.0 / 32768.0,
                ByteBuffer.wrap(data, 16, 4).order(ByteOrder.LITTLE_ENDIAN).int * 50.0 / 1073741824.0,
                ByteBuffer.wrap(data, 20, 4).order(ByteOrder.LITTLE_ENDIAN).int * 100.0 / 1073741824.0,
                ByteBuffer.wrap(data, 24, 4).order(ByteOrder.LITTLE_ENDIAN).int * 90.0 / 1073741824.0,
                ByteBuffer.wrap(data, 28, 4).order(ByteOrder.LITTLE_ENDIAN).int * 90.0 / 1073741824.0,
                ByteBuffer.wrap(data, 32, 4).order(ByteOrder.LITTLE_ENDIAN).int * 16384.0 / 1073741824.0,
                ((data[37].toUByte().toInt() shl 8) or data[36].toUByte().toInt()).toShort() * 4096.0 / 16384.0,
                ((data[39].toUByte().toInt() shl 8) or data[38].toUByte().toInt()).toShort() * 1024.0 / 32768.0,
                ((data[41].toUByte().toInt() shl 8) or data[40].toUByte().toInt()).toShort() * 256.0 / 16384.0,
                ((data[43].toUByte().toInt() shl 8) or data[42].toUByte().toInt()).toShort() * 32.0 / 16384.0,
                ((data[45].toUByte().toInt() shl 8) or data[44].toUByte().toInt()).toShort() * 512.0 / 16384.0,
                ((data[47].toUByte().toInt() shl 8) or data[46].toUByte().toInt()).toShort() * 600.0 / 16384.0,
                ((data[49].toUByte().toInt() shl 8) or data[48].toUByte().toInt()).toShort() * 6000.0 / 16384.0,
                ((data[51].toUByte().toInt() shl 8) or data[50].toUByte().toInt()).toShort() * 30.0 / 32768.0,
                ByteBuffer.wrap(data, 52, 4).order(ByteOrder.LITTLE_ENDIAN).int,
                ((data[57].toUByte().toInt() shl 8) or data[56].toUByte().toInt()).toShort() * 90.0 / 16384.0,
                ((data[59].toUByte().toInt() shl 8) or data[58].toUByte().toInt()).toShort() * 6000.0 / 32768.0,
                ((data[61].toUByte().toInt() shl 8) or data[60].toUByte().toInt()).toShort() * 6000.0 / 32768.0,

                data[62].toUByte(),
                ByteBuffer.wrap(data, 63, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt() and 0x30000000.toUInt() shr Integer.numberOfTrailingZeros(0x30000000),

                ByteBuffer.wrap(data, 63, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt() and 0x0C000000.toUInt() shr Integer.numberOfTrailingZeros(0x0C000000),

                ByteBuffer.wrap(data, 63, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt() and 0x03000000.toUInt() shr Integer.numberOfTrailingZeros(0x03000000),

                ByteBuffer.wrap(data, 63, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt() and 0x00C00000.toUInt() shr Integer.numberOfTrailingZeros(0x00C00000),

                ByteBuffer.wrap(data, 63, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt() and 0x00300000.toUInt() shr Integer.numberOfTrailingZeros(0x00300000),

                ByteBuffer.wrap(data, 63, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt() and 0x000C0000.toUInt() shr Integer.numberOfTrailingZeros(0x000C0000),

                ByteBuffer.wrap(data, 63, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt() and 0x00030000.toUInt() shr Integer.numberOfTrailingZeros(0x00030000),

                ByteBuffer.wrap(data, 63, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt() and 0x0000C000.toUInt() shr Integer.numberOfTrailingZeros(0x0000C000),

                ByteBuffer.wrap(data, 63, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt() and 0x00003000.toUInt() shr Integer.numberOfTrailingZeros(0x00003000),

                ByteBuffer.wrap(data, 63, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt() and 0x00000C00.toUInt() shr Integer.numberOfTrailingZeros(0x00000C00),

                ByteBuffer.wrap(data, 63, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt() and 0x00000300.toUInt() shr Integer.numberOfTrailingZeros(0x00000300),

                ByteBuffer.wrap(data, 63, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt(),

                ByteBuffer.wrap(data, 67, 4).order(ByteOrder.LITTLE_ENDIAN).int * 45000.0 / 1073741824.0,
                ((data[72].toUByte().toInt() shl 8) or data[71].toUByte().toInt()).toShort() * 3000.0 / 16384.0,
                ((data[74].toUByte().toInt() shl 8) or data[73].toUByte().toInt()).toShort() * 50.0 / 16384.0,
                ((data[76].toUByte().toInt() shl 8) or data[75].toUByte().toInt()).toShort() * 50.0 / 16384.0,
                ((data[78].toUByte().toInt() shl 8) or data[77].toUByte().toInt()).toShort() * 50.0 / 16384.0,
                ((data[80].toUByte().toInt() shl 8) or data[79].toUByte().toInt()).toShort() * 50.0 / 16384.0,

                ByteBuffer.wrap(data, 81, 4).order(ByteOrder.LITTLE_ENDIAN).int * 50.0 / 1073741824.0,
                ((data[86].toUByte().toInt() shl 8) or data[85].toUByte().toInt()).toShort() * 200.0 / 16384.0,
                ((data[88].toUByte().toInt() shl 8) or data[87].toUByte().toInt()).toShort() * 200.0 / 16384.0,
                ((data[90].toUByte().toInt() shl 8) or data[89].toUByte().toInt()).toShort() * 70.0 / 16384.0
            )
            return msg
        }

        412 -> {
            msg = listOf(
                ((data[1].toUByte().toInt() shl 8) or data[0].toUByte().toInt()).toUShort(),
                data[2].toUByte(),
                ((data[4].toUByte().toInt() shl 8) or data[3].toUByte().toInt()).toUShort(),
                data[5].toUByte(),
                data[6].toUByte(),
                (ByteBuffer.wrap(data, 7, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt() and 0x00FFFFFF.toUInt() shr Integer.numberOfTrailingZeros(0x00FFFFFF)).toInt() * 0.01,
                ByteBuffer.wrap(data, 7, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt() and 0xFF000000.toUInt() shr Integer.numberOfTrailingZeros(0xFF000000.toInt()),

                ((data[13].toUByte().toInt() shl 8) or data[12].toUByte().toInt()).toShort() * 256.0 / 16384.0,
                ((data[15].toUByte().toInt() shl 8) or data[14].toUByte().toInt()).toShort() * 256.0 / 16384.0,
                ((data[17].toUByte().toInt() shl 8) or data[16].toUByte().toInt()).toShort() * 256.0 / 16384.0,
                ((data[19].toUByte().toInt() shl 8) or data[18].toUByte().toInt()).toShort() * 64.0 / 16384.0,
                ((data[21].toUByte().toInt() shl 8) or data[20].toUByte().toInt()).toShort() * 64.0 / 16384.0,
                ((data[23].toUByte().toInt() shl 8) or data[22].toUByte().toInt()).toShort() * 64.0 / 16384.0,
                ((data[25].toUByte().toInt() shl 8) or data[24].toUByte().toInt()).toShort() * 0.01,
                ((data[27].toUByte().toInt() shl 8) or data[26].toUByte().toInt()).toShort() * 256.0 / 32768.0,
                data[28].toUByte().toInt() * 5.0 / 64.0,
                ((data[30].toUByte().toInt() shl 8) or data[29].toUByte().toInt()).toShort() * 4096.0 / 16384.0,
                ((data[32].toUByte().toInt() shl 8) or data[31].toUByte().toInt()).toShort() * 5000.0 / 32768.0,
                ((data[34].toUByte().toInt() shl 8) or data[33].toUByte().toInt()).toShort()* 128.0 / 32768.0,

                ByteBuffer.wrap(data, 35, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt(),

                ((data[40].toUByte().toInt() shl 8) or data[39].toUByte().toInt()).toShort() * 1100.0 / 32768.0,

                ByteBuffer.wrap(data, 41, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt(),

                ByteBuffer.wrap(data, 41, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt() and 0x30000000.toUInt() shr Integer.numberOfTrailingZeros(0x30000000),

                ByteBuffer.wrap(data, 41, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt() and 0x0C000000.toUInt() shr Integer.numberOfTrailingZeros(0x0C000000),

                ByteBuffer.wrap(data, 41, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt() and 0x03000000.toUInt() shr Integer.numberOfTrailingZeros(0x03000000),

                ByteBuffer.wrap(data, 41, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt() and 0x00C00000.toUInt() shr Integer.numberOfTrailingZeros(0x00C00000),

                ByteBuffer.wrap(data, 41, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt() and 0x00300000.toUInt() shr Integer.numberOfTrailingZeros(0x00300000),

                ByteBuffer.wrap(data, 41, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt() and 0x000C0000.toUInt() shr Integer.numberOfTrailingZeros(0x000C0000),

                ByteBuffer.wrap(data, 41, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt() and 0x00030000.toUInt() shr Integer.numberOfTrailingZeros(0x00030000),

                ByteBuffer.wrap(data, 41, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt() and 0x0000C000.toUInt() shr Integer.numberOfTrailingZeros(0x0000C000),

                ByteBuffer.wrap(data, 41, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt() and 0x00003000.toUInt() shr Integer.numberOfTrailingZeros(0x00003000),

                ByteBuffer.wrap(data, 41, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt() and 0x00000C00.toUInt() shr Integer.numberOfTrailingZeros(0x00000C00),

                ByteBuffer.wrap(data, 41, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt() and 0x00000300.toUInt() shr Integer.numberOfTrailingZeros(0x00000300),

                ByteBuffer.wrap(data, 45, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt(),

                ByteBuffer.wrap(data, 45, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt() and 0x30000000.toUInt() shr Integer.numberOfTrailingZeros(0x30000000),

                ByteBuffer.wrap(data, 45, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt() and 0x0C000000.toUInt() shr Integer.numberOfTrailingZeros(0x0C000000),

                ByteBuffer.wrap(data, 45, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt() and 0x03000000.toUInt() shr Integer.numberOfTrailingZeros(0x03000000),

                ByteBuffer.wrap(data, 45, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt() and 0x00C00000.toUInt() shr Integer.numberOfTrailingZeros(0x00C00000),

                ByteBuffer.wrap(data, 45, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt() and 0x00300000.toUInt() shr Integer.numberOfTrailingZeros(0x00300000),

                ByteBuffer.wrap(data, 45, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt() and 0x000C0000.toUInt() shr Integer.numberOfTrailingZeros(0x000C0000),

                ByteBuffer.wrap(data, 45, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt() and 0x0003C000.toUInt() shr Integer.numberOfTrailingZeros(0x0003C000),

                ByteBuffer.wrap(data, 45, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt() and 0x00002000.toUInt() shr Integer.numberOfTrailingZeros(0x00002000),

                ByteBuffer.wrap(data, 45, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt() and 0x00001000.toUInt() shr Integer.numberOfTrailingZeros(0x00001000),

                ByteBuffer.wrap(data, 45, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt() and 0x00000800.toUInt() shr Integer.numberOfTrailingZeros(0x00000800),

                ByteBuffer.wrap(data, 45, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt() and 0x00000400.toUInt() shr Integer.numberOfTrailingZeros(0x00000400),

                ByteBuffer.wrap(data, 45, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt() and 0x00000200.toUInt() shr Integer.numberOfTrailingZeros(0x00000200),

                ByteBuffer.wrap(data, 45, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt() and 0x00000100.toUInt() shr Integer.numberOfTrailingZeros(0x00000100),

                ((data[50].toUByte().toInt() shl 8) or data[49].toUByte().toInt()).toShort() * 1.0 / 83.409,
                ((data[52].toUByte().toInt() shl 8) or data[51].toUByte().toInt()).toShort() * 1.0 / 83.409,
                ((data[54].toUByte().toInt() shl 8) or data[53].toUByte().toInt()).toShort() * 32738.274 / 16384.0,

                ByteBuffer.wrap(data, 55, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt(),

                ByteBuffer.wrap(data, 55, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt() and 0x18000000.toUInt() shr Integer.numberOfTrailingZeros(0x18000000),

                ByteBuffer.wrap(data, 55, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt() and 0x04000000.toUInt() shr Integer.numberOfTrailingZeros(0x04000000),

                ByteBuffer.wrap(data, 55, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt() and 0x03000000.toUInt() shr Integer.numberOfTrailingZeros(0x03000000),

                ByteBuffer.wrap(data, 55, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt() and 0x00800000.toUInt() shr Integer.numberOfTrailingZeros(0x00800000),

                ByteBuffer.wrap(data, 55, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt() and 0x00400000.toUInt() shr Integer.numberOfTrailingZeros(0x00400000),

                ByteBuffer.wrap(data, 55, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt() and 0x00300000.toUInt() shr Integer.numberOfTrailingZeros(0x00300000),

                ByteBuffer.wrap(data, 55, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt() and 0x00080000.toUInt() shr Integer.numberOfTrailingZeros(0x00080000),
                ByteBuffer.wrap(data, 55, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt() and 0x00040000.toUInt() shr Integer.numberOfTrailingZeros(0x00040000),
                ByteBuffer.wrap(data, 55, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt() and 0x00020000.toUInt() shr Integer.numberOfTrailingZeros(0x00020000),
                ByteBuffer.wrap(data, 55, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt() and 0x00010000.toUInt() shr Integer.numberOfTrailingZeros(0x00010000),
                ByteBuffer.wrap(data, 55, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt() and 0x0000FF00.toUInt() shr Integer.numberOfTrailingZeros(0x0000FF00),

                ((data[60].toUByte().toInt() shl 8) or data[59].toUByte().toInt()).toShort() * 1024.0 / 32768.0,
                data[61].toUByte().toInt() * 5.0 / 64.0,
                data[62].toUByte().toInt() * 20.0 / 128.0,

                ByteBuffer.wrap(data, 63, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt(),
                ByteBuffer.wrap(data, 63, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt() and 0x02000000.toUInt() shr Integer.numberOfTrailingZeros(0x02000000),
                ByteBuffer.wrap(data, 63, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt() and 0x01000000.toUInt() shr Integer.numberOfTrailingZeros(0x01000000),
                ByteBuffer.wrap(data, 63, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt() and 0x00800000.toUInt() shr Integer.numberOfTrailingZeros(0x00800000),
                ByteBuffer.wrap(data, 63, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt() and 0x00400000.toUInt() shr Integer.numberOfTrailingZeros(0x00400000),
                ByteBuffer.wrap(data, 63, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt() and 0x00100000.toUInt() shr Integer.numberOfTrailingZeros(0x00100000),
                ByteBuffer.wrap(data, 63, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt() and 0x00080000.toUInt() shr Integer.numberOfTrailingZeros(0x00080000),

                ByteBuffer.wrap(data, 63, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt() and 0x00060000.toUInt() shr Integer.numberOfTrailingZeros(0x00060000),

                ByteBuffer.wrap(data, 63, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt() and 0x0001F800.toUInt() shr Integer.numberOfTrailingZeros(0x0001F800),

                ByteBuffer.wrap(data, 63, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt() and 0x00000200.toUInt() shr Integer.numberOfTrailingZeros(0x00000200),
                ByteBuffer.wrap(data, 63, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt() and 0x00000100.toUInt() shr Integer.numberOfTrailingZeros(0x00000100),

                ByteBuffer.wrap(data, 67, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt(),
                ByteBuffer.wrap(data, 67, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt() and 0x20000000.toUInt() shr Integer.numberOfTrailingZeros(0x20000000),
                ByteBuffer.wrap(data, 67, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt() and 0x08000000.toUInt() shr Integer.numberOfTrailingZeros(0x08000000),
                ByteBuffer.wrap(data, 67, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt() and 0x04000000.toUInt() shr Integer.numberOfTrailingZeros(0x04000000),
                ByteBuffer.wrap(data, 67, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt() and 0x02000000.toUInt() shr Integer.numberOfTrailingZeros(0x02000000),
                ByteBuffer.wrap(data, 67, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt() and 0x00400000.toUInt() shr Integer.numberOfTrailingZeros(0x00400000),
                ByteBuffer.wrap(data, 67, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt() and 0x00180000.toUInt() shr Integer.numberOfTrailingZeros(0x00180000),
                ByteBuffer.wrap(data, 67, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt() and 0x00040000.toUInt() shr Integer.numberOfTrailingZeros(0x00040000),
                ByteBuffer.wrap(data, 67, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt() and 0x00001000.toUInt() shr Integer.numberOfTrailingZeros(0x00001000),
                ByteBuffer.wrap(data, 67, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt() and 0x00000800.toUInt() shr Integer.numberOfTrailingZeros(0x00000800),
                ByteBuffer.wrap(data, 67, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt() and 0x00000400.toUInt() shr Integer.numberOfTrailingZeros(0x00000400),
                ByteBuffer.wrap(data, 67, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt() and 0x00000200.toUInt() shr Integer.numberOfTrailingZeros(0x00000200),
                ByteBuffer.wrap(data, 67, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt() and 0x00000100.toUInt() shr Integer.numberOfTrailingZeros(0x00000100),

                ((data[72].toUByte().toInt() shl 8) or data[71].toUByte().toInt()).toShort() * 45000.0 / 32768.0,
                ((data[74].toUByte().toInt() shl 8) or data[73].toUByte().toInt()).toShort() * 20480.0 / 16384.0,
                ((data[76].toUByte().toInt() shl 8) or data[75].toUByte().toInt()).toShort() * 180.0 / 16384.0,
                ((data[78].toUByte().toInt() shl 8) or data[77].toUByte().toInt()).toShort() * 180.0 / 16384.0,
                ((data[80].toUByte().toInt() shl 8) or data[79].toUByte().toInt()).toShort() * 0.01,
                ((data[82].toUByte().toInt() shl 8) or data[81].toUByte().toInt()).toShort() * 10240.0 / 16384.0,
                ((data[84].toUByte().toInt() shl 8) or data[83].toUByte().toInt()).toShort() * 10240.0 / 16384.0,
                ((data[86].toUByte().toInt() shl 8) or data[85].toUByte().toInt()).toShort() * 1024.0 / 16384.0,
                ((data[88].toUByte().toInt() shl 8) or data[87].toUByte().toInt()).toShort() * 1024.0 / 16384.0
            )
            return msg
        }

        500 -> {
            msg = listOf(
                ((data[1].toUByte().toInt() shl 8) or data[0].toUByte().toInt()).toUShort(),
                data[2].toUByte(),
                //далее сам класс
                TODO()
            )
            return msg
        }

        510 -> {
            msg = listOf(
                ((data[1].toUByte().toInt() shl 8) or data[0].toUByte().toInt()).toUShort(),
                data[2].toUByte(),
                ((data[4].toUByte().toInt() shl 8) or data[3].toUByte().toInt()).toUShort(),
                data[5].toUByte(),
                data[6].toUByte(),
                (ByteBuffer.wrap(data, 7, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt() and 0x00FFFFFF.toUInt() shr Integer.numberOfTrailingZeros(0x00FFFFFF)).toInt() * 0.01,
                ByteBuffer.wrap(data, 7, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt() and 0xFF000000.toUInt() shr Integer.numberOfTrailingZeros(0xFF000000.toInt()),
                data[11].toUByte() and 0x000001.toUByte(),
                data[11].toUByte() and 0x000010.toUByte(),
                data[11].toUByte() and 0x000008.toUByte(),
                data[11].toUByte() and 0x000004.toUByte(),
                //далее сам класс
                TODO()
            )
            return msg
        }

        511 -> {
            msg = listOf(
                ((data[1].toUByte().toInt() shl 8) or data[0].toUByte().toInt()).toUShort(),
                data[2].toUByte(),
                ((data[4].toUByte().toInt() shl 8) or data[3].toUByte().toInt()).toUShort(),
                data[5].toUByte(),
                data[6].toUByte(),
                (ByteBuffer.wrap(data, 7, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt() and 0x00FFFFFF.toUInt() shr Integer.numberOfTrailingZeros(0x00FFFFFF)).toInt() * 0.01,
                ByteBuffer.wrap(data, 7, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt() and 0xFF000000.toUInt() shr Integer.numberOfTrailingZeros(0xFF000000.toInt()),
                data[11].toUByte() and 0x000001.toUByte(),
                data[11].toUByte() and 0x000002.toUByte(),
                data[11].toUByte() and 0x000004.toUByte(),
                data[11].toUByte() and 0x000008.toUByte(),
                data[11].toUByte() and 0x000010.toUByte(),
                data[11].toUByte() and 0x000020.toUByte(),
                data[11].toUByte() and 0x000040.toUByte(),
                data[11].toUByte() and 0x000080.toUByte(),
                //далее сам класс
                TODO()
            )
            return msg
        }

        512 -> {
            msg = listOf(
                ((data[1].toUByte().toInt() shl 8) or data[0].toUByte().toInt()).toUShort(),
                data[2].toUByte(),
                ((data[4].toUByte().toInt() shl 8) or data[3].toUByte().toInt()).toUShort(),
                data[5].toUByte(),
                data[6].toUByte(),
                (ByteBuffer.wrap(data, 7, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt() and 0x00FFFFFF.toUInt() shr Integer.numberOfTrailingZeros(0x00FFFFFF)).toInt() * 0.01,
                ByteBuffer.wrap(data, 7, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt() and 0xFF000000.toUInt() shr Integer.numberOfTrailingZeros(0xFF000000.toInt()),
                //11 индекс скип
                //далее сам класс
                TODO()
            )
            return msg
        }
    }
    return null
}

val PD_0_be = listOf(
    TStructField( "Идентификатор пакета", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Контрольная сумма", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), "")
)

val PD_10_be = listOf(
    TStructField( "Идентификатор пакета", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Контрольная сумма", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField( "Счетчик секундных циклов", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Счетчик внутри секундного цикла", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Порядковый номер выстрела", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Время выстрела, сек", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Счетчик времени удержания БК, циклов по 50 мс", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Признак приема 250 (VS) пакета", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Признак нажатия БК подвесок", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Признак нажатия БК ВПУ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField( "Время внутри суток, сек", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField( "Широта, X (неуточненная), рад", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Долгота, Y (неуточненная), рад", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Высота, H (неуточненная), м", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField( "Скорость вдоль продольной оси Vx, м/с", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Скорость вдоль поперечной оси Vy, м/с", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Скорость вдоль вертикальной оси Vz, м/с", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), "")
)

val PD_100_be = listOf(
    TStructField( "Идентификатор пакета", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Контрольная сумма", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField( "Слово признаков", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Порядковый номер последнего обработанного выстрела", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Счетчик сообщений", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Команда 1 (3671775962 - тест)", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Команда 2 (7798903 - тест)", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Команда 3 (1929409280 - тест)", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField( "Мощность передатчика",
        Flag.T_OP_EQ,
        intArrayOf(0, 1, 2, 3, 4),
        listOf("опред.УРЧ", "выкл.", "пониж.", "средн.", "полная"),
        "запрещенная комбинация"
    )
)

val PD_110 = listOf(
    TStructField( "Идентификатор пакета", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Контрольная сумма", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Счетчик секундных циклов", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Счетчик внутри секундного цикла", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Порядковый номер выстрела", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Время выстрела, сек", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Счетчик времени удержания БК, циклов по 50 мс", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Признак приема 250 (VS) пакета", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Признак нажатия БК подвесок", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Признак нажатия БК ВПУ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField( "Время внутри суток, сек", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField( "Широта, X (неуточненная), рад", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Долгота, Y (неуточненная), рад", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Высота, H (неуточненная), м", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField( "Скорость вдоль продольной оси Vx, м/с", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Скорость вдоль поперечной оси Vy, м/с", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Скорость вдоль вертикальной оси Vz, м/с", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Курс, град", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Крен, град", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Тангаж, град", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Скорость приборная, м/с", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Путевая скорость(25)/Истинная воздушная (25СМ), м/с", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField( "Вертикальная скорость, м/с", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Угол атаки, град", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Угол скольжения, град", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Угол сноса, град", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Высота барометрическая, м", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Высота геометрическая, м", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Дальность текущая, м", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Дальность начала стрельбы (минимальная), м", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Дальность окончания стрельбы (максимальная), м", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Горизонтальная составляющая суммарной угловой поправки стрельбы (Y), град", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Вертикальная составляющая суммарной угловой поправки стрельбы угол линии визирования объекта (Z), град", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField( "Слово признаков", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField( "Выбор АСП к применению",
        Flag.T_OP_EQ,
        intArrayOf(0, 1, 2, 3, 4, 5, 6, 7),
        listOf("нет", "ВПУ", "НРС", "60", "АБ", "ППУ", "УР", "СпБ"),
        "запрещенная комбинация"
    ),

    TStructField( "Выбор способа разгрузки",
        Flag.T_OP_EQ,
        intArrayOf(1, 2, 4, 6),
        listOf("все", "по 2", "по 1", "по 4"),
        "запрещенная комбинация"
    ),

    TStructField( "Выбор способа применения АСП",
        Flag.T_OP_EQ,
        intArrayOf(2, 4, 5, 9, 12, 13),
        listOf("залп", "0,1с", "0,2с", "серия", "0,3с", "0,4с"),
        "запрещенная комбинация"
    ),

    TStructField( "Счетчик запаса комплекта ВПУ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField( "Признак ОБ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Признак ТБ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Признак РУЧ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Реж.прицеливания АВТО/РУЧ ( АВТО = 1 )", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Исп.бомб с ТУ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Прицеливание по цели", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "ВЕРХУШКА - 2D/3D", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "ВЕРХУШКА - экстраполяция", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "ВЕРХУШКА - нав.поле", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "ВЕРХУШКА - гот.времени", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Отказ сист.позиц", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Признак наличия 250 пакета для тек. сек.", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Общий отказ СПМО БЭИПНО-С", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Тестовый режим", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField( "Слово признаков 2", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField( "Отсечка", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "С/Б ( С = 1 )", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Главный ВКЛ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField( "ТП2", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "ТП3", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "ТП4", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "ТП5", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "ТП7", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "ТП8", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "ТП9", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "ТП10", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField( "Нет ответа от бортовой ИКРЛ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Отказ антенны из состава БПУ-ГН", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Отказ ПКУ-С", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Отказ БПНД", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Отказ БДСУО (БРЭО АК СУ-25СМ)", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Отказ БСНД- К из состава БПУ-ГН", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Отказ БСС", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Относительная барометрническая высота, м", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), "")
)

val PD_222 = listOf(
    TStructField( "Идентификатор пакета", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Контрольная сумма", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField( "Счетчик секундных циклов", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Счетчик внутри секундного цикла", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Порядковый номер выстрела", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Время выстрела, сек", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Счетчик времени удержания БК, циклов по 50 мс", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Признак нажатия БК подвесок", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Признак нажатия БК ВПУ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Валидность данных 1", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Валидность данных 2", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Конец передачи пакетов 224 (есть 225 пакет)", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField( "Номер спутника", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Слово состояния", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Псевдодальность, сек", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Время измерения, сек", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Подбой, сек", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Доплер", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Фаза несущей", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Сигнал-шум", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Контрольная сумма", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField( "Номер спутника 2", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Слово состояния 2", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Псевдодальность 2, сек", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Время измерения 2, сек", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Подбой 2, сек", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Доплер 2", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Фаза несущей 2", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Сигнал-шум 2", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Контрольная сумма 2", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), "")
)

val PD_223 = listOf(
    TStructField( "Идентификатор пакета", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Контрольная сумма", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField( "Счетчик секундных циклов", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Счетчик внутри секундного цикла", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField( "Валидность данных 1", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Валидность данных 2", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Конец передачи пакетов 224 (есть 225 пакет)", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField( "Номер спутника 1", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Слово состояния 1", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Псевдодальность 1, сек", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Время измерения 1, сек", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Подбой 1, сек", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Доплер 1", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Фаза несущей 1", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Сигнал-шум 1", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Контрольная сумма 1", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField( "Номер спутника 2", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Слово состояния 2", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Псевдодальность 2, сек", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Время измерения 2, сек", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Подбой 2, сек", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Доплер 2", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Фаза несущей 2", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Сигнал-шум 2", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Контрольная сумма 2", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), "")
)

val PD_300 = listOf(
    TStructField( "Идентификатор пакета", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Контрольная сумма", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField( "Счетчик секундных циклов", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Счетчик внутри секундного цикла", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Порядковый номер выстрела", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Время выстрела, сек", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Счетчик времени удержания БК, циклов по 50 мс", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Признак нажатия БК подвесок", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Признак нажатия БК ВПУ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField( "Продольная угловая скорость в ЗСК (x), град/с", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Вертикальная угловая скорость в ЗСК (y), град/с", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Боковая угловая скорость в ЗСК (z), град/с", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField( "Заданный курс, град", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Скорость заданная, м/с", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Число М", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Режимы работы", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Управляющее слово РСБН", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Слово признаков РСБН", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Признаки посадки", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Признаки работы", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Слово управл. Индикацией", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField( "Разовые ком реж СЗ, РК32", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Атака 2 вида", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Воздух-Земля (1-Воздух)", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField( "Способ применения АСП",
        Flag.T_OP_EQ,
        intArrayOf(2, 4, 5, 9, 12, 13),
        listOf("залп", "0,1с", "0,2с", "серия", "0,3с", "0,4с"),
        "запрещенная комбинация"
    ),

    TStructField( "Выбор способа разгрузки",
        Flag.T_OP_EQ,
        intArrayOf(1, 2, 4, 6),
        listOf("все", "по 2", "по 1", "по 4"),
        "запрещенная комбинация"
    ),

    TStructField( "Выбор АСП к применению",
        Flag.T_OP_EQ,
        intArrayOf(0, 1, 2, 4, 6),
        listOf("нет", "ВПУ", "НРС", "АБ", "УР"),
        "запрещенная комбинация"
    ),

    TStructField( "Разовые ком реж СЗ, РК34", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "РК режимов", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField( "Скорость вдоль продольной оси Vx в СГСК, м/с", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Скорость вдоль продольной оси Vy в СГСК, м/с", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Скорость вдоль продольной оси Vz в СГСК, м/с", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField( "Составляющая антенной скорости ШО-13, Wy, м/с", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Составляющая антенной скорости ШО-13, Wz, м/с", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Составляющая антенной скорости ШО-13, Wx, м/с", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField( "Мощность передатчика",
        Flag.T_OP_EQ,
        intArrayOf(0, 1, 2, 3, 4),
        listOf("опред.УРЧ", "выкл.", "пониж.", "средн.", "полная"),
        "запрещенная комбинация"
    ),

    TStructField( "Высота системная, м", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Код изделия", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), "")
)

val PD_305 = listOf(
    TStructField( "Идентификатор пакета", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Контрольная сумма", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField( "Счетчик секундных циклов", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Счетчик внутри секундного цикла", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Порядковый номер выстрела", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Время выстрела, сек", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Счетчик времени удержания БК, циклов по 50 мс", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Признак нажатия БК подвесок", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Признак нажатия БК ВПУ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField( "Слово признаков МФЦИ 1", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Слово признаков БФВИ 1", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Управляющее слово БФВИ+РК", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Угловая скорость ЛВ Клен, Y, град/с", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Угловая скорость ЛВ Клен,  Z+ РК", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Полный относ, м", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField( "Разовые ком реж СЗ, РК31", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Разовые ком реж СЗ, РК36, подв.1", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Разовые ком реж СЗ, РК36, подв.2", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Разовые ком реж СЗ, РК36, подв.3", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Разовые ком реж СЗ, РК36, подв.4", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Разовые ком реж СЗ, РК36, подв.5", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Разовые ком реж СЗ, РК36, подв.6", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Разовые ком реж СЗ, РК36, подв.7", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Разовые ком реж СЗ, РК36, подв.8", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Разовые ком реж СЗ, РК36, подв.9", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Разовые ком реж СЗ, РК36, подв.10", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Угол визирной метки КАИ без поправок по месту, град", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Угол визирной метки КАИ без поправок по направлению, град", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), "")
)

val PD_310 = listOf(
    TStructField( "Идентификатор пакета", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Контрольная сумма", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField( "Счетчик секундных циклов", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Счетчик внутри секундного цикла", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Порядковый номер выстрела", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Время выстрела, сек", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Счетчик времени удержания БК, циклов по 50 мс", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Признак нажатия БК подвесок", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Признак нажатия БК ВПУ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField( "Управляющие сигналы по крену", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Управляющие сигналы по тангажу", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Слово индикации строба 2", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Слово индикации сообщений", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Координата цели Х, м", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "СРК_40", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Время оставшееся до сброса, сек", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Разовые ком реж СЗ, РК33", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Дальность увода", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Угол визирования ПМ КАИ без поправок по месту, град", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Угол визирования ПМ КАИ без поправок по направлению, град", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Дальность системная, м", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Координата цели Z, м", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), "")
)

val PD_315 = listOf(
    TStructField( "Идентификатор пакета", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Контрольная сумма", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField( "Счетчик секундных циклов", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Счетчик внутри секундного цикла", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Порядковый номер выстрела", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Время выстрела, сек", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Счетчик времени удержания БК, циклов по 50 мс", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Признак нажатия БК подвесок", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Признак нажатия БК ВПУ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField( "Боковое отклонение, м", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Время оставшееся до НТ, сек", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Азимут до АЭР, град", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Дальность до АЭР, км", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Дальность до НТ, км", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Азимут до РМ, град", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Дальность до РМ, км", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Курс внешний, град", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Слово признаков МФЦИ 2", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Слово признаков МФЦИ 3",  Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Слово признаков МФЦИ 5", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Составляющие скорости ветра, X, м/с", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Составляющие скорости ветра, Y, м/с", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Боковой относ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), "")
)

val PD_320 = listOf(
    TStructField( "Идентификатор пакета", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Контрольная сумма", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField( "Счетчик секундных циклов", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Счетчик внутри секундного цикла", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField( "Режимы работы", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Слово данных ПЗ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Тип НРС, АБ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Хар. Скорость, м/с", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Хар. Скорость на участке 1, м/с", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Хар. Скорость на участке 2, м/с", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Время на 1-ом участке, сек", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Время на 2-ом участке, сек", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Интервал разгрузки КМГУ, сек", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Высота подрыва, м", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), "")
)

val PD_321 = listOf(
    TStructField( "Идентификатор пакета", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Контрольная сумма", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField( "Счетчик секундных циклов", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Счетчик внутри секундного цикла", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField( "Признак массива", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Географическая широта, град", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Географическая долгота, град", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField( "Высота цели, м", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Дальность упреждения, км", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Курс подхода, град", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Высота заданная, м", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Продольный вынос, км, км", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Боковой вынос, км", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Магнитное склонение, град", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Время прибытия, сек", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), "")
)

val PD_322 = listOf(
    TStructField( "Идентификатор пакета", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Контрольная сумма", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField( "Счетчик секундных циклов", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Счетчик внутри секундного цикла", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField( "Признак массива", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Географическая широта, град", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Географическая долгота, град", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField( "Высота цели, м", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Курс ВПП, град", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Глиссада, град", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Длина ВПП, м", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Магнитное склонение, град", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Имя1, буквы 1,2", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Имя2, буквы 3,4", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Имя3, буквы 5,6", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Имя4, буквы 7,8", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Номер ЧКК", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
)

val PD_323 = listOf(
    TStructField( "Идентификатор пакета", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Контрольная сумма", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField( "Счетчик секундных циклов", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Счетчик внутри секундного цикла", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField( "Признак массива", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Географическая широта, град", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Географическая долгота, град", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField( "Высота, м", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Номер ЧКК", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), "")
)

val PD_324 = listOf(
    TStructField( "Идентификатор пакета", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Контрольная сумма", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField( "Счетчик секундных циклов", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Счетчик внутри секундного цикла", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField( "Признак массива", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Географическая широта, град", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Географическая долгота, град", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField( "Высота, м", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), "")
)

val PD_325 = listOf(
    TStructField( "Идентификатор пакета", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Контрольная сумма", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField( "Счетчик секундных циклов", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Счетчик внутри секундного цикла", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField( "Признак массива", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Географическая широта, град", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Географическая долгота, град", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField( "Высота, м", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Радиус, м", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), "")
)

val PD_326 = listOf(
    TStructField( "Идентификатор пакета", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Контрольная сумма", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField( "Счетчик секундных циклов", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Счетчик внутри секундного цикла", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField( "Признак массива", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Географическая широта, град", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Географическая долгота, град", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField( "Высота, м", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), "")
)

val PD_400 = listOf(
    TStructField( "Идентификатор пакета", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Контрольная сумма", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Слово признаков", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Порядковый номер последнего обработанного выстрела", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Счетчик сообщений", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField( "Мощность передатчика",
        Flag.T_OP_EQ,
        intArrayOf(0, 1, 2, 3, 4),
        listOf("опред.УРЧ", "выкл.", "пониж.", "средн.", "полная"),
        "запрещенная комбинация"
    ),

    TStructField("Тип АСП ТП1", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Тип АСП ТП2", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Тип АСП ТП3", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Тип АСП ТП4", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), "")
)

val PD_410 = listOf(
    TStructField( "Идентификатор пакета", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Контрольная сумма", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField( "Счетчик секундных циклов", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Счетчик внутри секундного цикла", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Порядковый номер выстрела", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Время выстрела, сек", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Счетчик времени удержания БК, циклов по 50 мс", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Признак приема 250 (VS) пакета", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Признак нажатия БК подвесок", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Признак нажатия БК ВПУ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Признак повторного пакета", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Время внутри суток, сек", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Широта (неуточненная), рад", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Долгота (неуточненная), рад", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Высота (неуточненная), м", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Курс истинный, град", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Крен, град", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Тангаж, град", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Высота абсолютная барометрическая, м", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Продольная составляющая воздушной скорости, км/ч", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Поперечная составляющая воздушной скорости, км/ч", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Вертикальная составляющая воздушной скорости, км/ч", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Скорость относительная северная инерциальная, м/с", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Скорость относительная восточная инерциальная, м/с", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Вертикальная составляющая относительной скорости, м/с", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Скорость ветра, м/с", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Направление ветра в ССК, град", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Угол отклонения ПМ по направлению, град", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Угол отклонения ПМ по месту, град", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Угол положения ПУ в горизонтальной плоскости, град", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Угол положения ПУ в вертикальной плоскости, град", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Угол ЛВ по азимуту ОПС, град", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Угол места ЛВ ОПС, град", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("СУО ГЛАВНЫЙ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Выбор НППУ_Л", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Признак ПР-Л", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Признак ПР-О", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Выбранный тип АСП",
        Flag.T_OP_EQ,
        intArrayOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 15, 16, 17, 18, 19, 20, 25, 31),
        listOf("Не выбрана", "C8", "C13", "C8-1", "C8-2", "C8-3", "C8-4", "C8-5", "C8-6", "C8-7", "C8-8", "C8-9", "C8-10", "КМГУ", "УР А-К", "УР А-Ф", "УР А-С", "УР АМ-К", "УР АМ-Ф", "УР АМ-С", "УР Игла", "ТБ"),
        "Запрещенный код"
    ),

    TStructField("Длина очереди ПУ",
        Flag.T_OP_EQ,
        intArrayOf(0, 1, 2, 3),
        listOf("Не выбрана", "короткая", "средняя", "длинная"),
        "Запрещенный код"
    ),

    TStructField("Выбор ППУ_O", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Темп стрельбы ПУ",
        Flag.T_OP_EQ,
        intArrayOf(0, 1),
        listOf("большой", "малый"),
        "Запрещенный код"
    ),

    TStructField("Вариант разгрузки НУО",
        Flag.T_OP_EQ,
        intArrayOf(0, 1, 2, 3),
        listOf("Не выбран", "внеш.", "внутр.", "все"),
        "Запрещенный код"
    ),

    TStructField("Признак ГШ-Л", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Признак ГШ-О", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Признак БК-Л", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Признак БК-O", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Действие", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Выбор ящика Ф", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Выбор ящика Бр", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Готовность БСПИ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Непоходное положение ПУ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Режим разгрузки НУО",
        Flag.T_OP_EQ,
        intArrayOf(0, 1, 2, 3),
        listOf("Не выбрана", "короткая", "средняя", "длинная"),
        "Запрещенный код"
    ),

    TStructField("Отказ ОПС", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Разар. ОПС-кв", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Измерение дальности", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Ручное сопровождение", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Автоматическое сопровождение", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Программное сопровождение", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Гот. ОПС", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Исп. ОПС", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("УПЗ ( узкое поля зрения )", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("СПЗ ( среднее поля зрения )", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("ШПЗ ( широкое поля зрения )", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Исправность ПУ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Верхний упор ППУ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Нижний упор ППУ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Левый упор ППУ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Правый упор ППУ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Фиксир. угол 0°", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Привязка", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Упор ГС (Упор ЛВ)", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("СП (программный сброс)", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("КОД НЧ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Сход (изд. А)", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Борт Л (изд. А с лев.)", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Борт П (изд. А с прав.)", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Ручной режим", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Целеуказание от оператора", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Сброс летчика СБРОС_Л", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Целеуказание от летчика ЦУ-Л", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("ПРИВЯЗ-Л (СРК1)", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("ПРИВЯЗ-О (СРК1)", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("СБРОС-О (СРК1)", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Исправность ИЛС", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("3Гц (ТОЭС)", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Дальность (ТОЭС)", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Исправность ТОЭС", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Готовность ТОЭС", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Скорость вдоль продольной оси, м/с", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Скорость вдоль поперечной оси, м/с", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Скорость вдоль вертикальной оси, м/с", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Режимы специальных задач 1", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Режимы специальных задач 2", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Режимы специальных задач 3", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), "")
)

val PD_411 = listOf(
    TStructField( "Идентификатор пакета", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Контрольная сумма", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField( "Счетчик секундных циклов", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Счетчик внутри секундного цикла", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Порядковый номер выстрела", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Время выстрела, сек", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Счетчик времени удержания БК, циклов по 50 мс", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Достоверность внутрисистемного обмена БЭИПНО", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Отказ МКВ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Отказ ПКУ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Отказ БВ-С", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Отказ БСС", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Отказ БППУ-ГН", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Отказ бортовой ИКРЛ-С", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Отказ МС", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Путевой угол фактический, град", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Широта географическая компл., град", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Долгота географическая компл., град", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Широта географическая инерциальная, град", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Долгота географическая инерциальная, град", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Высота бароинерциальная, м", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Относительная барометрническая высота, м", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Высота геометрическая (радиовысота), м", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Скорость приборная, км/ч", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Вертикальная бароинерциальная скорость, м/с", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Давление у земли, мм. рт. ст.", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Баллистический относ, м", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Относ НАР, м", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Время падения НАР, сек", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Дальность до цели, м", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Магнитное склонение, град", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Максимальная дальность прим. АСП, м", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Минимальная дальность прим. АСП, м", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Мощность бортового передатчика",
        Flag.T_OP_EQ,
        intArrayOf(0, 1, 2, 3, 4),
        listOf("опред.УРЧ", "выкл", "пониженная", "средняя", "полная"),
        "запрещенная комбинация"
    ),

    TStructField("Исправность СНС",
        Flag.T_OP_EQ,
        intArrayOf(0, 1, 2),
        listOf("Неисправно", "Исправно", "Неготово или частично исправно"),
        "Запрещенный код"
    ),

    TStructField("Исправность РВ",
        Flag.T_OP_EQ,
        intArrayOf(0, 1, 2),
        listOf("Неисправно", "Исправно", "Неготово или частично исправно"),
        "Запрещенный код"
    ),

    TStructField("Исправность БПС-1 (СПАДИ)",
        Flag.T_OP_EQ,
        intArrayOf(0, 1, 2),
        listOf("Неисправно", "Исправно", "Неготово или частично исправно"),
        "Запрещенный код"
    ),

    TStructField("Исправность ПКВ",
        Flag.T_OP_EQ,
        intArrayOf(0, 1, 2),
        listOf("Неисправно", "Исправно", "Неготово или частично исправно"),
        "Запрещенный код"
    ),

    TStructField("Исправность КСС",
        Flag.T_OP_EQ,
        intArrayOf(0, 1, 2),
        listOf("Неисправно", "Исправно", "Неготово или частично исправно"),
        "Запрещенный код"
    ),

    TStructField("Исправность БК-77",
        Flag.T_OP_EQ,
        intArrayOf(0, 1, 2),
        listOf("Неисправно", "Исправно", "Неготово или частично исправно"),
        "Запрещенный код"
    ),

    TStructField("Исправность АРК",
        Flag.T_OP_EQ,
        intArrayOf(0, 1, 2),
        listOf("Неисправно", "Исправно", "Неготово или частично исправно"),
        "Запрещенный код"
    ),

    TStructField("Исправность БПС-2 (СПАДИ)",
        Flag.T_OP_EQ,
        intArrayOf(0, 1, 2),
        listOf("Неисправно", "Исправно", "Неготово или частично исправно"),
        "Запрещенный код"
    ),

    TStructField("Исправность РЛС",
        Flag.T_OP_EQ,
        intArrayOf(0, 1, 2),
        listOf("Неисправно", "Исправно", "Неготово или частично исправно"),
        "Запрещенный код"
    ),

    TStructField("Исправность СУО",
        Flag.T_OP_EQ,
        intArrayOf(0, 1, 2),
        listOf("Неисправно", "Исправно", "Неготово или частично исправно"),
        "Запрещенный код"
    ),

    TStructField("Исправность БСПИ-4",
        Flag.T_OP_EQ,
        intArrayOf(0, 1, 2),
        listOf("Неисправно", "Исправно", "Неготово или частично исправно"),
        "Запрещенный код"
    ),

    TStructField("Признаки исправности подсистем БРЭО (СРК4)", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Время текущее московское, сек", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Превышение над навигационной целью в ЗСК, м", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Угол отклонения ПМ по направлению, град", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Угол отклонения ПМ по месту, град", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Расчетный угол атаки, град", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Расчетный угол скольжения, град", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Дальность от оператора плоская, км", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Скорость продольная земная Vx, км/ч", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Скорость поперечная земная Vz, км/ч", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Скорость вертикальная земная Vy, м/с", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), "")
)

val PD_412 = listOf(
    TStructField( "Идентификатор пакета", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Контрольная сумма", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField( "Счетчик секундных циклов", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Счетчик внутри секундного цикла", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Порядковый номер выстрела", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Время выстрела, сек", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Счетчик времени удержания БК, циклов по 50 мс", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Составляющая угловой скорости по оси X, град/с", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Составляющая угловой скорости по оси Y, град/с", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Составляющая угловой скорости по оси Z, град/с", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Составляющая линейного ускорения по оси X, м/с2", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Составляющая линейного ускорения по оси Y, м/с2", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Составляющая линейного ускорения по оси Z, м/с2", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Курс заданный, град", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Скорость приборная заданная, км/ч", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Перегрузка, ед", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Высота барометрическая заданная, м", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Высота опасная, м", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Расчетное время полета АСП до цели, сек", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Слово данных №2 АРК-25", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Дальность до исполняемой НТ, км", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Признаки исправности подсистем БРЭО (СРК3)", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Исправность БЦВМ-1",
        Flag.T_OP_EQ,
        intArrayOf(0, 1, 2),
        listOf("Неисправно", "Исправно", "Неготово или частично исправно"),
        "Запрещенный код"
    ),

    TStructField("Исправность БЦВМ-2",
        Flag.T_OP_EQ,
        intArrayOf(0, 1, 2),
        listOf("Неисправно", "Исправно", "Неготово или частично исправно"),
        "Запрещенный код"
    ),

    TStructField("Исправность МФИ-О в (№1)",
        Flag.T_OP_EQ,
        intArrayOf(0, 1, 2),
        listOf("Неисправно", "Исправно", "Неготово или частично исправно"),
        "Запрещенный код"
    ),

    TStructField("Исправность МФИ-О н (№2)",
        Flag.T_OP_EQ,
        intArrayOf(0, 1, 2),
        listOf("Неисправно", "Исправно", "Неготово или частично исправно"),
        "Запрещенный код"
    ),

    TStructField("Исправность МФИ-Л л (№3)",
        Flag.T_OP_EQ,
        intArrayOf(0, 1, 2),
        listOf("Неисправно", "Исправно", "Неготово или частично исправно"),
        "Запрещенный код"
    ),

    TStructField("Исправность МФИ-Л п (№4)",
        Flag.T_OP_EQ,
        intArrayOf(0, 1, 2),
        listOf("Неисправно", "Исправно", "Неготово или частично исправно"),
        "Запрещенный код"
    ),

    TStructField("Исправность ПС",
        Flag.T_OP_EQ,
        intArrayOf(0, 1, 2),
        listOf("Неисправно", "Исправно", "Неготово или частично исправно"),
        "Запрещенный код"
    ),

    TStructField("Исправность ИНС",
        Flag.T_OP_EQ,
        intArrayOf(0, 1, 2),
        listOf("Неисправно", "Исправно", "Неготово или частично исправно"),
        "Запрещенный код"
    ),

    TStructField("Исправность СБКВ",
        Flag.T_OP_EQ,
        intArrayOf(0, 1, 2),
        listOf("Неисправно", "Исправно", "Неготово или частично исправно"),
        "Запрещенный код"
    ),

    TStructField("Исправность ДИСС",
        Flag.T_OP_EQ,
        intArrayOf(0, 1, 2),
        listOf("Неисправно", "Исправно", "Неготово или частично исправно"),
        "Запрещенный код"
    ),

    TStructField("Исправность СВС",
        Flag.T_OP_EQ,
        intArrayOf(0, 1, 2),
        listOf("Неисправно", "Исправно", "Неготово или частично исправно"),
        "Запрещенный код"
    ),

    TStructField("Признаки исправности подсистем БРЭО (СРК5)", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Исправность ОПС",
        Flag.T_OP_EQ,
        intArrayOf(0, 1, 2),
        listOf("Неисправно", "Исправно", "Неготово или частично исправно"),
        "Запрещенный код"
    ),

    TStructField("Исправность ТпСЛ",
        Flag.T_OP_EQ,
        intArrayOf(0, 1, 2),
        listOf("Неисправно", "Исправно", "Неготово или частично исправно"),
        "Запрещенный код"
    ),

    TStructField("Исправность БСПИ-6",
        Flag.T_OP_EQ,
        intArrayOf(0, 1, 2),
        listOf("Неисправно", "Исправно", "Неготово или частично исправно"),
        "Запрещенный код"
    ),

    TStructField("Исправность СВР-Б",
        Flag.T_OP_EQ,
        intArrayOf(0, 1, 2),
        listOf("Неисправно", "Исправно", "Неготово или частично исправно"),
        "Запрещенный код"
    ),

    TStructField("Исправность МТЦ-Л",
        Flag.T_OP_EQ,
        intArrayOf(0, 1, 2),
        listOf("Неисправно", "Исправно", "Неготово или частично исправно"),
        "Запрещенный код"
    ),

    TStructField("Исправность БКТС-1",
        Flag.T_OP_EQ,
        intArrayOf(0, 1, 2),
        listOf("Неисправно", "Исправно", "Неготово или частично исправно"),
        "Запрещенный код"
    ),

    TStructField("Код БЧ НАР", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Пуск", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("ПР", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("ПКС", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("АКС", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Сброс", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("ДР-А", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Угол отклонения МПЦ по ИЛС по оси Y, град", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Угол отклонения МПЦ по ИЛС по оси Z, град", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Отклонение от ортодромии боковое (от ЛЗП), м", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Дискретные пар-ры на ИЛС", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Яркость \"Запрета стрельбы\"",
        Flag.T_OP_EQ,
        intArrayOf(0, 1, 3),
        listOf("Не рисуется", "Рисуется", "Мигает"),
        "Запрещенный код"
    ),

    TStructField("Яркость БК ИЛС", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Яркость МПЦ",
        Flag.T_OP_EQ,
        intArrayOf(0, 1, 3),
        listOf("Не рисуется", "Рисуется", "Мигает"),
        "Запрещенный код"
    ),

    TStructField("Яркость времени полета УР-А", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Яркость отклонения от ЛЗП", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Яркость ПМ",
        Flag.T_OP_EQ,
        intArrayOf(0, 1, 3),
        listOf("Не рисуется", "Рисуется", "Мигает"),
        "Запрещенный код"
    ),

    TStructField("Яркость мин. дальности прим.", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Яркость макс. дальности прим.", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Яркость ОМ лев.", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Яркость ОМ прав.", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("№ кадра", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Высота геометрическая заданная, м", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Максимально допустимая вертикальная перегрузка, ед", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("№ текущей НТ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Признаки НТ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Инерциальный режим счисления", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Курсовой режим счисления", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Допплеровский режим счисления", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Воздушный режим счисления", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Режим \"Возврат\"", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Выбор НППУ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Режим управления",
        Flag.T_OP_EQ,
        intArrayOf(1, 2, 3),
        listOf("Путевой режим управления", "Маршрутный режим управления", "Комбинированный режим упрааления"),
        "Запрещенный код"
    ),

    TStructField("Тип НТ",
        Flag.T_OP_EQ,
        intArrayOf(0, 1, 2, 4, 8, 16, 32),
        listOf("Не определен", "Неизвестен", "Полет на Цель", "Полет на Аэродром", "Полет на ППМ", "Полет на КПМ", "Полет на ИПМ"),
        "Запрещенный код"
    ),

    TStructField("К2-кв", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("К1-кв", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("СРК2", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Выбор НАР", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("режим ЛУР", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Разрешена коррекция от СНС", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Разрешена коррекция от ДИСС", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Коррекция координат по СНС", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Курс от (Авто-1, ИНС-2, СБКВ-3)", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Поверхность", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Выбор А-С", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Выбор А-Ф", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Выбор А-К", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("ПОС", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("ЦУ-Л", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Время полета, сек", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Дальность до цели измеренная ТОЭС, м", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Угол ЛВ по азимуту ТОЭС, град.", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Угол места ЛВ  ТОЭС, град.", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Курс СБИ, град", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Дальность до цели тек. (ОПС), м", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Дальность до цели (оператор) изм. (ОПС), м", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Превышение над целью, м", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Превышение цели относительно точки взлета, м", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), "")
)

val PD_500 = listOf(
    TStructField( "Идентификатор пакета", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Контрольная сумма", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Слово признаков", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Порядковый номер последнего обработанного выстрела", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Счетчик сообщений", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Мощность передатчика",
        Flag.T_OP_EQ,
        intArrayOf(0, 1, 2, 3, 4),
        listOf("опред.УРЧ", "выкл", "пониженная", "средняя", "полная"),
        "запрещенная комбинация"
    )
)

val PD_510 = listOf(
    TStructField( "Идентификатор пакета", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Контрольная сумма", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Счетчик секундных циклов", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Счетчик внутри секундного цикла", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Порядковый номер выстрела", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Время выстрела, сек", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Счетчик времени удержания БК, циклов по 50 мс", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Признак приема 250 (VS) пакета", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Признак нажатия БК подвесок", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Признак нажатия БК ВПУ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Признак повторного пакета", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Время внутри суток, сек", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Широта (неуточненная), рад", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Долгота (неуточненная), рад", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Высота (неуточненная), м", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Курс истинный, град", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Крен, град", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Тангаж, град", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Высота абсолютная барометрическая, м", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Пуск 2 ТП 1", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Пуск 2 ТП 2", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Пуск 2 ТП 3", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Пуск 2 ТП 4", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("СУО ГЛАВНЫЙ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("ПР-Л", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("ПР-П", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Выбранный тип АСП",
        Flag.T_OP_EQ,
        intArrayOf(0, 1, 2, 3, 4, 5),
        listOf("Не выбран", "УР-А (Атака)", "ИГЛА", "C8", "ТБ", "УР-B (Вихрь)"),
        "Запрещенный код"
    ),

    TStructField("Вариант разгрузки",
        Flag.T_OP_EQ,
        intArrayOf(1),
        listOf("Внутр"),
        "Внешн"
    ),

    TStructField("Режим разгрузки",
        Flag.T_OP_EQ,
        intArrayOf(0, 1, 2, 3),
        listOf("Не выбран", "КОР", "СР", "ДЛ"),
        "Запрещенный код"
    ),

    TStructField("БК ВПУ Л", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("БК ВПУ O", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("БК ВПУ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("БК РС Л", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("БК РС O", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("БК УР О", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("БК", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("БР", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Тренаж",
        Flag.T_OP_EQ,
        intArrayOf(1),
        listOf("Вкл"),
        "Нет"
    ),

    TStructField("Блокировка СУО", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("ПР", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Выбор ТП 1", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Выбор ТП 2", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Выбор ТП 3", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Выбор ТП 4", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Выбор ТП 5", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Выбор ТП 6", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("ЛСН в работе", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Выбор ВПУ Л", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Выбор ВПУ О", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Выбранный ПЯ",
        Flag.T_OP_EQ,
        intArrayOf(1),
        listOf("Передний"),
        "Задний"
    ),

    TStructField("Темп работы ПУ",
        Flag.T_OP_EQ,
        intArrayOf(1),
        listOf("Большой"),
        "Малый"
    ),

    TStructField("Перекладка", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Выбор ВПУ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Квитанция ППУ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Остаток ПУ переднего", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Остаток ПУ заднего", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Скорость вдоль продольной оси, м/с", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Скорость вдоль поперечной оси, м/с", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Скорость вдоль вертикальной оси, м/с", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Продольная составляющая воздушной скорости, км/ч", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Поперечная составляющая воздушной скорости, км/ч", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Вертикальная составляющая воздушной скорости, км/ч", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Скорость относительная северная инерциальная, м/с", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Скорость относительная восточная инерциальная, м/с", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Вертикальная составляющая относительной скорости, м/с", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Значение скорости ветра, км/ч", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Навигационное направление ветра, град", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Угол отклонения ПМ по направлению, град", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Угол отклонения ПМ по месту, град", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Угол положения ППУ по направлению, град", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Угол положения ППУ по месту, град", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Угол ЛВ по азимуту ГОЭС, град", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Угол места ЛВ ГОЭС, град", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Превышение над целью, м", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), "")
)

val PD_511 = listOf(
    TStructField( "Идентификатор пакета", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Контрольная сумма", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Счетчик секундных циклов", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Счетчик внутри секундного цикла", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Порядковый номер выстрела", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Время выстрела, сек", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Счетчик времени удержания БК, циклов по 50 мс", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Достоверность внутрисистемного обмена БЭИПНО", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Отказ МКВ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Отказ ПКУ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Отказ БВ-С", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Отказ БСС", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Отказ БППУ-ГН", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Отказ бортовой ИКРЛ-С", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Отказ МС", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Время текущее московское", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Путевой угол фактический, град", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Угол крена компл., град", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Угол тангажа компл., град", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Широта географическая компл., град", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Долгота географическая компл., град", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Широта географическая инерциальная , град", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Долгота географическая инерциальная , град", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Высота бароинерциальная, м", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Относительная барометрническая высота, м", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Высота геометрическая (радиовысота), м", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Скорость приборная, км/ч", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Вертикальная бароинерциальная скорость, м/с", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Давление у земли, мм. рт. ст.", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Полный относ снаряда в горизонтальной плоскости, м", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Полный относ снаряда в боковой плоскости, м", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Время полета снаряда, сек", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Расчетное время полета АСП до цели, сек", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Дальность до цели (оператора), тек., м", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Дальность до цели (оператора), изм., м", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Магнитное склонение, град", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Излучение ЛД РК4", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("ТА захватил цель РК4", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("ЛСН в работе РК4", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Неисправность ЛСН РК4", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Готовность ЛСН РК4", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Блокировка лазерного излучения РК4", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Арретир РК4", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Готовность ГОЭС", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Тип АСП на ТП1", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Количество АСП на ТП1", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Выбор ТП1", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Тип АСП на ТП2", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Количество АСП на ТП2", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Выбор ТП2", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Тип АСП на ТП3", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Количество АСП на ТП3", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Выбор ТП3", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Тип АСП на ТП4", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Количество АСП на ТП4", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Выбор ТП4", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Тип АСП на ТП5", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Количество АСП на ТП5", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Выбор ТП5", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Тип АСП на ТП6", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Количество АСП на ТП6", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Выбор ТП6", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Максимальная дальность прим. АСП, м", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Минимальная дальность прим. АСП, м", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Мощность бортового передатчика",
        Flag.T_OP_EQ,
        intArrayOf(0, 1, 2, 3, 4),
        listOf("опред.УРЧ", "выкл", "пониженная", "средняя", "полная"),
        "запрещенная комбинация"
    ),

    TStructField("ЦУ Л", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Автовыбор ИНС или СБКВ",
        Flag.T_OP_EQ,
        intArrayOf(1),
        listOf("Автовыбор"),
        "Нет"
    ),

    TStructField("Система для счисленения СБКВ",
        Flag.T_OP_EQ,
        intArrayOf(1),
        listOf("СБКВ"),
        "Нет"
    ),

    TStructField("Система для счисленения ИНС",
        Flag.T_OP_EQ,
        intArrayOf(1),
        listOf("ИНС"),
        "Нет"
    ),

    TStructField("ЛЕВ/ПРАВ",
        Flag.T_OP_EQ,
        intArrayOf(1),
        listOf("ПРАВ"),
        "ЛЕВ"
    ),

    TStructField("Признак \"Работа\" (РК2)", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Признак \"Маршрутный способ управления\" (РК2)", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Пуск 1 ТП 1 (РК2)", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Пуск 2 ТП 1 (РК2)", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Пуск 1 ТП 2 (РК2)", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Пуск 2 ТП 2 (РК2)", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Пуск 1 ТП 3 (РК2)", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Пуск 2 ТП 3 (РК2)", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Пуск 1 ТП 4 (РК2)", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Пуск 2 ТП 4 (РК2)", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("ППУ (РК2)", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("ЦУ О", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("СБРОС О", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Путевой способ управления", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Комбинированный способ управления", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Маршрутный способ управления", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("АС СНЯТ (о)", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("АС СНЯТ (л)", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Режимы ГОЭС Ка-52 (РК4)", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Режимы ТП1 (РК6)", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Режимы ТП2 (РК7)", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Режимы ТП3 (РК8)", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Режимы ТП4 (РК9)", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Режимы ТП5 (РК10)", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Режимы ТП6 (РК11)", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Признаки достоверности подсистем БРЭО (РК2)", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), "")
)

val PD_512 = listOf(
    TStructField( "Идентификатор пакета", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Контрольная сумма", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Счетчик секундных циклов", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Счетчик внутри секундного цикла", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Порядковый номер выстрела", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Время выстрела, сек", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Счетчик времени удержания БК, циклов по 50 мс", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Составляющая угловой скорости по оси X, град/с", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Составляющая угловой скорости по оси Y, град/с", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Составляющая угловой скорости по оси Z, град/с", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Составляющая линейного ускорения по оси X, м/с2", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Составляющая линейного ускорения по оси Y, м/с2", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Составляющая линейного ускорения по оси Z, м/с2", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Курс заданный, град", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Скорость заданная, км/ч", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Угол отклонения МПЦ по ИЛС по оси Y, град", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Угол отклонения МПЦ по ИЛС по оси Z, град", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Отклонение от ортодромии боковое (от ЛЗП), м", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Дискретные пар-ры на ИЛС", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("№ кадра", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Яркость ОМ прав.", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Яркость ОМ лев.", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Яркость макс. дальности прим.", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Яркость мин. дальности прим.", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Яркость ПМ",
        Flag.T_OP_EQ,
        intArrayOf(0, 1, 3),
        listOf("Не рисуется", "Рисуется", "Мигает"),
        "Запрещенная комбинация"
    ),

    TStructField("Яркость отклонения от ЛЗП", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Яркость времени полета УР", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Яркость МПЦ",
        Flag.T_OP_EQ,
        intArrayOf(0, 1, 3),
        listOf("Не рисуется", "Рисуется", "Мигает"),
        "Запрещенная комбинация"
    ),

    TStructField("Яркость БК ИЛС", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Яркость Запрета стрельбы",
        Flag.T_OP_EQ,
        intArrayOf(0, 1, 3),
        listOf("Не рисуется", "Рисуется", "Мигает"),
        "Запрещенная комбинация"
    ),

    TStructField("Несход 1 АСП на ТП1", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Несход 2 АСП на ТП1", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Несход 3 АСП на ТП1", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Несход 4 АСП на ТП1", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Несход 5 АСП на ТП1", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Несход 6 АСП на ТП1", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Тип БЧ 1.1", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Тип БЧ 1.2", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Тип БЧ 1.3", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Тип БЧ 1.4", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Тип БЧ 1.5", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Тип БЧ 1.6", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Выбранный тип БЧ ТП1",
        Flag.T_OP_EQ,
        intArrayOf(0, 1, 2, 3),
        listOf("нет", "Ф1 - ОД", "Ф - ОФ", "К - кумулятивный"),
        "Запрещенная комбинация"
    ),

    TStructField("Несход 1 АСП на ТП4", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Несход 2 АСП на ТП4", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Несход 3 АСП на ТП4", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Несход 4 АСП на ТП4", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Несход 5 АСП на ТП4", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Несход 6 АСП на ТП4", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Тип БЧ 4.1", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Тип БЧ 4.2", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Тип БЧ 4.3", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Тип БЧ 4.4", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Тип БЧ 4.5", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Тип БЧ 4.6", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Выбранный тип БЧ ТП4",
        Flag.T_OP_EQ,
        intArrayOf(0, 1, 2, 3),
        listOf("нет", "Ф1 - ОД", "Ф - ОФ", "К - кумулятивный"),
        "Запрещенная комбинация"
    ),

    TStructField("Дальность до исполняемой НТ, км", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Слово данных №2 АРК-25", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Исправность ИНС", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Отказ СБКВ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Отказ МИВП л.б.", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Отказ МИВП п.б.", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Отказ внутрисистемного обмена", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Исправность информации (РВ)", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Исправность аппаратурная (РВ)", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Исправность УСК", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Исправность ИЛС", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Достоверность Аx", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Достоверность Аy", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Достоверность Тснар", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Достоверность Нпревц", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Отказ ГОЭС", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Исправность СУО", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Навигация", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Высота заданная, м", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Значение ЗПУ пролета НТ, град", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Признаки НТ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Расчетное время прибытия в НТ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Максимально допустимая скорость полог. Пикир., км/ч", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Поперечная составляющая приборной скорости, км/ч", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Боковое отклонение от ЛЗП, м", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Азимут исполняемой НТ, град", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Время СВР, час", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Время СВР, мин", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Время СВР, сек", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Угол курса компл., град", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), "")
)