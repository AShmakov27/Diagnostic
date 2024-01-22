package com.diplom.mkp_mbsy_diagnostic.utils.MSSLog

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
    var msg: List<Comparable<*>>?
    when (id) {
        10 -> {
            msg = listOf(
                TODO()
            )
            return msg
        }

        100 -> {
            msg = listOf(
                TODO()
            )
            return msg
        }

        110 -> {
            msg = listOf(
                TODO()
            )
            return msg
        }

        222 -> {
            msg = listOf(
                TODO()
            )
            return msg
        }

        223 -> {
            msg = listOf(
                TODO()
            )
            return msg
        }

        300 -> {
            msg = listOf(
                TODO()
            )
            return msg
        }

        305 -> {
            msg = listOf(
                TODO()
            )
            return msg
        }

        310 -> {
            msg = listOf(
                TODO()
            )
            return msg
        }

        315 -> {
            msg = listOf(
                TODO()
            )
            return msg
        }

        320 -> {
            msg = listOf(
                TODO()
            )
            return msg
        }

        321 -> {
            msg = listOf(
                TODO()
            )
            return msg
        }

        322 -> {
            msg = listOf(
                TODO()
            )
            return msg
        }

        323 -> {
            msg = listOf(
                TODO()
            )
            return msg
        }

        324 -> {
            msg = listOf(
                TODO()
            )
            return msg
        }

        325 -> {
            msg = listOf(
                TODO()
            )
            return msg
        }

        326 -> {
            msg = listOf(
                TODO()
            )
            return msg
        }

        400 -> {
            msg = listOf(
                TODO()
            )
            return msg
        }

        410 -> {
            msg = listOf(
                TODO()
            )
            return msg
        }

        411 -> {
            msg = listOf(
                TODO()
            )
            return msg
        }

        412 -> {
            msg = listOf(
                TODO()
            )
            return msg
        }

        500 -> {
            msg = listOf(
                TODO()
            )
            return msg
        }

        510 -> {
            msg = listOf(
                TODO()
            )
            return msg
        }

        511 -> {
            msg = listOf(
                TODO()
            )
            return msg
        }

        512 -> {
            msg = listOf(
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

    TStructField( "Способ применения АСП", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

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
)

val PD_412 = listOf(
    TStructField( "Идентификатор пакета", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Контрольная сумма", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
)

val PD_500 = listOf(
    TStructField( "Идентификатор пакета", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Контрольная сумма", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
)

val PD_510 = listOf(
    TStructField( "Идентификатор пакета", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Контрольная сумма", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
)

val PD_511 = listOf(
    TStructField( "Идентификатор пакета", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Контрольная сумма", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
)

val PD_512 = listOf(
    TStructField( "Идентификатор пакета", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField( "Контрольная сумма", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
)