package com.diplom.mkp_mbsy_diagnostic.utils.MSSLog

fun PD_chooser_pan(id: Int): List<TStructField>? {
    when (id) {
        220 -> return PD_220
        221 -> return PD_221
    }
    return null
}

val PD_0_pan = listOf(
    TStructField("ID Пакета: ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Контрольная сумма: ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), "")
)

val PD_220 = listOf(
    TStructField("ID Пакета: ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Контрольная сумма: ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Идентификатор типа объекта: ", Flag.T_OP_EQ,
        intArrayOf(1, 2, 3, 101, 102, 103, 104, 105, 106),
        listOf("ПАН", "ППМ", "Взрыв", "Цель-танк", "Цель-БМП", "Цель-РЛС", "Цель-Батарея", "Цель-КШМ", "Цель-ПУ ЗРК"), "запрещенный код"),

    TStructField("Порядковый номер пакета: ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Слово признаков: ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Время, сек от начала дня: ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Тип передаваемых координат: ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Координата X, м: ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Координата Y, м: ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Координата H, м: ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Азимут, град: ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Номер маршрута: ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Номер ППМ в маршруте: ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
)

val PD_221 = listOf(
    TStructField("ID Пакета: ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Контрольная сумма: ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Порядковый номер пакета, на который идет подтверждение: ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), "")
)