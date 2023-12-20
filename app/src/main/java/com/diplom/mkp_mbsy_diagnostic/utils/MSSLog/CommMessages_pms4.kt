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
    T_OP_EQ(1),
    T_OP_ELSE(2)
}

class TStructField (
    var m_sName: String,
    var m_nEnumOp: Flag,
    var m_nEnumValue: Long,
    var m_sEnumValue: String,
    var m_bIncludeInDescription: Int
)

fun PD_chooser(id: Int): List<TStructField>? {
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

val PD_0 = listOf(
    TStructField("Идентификатор заголовка: ", Flag.T_OP_UNDEF, 0, "", 0),
    TStructField("ID Пакета: ", Flag.T_OP_UNDEF, 0, "", 0),
    TStructField("Контрольная сумма ( мл. байт ): ", Flag.T_OP_UNDEF, 0, "", 0),
    TStructField("Контрольная сумма ( ст. байт ): ", Flag.T_OP_UNDEF, 0, "", 0)
)

val PD_16 = listOf(
    TStructField("Идентификатор заголовка: ", Flag.T_OP_UNDEF, 0, "", 0),
    TStructField("ID Пакета: ", Flag.T_OP_UNDEF, 0, "", 0),
    TStructField("Контрольная сумма ( мл. байт ): ", Flag.T_OP_UNDEF, 0, "", 0),
    TStructField("Контрольная сумма ( ст. байт ): ", Flag.T_OP_UNDEF, 0, "", 0),
    TStructField("Номер МБСУ: ", Flag.T_OP_UNDEF, 0, "", 0),
    TStructField("Номер МКП: ", Flag.T_OP_UNDEF, 0, "", 0)
)

val PD_17 = listOf(
    TStructField("Идентификатор заголовка: ", Flag.T_OP_UNDEF, 0, "", 0),
    TStructField("ID Пакета: ", Flag.T_OP_UNDEF, 0, "", 0),
    TStructField("Контрольная сумма ( мл. байт ): ", Flag.T_OP_UNDEF, 0, "", 0),
    TStructField("Контрольная сумма ( ст. байт ): ", Flag.T_OP_UNDEF, 0, "", 0),
    TStructField("Номер МБСУ: ", Flag.T_OP_UNDEF, 0, "", 0),
    TStructField("Номер МКП: ", Flag.T_OP_UNDEF, 0, "", 0),
    TStructField("Версия: ", Flag.T_OP_UNDEF, 0, "", 0),
    TStructField("Подверсия: ", Flag.T_OP_UNDEF, 0, "", 0),
    TStructField("Месяц: ", Flag.T_OP_UNDEF, 0, "", 0),
    TStructField("Год: ", Flag.T_OP_UNDEF, 0, "", 0)
)

val PD_20 = listOf(
    TStructField("Идентификатор заголовка: ", Flag.T_OP_UNDEF, 0, "", 0),
    TStructField("ID Пакета: ", Flag.T_OP_UNDEF, 0, "", 0),
    TStructField("Контрольная сумма ( мл. байт ): ", Flag.T_OP_UNDEF, 0, "", 0),
    TStructField("Контрольная сумма ( ст. байт ): ", Flag.T_OP_UNDEF, 0, "", 0),
    TStructField("Номер МБСУ: ", Flag.T_OP_UNDEF, 0, "", 0),
    TStructField("Номер МКП: ", Flag.T_OP_UNDEF, 0, "", 0)
)

val PD_21 = listOf(
    TStructField("Идентификатор заголовка: ", Flag.T_OP_UNDEF, 0, "", 0),
    TStructField("ID Пакета: ", Flag.T_OP_UNDEF, 0, "", 0),
    TStructField("Контрольная сумма ( мл. байт ): ", Flag.T_OP_UNDEF, 0, "", 0),
    TStructField("Контрольная сумма ( ст. байт ): ", Flag.T_OP_UNDEF, 0, "", 0),
    TStructField("Номер МБСУ: ", Flag.T_OP_UNDEF, 0, "", 0),
    TStructField("Номер МКП: ", Flag.T_OP_UNDEF, 0, "", 0),
    TStructField("Колличество ошибок: ", Flag.T_OP_UNDEF, 0, "", 0),
    TStructField("Время: ", Flag.T_OP_UNDEF, 0, "", 0)
)

val PD_38 = listOf(
    TStructField("Идентификатор заголовка: ", Flag.T_OP_UNDEF, 0, "", 0),
    TStructField("ID Пакета: ", Flag.T_OP_UNDEF, 0, "", 0),
    TStructField("Контрольная сумма ( мл. байт ): ", Flag.T_OP_UNDEF, 0, "", 0),
    TStructField("Контрольная сумма ( ст. байт ): ", Flag.T_OP_UNDEF, 0, "", 0),
    TStructField("Номер МБСУ: ", Flag.T_OP_UNDEF, 0, "", 0),
    TStructField("Номер МКП: ", Flag.T_OP_UNDEF, 0, "", 0)
)

val PD_39 = listOf(
    TStructField("Идентификатор заголовка: ", Flag.T_OP_UNDEF, 0, "", 0),
    TStructField("ID Пакета: ", Flag.T_OP_UNDEF, 0, "", 0),
    TStructField("Контрольная сумма ( мл. байт ): ", Flag.T_OP_UNDEF, 0, "", 0),
    TStructField("Контрольная сумма ( ст. байт ): ", Flag.T_OP_UNDEF, 0, "", 0),
    TStructField("Номер МБСУ: ", Flag.T_OP_UNDEF, 0, "", 0),
    TStructField("Номер МКП: ", Flag.T_OP_UNDEF, 0, "", 0),
    TStructField("Массив зарядов[0]: ", Flag.T_OP_UNDEF, 0, "", 0),
    TStructField("Массив зарядов[1]: ", Flag.T_OP_UNDEF, 0, "", 0)
)

val PD_54 = listOf(
    TStructField("Идентификатор заголовка: ", Flag.T_OP_UNDEF, 0, "", 0),
    TStructField("ID Пакета: ", Flag.T_OP_UNDEF, 0, "", 0),
    TStructField("Контрольная сумма ( мл. байт ): ", Flag.T_OP_UNDEF, 0, "", 0),
    TStructField("Контрольная сумма ( ст. байт ): ", Flag.T_OP_UNDEF, 0, "", 0),
    TStructField("Номер МБСУ: ", Flag.T_OP_UNDEF, 0, "", 0),
    TStructField("Номер МКП: ", Flag.T_OP_UNDEF, 0, "", 0),
    TStructField("Массив на подрыв[0]: ", Flag.T_OP_UNDEF, 0, "", 0),
    TStructField("Массив на подрыв[1]: ", Flag.T_OP_UNDEF, 0, "", 0)
)

val PD_62 = listOf(
    TStructField("Идентификатор заголовка: ", Flag.T_OP_UNDEF, 0, "", 0),
    TStructField("ID Пакета: ", Flag.T_OP_UNDEF, 0, "", 0),
    TStructField("Контрольная сумма ( мл. байт ): ", Flag.T_OP_UNDEF, 0, "", 0),
    TStructField("Контрольная сумма ( ст. байт ): ", Flag.T_OP_UNDEF, 0, "", 0),
    TStructField("Номер МБСУ: ", Flag.T_OP_UNDEF, 0, "", 0),
    TStructField("Номер МКП: ", Flag.T_OP_UNDEF, 0, "", 0)
)

val PD_63 = listOf(
    TStructField("Идентификатор заголовка: ", Flag.T_OP_UNDEF, 0, "", 0),
    TStructField("ID Пакета: ", Flag.T_OP_UNDEF, 0, "", 0),
    TStructField("Контрольная сумма ( мл. байт ): ", Flag.T_OP_UNDEF, 0, "", 0),
    TStructField("Контрольная сумма ( ст. байт ): ", Flag.T_OP_UNDEF, 0, "", 0),
    TStructField("Номер МБСУ: ", Flag.T_OP_UNDEF, 0, "", 0),
    TStructField("Номер МКП: ", Flag.T_OP_UNDEF, 0, "", 0),
    TStructField("Напряжение МСУ: ", Flag.T_OP_UNDEF, 0, "", 0),
    TStructField("Напряжение аккумулятора модема: ", Flag.T_OP_UNDEF, 0, "", 0),
    TStructField("Напряжение разблокировки: ", Flag.T_OP_UNDEF, 0, "", 0),
    TStructField("Процент распознанной информации: ", Flag.T_OP_UNDEF, 0, "", 0),
    TStructField("Резерв: ", Flag.T_OP_UNDEF, 0, "", 0),
    TStructField("Температура внутри блока: ", Flag.T_OP_UNDEF, 0, "", 0)
)

/*
//------  Описание структуры пакетов -------------------------------------------

// фиктивный пакет - заглушка --
TStructField PD_0[] =
{
    TStructField( "Идентификатор заголовка",            T_UINT8, offsetof( MESS_BASE_pms, id_head ), 0, 0.0, 0, T_OP_UNDEF, 0, NULL, FALSE ),
    TStructField( "ID Пакета",                          T_UINT8,  offsetof( MESS_BASE_pms, id ) ),
    TStructField( "Контрольная сумма ( мл. байт )",     T_UINT8,  offsetof( MESS_BASE_pms, LoSumm ), 0, 0.0, 0, T_OP_UNDEF, 0, NULL, FALSE ),
    TStructField( "Контрольная сумма ( ст. байт )",     T_UINT8,  offsetof( MESS_BASE_pms, HiSumm ), 0, 0.0, 0, T_OP_UNDEF, 0, NULL, FALSE ),
};
int  nPD_0 = sizeof( PD_0 )/sizeof( PD_0[ 0 ] );

TStructField PD_16[] =
{
    TStructField( "Идентификатор заголовка",            T_UINT8, offsetof( MESS_16_pms, id_head ), 0, 0.0, 0, T_OP_UNDEF, 0, NULL, FALSE ),
    TStructField( "ID Пакета",                          T_UINT8,  offsetof( MESS_16_pms, id ) ),
    TStructField( "Контрольная сумма ( мл. байт )",     T_UINT8,  offsetof( MESS_16_pms, LoSumm ), 0, 0.0, 0, T_OP_UNDEF, 0, NULL, FALSE ),
    TStructField( "Контрольная сумма ( ст. байт )",     T_UINT8,  offsetof( MESS_16_pms, HiSumm ), 0, 0.0, 0, T_OP_UNDEF, 0, NULL, FALSE ),

    TStructField( "Номер МБСУ",                         T_UINT16,  offsetof( MESS_16_pms, MB_Id ) ),
	TStructField( "Номер МКП",                          T_UINT16,  offsetof( MESS_16_pms, MK_Id ) ),
};
int  nPD_16 = sizeof( PD_16 )/sizeof( PD_16[ 0 ] );

TStructField PD_17[] =
{
    TStructField( "Идентификатор заголовка",            T_UINT8, offsetof( MESS_17_pms, id_head ), 0, 0.0, 0, T_OP_UNDEF, 0, NULL, FALSE ),
    TStructField( "ID Пакета",                          T_UINT8,  offsetof( MESS_17_pms, id ) ),
    TStructField( "Контрольная сумма ( мл. байт )",     T_UINT8,  offsetof( MESS_17_pms, LoSumm ), 0, 0.0, 0, T_OP_UNDEF, 0, NULL, FALSE ),
    TStructField( "Контрольная сумма ( ст. байт )",     T_UINT8,  offsetof( MESS_17_pms, HiSumm ), 0, 0.0, 0, T_OP_UNDEF, 0, NULL, FALSE ),

	TStructField( "Номер МБСУ",                         T_UINT16,  offsetof( MESS_63_pms, MB_Id ) ),
	TStructField( "Номер МКП",                          T_UINT16,  offsetof( MESS_63_pms, MK_Id ) ),

    TStructField( "Версия",                            T_UINT8,  offsetof( MESS_17_pms, Version ) ),
    TStructField( "Подверсия",                         T_UINT8,  offsetof( MESS_17_pms, PodVersion ) ),
    TStructField( "Месяц",                              T_UINT8,  offsetof( MESS_17_pms, Month ) ),
    TStructField( "Год",                               T_UINT8,  offsetof( MESS_17_pms, Yhar ) ),

};
int  nPD_17 = sizeof( PD_17 )/sizeof( PD_17[ 0 ] );


TStructField PD_20[] =
{
    TStructField( "Идентификатор заголовка",            T_UINT8, offsetof( MESS_20_pms, id_head ), 0, 0.0, 0, T_OP_UNDEF, 0, NULL, FALSE ),
    TStructField( "ID Пакета",                          T_UINT8,  offsetof( MESS_20_pms, id ) ),
    TStructField( "Контрольная сумма ( мл. байт )",     T_UINT8,  offsetof( MESS_20_pms, LoSumm ), 0, 0.0, 0, T_OP_UNDEF, 0, NULL, FALSE ),
    TStructField( "Контрольная сумма ( ст. байт )",     T_UINT8,  offsetof( MESS_20_pms, HiSumm ), 0, 0.0, 0, T_OP_UNDEF, 0, NULL, FALSE ),

	TStructField( "Номер МБСУ",                         T_UINT16,  offsetof( MESS_63_pms, MB_Id ) ),
	TStructField( "Номер МКП",                          T_UINT16,  offsetof( MESS_63_pms, MK_Id ) ),
};
int  nPD_20 = sizeof( PD_20 )/sizeof( PD_20[ 0 ] );

TStructField PD_21[] =
{
    TStructField( "Идентификатор заголовка",            T_UINT8, offsetof( MESS_21_pms, id_head ), 0, 0.0, 0, T_OP_UNDEF, 0, NULL, FALSE ),
    TStructField( "ID Пакета",                          T_UINT8,  offsetof( MESS_21_pms, id ) ),
    TStructField( "Контрольная сумма ( мл. байт )",     T_UINT8,  offsetof( MESS_21_pms, LoSumm ), 0, 0.0, 0, T_OP_UNDEF, 0, NULL, FALSE ),
    TStructField( "Контрольная сумма ( ст. байт )",     T_UINT8,  offsetof( MESS_21_pms, HiSumm ), 0, 0.0, 0, T_OP_UNDEF, 0, NULL, FALSE ),

	TStructField( "Номер МБСУ",                         T_UINT16,  offsetof( MESS_63_pms, MB_Id ) ),
	TStructField( "Номер МКП",                          T_UINT16,  offsetof( MESS_63_pms, MK_Id ) ),

    TStructField( "Колличество ошибок",					T_UINT16,  offsetof( MESS_21_pms, kolError ) ),
    TStructField( "Время",								T_UINT16,  offsetof( MESS_21_pms, secund ) ),

};
int  nPD_21 = sizeof( PD_21 )/sizeof( PD_21[ 0 ] );


TStructField PD_38[] =
{
    TStructField( "Идентификатор заголовка",            T_UINT8, offsetof( MESS_38_pms, id_head ), 0, 0.0, 0, T_OP_UNDEF, 0, NULL, FALSE ),
    TStructField( "ID Пакета",                          T_UINT8,  offsetof( MESS_38_pms, id ) ),
    TStructField( "Контрольная сумма ( мл. байт )",     T_UINT8,  offsetof( MESS_38_pms, LoSumm ), 0, 0.0, 0, T_OP_UNDEF, 0, NULL, FALSE ),
    TStructField( "Контрольная сумма ( ст. байт )",     T_UINT8,  offsetof( MESS_38_pms, HiSumm ), 0, 0.0, 0, T_OP_UNDEF, 0, NULL, FALSE ),

	TStructField( "Номер МБСУ",                         T_UINT16,  offsetof( MESS_63_pms, MB_Id ) ),
	TStructField( "Номер МКП",                          T_UINT16,  offsetof( MESS_63_pms, MK_Id ) ),
};
int  nPD_38 = sizeof( PD_38 )/sizeof( PD_38[ 0 ] );

TStructField PD_39[] =
{
    TStructField( "Идентификатор заголовка",            T_UINT8, offsetof( MESS_39_pms, id_head ), 0, 0.0, 0, T_OP_UNDEF, 0, NULL, FALSE ),
    TStructField( "ID Пакета",                          T_UINT8,  offsetof( MESS_39_pms, id ) ),
    TStructField( "Контрольная сумма ( мл. байт )",     T_UINT8,  offsetof( MESS_39_pms, LoSumm ), 0, 0.0, 0, T_OP_UNDEF, 0, NULL, FALSE ),
    TStructField( "Контрольная сумма ( ст. байт )",     T_UINT8,  offsetof( MESS_39_pms, HiSumm ), 0, 0.0, 0, T_OP_UNDEF, 0, NULL, FALSE ),

	TStructField( "Номер МБСУ",                         T_UINT16,  offsetof( MESS_63_pms, MB_Id ) ),
	TStructField( "Номер МКП",                          T_UINT16,  offsetof( MESS_63_pms, MK_Id ) ),

    TStructField( "Массив зарядов[0]",                  T_UINT16, offsetof( MESS_39_pms, Charge ) ),
    TStructField( "Массив зарядов[1]",                  T_UINT16, offsetof( MESS_39_pms, Charge ) + sizeof( UINT16 ) ),

};
int  nPD_39 = sizeof( PD_39 )/sizeof( PD_39[ 0 ] );


TStructField PD_54[] =
{
    TStructField( "Идентификатор заголовка",            T_UINT8, offsetof( MESS_54_pms, id_head ), 0, 0.0, 0, T_OP_UNDEF, 0, NULL, FALSE ),
    TStructField( "ID Пакета",                          T_UINT8,  offsetof( MESS_54_pms, id ) ),
    TStructField( "Контрольная сумма ( мл. байт )",     T_UINT8,  offsetof( MESS_54_pms, LoSumm ), 0, 0.0, 0, T_OP_UNDEF, 0, NULL, FALSE ),
    TStructField( "Контрольная сумма ( ст. байт )",     T_UINT8,  offsetof( MESS_54_pms, HiSumm ), 0, 0.0, 0, T_OP_UNDEF, 0, NULL, FALSE ),

	TStructField( "Номер МБСУ",                         T_UINT16,  offsetof( MESS_63_pms, MB_Id ) ),
	TStructField( "Номер МКП",                          T_UINT16,  offsetof( MESS_63_pms, MK_Id ) ),

    TStructField( "Массив на подрыв[0]",                T_UINT16, offsetof( MESS_54_pms, Underminning ) ),
    TStructField( "Массив на подрыв[1]",                T_UINT16, offsetof( MESS_54_pms, Underminning ) + sizeof( UINT16 ) ),

};
int  nPD_54 = sizeof( PD_54 )/sizeof( PD_54[ 0 ] );

TStructField PD_62[] =
{
    TStructField( "Идентификатор заголовка",            T_UINT8, offsetof( MESS_62_pms, id_head ), 0, 0.0, 0, T_OP_UNDEF, 0, NULL, FALSE ),
    TStructField( "ID Пакета",                          T_UINT8,  offsetof( MESS_62_pms, id ) ),
    TStructField( "Контрольная сумма ( мл. байт )",     T_UINT8,  offsetof( MESS_62_pms, LoSumm ), 0, 0.0, 0, T_OP_UNDEF, 0, NULL, FALSE ),
    TStructField( "Контрольная сумма ( ст. байт )",     T_UINT8,  offsetof( MESS_62_pms, HiSumm ), 0, 0.0, 0, T_OP_UNDEF, 0, NULL, FALSE ),

	TStructField( "Номер МБСУ",                         T_UINT16,  offsetof( MESS_63_pms, MB_Id ) ),
	TStructField( "Номер МКП",                          T_UINT16,  offsetof( MESS_63_pms, MK_Id ) ),
};
int  nPD_62 = sizeof( PD_62 )/sizeof( PD_62[ 0 ] );

TStructField PD_63[] =
{
    TStructField( "Идентификатор заголовка",            T_UINT8,  offsetof( MESS_63_pms, id_head ), 0, 0.0, 0, T_OP_UNDEF, 0, NULL, FALSE ),
    TStructField( "ID Пакета",                          T_UINT8,  offsetof( MESS_63_pms, id ) ),
    TStructField( "Контрольная сумма ( мл. байт )",     T_UINT8,  offsetof( MESS_63_pms, LoSumm ), 0, 0.0, 0, T_OP_UNDEF, 0, NULL, FALSE ),
    TStructField( "Контрольная сумма ( ст. байт )",     T_UINT8,  offsetof( MESS_63_pms, HiSumm ), 0, 0.0, 0, T_OP_UNDEF, 0, NULL, FALSE ),

	TStructField( "Номер МБСУ",                         T_UINT16,  offsetof( MESS_63_pms, MB_Id ) ),
	TStructField( "Номер МКП",                          T_UINT16,  offsetof( MESS_63_pms, MK_Id ) ),

	TStructField( "Напряжение МСУ",                     T_UINT16, offsetof( MESS_63_pms, Param1 ) ),
	TStructField( "Напряжение аккумулятора модема",     T_UINT16, offsetof( MESS_63_pms, Param2 ) ),
	TStructField( "Напряжение разблокировки",           T_UINT16, offsetof( MESS_63_pms, Param3 ) ),

	TStructField( "Процент распознанной информации",    T_UINT16, offsetof( MESS_63_pms, Param4 ), 0, 0.0, 0, T_OP_UNDEF, 0, NULL, FALSE ),
	TStructField( "Резерв",                             T_UINT16, offsetof( MESS_63_pms, Param5 ), 0, 0.0, 0, T_OP_UNDEF, 0, NULL, FALSE ),
	TStructField( "Температура внутри блока",           T_UINT16, offsetof( MESS_63_pms, Param6 ), 0, 0.0, 0, T_OP_UNDEF, 0, NULL, FALSE ),

};
int  nPD_63 = sizeof( PD_63 )/sizeof( PD_63[ 0 ] );
*/
