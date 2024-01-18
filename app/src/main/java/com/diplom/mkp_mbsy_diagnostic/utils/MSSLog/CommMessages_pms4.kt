package com.diplom.mkp_mbsy_diagnostic.utils.MSSLog

import com.diplom.mkp_mbsy_diagnostic.utils.byteArrayToMessage_39

fun PD_chooser_pms(id: Int): List<TStructField>? {
    when (id) {
        16 -> return PD_16
        17 -> return PD_17
        20 -> return PD_20
        21 -> return PD_21
        38 -> return PD_38
        39 -> return PD_39
        54 -> return PD_54
        62 -> return PD_62
        63 -> return PD_63
    }
    return null
}

@OptIn(ExperimentalUnsignedTypes::class)
fun process_data_pms(id: Int, data: ByteArray):List<Comparable<*>>? {
    val msg: List<Comparable<*>>?
    when (id) {
        16, 20, 38, 62 -> {
            msg = listOf(
                data[0].toUByte(),
                data[1].toUByte(),
                data[2].toUByte(),
                data[3].toUByte(),
                ((data[5].toUByte().toInt() shl 8) or data[4].toUByte().toInt()).toUShort(),
                ((data[7].toUByte().toInt() shl 8) or data[6].toUByte().toInt()).toUShort()
            )
            return msg
        }

        17 -> {
            msg = listOf(
                data[0].toUByte(),
                data[1].toUByte(),
                data[2].toUByte(),
                data[3].toUByte(),
                ((data[5].toUByte().toInt() shl 8) or data[4].toUByte().toInt()).toUShort(),
                ((data[7].toUByte().toInt() shl 8) or data[6].toUByte().toInt()).toUShort(),
                data[8].toUByte(),
                data[9].toUByte(),
                data[10].toUByte(),
                data[11].toUByte()
            )
            return msg
        }

        21 -> {
            msg = listOf(
                data[0].toUByte(),
                data[1].toUByte(),
                data[2].toUByte(),
                data[3].toUByte(),
                ((data[5].toUByte().toInt() shl 8) or data[4].toUByte().toInt()).toUShort(),
                ((data[7].toUByte().toInt() shl 8) or data[6].toUByte().toInt()).toUShort(),
                ((data[9].toUByte().toInt() shl 8) or data[8].toUByte().toInt()).toUByte(),
                ((data[11].toUByte().toInt() shl 8) or data[10].toUByte().toInt()).toUByte()
            )
            return msg
        }

        39, 54 -> {
            val msg_class = byteArrayToMessage_39(data)
            val undermining0: String
            val undermining1: String
            val bitsets = ArrayList<String>()
            if (msg_class != null) {
                for (i in msg_class.Charge) {
                    bitsets.add(i.toString(2))
                }
            }
            undermining0 = bitsets[0]
            undermining1 = bitsets[1]
            msg = listOf(
                data[0].toUByte(),
                data[1].toUByte(),
                data[2].toUByte(),
                data[3].toUByte(),
                ((data[5].toUByte().toInt() shl 8) or data[4].toUByte().toInt()).toUShort(),
                ((data[7].toUByte().toInt() shl 8) or data[6].toUByte().toInt()).toUShort(),
                undermining0,
                undermining1
            )
            return msg
        }

        63 -> {
            msg = listOf(
                data[0].toUByte(),
                data[1].toUByte(),
                data[2].toUByte(),
                data[3].toUByte(),
                ((data[5].toUByte().toInt() shl 8) or data[4].toUByte().toInt()).toUShort(),
                ((data[7].toUByte().toInt() shl 8) or data[6].toUByte().toInt()).toUShort(),
                ((data[9].toUByte().toInt() shl 8) or data[8].toUByte().toInt()).toUByte(),
                ((data[11].toUByte().toInt() shl 8) or data[10].toUByte().toInt()).toUByte(),
                ((data[13].toUByte().toInt() shl 8) or data[12].toUByte().toInt()).toUByte(),
                ((data[15].toUByte().toInt() shl 8) or data[14].toUByte().toInt()).toUByte(),
                ((data[17].toUByte().toInt() shl 8) or data[16].toUByte().toInt()).toUByte(),
                ((data[19].toUByte().toInt() shl 8) or data[18].toUByte().toInt()).toUByte(),
            )
            return msg
        }
    }
    return null
}

val PD_0_pms = listOf(
    TStructField("Идентификатор заголовка ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("ID Пакета ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Контрольная сумма ( мл. байт ) ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Контрольная сумма ( ст. байт ) ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), "")
)

val PD_16 = listOf(
    TStructField("Идентификатор заголовка ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("ID Пакета ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Контрольная сумма ( мл. байт ) ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Контрольная сумма ( ст. байт ) ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Номер МБСУ ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Номер МКП ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), "")
)

val PD_17 = listOf(
    TStructField("Идентификатор заголовка ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("ID Пакета ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Контрольная сумма ( мл. байт ) ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Контрольная сумма ( ст. байт ) ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Номер МБСУ ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Номер МКП ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Версия ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Подверсия ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Месяц ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Год ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), "")
)

val PD_20 = listOf(
    TStructField("Идентификатор заголовка ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("ID Пакета ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Контрольная сумма ( мл. байт ) ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Контрольная сумма ( ст. байт ) ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Номер МБСУ: ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Номер МКП: ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), "")
)

val PD_21 = listOf(
    TStructField("Идентификатор заголовка ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("ID Пакета ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Контрольная сумма ( мл. байт ) ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Контрольная сумма ( ст. байт ) ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Номер МБСУ ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Номер МКП ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Колличество ошибок ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Время ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), "")
)

val PD_38 = listOf(
    TStructField("Идентификатор заголовка ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("ID Пакета ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Контрольная сумма ( мл. байт ) ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Контрольная сумма ( ст. байт ) ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Номер МБСУ ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Номер МКП ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), "")
)

val PD_39 = listOf(
    TStructField("Идентификатор заголовка ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("ID Пакета ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Контрольная сумма ( мл. байт ) ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Контрольная сумма ( ст. байт ) ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Номер МБСУ ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Номер МКП ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Массив зарядов[0] ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Массив зарядов[1] ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), "")
)

val PD_54 = listOf(
    TStructField("Идентификатор заголовка ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("ID Пакета ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Контрольная сумма ( мл. байт ) ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Контрольная сумма ( ст. байт ) ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Номер МБСУ ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Номер МКП ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Массив на подрыв[0] ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Массив на подрыв[1] ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), "")
)

val PD_62 = listOf(
    TStructField("Идентификатор заголовка ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("ID Пакета ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Контрольная сумма ( мл. байт ) ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Контрольная сумма ( ст. байт ) ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Номер МБСУ ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Номер МКП ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), "")
)

val PD_63 = listOf(
    TStructField("Идентификатор заголовка ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("ID Пакета ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Контрольная сумма ( мл. байт ) ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Контрольная сумма ( ст. байт ) ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Номер МБСУ ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Номер МКП ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Напряжение МСУ ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Напряжение аккумулятора модема ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Напряжение разблокировки ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Процент распознанной информации ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Резерв ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Температура внутри блока ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), "")
)