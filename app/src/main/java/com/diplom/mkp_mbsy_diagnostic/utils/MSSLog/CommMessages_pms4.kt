package com.diplom.mkp_mbsy_diagnostic.utils.MSSLog

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

val PD_0_pms = listOf(
    TStructField("Идентификатор заголовка: ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("ID Пакета: ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Контрольная сумма ( мл. байт ): ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Контрольная сумма ( ст. байт ): ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), "")
)

val PD_16 = listOf(
    TStructField("Идентификатор заголовка: ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("ID Пакета: ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Контрольная сумма ( мл. байт ): ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Контрольная сумма ( ст. байт ): ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Номер МБСУ: ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Номер МКП: ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), "")
)

val PD_17 = listOf(
    TStructField("Идентификатор заголовка: ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("ID Пакета: ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Контрольная сумма ( мл. байт ): ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Контрольная сумма ( ст. байт ): ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Номер МБСУ: ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Номер МКП: ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Версия: ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Подверсия: ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Месяц: ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Год: ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), "")
)

val PD_20 = listOf(
    TStructField("Идентификатор заголовка: ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("ID Пакета: ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Контрольная сумма ( мл. байт ): ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Контрольная сумма ( ст. байт ): ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Номер МБСУ: ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Номер МКП: ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), "")
)

val PD_21 = listOf(
    TStructField("Идентификатор заголовка: ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("ID Пакета: ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Контрольная сумма ( мл. байт ): ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Контрольная сумма ( ст. байт ): ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Номер МБСУ: ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Номер МКП: ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Колличество ошибок: ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Время: ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), "")
)

val PD_38 = listOf(
    TStructField("Идентификатор заголовка: ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("ID Пакета: ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Контрольная сумма ( мл. байт ): ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Контрольная сумма ( ст. байт ): ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Номер МБСУ: ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Номер МКП: ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), "")
)

val PD_39 = listOf(
    TStructField("Идентификатор заголовка: ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("ID Пакета: ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Контрольная сумма ( мл. байт ): ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Контрольная сумма ( ст. байт ): ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Номер МБСУ: ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Номер МКП: ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Массив зарядов[0]: ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Массив зарядов[1]: ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), "")
)

val PD_54 = listOf(
    TStructField("Идентификатор заголовка: ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("ID Пакета: ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Контрольная сумма ( мл. байт ): ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Контрольная сумма ( ст. байт ): ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Номер МБСУ: ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Номер МКП: ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Массив на подрыв[0]: ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Массив на подрыв[1]: ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), "")
)

val PD_62 = listOf(
    TStructField("Идентификатор заголовка: ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("ID Пакета: ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Контрольная сумма ( мл. байт ): ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Контрольная сумма ( ст. байт ): ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Номер МБСУ: ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Номер МКП: ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), "")
)

val PD_63 = listOf(
    TStructField("Идентификатор заголовка: ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("ID Пакета: ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Контрольная сумма ( мл. байт ): ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Контрольная сумма ( ст. байт ): ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Номер МБСУ: ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Номер МКП: ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Напряжение МСУ: ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Напряжение аккумулятора модема: ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Напряжение разблокировки: ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Процент распознанной информации: ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Резерв: ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Температура внутри блока: ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), "")
)