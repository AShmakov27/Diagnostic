package com.diplom.mkp_mbsy_diagnostic.utils.MSSLog

import java.nio.ByteBuffer
import java.nio.ByteOrder

fun PD_chooser_ikrl(id: Int): List<TStructField>? {
    when (id) {
        10 -> return PD_10
        11 -> return PD_11
        70 -> return PD_70
        71 -> return PD_71
        80 -> return PD_80
        81 -> return PD_81
        90 -> return PD_90
        91 -> return PD_91
        100 -> return PD_100
        101 -> return PD_101
    }
    return null
}

fun process_data_ikrl(id: Int, data: ByteArray):List<Comparable<*>>? {
    val msg: List<Comparable<*>>?
    when (id) {
        10 -> {
            msg = listOf(
                data[0].toUByte(),
                data[1].toUByte(),
                ((data[5].toUByte().toInt() shl 8) or data[4].toUByte().toInt()).toUShort(),
                ((data[7].toUByte().toInt() shl 8) or data[6].toUByte().toInt()).toUShort(),
                ByteBuffer.wrap(data, 11, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt(),
                ByteBuffer.wrap(data, 15, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt(),
                data[19].toUByte(),
                data[20].toUByte(),
                ((data[22].toUByte().toInt() shl 8) or data[21].toUByte().toInt()).toUShort(),
                data[24].toUByte(),
                data[25].toUByte(),
                ((data[27].toUByte().toInt() shl 8) or data[26].toUByte().toInt()).toUShort(),
                ((data[29].toUByte().toInt() shl 8) or data[28].toUByte().toInt()).toUShort(),
                ((data[31].toUByte().toInt() shl 8) or data[30].toUByte().toInt()).toUShort(),
                ((data[33].toUByte().toInt() shl 8) or data[32].toUByte().toInt()).toUShort(),
                data[34].toUByte(),
                data[35].toUByte(),
                ((data[37].toUByte().toInt() shl 8) or data[36].toUByte().toInt()).toUShort(),
                ((data[39].toUByte().toInt() shl 8) or data[38].toUByte().toInt()).toUShort(),
                ((data[41].toUByte().toInt() shl 8) or data[40].toUByte().toInt()).toUShort(),
                ((data[43].toUByte().toInt() shl 8) or data[42].toUByte().toInt()).toUShort(),
                ((data[45].toUByte().toInt() shl 8) or data[44].toUByte().toInt()).toUShort(),
                ((data[47].toUByte().toInt() shl 8) or data[46].toUByte().toInt()).toUShort(),
                ((data[49].toUByte().toInt() shl 8) or data[48].toUByte().toInt()).toUShort(),
                ((data[52].toUByte().toInt() shl 8) or data[50].toUByte().toInt()).toUShort(),
                ByteBuffer.wrap(data, 53, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt(),
                ((data[57].toUByte().toInt() shl 8) or data[56].toUByte().toInt()).toUShort(),
                ((data[59].toUByte().toInt() shl 8) or data[58].toUByte().toInt()).toUShort(),
                data[60].toUByte(),
                data[61].toUByte(),
                data[62].toUByte(),
                data[63].toUByte()
            )
            return msg
        }

        70 -> {
            msg = listOf(
                data[0].toUByte(),
                data[1].toUByte(),
                ((data[5].toUByte().toInt() shl 8) or data[4].toUByte().toInt()).toUShort(),
                ((data[7].toUByte().toInt() shl 8) or data[6].toUByte().toInt()).toUShort(),
                ByteBuffer.wrap(data, 11, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt(),
                ByteBuffer.wrap(data, 15, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt(),
                ByteBuffer.wrap(data, 19, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt(),
                ByteBuffer.wrap(data, 23, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt(),
                ByteBuffer.wrap(data, 27, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt()
            )
            return msg
        }

        80 -> {
            msg = listOf(
                data[0].toUByte(),
                data[1].toUByte(),
                data[4].toUByte(),
                data[5].toUByte(),
                data[6].toUByte(),
                data[7].toUByte(),
                data[8].toUByte(),
                data[9].toUByte(),
                data[10].toUByte(),
                data[11].toUByte(),
                ((data[13].toUByte().toInt() shl 8) or data[12].toUByte().toInt()).toUShort(),
                ((data[15].toUByte().toInt() shl 8) or data[14].toUByte().toInt()).toUShort(),
                data[16].toUByte(),
                data[17].toUByte(),
                data[18].toUByte(),
                data[19].toUByte(),
                ByteBuffer.wrap(data, 20, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt(),
                ((data[25].toUByte().toInt() shl 8) or data[24].toUByte().toInt()).toUShort(),
                ((data[27].toUByte().toInt() shl 8) or data[26].toUByte().toInt()).toUShort(),
                ((data[29].toUByte().toInt() shl 8) or data[28].toUByte().toInt()).toUShort(),
                ((data[31].toUByte().toInt() shl 8) or data[30].toUByte().toInt()).toUShort()
            )
            return msg
        }

        90 -> {
            msg = listOf(
                data[0].toUByte(),
                data[1].toUByte(),
                ((data[5].toUByte().toInt() shl 8) or data[4].toUByte().toInt()).toUShort(),
                data[6].toUByte(),
                data[7].toUByte(),
                ByteBuffer.wrap(data, 8, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt(),
                data[12].toUByte(),
                data[13].toUByte(),
                ((data[15].toUByte().toInt() shl 8) or data[14].toUByte().toInt()).toUShort(),
                ((data[17].toUByte().toInt() shl 8) or data[16].toUByte().toInt()).toUShort(),
                ((data[19].toUByte().toInt() shl 8) or data[18].toUByte().toInt()).toUShort(),
                data[20].toUByte(),
                data[21].toUByte(),
                ((data[23].toUByte().toInt() shl 8) or data[22].toUByte().toInt()).toUShort(),
                ByteBuffer.wrap(data, 24, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt(),
                ((data[29].toUByte().toInt() shl 8) or data[28].toUByte().toInt()).toUShort(),
                ((data[31].toUByte().toInt() shl 8) or data[30].toUByte().toInt()).toUShort(),
                ByteBuffer.wrap(data, 32, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt(),
                ByteBuffer.wrap(data, 36, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt(),
                ByteBuffer.wrap(data, 40, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt(),
                ByteBuffer.wrap(data, 44, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt(),
                ByteBuffer.wrap(data, 48, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt(),
                ByteBuffer.wrap(data, 52, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt(),
                ByteBuffer.wrap(data, 56, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt(),
                ByteBuffer.wrap(data, 60, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt(),
                ByteBuffer.wrap(data, 64, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt(),
                ByteBuffer.wrap(data, 68, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt(),
                ByteBuffer.wrap(data, 72, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt(),
                ByteBuffer.wrap(data, 76, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt(),
                ByteBuffer.wrap(data, 80, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt(),
                ByteBuffer.wrap(data, 84, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt(),
                ByteBuffer.wrap(data, 88, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt(),
                ByteBuffer.wrap(data, 92, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt()
            )
            return msg
        }

        100 -> {
            msg = listOf(
                data[0].toUByte(),
                data[1].toUByte(),
                ((data[5].toUByte().toInt() shl 8) or data[4].toUByte().toInt()).toUShort(),
                ((data[7].toUByte().toInt() shl 8) or data[6].toUByte().toInt()).toUShort(),
                ((data[9].toUByte().toInt() shl 8) or data[8].toUByte().toInt()).toUShort(),
                ((data[11].toUByte().toInt() shl 8) or data[10].toUByte().toInt()).toUShort(),
                ByteBuffer.wrap(data, 12, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt(),
                ByteBuffer.wrap(data, 16, 4).order(ByteOrder.LITTLE_ENDIAN).int.toUInt(),
                ((data[21].toUByte().toInt() shl 8) or data[20].toUByte().toInt()).toUShort(),
                ((data[23].toUByte().toInt() shl 8) or data[22].toUByte().toInt()).toUShort()
            )
            return msg
        }

        11, 71, 81, 91, 101 -> {
            msg = listOf(
                data[0].toUByte(),
                data[1].toUByte()
            )
            return msg
        }
    }
    return null
}

val PD_0_ikrl = listOf(
    TStructField("Тип протокола + тип сервиса ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Тип данных ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Резерв 1 ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Резерв 2 ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), "")
)

val PD_10 = listOf(
    TStructField("Тип протокола + тип сервиса ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Тип данных ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Количество тестовых блоков", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Количество отказов от декодирования", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Количество обнаруженных ошибок", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Количество ошибок в тестовых блоках", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Уровень свёртки системы расширения спектра", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Средний отклик системы блоковой синхронизации", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Средний отклик системы блоковой синхронизации", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("SNR", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Детектор мощности", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Код несущей частоты (доп. код)", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Код тактовой частоты (доп. код)", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Модуль сигнала", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Уровень АРУ	канал 1", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Уровень АРУ	канал 2", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Количество данных интерфейса 0 (тестовые блоки)", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Количество данных интерфейса 1", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Количество данных интерфейса 2", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Количество данных интерфейса 3", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Количество данных интерфейса 4", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Количество данных интерфейса 5 (видео)", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Количество данных интерфейса 6", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Количество данных интерфейса 7", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Дальномер", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Угол H", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Угол V", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Состояние УРЧ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Темп УРЧ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Питание канал 1", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Питание канал 2", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), "")
)

val PD_11 = listOf(
    TStructField("Тип протокола + тип сервиса ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Тип данных ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), "")
)

val PD_70 = listOf(
    TStructField("Тип протокола + тип сервиса ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Тип данных ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Код генератора опорной частоты", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Дата записи параметров 1", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Дата записи параметров 2", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Версия ПО ПРОЦЕССОР", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Версия ПО ПЛИС", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("ID SOPC", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), "")
)

val PD_71 = listOf(
    TStructField("Тип протокола + тип сервиса ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Тип данных ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), "")
)

val PD_80 = listOf(
    TStructField("Тип протокола + тип сервиса ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Тип данных ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Режим1", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Частотная литера + Мощность", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Состояние 1", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Состояние 2", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Мощность 1", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Мощность 2", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Температура УРЧ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Температура ВИП", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Параметр 1", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Параметр 2", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Параметр 3", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Режим модема", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Резерв 1", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Резерв 2", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Параметр 4", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Фаза передатчика", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Фаза приемника", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Детектор мощности", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("АРУ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), "")
)

val PD_81 = listOf(
    TStructField("Тип протокола + тип сервиса ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Тип данных ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), "")
)

val PD_90 = listOf(
    TStructField("Тип протокола + тип сервиса ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Тип данных ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Длина строки TDMA в байтах (145)", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Номер строки TDMA (с нуля)", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Условный номер борта", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("IP address запрашиваемого абонента", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Флаг активности", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Длительность защитного интервала (код. блоков)", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Длительность сеанса TDMA (код. блоков)", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Длительность сеанса телеметрии от наземного терминала к бортовому (код. блоков)", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Длительность сеанса телеметрии от бортового терминала к наземному (код. блоков)", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Длительность периода видеоданных", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Кол-во сеансов TDMA для передачи видео", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Длительность сеанса передачи Видео (код. блоков)", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("IP address получателя видеоданных", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("UDP порт отправителя", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("UDP порт получателя", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Дополнительные данные 1. Link, RSSI, Tx power", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Дополнительные данные 2. TimeShiftLocal", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Дополнительные данные 3. Дальность земля", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Дополнительные данные 4. Дальность борт", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Дополнительные данные 5. Угол Н земля", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Дополнительные данные 6. Угол V земля", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Дополнительные данные 7. Угол Н борт", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Дополнительные данные 8. Угол V борт", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Дополнительные данные 9.", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Дополнительные данные 10.", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Дополнительные данные 11.", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Дополнительные данные 12.", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Дополнительные данные 13.", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Дополнительные данные 14.", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Дополнительные данные 15. Кол-во запросов", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Дополнительные данные 16. Кол-во ответов", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), "")
)

val PD_91 = listOf(
    TStructField("Тип протокола + тип сервиса ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Тип данных ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), "")
)

val PD_100 = listOf(
    TStructField("Тип протокола + тип сервиса ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Тип данных ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Флаг", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Постоянный MAC", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("MAC ( заводской номер )", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("MAC, доступный пользователю", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("IP-адрес модема", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("IP-адрес получателя видеоданных", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("UDP порт отправителя видеоданных", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("UDP порт получателя видеоданных", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), "")
)

val PD_101 = listOf(
    TStructField("Тип протокола + тип сервиса ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Тип данных ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), "")
)