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

/*

struct MESS_BASE_be3
{
	UINT16	id;						// Идентификатор пакета
	UINT8	crc8;					// Контрольная сумма

};	// Всего 3 байта

struct MESS_CNT_be3 : public MESS_BASE_be3
{
	UINT16	secCnt;					// Счетчик секундных циклов
	UINT8	cycleCnt;				// Счетчик внутри секундного цикла

};	// Всего 6 байт

struct MESS_SHOT_be3 : public MESS_CNT_be3
{
	UINT8	shot;					// Порядковый номер выстрела
	UINT32	shotTime;				// Время выстрела
	UINT8	syntacticWordGen;		// Слово состояния пакета

};	// Всего 11 байт

struct MESS_MISSION_be3 : public MESS_CNT_be3
{
	UINT32	arraySign;				// Признак массива
	INT32	geographicLatitude;		// Географическая широта
	INT32	geographicLongitude;	// Географическая долгота

}; // Всего 18 байт

struct MESS_10_COMM : public MESS_SHOT_be3
{
	UINT32	time;							// Время внутри суток, сек
	UINT32	latitude;						// Широта (неуточненная), рад
	UINT32	longitude;						// Долгота (неуточненная), рад
	UINT32	altitude;						// Высота (неуточненная), м
	INT32	longitudeAxeSpeed;				// Скорость вдоль продольной оси, м/с
	INT32	latitudeAxeSpeed;				// Скорость вдоль поперечной оси, м/с
	INT32	altitudeAxeSpeed;				// Скорость вдоль вертикальной оси, м/с
};

struct MESS_223_COMM : public MESS_CNT_be3
{
	UINT8	syntacticWordGen;		// Слово состояния

	UINT16 	satellite;				// Номер спутника
	UINT16	packSyntacticWord;		// Слово состояния
	double	pseudoRange;			// Псевдодальность
	float	measurementTime;		// Время измерения
	double	lining;					// Подбой
	double	dopler;					// Доплер
	double	phaseOfTheBearing;		// Фаза несущей
	UINT8	signalNoise;			// Сигнал-шум
	UINT8	crc8;					//-V703 // Контрольная сумма

	UINT16 	satellite_2;			// Номер спутника
	UINT16	packSyntacticWord_2;	// Слово состояния
	double	pseudoRange_2;			// Псевдодальность
	float	measurementTime_2;		// Время измерения
	double	lining_2;				// Подбой
	double	dopler_2;				// Доплер
	double	phaseOfTheBearing_2;	// Фаза несущей
	UINT8	signalNoise_2;			// Сигнал-шум
	UINT8	crc8_2;					// Контрольная сумма
};

struct MESS_110_be3 : public MESS_10_COMM//MESS_SHOT_be3
{
	UINT16	heading;				// Курс
	INT16	roll;					// Крен
	INT16	pitch;					// Тангаж
	UINT32	indicatedAirspeed;		// Скорость приборная
	UINT32	groundSpeed;			// Путевая скорость(25)/Истинная воздушная (25СМ)
	INT16	verticalSpeed;			// Вертикальная скорость
	INT16	angleOfAttack;			// Угол атаки
	INT16	slipAngle;				// Угол скольжения
	INT16	driftAngle;				// Угол сноса
	INT32	pressureAltitude;		// Высота барометрическая
	UINT16	height;					// Высота геометрическая
	UINT16	targetRange;			// Дальность текущая
	UINT16	in_range;				// Дальность начала стрельбы (минимальная)
	UINT16	launchRange;			// Дальность окончания стрельбы (максимальная)
	INT16	yFiringCorrection;		// Горизонтальная составляющая суммарной угловой поправки стрельбы (Y)
	INT16	zFiringCorrection;		// Вертикальная составляющая суммарной угловой поправки стрельбы угол линии визирования объекта (Z)
	UINT32	syntacticWord;			// Слово признаков
	UINT32	syntacticWord_2;		// Слово признаков (Разовые ком реж СЗ, РК33)
	INT32	relativeBaromAltitude;	// Относительная барометрническая высота, м

};	// Всего 81 байт

/////////////////////////////////////////////////////////////////////////////////////////
struct MESS_222_be3 : public MESS_SHOT_be3
{

	UINT16 	satellite;				// Номер спутника
	UINT16	packSyntacticWord;		// Слово состояния
	double	pseudoRange;			// Псевдодальность
	float	measurementTime;		// Время измерения
	double	lining;					// Подбой
	double	dopler;					// Доплер
	double	phaseOfTheBearing;		// Фаза несущей
	UINT8	signalNoise;			// Сигнал-шум
	UINT8	crc8;					//-V703 // Контрольная сумма

	UINT16 	satellite_2;			// Номер спутника
	UINT16	packSyntacticWord_2;	// Слово состояния
	double	pseudoRange_2;			// Псевдодальность
	float	measurementTime_2;		// Время измерения
	double	lining_2;				// Подбой
	double	dopler_2;				// Доплер
	double	phaseOfTheBearing_2;	// Фаза несущей
	UINT8	signalNoise_2;			// Сигнал-шум
	UINT8	crc8_2;					// Контрольная сумма

};	// Всего 96 байт

/////////////////////////////////////////////////////////////////////////////////////////
struct MESS_300_be3 : public MESS_SHOT_be3
{
	INT32	xVelocity;				// Продольная угловая скорость в ЗСК (x)
	INT32	yVelocity;				// Вертикальная угловая скорость в ЗСК (y)
	INT32	zVelocity;				// Боковая угловая скорость в ЗСК (z)
	UINT32	selectedHeading;		// Заданный курс
	UINT16	targetAirspeed;			// Скорость заданная
	UINT32	machNumber;				// Число М
	UINT32	workMode;				// Режимы работы
	UINT32	controlWordRSBN;		// Управляющее слово РСБН
	UINT32	syntacticWordRSBN;		// Слово признаков РСБН
	UINT32	landingSigns;			// Признаки посадки
	UINT32	workingSigns;			// Признаки работы
	UINT32	indicationWord;			// Слово управл. Индикацией
	UINT32	modeRK32;				// Разовые ком реж СЗ, РК32
	UINT32	modeRK34;				// Разовые ком реж СЗ, РК34
	UINT32	modeRK;					// РК режимов

	INT32	vx_SGSK;				// Скорость вдоль продольной оси Vx в СГСК
	INT16	vy_SGSK;				// Скорость вдоль поперечной оси Vy в СГСК
	INT16	vz_SGSK;				// Скорость вдоль вертикальной оси Vz в СГСК
	INT16	y_SHO13;				// Составляющая антенной скорости ШО-13, Wy
	INT16	z_SHO13;				// Составляющая антенной скорости ШО-13, Wz
	UINT16	x_SHO13;				// Составляющая антенной скорости ШО-13, Wx
	INT16	PowerTransmitter;		// Мощность бортового передатчика (действующая)
	UINT16	H_system;				// Высота системная
	UINT32	CodeOfProduct;			// Код изделия

};	// Всего 69 байт

/////////////////////////////////////////////////////////////////////////////////////////
struct MESS_305_be3 : public MESS_SHOT_be3
{
	UINT32	syntacticWordMFCI;		// Слово признаков МФЦИ 1
	UINT32	syntacticWordBFVI;		// Слово признаков БФВИ 1
	UINT32	controlWordBFVI_RK;		// Управляющее слово БФВИ+РК
	INT32	angularVelocityY;		// Угловая скорость ЛВ Клен, Y
	UINT32	angularVelocityZ;		// Угловая скорость ЛВ Клен,  Z+ РК
	UINT16	fullDeviation;			// Полный относ
	UINT32	modeRK31;				// Разовые ком реж СЗ, РК31
	UINT32	modeRK36_1;				// Разовые ком реж СЗ, РК36, подв.1
	UINT32	modeRK36_2;				// Разовые ком реж СЗ, РК36, подв.2
	UINT32	modeRK36_3;				// Разовые ком реж СЗ, РК36, подв.3
	UINT32	modeRK36_4;				// Разовые ком реж СЗ, РК36, подв.4
	UINT32	modeRK36_5;				// Разовые ком реж СЗ, РК36, подв.5
	UINT32	modeRK36_6;				// Разовые ком реж СЗ, РК36, подв.6
	UINT32	modeRK36_7;				// Разовые ком реж СЗ, РК36, подв.7
	UINT32	modeRK36_8;				// Разовые ком реж СЗ, РК36, подв.8
	UINT32	modeRK36_9;				// Разовые ком реж СЗ, РК36, подв.9
	UINT32	modeRK36_10;			// Разовые ком реж СЗ, РК36, подв.10
	INT16	sightAngleWOPlace;		// Угол визирной метки КАИ без поправок по месту
	INT16	sightAngleWODirection;	// Угол визирной метки КАИ без поправок по направлению

};	// Всего 81 байт

/////////////////////////////////////////////////////////////////////////////////////////
struct MESS_310_be3 : public MESS_SHOT_be3
{
	INT16	rollControlSignal;		// Управляющие сигналы по крену
	INT16	pitchControlSignal;		// Управляющие сигналы по тангажу
	UINT32	strobIndicationWord;	// Слово индикации строба 2
	UINT32	messIndicationWord;		// Слово индикации сообщений
	UINT32	targetX;				// Координата цели Х
	UINT32	srk_40;					// СРК_40
	UINT16	releaseTime;			// Время оставшееся до сброса
	UINT32	modeRK33;				// Разовые ком реж СЗ, РК33
	UINT16	runawayDistance;		// Дальность увода
	INT16	sightPMAngleWOPlace;		// Угол визирования ПМ КАИ без поправок по месту
	INT16	sightPMAngleWODirection;	// Угол визирования ПМ КАИ без поправок по направлению
	UINT16	systemDistance;			// Дальность системная
	INT16	targetZ;				// Координата цели Z
};	// Всего 45 байт

/////////////////////////////////////////////////////////////////////////////////////////
struct MESS_315_be3 : public MESS_SHOT_be3
{
	INT32	lateralDivergence;		// Боковое отклонение
	UINT32	time_NT;				// Время оставшееся до НТ
	UINT16	azimuth_AR;				// Азимут до АЭР
	UINT16	distance_AR;			// Дальность до АЭР
	UINT16	distance_NT;			// Дальность до НТ
	UINT16	azimuth_RM;				// Азимут до РМ
	UINT16	distance_RM;			// Дальность до РМ
	UINT16	externalHeading;		// Курс внешний
	UINT32	syntacticWordMFCI_2;	// Слово признаков МФЦИ 2
	UINT32	syntacticWordMFCI_3;	// Слово признаков МФЦИ 3
	UINT32	syntacticWordMFCI_5;	// Слово признаков МФЦИ 5
	INT16	windSpeedComponentX;	// Составляющие скорости ветра, X
	INT16	windSpeedComponentY;	// Составляющие скорости ветра, Y
	INT16	lateralDeviation;		// Боковой относ
};	// Всего 49 байт

/////////////////////////////////////////////////////////////////////////////////////////
struct MESS_320_be3 : public MESS_CNT_be3
{
	UINT32	workMode;				// Режимы работы
	UINT32	dataWord;				// Слово данных ПЗ
	UINT32	typeNRS;				// Тип НРС, АБ
	UINT16	speed;					// Хар. Скорость
	UINT16	segment_1_Speed;		// Хар. Скорость на участке 1
	UINT16	segment_2_Speed;		// Хар. Скорость на участке 2
	UINT32	segment_1_Time;			// Время на 1-ом участке
	UINT32	segment_2_Time;			// Время на 2-ом участке
	UINT32	unloadingInterval;		// Интервал разгрузки КМГУ
	INT32	pull_upAltitude;		// Высота подрыва

};	// Всего 40 байт

/////////////////////////////////////////////////////////////////////////////////////////
struct MESS_321_be3 : public MESS_MISSION_be3
{
	INT32	targetAltitude;			// Высота цели
	UINT32	anticipationRange;		// Дальность упреждения
	UINT16	run_inHeading;			// Курс подхода
	INT32	desiredAltitude;		// Высота заданная
	UINT32	longitudinalStagger;	// Продольный вынос
	UINT32	sideStagger;			// Боковой вынос
	INT16	variation;				// Магнитное склонение
	UINT32	arrivalTime;			// Время прибытия

};	// Всего 46 байт

/////////////////////////////////////////////////////////////////////////////////////////
struct MESS_322_be3 : public MESS_MISSION_be3
{
	UINT32	targetAltitude;			// Высота цели
	INT16	runwayHeading;			// Курс ВПП
	UINT16	glidePath;				// Глиссада
	UINT32	runwayLength;			// Длина ВПП
	INT16	variation;				// Магнитное склонение
	UINT32	name_1;					// Имя1, буквы 1,2
	UINT32	name_2;					// Имя2, буквы 3,4
	UINT32	name_3;					// Имя3, буквы 5,6
	UINT32	name_4;					// Имя4, буквы 7,8
	UINT32	numCHKK;				// Номер ЧКК

};	// Всего 52 байт

/////////////////////////////////////////////////////////////////////////////////////////
struct MESS_323_be3 : public MESS_MISSION_be3
{
	INT32	altitude;				// Высота
	UINT32	numCHKK;				// Номер ЧКК

};	// Всего 26 байт

/////////////////////////////////////////////////////////////////////////////////////////
struct MESS_324_be3 : public MESS_MISSION_be3
{
	INT32	altitude;				// Высота

};	// Всего 22 байт

/////////////////////////////////////////////////////////////////////////////////////////
struct MESS_325_be3 : public MESS_MISSION_be3
{
	INT32	altitude;				// Высота
	UINT32	radius;					// Радиус

};	// Всего 26 байт

/////////////////////////////////////////////////////////////////////////////////////////
struct MESS_326_be3 : public MESS_MISSION_be3
{
	INT32	altitude;				// Высота

};	// Всего 22 байт

struct MESS_400_Mi28N : public MESS_BASE_be3
{
	UINT8	syntacticWord;			// Слово признаков
	UINT8	shot;					// Порядковый номер последнего обработанного выстрела
	UINT32	cnt;					// Порядковый номер пакета
	UINT16	PowerTransmitter;		// Мощность бортового передатчика (задаваемая)
	UINT8	typeTP1;
	UINT8	typeTP2;
	UINT8	typeTP3;
	UINT8	typeTP4;

};

struct MESS_410_Mi28N : MESS_10_COMM//MESS_SHOT_be3
{

	UINT16	heading;						// Курс истинный, град
	INT16	roll;							// Крен, град
	INT16	pitch;							// Тангаж, град
	INT16	trueAltitude;					// Высота абсолютная барометрическая, м
	INT16	longitudeAirSpeedComponent;		// Продольная составляющая воздушной скорости, км/ч
	INT16	latitudeAirSpeedComponent;		// Поперечная составляющая воздушной скорости, км/ч
	INT16	altitudeAirSpeedComponent;		// Вертикальная составляющая воздушной скорости, км/ч
	INT32	relativeSpeedNorthernInertial;	// Скорость относительная северная инерциальная, м/с
	INT32	relativeSpeedEastInertial;		// Скорость относительная восточная инерциальная, м/с
	INT16	relativeSpeedVerticalComponent;	// Вертикальная составляющая относительной скорости, м/с
	INT16	wind;							// Скорость ветра, м/с
	INT16	windDirectionSSK;				// Направление ветра в ССК, град
	INT16	aimingDirectionDeviationAngle;	// Угол отклонения ПМ по направлению, град
	INT16	aimingPlaceDeviationAngle;		// Угол отклонения ПМ по месту , град
	INT16	horizontalGunAngle;				// Угол положения НППУ в горизонтальной плоскости, град
	INT16	verticalGunAngle;				// Угол положения НППУ в вертикальной плоскости , град
	INT16	azimuthAngleOPS;				// Угол ЛВ по азимуту ОПС, град
	INT16	placeAngleOPS;					// Угол места ЛВ ОПС, град
	UINT32	rsz1;							// Режимы специальных задач 1
	UINT32	rsz2;							// Режимы специальных задач 2
	UINT32	rsz3;							// Режимы специальных задач 3

};

/////////////////////////////////////////////////////////////////////////////////////////
struct MESS_411_Mi28N : MESS_SHOT_be3
{
	UINT16  reserv4111;                     // Резерв
	UINT16	trackAngle;						// Путевой угол фактический, град
	INT32	integratedLatitude;				// Широта географическая компл., град
	INT32	integratedLongitude;			// Долгота географическая компл., град
	INT32	inertialLatitude;				// Широта географическая инерциальная , град
	INT32	inertialLongitude;				// Долгота географическая инерциальная , град
	INT32	pressureInertialAltitude;		// Высота бароинерциальная, м
	INT16	relativeBaromAltitude;			// Относительная барометрническая высота, м
	UINT16	radioAltitude;					// Высота геометрическая (радиовысота), м
	INT16	indicatedAirspeed;				// Скорость приборная, км/ч
	INT16	pressureInertialVerticalSpeed;	// Вертикальная бароинерциальная скорость, м/с
	INT16	aerodromePressure;				// Давление у земли, мм. рт. ст.
	INT16	ballisticDeviation;				// Баллистический относ, м
	INT16	rocketDeviation;				// Относ НАР, м
	UINT16	rocketFallTime;					// Время  падения НАР, сек
	INT32	targetRange;					// Дальность до цели, м
	INT16	magneticHeading;				// Магнитное склонение, град
	UINT16	launchRange;					// Максимальная дальность прим. АСП, м
	UINT16	inRange;						// Минимальная дальность прим. АСП, м
	INT8	onboardTransmitterPower;		// Мощность бортового передатчика
	UINT32	flagsSRK4;						// Признаки исправности подсистем БРЭО (СРК4)
	INT32	timeMoscow;						// Время текущее московское, сек
	INT16	naviPurposeStepUp_ZSK;			// Превышение над навигационной целью в ЗСК
	INT16	aimingDirectionDeviationAngleILS;	// Угол отклонения ПМ по направлению, град
	INT16	aimingPlaceDeviationAngleILS;		// Угол отклонения ПМ по месту , град
	INT16	attackAngleCalc;				// Расчетный угол атаки
	INT16	slipAngleCalc;					// Расчетный угол скольжения

	INT32	navigatorRangeFlat;				// Дальность от оператора плоская, км
	INT16	longitudeGroundSpeed;			// Скорость продольная земная Vx, км/ч
	INT16	latitudeGroundSpeed;			// Скорость поперечная земная Vz, км/ч
	INT16	altitudeGroundSpeed;			// Скорость вертикальная земная Vy, м/с

};

/////////////////////////////////////////////////////////////////////////////////////////
struct MESS_412_Mi28N : MESS_SHOT_be3
{
	INT16	angleSpeedComponentX;			// Составляющая угловой скорости по оси X, град/с
	INT16	angleSpeedComponentY;			// Составляющая угловой скорости по оси Y, град/с
	INT16	angleSpeedComponentZ;			// Составляющая угловой скорости по оси Z, град/с
	INT16	lineVelocityComponentX;			// Составляющая линейного ускорения по оси X, м/с2
	INT16	lineVelocityComponentY;			// Составляющая линейного ускорения по оси Y, м/с2
	INT16	lineVelocityComponentZ;			// Составляющая линейного ускорения по оси Z, м/с2
	UINT16	setHeading;						// Курс заданный, град*100
	UINT16	setAirspeed;					// Скорость приборная заданная, км/ч
	INT8	g_force;						// Перегрузка, ед
	INT16	setBarometricHeight;			// Высота барометрическая заданная, м
	UINT16	alertAltitude;					// Высота опасная, м
	UINT16	timeToGoASP;					// Расчетное время полета АСП до цели, сек
	UINT32	dataWord;						// Слово данных №2 АРК-25
	UINT16	distanceToWPT;					// Дальность до исполняемой НТ, км
	UINT32	subsystemsSigns3;				// Признаки исправности подсистем БРЭО (СРК3)
	UINT32	subsystemsSigns5;				// Признаки исправности подсистем БРЭО (СРК5)
	INT16	deviationAngleY;				// Угол отклонения МПЦ по ИЛС, град
	INT16	deviationAngleZ;				// Угол отклонения МПЦ по ИЛС, град
	INT16	lateralDisplacement;			// Отклонение от ортодромии боковое (от ЛЗП), м
	UINT32	discreteParameters;				// Дискретные пар-ры на ИЛС
	UINT16	setHeight;						// Высота геометрическая заданная, м
	INT8	maxVerticalAcceleration;		// Максимально допустимая вертикальная перегрузка, ед
	UINT8	numWPT;							// № текущей НТ
	UINT32	signWPT;						// Признаки НТ
	UINT32	subsystemsSigns2;				// СРК2
	UINT16	flightTime;						// Время полета, сек
	INT16	measuredTargetRange;			// Дальность до цели измеренная ТОЭС, м
	INT16	azimuthAngleTOES;				// Угол ЛВ по азимуту ТОЭС, град.
	INT16	placeAngleTOES;					// Угол места ЛВ  ТОЭС, град.
	UINT16	heading_SBI;					// Курс СБИ, град*100
	UINT16	targetRangeCurrentOPS;			// Дальность до цели тек. (ОПС), м
	UINT16	measuredTargetRangeOPS;			// Дальность до цели (оператор) изм. (ОПС), м
	INT16  targetVerticalDistance;			// Превышение над целью, м
	INT16  targetTakeoffElevation;			// Превышение цели относительно точки взлета, м
	UINT16  reserv4121;                     // Резерв

};

struct MESS_500_Ka52 : public MESS_BASE_be3
{
	UINT8	syntacticWord;			// Слово признаков
	UINT8	shot;					// Порядковый номер последнего обработанного выстрела
	UINT32	cnt;					// Порядковый номер пакета
	UINT16	PowerTransmitter;		// Мощность бортового передатчика (задаваемая)

};

struct MESS_510_Ka52 : MESS_10_COMM//MESS_SHOT_be3
{

	UINT16	heading;						// Курс истинный, град
	INT16	roll;							// Крен, град
	INT16	pitch;							// Тангаж, град
	INT16	trueAltitude;					// Высота абсолютная барометрическая, м
	INT16	longitudeAirSpeedComponent;		// Продольная составляющая воздушной скорости, км/ч
	INT16	latitudeAirSpeedComponent;		// Поперечная составляющая воздушной скорости, км/ч
	INT16	altitudeAirSpeedComponent;		// Вертикальная составляющая воздушной скорости, км/ч
	INT32	relativeSpeedNorthernInertial;	// Скорость относительная северная инерциальная, м/с
	INT32	relativeSpeedEastInertial;		// Скорость относительная восточная инерциальная, м/с
	INT16	relativeSpeedVerticalComponent;	// Вертикальная составляющая относительной скорости, м/с
	UINT16	wind;							// Значение скорости ветра, км/ч
	INT16	windDirectionNavi;				// Навигационное направление ветра, град
	INT16	aimingDirectionDeviationAngle;	// Угол отклонения ПМ по направлению, град
	INT16	aimingPlaceDeviationAngle;		// Угол отклонения ПМ по месту , град
	INT16	horizontalGunAngle;				// Угол положения НППУ в горизонтальной плоскости, град
	INT16	verticalGunAngle;				// Угол положения НППУ в вертикальной плоскости , град
	INT16	azimuthAngleGOES;				// Угол ЛВ по азимуту ГОЭС, град
	INT16	placeAngleGOES;					// Угол места ЛВ ГОЭС, град
	INT16	elevationTarget;				// Превышение над целью, м
	UINT32	rsz1;							// Режимы специальных задач
	UINT32	modesNPPU;						// Режимы НППУ (РК5)

};

/////////////////////////////////////////////////////////////////////////////////////////
struct MESS_511_Ka52 : MESS_SHOT_be3
{
	UINT32	timeMoscow;						// Время текущее московское
	INT16	trackAngle;						// Путевой угол фактический, град
	INT16	integratedRoll;					// Угол крена компл., град
	INT16	integratedPitch;				// Угол тангажа компл., град
	INT32	integratedLatitude;				// Широта географическая компл., град
	INT32	integratedLongitude;			// Долгота географическая компл., град
	INT32	inertialLatitude;				// Широта географическая инерциальная, град
	INT32	inertialLongitude;				// Долгота географическая инерциальная, град
	INT32	pressureInertialAltitude;		// Высота бароинерциальная, м
	INT16	relativeBaromAltitude;			// Относительная барометрническая высота, м
	UINT16	radioAltitude;					// Высота геометрическая (радиовысота), м
	INT16	indicatedAirspeed;				// Скорость приборная, км/ч
	INT16	pressureInertialVerticalSpeed;	// Вертикальная бароинерциальная скорость, м/с
	INT16	aerodromePressure;				// Давление у земли, мм. рт. ст.
	INT16	ballisticDeviation;				// Полный относ снаряда в горизонтальной плоскости, м
	INT16	rocketDeviation;				// Полный относ снаряда в боковой плоскости, м
	INT16	rocketFlightTime;				// Время полета снаряда, сек
	INT16	calcRocketFlightTime;			// Расчетное время полета АСП до цели, сек
	UINT16	targetRangeCurrent;				// Дальность до цели (оператора), тек., м
	INT16	targetRangeMeasured;			// Дальность до цели (оператора), изм., м
	INT16	magneticHeading;				// Магнитное склонение, град
	UINT32	rsz2;							// Режимы специальных задач (РК4)
	UINT16	modesTP1;						// Режимы ТП1 (РК6)
	UINT16	modesTP2;						// Режимы ТП2 (РК7)
	UINT16	modesTP3;						// Режимы ТП3 (РК8)
	UINT16	modesTP4;						// Режимы ТП4 (РК9)
	UINT16	modesTP5;						// Режимы ТП5 (РК10)
	UINT16	modesTP6;						// Режимы ТП6 (РК11)
	INT16	launchRange;					// Максимальная дальность прим. АСП, м
	INT16	inRange;						// Минимальная дальность прим. АСП, м
	UINT8	onboardTransmitterPower;		// Мощность бортового передатчика
	UINT32	flagsRK2;						// Признаки достоверности подсистем БРЭО (РК2)

};

/////////////////////////////////////////////////////////////////////////////////////////
struct MESS_512_Ka52 : MESS_SHOT_be3
{
	INT16	angleSpeedComponentX;			// Составляющая угловой скорости по оси X, град/с
	INT16	angleSpeedComponentY;			// Составляющая угловой скорости по оси Y, град/с
	INT16	angleSpeedComponentZ;			// Составляющая угловой скорости по оси Z, град/с
	INT16	lineVelocityComponentX;			// Составляющая линейного ускорения по оси X, м/с2
	INT16	lineVelocityComponentY;			// Составляющая линейного ускорения по оси Y, м/с2
	INT16	lineVelocityComponentZ;			// Составляющая линейного ускорения по оси Z, м/с2
	UINT16	setHeading;						// Курс заданный, град
	UINT16	setAirspeed;					// Скорость заданная, км/ч
	INT16	deviationAngleY;				// Угол отклонения МПЦ по ИЛС, град
	INT16	deviationAngleZ;				// Угол отклонения МПЦ по ИЛС, град
	UINT16	lateralDisplacement;			// Отклонение от ортодромии боковое (от ЛЗП), м
	UINT32	discreteParameters;				// Дискретные пар-ры на ИЛС
	UINT32	modesBCTP1;						// Режимы БЧ на ТП1 (РК12)
	UINT32	modesBCTP4;						// Режимы БЧ на ТП4 (РК13)
	UINT16	distanceToWPT;					// Дальность до исполняемой НТ, км
	UINT32	dataWord;						// Слово данных №2 АРК-25
	UINT32	subsystemsSigns1;				// Признаки исправности подсистем БРЭО (РК1)
	UINT16	setHeight;						// Высота заданная, м
	INT16	valueWPT;						// Значение ЗПУ пролета НТ, град
	UINT32	signWPT;						// Признаки НТ
	UINT32	timeWPT;						// Расчетное время прибытия в НТ
	INT16	maxDiveSpeed;					// Максимально допустимая скорость полог. Пикир., км/ч
	INT16	latitudeIndicatedSpeedComponent;// Поперечная составляющая приборной скорости, км/ч
	INT16	lateralDeviation;				// Боковое отклонение от ЛЗП, м
	INT16	azimuthActiveWPT;				// Азимут исполняемой НТ, град
	UINT32	timeSVR;						// Время СВР
	INT16	integratedHeading;				// Угол курса компл.
	INT16   reserv5122;                     // Резерв
	UINT32  reserv5123;                     // Резерв

};

/////////////////////////////////////////////////////////////////////////////////////////
*/