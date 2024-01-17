package com.diplom.mkp_mbsy_diagnostic.utils.MSSLog

fun PD_chooser_ko(id: Int): List<TStructField>? {
    when (id) {
        170 -> return PD_170
        171 -> return PD_171
        172 -> return PD_172
        173 -> return PD_173
        174 -> return PD_174
        175 -> return PD_175
        176 -> return PD_176
        177 -> return PD_177
        178 -> return PD_178
        179 -> return PD_179
        180 -> return PD_180
        181 -> return PD_181
        182 -> return PD_182
        183 -> return PD_183
        184 -> return PD_184
        185 -> return PD_185
        186 -> return PD_186
        187 -> return PD_187
        188 -> return PD_188
        190 -> return PD_190
        191 -> return PD_191
        201 -> return PD_201
        202 -> return PD_202
        301 -> return PD_301
        305 -> return  PD_305
        311 -> return  PD_311
        331 -> return  PD_331
        340 -> return  PD_340
    }
    return null
}

fun process_data_ko(id: Int, data: ByteArray): List<Comparable<*>>? {
    var msg: List<Comparable<*>>? = null
    when (id) {
        170 -> {
            msg = listOf(
                TODO()
            )
            return msg
        }
    }
    return null
}

val PD_0_ko = listOf(
    TStructField("ID Пакета: ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Контрольная сумма: ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), "")
)

val PD_170 = listOf(
    TStructField(
        "Сообщение с основными параметрами ЛА",
        Flag.T_OP_UNDEF,
        intArrayOf(0),
        listOf(""),
        ""
    ),
    TStructField("ID Пакета: ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Контрольная сумма: ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Идентификатор объекта", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Широта, град", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Долгота, град", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Крен, град", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Тангаж, град", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Путевой угол, град", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Курс магнитный, град", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Высота барометрическая, м", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Радиовысота, м", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Скорость по прибору, м/с", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Скорость вертикальная, м/с", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Время дня, с", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Продольная скорость в ЗСК, м/с", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Вертикальная скорость в ЗСК, м/с", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Боковая скорость в ЗСК, м/с", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Продольная угловая скорость, рад/с", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Вертикальная угловая скорость, рад/с", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Боковая угловая скорость в ЗСК, рад/с", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Продольное ускорение в ЗСК, м/с", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Вертикальное ускорение в ЗСК, м/с2", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Боковое ускорение в ЗСК,	м/с2", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Угол рысканья, град", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Частота вращения винта,	об/мин", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Угол скольжения, град", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Заданный курс, град", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Угол сноса, град", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Скорость заданная, м/с", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Широта точки падения, град", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Долгота точки падения, град", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Число М", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Высота геометрическая, м", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Высота спутниковая, м", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), "")
)

val PD_171 = listOf(
    TStructField("Сообщение инициализации", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("ID Пакета: ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Контрольная сумма: ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Идентификатор объекта", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Тип ЛА", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Наименование", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Слово признаков", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Пилон 1", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Пилон 2", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Пилон 3", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Пилон 4", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Пилон 5", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Пилон 6", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Пилон 7", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Пилон 8", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Пилон 9", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Пилон 10", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Пилон 11", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), "")
)

val PD_172 = listOf(
    TStructField("Подтверждение сообщения инициализации", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("ID Пакета: ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Контрольная сумма: ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Идентификатор объекта", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Тип ЛА", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Наименование", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Слово признаков", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Пилон 1", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Пилон 2", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Пилон 3", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Пилон 4", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Пилон 5", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Пилон 6", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Пилон 7", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Пилон 8", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Пилон 9", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Пилон 10", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Пилон 11", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), "")
)

val PD_173 = listOf(
    TStructField("Сообщение с данными о метеорологической обстановке", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("ID Пакета: ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Контрольная сумма: ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField(
        "Время года",
        Flag.T_OP_EQ,
        intArrayOf(0, 1, 2, 3),
        listOf("Лето", "Осень", "Зима", "Весна"),
        "Запрещенный код"
    ),

    TStructField(
        "Время суток",
        Flag.T_OP_EQ,
        intArrayOf(1, 2, 3),
        listOf("День", "Сумерки", "Ночь", "Весна"),
        "Запрещенный код"
    ),

    TStructField(
        "Погодные условия",
        Flag.T_OP_EQ,
        intArrayOf(1, 2, 3, 4, 5, 6),
        listOf("Ясно,безоблачно", "Облачно", "Пасмурно", "Дождь", "Ливень", "Снег"),
        "Запрещенный код"
    ),

    TStructField("Видимость, м", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Направление ветра, град", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Сила ветра, м/с", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField(
        "Вид облаков",
        Flag.T_OP_EQ,
        intArrayOf(1, 2, 3),
        listOf("Перистые", "Кучевые", "Грозовые"),
        "Запрещенный код"
    ),

    TStructField("Насыщенность облачности", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Атмосферное давление", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), "")
)

val PD_174 = listOf(
    TStructField("Подтверждение сообщение с данными о метеорологической обстановке", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("ID Пакета: ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Контрольная сумма: ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField(
        "Время года",
        Flag.T_OP_EQ,
        intArrayOf(0, 1, 2, 3),
        listOf("Лето", "Осень", "Зима", "Весна"),
        "Запрещенный код"
    ),

    TStructField(
        "Время суток",
        Flag.T_OP_EQ,
        intArrayOf(1, 2, 3),
        listOf("День", "Сумерки", "Ночь", "Весна"),
        "Запрещенный код"
    ),

    TStructField(
        "Погодные условия",
        Flag.T_OP_EQ,
        intArrayOf(1, 2, 3, 4, 5, 6),
        listOf("Ясно,безоблачно", "Облачно", "Пасмурно", "Дождь", "Ливень", "Снег"),
        "Запрещенный код"
    ),

    TStructField("Видимость, м", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Направление ветра, град", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Сила ветра, м/с", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField(
        "Вид облаков",
        Flag.T_OP_EQ,
        intArrayOf(1, 2, 3),
        listOf("Перистые", "Кучевые", "Грозовые"),
        "Запрещенный код"
    ),

    TStructField("Насыщенность облачности", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Атмосферное давление", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), "")
)

val PD_175 = listOf(
    TStructField("Сообщение с инструкцией о создании/изменении свойств статичного или малоподвижного объекта", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("ID Пакета: ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Контрольная сумма: ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Высылать подтверждение пакета", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Идентификатор объекта", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Тип объекта", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Широта, град", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Долгота, град", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Высота, м", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Путевой угол, град", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Крен, град", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Тангаж, град", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Слово признаков", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), "")
)

val PD_176 = listOf(
    TStructField("Подтверждение сообщения с инструкцией о создании/изменении свойств статичного или малоподвижного объекта", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("ID Пакета: ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Контрольная сумма: ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Подтверждение пакета", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Идентификатор объекта", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Тип объекта", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Широта, град", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Долгота, град", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Высота, м", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Путевой угол, град", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Крен, град", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Тангаж, град", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Слово признаков", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), "")
)

val PD_177 = listOf(
    TStructField("Сообщение с инструкцией о создании объекта \"\"неуправляемый снаряд\"\"", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("ID Пакета: ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Контрольная сумма: ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Идентификатор объекта", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Тип объекта", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Мощность взрыва ,кг", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Количество точек траектории", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Широта X точки траектории", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Долгота Y точки траектории", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Высота H точки траектории", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Текущее время полета, с", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), "")
)

val PD_178 = listOf(
    TStructField("Подтверждение сообщения с инструкцией о создании объекта \"\"неуправляемый снаряд\"\"", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("ID Пакета: ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Контрольная сумма: ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Идентификатор объекта", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Тип головки", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Мощность взрыва ,кг", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Количество точек траектории", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Широта X точки траектории", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Долгота Y точки траектории", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Высота H точки траектории", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Текущее время полета, с", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), "")
)

val PD_179 = listOf(
    TStructField("Сообщение с инструкцией о положении камеры", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("ID Пакета: ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Контрольная сумма: ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Широта,	град", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Долгота,	град", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Высота,	м", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Курс, град", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Тангаж, град", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Отрисовать", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), "")
)

val PD_180 = listOf(
    TStructField("Подтверждение сообщения с инструкцией о положении камеры", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("ID Пакета: ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Контрольная сумма: ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Широта,	град", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Долгота,	град", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Высота,	м", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Курс, град", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Тангаж, град", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Отрисовать", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), "")
)

val PD_181 = listOf(
    TStructField("Cообщения с инструкцией удаления объекта", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("ID Пакета: ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Контрольная сумма: ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Высылать подтверждение пакета", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Идентификатор объекта", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), "")
)

val PD_182 = listOf(
    TStructField("Подтверждения сообщения с инструкцией удаления объекта", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("ID Пакета: ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Контрольная сумма: ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Подтверждение пакета", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Идентификатор объекта", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), "")
)

val PD_183 = listOf(
    TStructField("Cообщения с инструкцией по управлению режимом работы", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("ID Пакета: ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Контрольная сумма: ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Высылать подтверждение пакета", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField(
        "Режим отображения внутрикабинной обстановки",
        Flag.T_OP_EQ,
        intArrayOf(0x0001, 0x0002),
        listOf("Вид из кабины командира", "Вид из кабины летчика-оператора"),
        "Запрещенный код"
    ),

    TStructField(
        "Режим отображения закабинной обстановки",
        Flag.T_OP_EQ,
        intArrayOf(1, 2, 4),
        listOf("Вид из кабины пилота", "Прицел", "Вне кабины пилота"),
        "Запрещенный код"
    )
)

val PD_184 = listOf(
    TStructField("Подтверждение сообщения с инструкцией по управлению режимом работы", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("ID Пакета: ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Контрольная сумма: ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Подтверждение пакета", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Идентификатор объекта", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), "")
)

val PD_185 = listOf(
    TStructField("Сообщение с инструкцией закрытия программных модулей СПМО НПКУ-С", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("ID Пакета: ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Контрольная сумма: ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Высылать подтверждение пакета", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), "")
)

val PD_186 = listOf(
    TStructField("Подтверждение сообщения с инструкцией закрытия программных модулей СПМО НПКУ-С", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("ID Пакета: ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Контрольная сумма: ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Подтверждение пакета", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), "")
)

val PD_187 = listOf(
    TStructField("Подтвержждение сообщения о включении СПMО НПКУ-С в работу", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("ID Пакета: ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Контрольная сумма: ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Слово признаков", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), "")
)

val PD_188 = listOf(
    TStructField("Сообщение о включении СПMО НПКУ-С в работу", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("ID Пакета: ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Контрольная сумма: ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Слово признаков", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), "")
)

val PD_190 = listOf(
    TStructField("Сообщение с инструкцией о положении камеры для режимов ИОС/ОПС", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("ID пакета", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Контрольная сумма", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Широта, град", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Долгота, град", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Высота, м", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Курс, град", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Тангаж, град", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Отрисовать", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Угол Fov, град", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), "")
)

val PD_191 = listOf(
    TStructField("Подтверждение сообщения с инструкцией о положении камеры для режимов ИОС/ОПС", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("ID пакета", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Контрольная сумма", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),


    TStructField("Широта, град", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Долгота, град", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Высота, м", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Курс, град", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Тангаж, град", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Отрисовать", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Угол Fov, град", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), "")
)

val PD_201 = listOf(
    TStructField("Сообщение с инструкцией о создании объекта \"\"управляемый снаряд\"\"", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("ID пакета", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Контрольная сумма", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Идентификатор объекта", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Тип объекта", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Мощность взрыва, кг", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Широта,	град", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Долгота,	град", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Высота,	м", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Текущее время полета,c", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Cкорость вдоль продольной оси, м/с", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Cкорость вдоль поперечной оси, м/с", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Cкорость вдоль вертикальной оси, м/с", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Курс, град", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Тангаж, град", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), "")
)

val PD_202 = listOf(
    TStructField("Сообщение с инструкцией о создании объекта \"\"управляемый снаряд\"\"", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("ID пакета", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Контрольная сумма", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Идентификатор объекта", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Тип объекта", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Мощность взрыва ,кг", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Широта,	град", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Долгота,	град", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Высота,	м", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Текущее время полета,c", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Cкорость вдоль продольной оси", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Cкорость вдоль поперечной оси", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Cкорость вдоль вертикальной оси", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Курс, град", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Тангаж, град", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), "")
)

val PD_301 = listOf(
    TStructField("Сообщение с текущими данными ( для КАИ в С-25СМ )", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("ID пакета", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Контрольная сумма", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Идентификатор объекта", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Максимальный крен, град", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Тангаж, град", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Высота барометрическая, м", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Высота геометрическая, м", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Скорость по прибору,м/с", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Скорость по прибору заданная,м/с", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Тенденция изменения приборной скорости", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Скорость вертикальная, м/с", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Курс заданный, град", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Курс текущий, град", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Время, оставшееся до сброса", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Остаток времени работы ЛД", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Размер базы воздушной цели", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Курс НОЦ, град", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Тип НОЦ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Дальность до НОЦ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Остаток боекомплекта при выборе ВПУ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Слово состояния подвесок 1", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField(" Наличие АСП на ТП2", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("  Выбор АСП на ТП2", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("  Готовность АСП на ТП2", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("  Несход АСП с ТП2", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("  На ТП2 подвешены ПТБ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField(" Наличие АСП на ТП3", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("  Выбор АСП на ТП3", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("  Готовность АСП на ТП3", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("  Несход АСП с ТП3", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("  На ТП3 подвешены ПТБ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField(" Наличие АСП на ТП4", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("  Выбор АСП на ТП4", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("  Готовность АСП на ТП4", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("  Несход АСП с ТП4", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("  На ТП4 подвешены ПТБ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField(" Наличие АСП на ТП5", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("  Выбор АСП на ТП5", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("  Готовность АСП на ТП5", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("  Несход АСП с ТП5", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("  На ТП5 подвешены ПТБ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Слово состояния подвесок 2", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField(" Наличие АСП на ТП7", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("  Выбор АСП на ТП7", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("  Готовность АСП на ТП7", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("  Несход АСП с ТП7", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("  На ТП7 подвешены ПТБ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField(" Наличие АСП на ТП8", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("  Выбор АСП на ТП8", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("  Готовность АСП на ТП8", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("  Несход АСП с ТП8", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("  На ТП8 подвешены ПТБ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField(" Наличие АСП на ТП9", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("  Выбор АСП на ТП9", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("  Готовность АСП на ТП9", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("  Несход АСП с ТП9", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("  На ТП9 подвешены ПТБ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField(" Наличие АСП на ТП10", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("  Выбор АСП на ТП10", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("  Готовность АСП на ТП10", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("  Несход АСП с ТП10", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("  На ТП10 подвешены ПТБ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Угол визирования ПМ по азимуту", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Угол визирования ПМ по месту", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Азимут шпаги", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Дальность текущая круговая", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Дальность разрешенная min", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Дальность разрешенная max", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Дальность увода", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Угол визирования ВМ по азимуту", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Угол визирования ВМ по месту", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Отсчетный индекс относа бомбы в горизонтальной плоскости", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Отсчетный индекс гориз.дальности до точки приц-я при бомбометании", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Директорное кольцо Хдк", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Директорное кольцо Yдк", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Дальность текущая наклонная", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Слово РК КАИ1", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField(" Центральное перекрестье", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField(" Символ ЛА", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField(" Шкала крена", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField(" Ограничение по  крену при работе с УР с ЛГСН", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField(" Шкала тангажа с отсчетным индексом", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField(" Счетчик барометрической  высоты", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField(" Счетчик геометрической высоты с индексом Р", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField(" Счетчик приборной скорости", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField(
        " Тенденция изменения приборной скорости",
        Flag.T_OP_EQ,
        intArrayOf(0, 1, 2, 3),
        listOf("нет", "центр", "влево", "вправо"),
        "Запрещенный код"
    ),


    TStructField(" Счетчик заданной приборной скорости", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField(" Указатель вертикальной скорости", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField(" Цифровой счетчик  вертикальной скорости", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField(" Мигающий крест", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField(" Шкала курса и отсчетный индекс текущего курса", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField(" Указатель заданного курса", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField(" Директорное кольцо", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField(
        " Тип используемого корректора",
        Flag.T_OP_EQ,
        intArrayOf(0, 1, 2, 3),
        listOf("Нет индикации", "НЕТ КОРР", "СНС", "РСБН"),
        "Запрещенный код"
    ),

    TStructField(
        " Транспаранты МАНЕВР/УВОД/ЗАПРЕТ ДВИЖЕНИЯ",
        Flag.T_OP_EQ,
        intArrayOf(0, 1, 2, 3),
        listOf("Нет индикации", "МАНЕВР", "УВОД", "ЗАПРЕТ ДВИЖЕНИЯ"),
        "Запрещенный код"
    ),

    TStructField(
        " Режим коррекции",
        Flag.T_OP_EQ,
        intArrayOf(0, 1, 2, 3, 4),
        listOf("Нет индикации", "КОРР КУР", "КОРР ОР", "ВВОД ОПЦ", "ЗАПц"),
        "Запрещенный код"
    ),

    TStructField("Слово РК КАИ2", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField(" Скоба – разрешение применения АСП (Символ ПР) и счетчик времени tост  внизу", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField(" Скоба – разрешение применения АСП (Символ ПР) и счетчик времени tост  вверху", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField(
        " Символы Л/ЛД",
        Flag.T_OP_EQ,
        intArrayOf(0, 1, 2),
        listOf("Нет индикации", "Л ", "ЛД"),
        "Запрещенный код"
    ),

    TStructField(" Шкала остатка времени работы ЛД", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField(" Размер БАЗЫ воздушной цели", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField(
        " Наименование режима работы",
        Flag.T_OP_EQ,
        intArrayOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12),
        listOf(
            "Нет индикации",
            "МАРШРУТ",
            "ПОСАДКА",
            "ВОЗВРАТ",
            "АЭР-РО",
            "ВЗЛ",
            "ПЗ",
            "ПНТ",
            "НАВВб",
            "ГВТ",
            "ВНЕШ ПОДСВ",
            "КАБР"
        ),
        "Запрещенный код"
    ),

    TStructField(" Наименование режима работы", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField(" Тип НОЦ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField(" Курс НОЦ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField(" Счетчик Дноц", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField(" Окружность НОЦ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField(
        " Тип наземной цели",
        Flag.T_OP_EQ,
        intArrayOf(0, 1, 2),
        listOf("Нет индикации", "ОЦ", "ПЦ"),
        "Запрещенный код"
    ),

    TStructField(" Отметка нажатия БК", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField(" Признак захвата ГСН УР (ЗГ)", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField(" Транспарант ВКЛ ГЛАВН", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField(
        " Транспаранты НАЧц/ЦНТц",
        Flag.T_OP_EQ,
        intArrayOf(0, 1, 2),
        listOf("Нет индикации", "НАЧц", "ЦНТц"),
        "Запрещенный код"
    ),

    TStructField("Слово РК КАИ3", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField(
        " Способ разгрузки",
        Flag.T_OP_EQ,
        intArrayOf(0, 1, 2, 3, 4),
        listOf("Нет индикации", "По 1", "По 2", "По 4", "Все"),
        "Запрещенный код"
    ),

    TStructField(
        " Выбранное к применению оружие",
        Flag.T_OP_EQ,
        intArrayOf(0, 1, 2, 4, 6),
        listOf("Нет оружия", "ВПУ", "НРС", "АБ", "УРС"),
        "Запрещенный код"
    ),

    TStructField(" Остаток ВПУ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField(" Состояние точек подвески (ТП)", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),


    TStructField("Слово РК КАИ4", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField(" Центральная точка ПМ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField(" Верхний конец перекрестия ПМ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField(" Нижний конец перекрестия ПМ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField(" Горизонтальная часть перекрестия ПМ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField(" Окружность вокруг ПМ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField(" Шпага ПМ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField(" Круговая шкала дальности вокруг ПМ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField(" Отметка ДРмакс на круговой шкале дальности ПМ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField(" Отметка ДРмин на круговой шкале дальности ПМ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField(" Счетчик угла ПМ по вертикали", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField(" Визирная марка ВМ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField(" Центральная точка ВМ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField(" Верхний конец перекрестия ВМ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField(" Нижний конец перекрестия ВМ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField(" Горизонтальная часть перекрестия ВМ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField(" Квадрат вокруг ВМ Отметка нажатия БК", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Слово РК КАИ5", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField(" Символ Шкалы линейной дальности ( ШЛД )", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField(" Индекс Дтек на ШДЛ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField(" Дальность разрешенная минимальная на ШДЛ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField(" Дальность разрешенная максимальная на ШДЛ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField(" Отсчетный индекс дальности увода на ШДЛ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField(" Отсчетный индекс относа бомбы в горизонтальной плоскости ша ШДЛ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField(" Отсчетный индекс (треугольник) горизонтальной дальности до точки  прицеливания при бомбометании на ШДЛ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField(" Счетчик текущей наклонной дальности (км) на ШДЛ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField(
        " Готовность курсовой зоны",
        Flag.T_OP_EQ,
        intArrayOf(0, 1, 2),
        listOf("Нет индикации", "Индицируется планка и буква", "Индицируется буква К без планки"),
        "Запрещенный код"
    ),

    TStructField(
        " Готовность глиссадной зоны",
        Flag.T_OP_EQ,
        intArrayOf(0, 1, 2),
        listOf("Нет индикации", "Индицируется планка и буква", "Индицируется буква Г без планки"),
        "Запрещенный код"
    ),

    TStructField(" Индицировать индикатор положения самолета относительно глиссады", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField(
        " Режим счисления",
        Flag.T_OP_EQ,
        intArrayOf(0, 1, 2, 3, 4),
        listOf("Нет индикации", "КВ", "КД", "И", "И-Д"),
        "Запрещенный код"
    ),

    TStructField(" Директорный режим", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
)

val PD_305 = listOf(
    TStructField("Сообщение с текущими данными ( для МФЦИ в С-25СМ )", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("ID пакета", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Контрольная сумма", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Идентификатор объекта", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Истинная скорость", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Путевая скорость", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Направление ветра", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Cкорость ветра", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Номер текущей НТ (ППМ)", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Время до НТ (ППМ)", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Дальность до НТ (ППМ)", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Курс для НТ (ППМ )", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Тип текущей НТ (ППМ)", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Угол визирования ВМ по азимуту", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Угол визирования ВМ по месту", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Слово состояния точек подвески1", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField(" Наличие АСП на ТП1", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField(" Выбор АСП на ТП1", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField(" Готовность АСП на ТП1", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField(" Несход АСП с ТП1", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField(" На ТП1 подвешены ПТБ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField(" Наличие АСП на ТП2", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField(" Выбор АСП на ТП2", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField(" Готовность АСП на ТП2", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField(" Несход АСП с ТП2", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField(" На ТП2 подвешены ПТБ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField(" Наличие АСП на ТП3", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField(" Выбор АСП на ТП3", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField(" Готовность АСП на ТП3", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField(" Несход АСП с ТП3", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField(" На ТП3 подвешены ПТБ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField(" Наличие АСП на ТП4", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField(" Выбор АСП на ТП4", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField(" Готовность АСП на ТП4", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField(" Несход АСП с ТП4", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField(" На ТП4 подвешены ПТБ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Слово состояния точек подвески2", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField(" Наличие АСП на ТП5", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField(" Выбор АСП на ТП5", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField(" Готовность АСП на ТП5", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField(" Несход АСП с ТП5", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField(" На ТП5 одвешены ПТБ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField(" Наличие АСП на ТП6", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField(" Выбор АСП на ТП6", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField(" Готовность АСП на ТП6", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField(" Несход АСП с ТП6", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField(" На ТП6  подвешены ПТБ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField(" Наличие АСП на ТП7", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField(" Выбор АСП на ТП7", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField(" Готовность АСП на ТП7", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField(" Несход АСП с ТП7", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField(" На ТП7  подвешены ПТБ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField(" Наличие АСП на ТП8", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField(" Выбор АСП на ТП8", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField(" Готовность АСП на ТП8", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField(" Несход АСП с ТП8", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField(" На ТП8  подвешены ПТБ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Номер справочной навигационной точки (СНТ)", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Азимут до справочной НТ (СНТ)", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Дальность до справочной НТ (СНТ)", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Номер РМ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Наименование РМ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Азимут до РМ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Дальность до РМ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Номер ЧКК", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Отсчетный индекс азимута радиомаяка РСБН", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Курс для РМ РСБН", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Фактический путевой угол", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Относ АБ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Боковое отклонение", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Индекс числового значения боковой ошибки прицеливания(для (.)падения АСП)", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Полный относ (для (.)падения АСП)", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Слово РК MFCI1", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField(" Индицировать окно скоростей и числа М", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField(" Индицировать окно высот", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField(" Индицировать Нц", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField(" Индицировать параметры ветра и угла сноса", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField(" Индицировать шкалу курса", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField(" Индицировать стрелку  Аз/ КУР", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField(" Индицировать стрелку ФПУ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField(" Индицировать окна параметров НТ, РМ, СНТ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField(" Индицировать счетчик Z", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField(" Индицировать высоту НТ (цели)", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField(" Индицировать счетчики подх и Дупр", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField(" Индицировать  Нр (радиовысота)", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField(
        " Индицировать средства коррекции",
        Flag.T_OP_EQ,
        intArrayOf(0, 1, 2, 3, 4),
        listOf("НЕТ КОР", "ГЛ", "GPS", "ГЛ+GPS", "РСБН"),
        "Запрещенный код"
    ),

    TStructField(
        " Индицировать ВМ",
        Flag.T_OP_EQ,
        intArrayOf(0, 1, 2),
        listOf("ВМ не индицировать", "индицировать ВМ с точкой", "индицировать ВМ с перекрестием"),
        "Запрещенный код"
    ),

    TStructField(" Индицировать СПО", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField(
        " Индицировать отказавшую систему",
        Flag.T_OP_EQ,
        intArrayOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22),
        listOf(
            "Нет отказов",
            "ИКВ",
            "СВС",
            "РСБН",
            "РВ",
            "ДИСС",
            "Метка",
            "СНС",
            "Клен",
            "ОЛП",
            "СВИ",
            "КАИ",
            "БСКИ",
            "АГР",
            "БФВИ",
            "СУО",
            "СВР",
            "73МС (3)",
            "73МС (4)",
            "73МС (9)",
            "73МС (8)",
            "РН",
            "Л-150"
        ),
        "Запрещенный код"
    ),

    TStructField(" Индицировать тип РМ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField(" Индицировать способ выбора РМ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField(" Индицировать РМ с символом  стрелка-молния", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField(" Индицировать относ и значение относа", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField(" Индицировать подвески", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField(" Индицировать шкалу бокового уклонения АСП", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField(" Индицировать шкалу КРУГ/шкалу СЕКТОР", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField(" Индицировать точку падения АСП, Ао и Тост", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Слово РК MFCI2", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField(" Индицировать планку курса", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField(" Индицировать планку глиссады", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField(" Индицировать индикатор положения самолета относительно глиссады", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField(" Индицировать КУР/Азимут", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField(" Индицировать выбор СНС/индицировать ТИП", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField(" Индицировать Тпр/Тост для СНТ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField(" Индицировать Тпр/Тост для исполняемой НТ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField(" Индицировать Тпр/Тост для СНТ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField(" Индицировать ист/ магн/индицировать КОНТРОЛЬ СПО", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField(" Матрица   масштаба (км / радиус шкалы курса)", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField(" Индицировать букву К", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField(" Индицировать букву Г", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Слово РК MFCI3", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField(
        " Режим работы",
        Flag.T_OP_EQ,
        intArrayOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22),
        listOf(
            "нет индикации",
            "МАРШРУТ",
            "ПОСАДКА",
            "ВОЗВРАТ",
            "АЭР-РО",
            "ВЗЛ",
            "ПЗ",
            "ПНТ",
            "НАВВб",
            "ГВТ",
            "ВНЕШ ПОДСВ",
            "КАБР"
        ),
        "Запрещенный код"
    ),

    TStructField(
        " Режим коррекции",
        Flag.T_OP_EQ,
        intArrayOf(0, 1, 2, 3, 4),
        listOf("Нет индикации", "КОРР КУР", "КОРР ОР", "ВВОД ОПЦ", "ЗАПц"),
        "Запрещенный код"
    ),

    TStructField(
        " Способ разгрузки",
        Flag.T_OP_EQ,
        intArrayOf(0, 1, 2, 3, 4),
        listOf("нет индикации", "По 1", "По 2", "По 4", "Все"),
        "Запрещенный код"
    ),

    TStructField(
        " Выбранное к применению оружие",
        Flag.T_OP_EQ,
        intArrayOf(0, 1, 2, 3),
        listOf("нет оружия", "ВПУ", "НРС", "УРС"),
        "Запрещенный код"
    ),

    TStructField(" Способ выбора РМ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField(" Признак нажатия БК", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField(" Радиус шкалы курса", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField(" Внутренний радиус шкалы курса", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Название текущей навигационной точки (NP)", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Название справочной навигационной точки (NP)", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), "")
)

val PD_311 = listOf(
    TStructField("Сообщение с инструкцией об отображении ППМ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("ID пакета", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Контрольная сумма", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Количество НТ", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Номер точки", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField(
        "Тип точки",
        Flag.T_OP_EQ,
        intArrayOf(0x11, 0x12, 0x13, 0x14, 0x15, 0x16, 0x18, 0x19, 0x21, 0x22, 0x23, 0x24, 0x25, 0x31, 0x32, 0x51, 0x52, 0x53, 0x54, 0x55, 0x40, 0x60),
        listOf(
            "ППМ",
            "ППМ Цель",
            "ППМ ВТ",
            "ППМ ВВО",
            "ППМ Виз.Кор.",
            "ППМ Вн.Подс.",
            "ППМ СНС",
            "ППМ Цель лев.",
            "ППМ Цель пр.",
            "АЭР Взлета",
            "АЭР Посадки",
            "АЭР взлета-пос.",
            "АЭР Запасной",
            "АЭР Виз. Кор.",
            "РМ ненапр.",
            "РМ направл",
            "Зона ПВО",
            "Зона фронт",
            "Зона полеты",
            "Зона Круг",
            "Зона Опасн.",
            "ВВО",
            "ОПЦ"
        ),
        "Запрещенный код"
    ),

    TStructField("Азимут точки", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Дальность точки", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Курс ВПП точки", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Слово признаков", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Резерв_1", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Резерв_2", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Резерв_3", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Резерв_4", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Резерв_5", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), "")
)

val PD_331 = listOf(
    TStructField("Сообщение c параметрами ВГ АСП-17ВП", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("ID пакета", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Контрольная сумма", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Идентификатор объекта", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Состояние ВГ АСП-17ВП", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("   Разрешение отображения подвижной марки", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("   Разрешение отображения шкалы Дтек", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("   Разрешение отображения шкалы Дэфф", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("   Разрешение отображения метки крена", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField(
        "   Тип выбранного оружия",
        Flag.T_OP_EQ,
        intArrayOf(0, 1, 2, 4, 5, 6, 7, 8),
        listOf(
            "не выбрано",
            "КМГУ",
            "ГУВ",
            "УПК",
            "УР",
            "НПУ-30",
            "НРС",
            "БОМБЫ"
        ),
        "Запрещенный код"
    ),

    TStructField("   Применение АСП", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),


    TStructField("Горизонтальная составляющая суммарной угловой поправки стрельбы,град", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Вертикальная составляющая суммарной угловой поправки стрельбы угол линии визирования объекта,град,град", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Текущая дальность,м", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Разрешенная дальность,м", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Запрещенная дальность,м", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), "")
)

val PD_340 = listOf(
    TStructField("Сообщение с параметрами навигационных приборов МИ-28H", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("ID пакета", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Контрольная сумма", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Идентификатор объекта", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Вертикальная перегрузка, м/сек2,м", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Индекс заданной высоты", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Высота аэродрома, мм рт. стодба", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Опасная высота, м", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Время полета, с", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Секундомер, с", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Напряжение вольтметра В-1, в", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Вертикальная бароинерциальная скорость, м/c", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Директорная планка по курсу", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Директорная планка по глиссаде", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Курсовой  угол РНС, град", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Стрелка указатедя отклонения от равносигнальной зоны курса", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Стрелка указатедя отклонения от равносигнальной зоны глиссады", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Дальность до НТ, км", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Частота вращения НВ, %", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),

    TStructField("Слово состояния положения блинкеров", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), ""),
    TStructField("Слово состояния дискретных признаков", Flag.T_OP_UNDEF, intArrayOf(0), listOf(""), "")
)
/*
val PD_341 = listOf(

)

val PD_342 = listOf(

)

val PD_343 = listOf(

)

val PD_344 = listOf(

)

val PD_345 = listOf(

)

val PD_346 = listOf(

)

val PD_347 = listOf(

)

val PD_348 = listOf(

)

val PD_349 = listOf(

)

val PD_350 = listOf(

)

val PD_351 = listOf(

)

val PD_352 = listOf(

)

val PD_353 = listOf(

)

val PD_354 = listOf(

)

val PD_355 = listOf(

)

val PD_356 = listOf(

)

val PD_357 = listOf(

)
*/