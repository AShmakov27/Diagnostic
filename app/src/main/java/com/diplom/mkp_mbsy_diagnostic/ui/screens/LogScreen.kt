package com.diplom.mkp_mbsy_diagnostic.ui.screens

import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.LinearOutSlowInEasing
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.List
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SmallFloatingActionButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.diplom.mkp_mbsy_diagnostic.ui.theme.MKP_MBSY_diagnosticTheme
import com.diplom.mkp_mbsy_diagnostic.utils.MSSLog.MsgFromLog
import com.diplom.mkp_mbsy_diagnostic.utils.byteArrayToMessage_16
import com.diplom.mkp_mbsy_diagnostic.utils.byteArrayToMessage_17
import com.diplom.mkp_mbsy_diagnostic.utils.byteArrayToMessage_21
import com.diplom.mkp_mbsy_diagnostic.utils.byteArrayToMessage_39
import com.diplom.mkp_mbsy_diagnostic.utils.byteArrayToMessage_63
import com.diplom.mkp_mbsy_diagnostic.viewmodel.LogViewModel
import java.math.BigInteger

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LogScreen(
    viewModel: LogViewModel = hiltViewModel()
) {
    val data by viewModel.data.observeAsState(initial = emptyList())
    val context = LocalContext.current

    val filePickerLauncher = rememberLauncherForActivityResult(
        contract = ActivityResultContracts.OpenDocument(),
        onResult =
        {
            if (it != null) {
                viewModel.onFilePathsListChange(it,context)
            }
        })

    Scaffold(
        topBar = {
            TopBar(title = "Мобильная диагностика МКП и МБСУ. Просмотр логов")
        },
        content = {
            Box(modifier = Modifier.padding(it))
            {
                LogContent(
                    data = data
                )
            }
        },
        floatingActionButton = {
            SmallFloatingActionButton(
                containerColor = MaterialTheme.colorScheme.primary,
                contentColor = MaterialTheme.colorScheme.onPrimary,
                shape = CircleShape,
                onClick = {  filePickerLauncher.launch(arrayOf("*/*")) }
            ) {
                Icon(imageVector = Icons.Filled.List, contentDescription = "File choose")
            }
        }
    )
}

@Composable
fun LogContent(
    data: List<MsgFromLog>
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(start = 0.dp, end = 0.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    )
    {
        LazyColumn(modifier = Modifier.weight(1f))
        {
            items(items = data, key = { it.pos }) {
                PackagesView(
                    pos = it.pos,
                    incoming_message = it.incoming_message,
                    id = it.ID,
                    date_time = it.date_time,
                    size = it.size,
                    data = it.msg_data
                )
            }
        }
    }
}

@Composable
fun PackagesView(
    pos: Int, incoming_message: Byte, id: UInt, date_time: String, size: Int, data: ByteArray
) {
    var showData by remember { mutableStateOf(true) }
    Card(
        modifier = Modifier
            .padding(top = 5.dp, start = 5.dp, end = 5.dp)
            .fillMaxWidth()
            .animateContentSize(
                animationSpec = tween(
                    durationMillis = 300,
                    easing = LinearOutSlowInEasing
                )
            ),
        shape = RoundedCornerShape(10.dp)
    ) {
        Row(
            modifier = Modifier
                .background(color = MaterialTheme.colorScheme.secondaryContainer)
                .fillMaxWidth()
                .height(30.dp)
                .clickable { showData = !showData },
            horizontalArrangement = Arrangement.Center
        ) {
            Text(
                text = "№ $pos", style = TextStyle(
                    fontSize = MaterialTheme.typography.titleLarge.fontSize,
                    fontWeight = FontWeight.Bold,
                    color = MaterialTheme.colorScheme.onSecondaryContainer
                ),
                modifier = Modifier.padding(start = 5.dp, end = 5.dp)
            )
            if (incoming_message.toInt() == 0) {
                Icon(
                    imageVector = Icons.Default.ArrowForward,
                    contentDescription = "receive",
                    tint = MaterialTheme.colorScheme.onSecondaryContainer
                )
            } else if (incoming_message.toInt() == 1) {
                Icon(
                    imageVector = Icons.Default.ArrowBack,
                    contentDescription = "Send",
                    tint = MaterialTheme.colorScheme.onSecondaryContainer,
                    modifier = Modifier.padding(top = 3.dp)
                )
            }
            Text(
                text = "ID = $id", style = TextStyle(
                    fontSize = MaterialTheme.typography.titleLarge.fontSize,
                    fontWeight = FontWeight.Bold,
                    color = MaterialTheme.colorScheme.onSecondaryContainer
                ),
                modifier = Modifier.padding(start = 5.dp, end = 10.dp)
            )
        }
        if (showData) {
            Spacer(
                modifier = Modifier
                    .padding(start = 5.dp, end = 5.dp)
                    .height(3.dp)
                    .fillMaxWidth()
                    .background(color = MaterialTheme.colorScheme.onSecondaryContainer)
            )
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(color = MaterialTheme.colorScheme.secondaryContainer),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "$date_time", style = TextStyle(
                        fontSize = MaterialTheme.typography.titleLarge.fontSize,
                        fontWeight = FontWeight.Bold,
                        color = MaterialTheme.colorScheme.onSecondaryContainer
                    ),
                    modifier = Modifier.padding(start = 5.dp, end = 10.dp)
                )
            }
            Spacer(
                modifier = Modifier
                    .padding(start = 5.dp, end = 5.dp)
                    .height(3.dp)
                    .fillMaxWidth()
                    .background(color = MaterialTheme.colorScheme.onSecondaryContainer)
            )
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(color = MaterialTheme.colorScheme.secondaryContainer)
            ) {
                when (id.toInt()) {
                    16, 20, 38, 62 -> {
                        val msg = byteArrayToMessage_16(data)
                        if (msg != null) {
                            Text(
                                text = "Идентификатор заголовка: ${msg.id_head}",
                                style = TextStyle(
                                    fontSize = MaterialTheme.typography.titleMedium.fontSize,
                                    fontWeight = FontWeight.Bold,
                                    color = MaterialTheme.colorScheme.onSecondaryContainer
                                ),
                                modifier = Modifier.padding(start = 5.dp, end = 10.dp)
                            )
                            Text(
                                text = "ID Пакета: ${msg.id}", style = TextStyle(
                                    fontSize = MaterialTheme.typography.titleMedium.fontSize,
                                    fontWeight = FontWeight.Bold,
                                    color = MaterialTheme.colorScheme.onSecondaryContainer
                                ),
                                modifier = Modifier.padding(start = 5.dp, end = 10.dp)
                            )
                            Text(
                                text = "Контрольная сумма ( мл. байт ): ${msg.LoSumm}",
                                style = TextStyle(
                                    fontSize = MaterialTheme.typography.titleMedium.fontSize,
                                    fontWeight = FontWeight.Bold,
                                    color = MaterialTheme.colorScheme.onSecondaryContainer
                                ),
                                modifier = Modifier.padding(start = 5.dp, end = 10.dp)
                            )
                            Text(
                                text = "Контрольная сумма ( ст. байт ): ${msg.HiSumm}",
                                style = TextStyle(
                                    fontSize = MaterialTheme.typography.titleMedium.fontSize,
                                    fontWeight = FontWeight.Bold,
                                    color = MaterialTheme.colorScheme.onSecondaryContainer
                                ),
                                modifier = Modifier.padding(start = 5.dp, end = 10.dp)
                            )
                            Text(
                                text = "Номер МБСУ: ${msg.MB_id}", style = TextStyle(
                                    fontSize = MaterialTheme.typography.titleMedium.fontSize,
                                    fontWeight = FontWeight.Bold,
                                    color = MaterialTheme.colorScheme.onSecondaryContainer
                                ),
                                modifier = Modifier.padding(start = 5.dp, end = 10.dp)
                            )
                            Text(
                                text = "Номер МКП: ${msg.MK_id}", style = TextStyle(
                                    fontSize = MaterialTheme.typography.titleMedium.fontSize,
                                    fontWeight = FontWeight.Bold,
                                    color = MaterialTheme.colorScheme.onSecondaryContainer
                                ),
                                modifier = Modifier.padding(start = 5.dp, end = 10.dp)
                            )
                        }
                    }

                    17 -> {
                        val msg = byteArrayToMessage_17(data)
                        if (msg != null) {
                            Text(
                                text = "Идентификатор заголовка: ${msg.id_head}",
                                style = TextStyle(
                                    fontSize = MaterialTheme.typography.titleMedium.fontSize,
                                    fontWeight = FontWeight.Bold,
                                    color = MaterialTheme.colorScheme.onSecondaryContainer
                                ),
                                modifier = Modifier.padding(start = 5.dp, end = 10.dp)
                            )

                            Text(
                                text = "ID Пакета: ${msg.id}", style = TextStyle(
                                    fontSize = MaterialTheme.typography.titleMedium.fontSize,
                                    fontWeight = FontWeight.Bold,
                                    color = MaterialTheme.colorScheme.onSecondaryContainer
                                ),
                                modifier = Modifier.padding(start = 5.dp, end = 10.dp)
                            )
                            Text(
                                text = "Контрольная сумма ( мл. байт ): ${msg.LoSumm}",
                                style = TextStyle(
                                    fontSize = MaterialTheme.typography.titleMedium.fontSize,
                                    fontWeight = FontWeight.Bold,
                                    color = MaterialTheme.colorScheme.onSecondaryContainer
                                ),
                                modifier = Modifier.padding(start = 5.dp, end = 10.dp)
                            )
                            Text(
                                text = "Контрольная сумма ( ст. байт ): ${msg.HiSumm}",
                                style = TextStyle(
                                    fontSize = MaterialTheme.typography.titleMedium.fontSize,
                                    fontWeight = FontWeight.Bold,
                                    color = MaterialTheme.colorScheme.onSecondaryContainer
                                ),
                                modifier = Modifier.padding(start = 5.dp, end = 10.dp)
                            )
                            Text(
                                text = "Номер МБСУ: ${msg.MB_id}", style = TextStyle(
                                    fontSize = MaterialTheme.typography.titleMedium.fontSize,
                                    fontWeight = FontWeight.Bold,
                                    color = MaterialTheme.colorScheme.onSecondaryContainer
                                ),
                                modifier = Modifier.padding(start = 5.dp, end = 10.dp)
                            )
                            Text(
                                text = "Номер МКП: ${msg.MK_id}", style = TextStyle(
                                    fontSize = MaterialTheme.typography.titleMedium.fontSize,
                                    fontWeight = FontWeight.Bold,
                                    color = MaterialTheme.colorScheme.onSecondaryContainer
                                ),
                                modifier = Modifier.padding(start = 5.dp, end = 10.dp)
                            )
                            Text(
                                text = "Версия: ${msg.Version}", style = TextStyle(
                                    fontSize = MaterialTheme.typography.titleMedium.fontSize,
                                    fontWeight = FontWeight.Bold,
                                    color = MaterialTheme.colorScheme.onSecondaryContainer
                                ),
                                modifier = Modifier.padding(start = 5.dp, end = 10.dp)
                            )
                            Text(
                                text = "Подверсия: ${msg.PodVersion}", style = TextStyle(
                                    fontSize = MaterialTheme.typography.titleMedium.fontSize,
                                    fontWeight = FontWeight.Bold,
                                    color = MaterialTheme.colorScheme.onSecondaryContainer
                                ),
                                modifier = Modifier.padding(start = 5.dp, end = 10.dp)
                            )
                            Text(
                                text = "Месяц: ${msg.Month}", style = TextStyle(
                                    fontSize = MaterialTheme.typography.titleMedium.fontSize,
                                    fontWeight = FontWeight.Bold,
                                    color = MaterialTheme.colorScheme.onSecondaryContainer
                                ),
                                modifier = Modifier.padding(start = 5.dp, end = 10.dp)
                            )
                            Text(
                                text = "Год: ${msg.Year}", style = TextStyle(
                                    fontSize = MaterialTheme.typography.titleMedium.fontSize,
                                    fontWeight = FontWeight.Bold,
                                    color = MaterialTheme.colorScheme.onSecondaryContainer
                                ),
                                modifier = Modifier.padding(start = 5.dp, end = 10.dp)
                            )
                        }
                    }

                    21 -> {
                        val msg = byteArrayToMessage_21(data)
                        if (msg != null) {
                            Text(
                                text = "Идентификатор заголовка: ${msg.id_head}",
                                style = TextStyle(
                                    fontSize = MaterialTheme.typography.titleMedium.fontSize,
                                    fontWeight = FontWeight.Bold,
                                    color = MaterialTheme.colorScheme.onSecondaryContainer
                                ),
                                modifier = Modifier.padding(start = 5.dp, end = 10.dp)
                            )

                            Text(
                                text = "ID Пакета: ${msg.id}", style = TextStyle(
                                    fontSize = MaterialTheme.typography.titleMedium.fontSize,
                                    fontWeight = FontWeight.Bold,
                                    color = MaterialTheme.colorScheme.onSecondaryContainer
                                ),
                                modifier = Modifier.padding(start = 5.dp, end = 10.dp)
                            )
                            Text(
                                text = "Контрольная сумма ( мл. байт ): ${msg.LoSumm}",
                                style = TextStyle(
                                    fontSize = MaterialTheme.typography.titleMedium.fontSize,
                                    fontWeight = FontWeight.Bold,
                                    color = MaterialTheme.colorScheme.onSecondaryContainer
                                ),
                                modifier = Modifier.padding(start = 5.dp, end = 10.dp)
                            )
                            Text(
                                text = "Контрольная сумма ( ст. байт ): ${msg.HiSumm}",
                                style = TextStyle(
                                    fontSize = MaterialTheme.typography.titleMedium.fontSize,
                                    fontWeight = FontWeight.Bold,
                                    color = MaterialTheme.colorScheme.onSecondaryContainer
                                ),
                                modifier = Modifier.padding(start = 5.dp, end = 10.dp)
                            )
                            Text(
                                text = "Номер МБСУ: ${msg.MB_id}", style = TextStyle(
                                    fontSize = MaterialTheme.typography.titleMedium.fontSize,
                                    fontWeight = FontWeight.Bold,
                                    color = MaterialTheme.colorScheme.onSecondaryContainer
                                ),
                                modifier = Modifier.padding(start = 5.dp, end = 10.dp)
                            )
                            Text(
                                text = "Номер МКП: ${msg.MK_id}", style = TextStyle(
                                    fontSize = MaterialTheme.typography.titleMedium.fontSize,
                                    fontWeight = FontWeight.Bold,
                                    color = MaterialTheme.colorScheme.onSecondaryContainer
                                ),
                                modifier = Modifier.padding(start = 5.dp, end = 10.dp)
                            )
                            Text(
                                text = "Колличество ошибок: ${msg.KolErr}", style = TextStyle(
                                    fontSize = MaterialTheme.typography.titleMedium.fontSize,
                                    fontWeight = FontWeight.Bold,
                                    color = MaterialTheme.colorScheme.onSecondaryContainer
                                ),
                                modifier = Modifier.padding(start = 5.dp, end = 10.dp)
                            )
                            Text(
                                text = "Время: ${msg.Sec}", style = TextStyle(
                                    fontSize = MaterialTheme.typography.titleMedium.fontSize,
                                    fontWeight = FontWeight.Bold,
                                    color = MaterialTheme.colorScheme.onSecondaryContainer
                                ),
                                modifier = Modifier.padding(start = 5.dp, end = 10.dp)
                            )
                        }
                    }

                    39, 54 -> {
                        val msg = byteArrayToMessage_39(data)
                        if (msg != null) {
                            Text(
                                text = "Идентификатор заголовка: ${msg.id_head}",
                                style = TextStyle(
                                    fontSize = MaterialTheme.typography.titleMedium.fontSize,
                                    fontWeight = FontWeight.Bold,
                                    color = MaterialTheme.colorScheme.onSecondaryContainer
                                ),
                                modifier = Modifier.padding(start = 5.dp, end = 10.dp)
                            )

                            Text(
                                text = "ID Пакета: ${msg.id}", style = TextStyle(
                                    fontSize = MaterialTheme.typography.titleMedium.fontSize,
                                    fontWeight = FontWeight.Bold,
                                    color = MaterialTheme.colorScheme.onSecondaryContainer
                                ),
                                modifier = Modifier.padding(start = 5.dp, end = 10.dp)
                            )
                            Text(
                                text = "Контрольная сумма ( мл. байт ): ${msg.LoSumm}",
                                style = TextStyle(
                                    fontSize = MaterialTheme.typography.titleMedium.fontSize,
                                    fontWeight = FontWeight.Bold,
                                    color = MaterialTheme.colorScheme.onSecondaryContainer
                                ),
                                modifier = Modifier.padding(start = 5.dp, end = 10.dp)
                            )
                            Text(
                                text = "Контрольная сумма ( ст. байт ): ${msg.HiSumm}",
                                style = TextStyle(
                                    fontSize = MaterialTheme.typography.titleMedium.fontSize,
                                    fontWeight = FontWeight.Bold,
                                    color = MaterialTheme.colorScheme.onSecondaryContainer
                                ),
                                modifier = Modifier.padding(start = 5.dp, end = 10.dp)
                            )
                            Text(
                                text = "Номер МБСУ: ${msg.MB_id}", style = TextStyle(
                                    fontSize = MaterialTheme.typography.titleMedium.fontSize,
                                    fontWeight = FontWeight.Bold,
                                    color = MaterialTheme.colorScheme.onSecondaryContainer
                                ),
                                modifier = Modifier.padding(start = 5.dp, end = 10.dp)
                            )
                            Text(
                                text = "Номер МКП: ${msg.MK_id}", style = TextStyle(
                                    fontSize = MaterialTheme.typography.titleMedium.fontSize,
                                    fontWeight = FontWeight.Bold,
                                    color = MaterialTheme.colorScheme.onSecondaryContainer
                                ),
                                modifier = Modifier.padding(start = 5.dp, end = 10.dp)
                            )
                        }
                    }

                    63 -> {
                        val msg = byteArrayToMessage_63(data)
                        if (msg != null) {
                            Text(
                                text = "Идентификатор заголовка: ${msg.id_head}",
                                style = TextStyle(
                                    fontSize = MaterialTheme.typography.titleMedium.fontSize,
                                    fontWeight = FontWeight.Bold,
                                    color = MaterialTheme.colorScheme.onSecondaryContainer
                                ),
                                modifier = Modifier.padding(start = 5.dp, end = 10.dp)
                            )

                            Text(
                                text = "ID Пакета: ${msg.id}", style = TextStyle(
                                    fontSize = MaterialTheme.typography.titleMedium.fontSize,
                                    fontWeight = FontWeight.Bold,
                                    color = MaterialTheme.colorScheme.onSecondaryContainer
                                ),
                                modifier = Modifier.padding(start = 5.dp, end = 10.dp)
                            )
                            Text(
                                text = "Контрольная сумма ( мл. байт ): ${msg.LoSumm}",
                                style = TextStyle(
                                    fontSize = MaterialTheme.typography.titleMedium.fontSize,
                                    fontWeight = FontWeight.Bold,
                                    color = MaterialTheme.colorScheme.onSecondaryContainer
                                ),
                                modifier = Modifier.padding(start = 5.dp, end = 10.dp)
                            )
                            Text(
                                text = "Контрольная сумма ( ст. байт ): ${msg.HiSumm}",
                                style = TextStyle(
                                    fontSize = MaterialTheme.typography.titleMedium.fontSize,
                                    fontWeight = FontWeight.Bold,
                                    color = MaterialTheme.colorScheme.onSecondaryContainer
                                ),
                                modifier = Modifier.padding(start = 5.dp, end = 10.dp)
                            )
                            Text(
                                text = "Номер МБСУ: ${msg.MB_id}", style = TextStyle(
                                    fontSize = MaterialTheme.typography.titleMedium.fontSize,
                                    fontWeight = FontWeight.Bold,
                                    color = MaterialTheme.colorScheme.onSecondaryContainer
                                ),
                                modifier = Modifier.padding(start = 5.dp, end = 10.dp)
                            )
                            Text(
                                text = "Номер МКП: ${msg.MK_id}", style = TextStyle(
                                    fontSize = MaterialTheme.typography.titleMedium.fontSize,
                                    fontWeight = FontWeight.Bold,
                                    color = MaterialTheme.colorScheme.onSecondaryContainer
                                ),
                                modifier = Modifier.padding(start = 5.dp, end = 10.dp)
                            )
                            Text(
                                text = "Напряжение МСУ: ${msg.Param1}", style = TextStyle(
                                    fontSize = MaterialTheme.typography.titleMedium.fontSize,
                                    fontWeight = FontWeight.Bold,
                                    color = MaterialTheme.colorScheme.onSecondaryContainer
                                ),
                                modifier = Modifier.padding(start = 5.dp, end = 10.dp)
                            )
                            Text(
                                text = "Напряжение аккумулятора модема: ${msg.Param2}",
                                style = TextStyle(
                                    fontSize = MaterialTheme.typography.titleMedium.fontSize,
                                    fontWeight = FontWeight.Bold,
                                    color = MaterialTheme.colorScheme.onSecondaryContainer
                                ),
                                modifier = Modifier.padding(start = 5.dp, end = 10.dp)
                            )
                            Text(
                                text = "Напряжение разблокировки: ${msg.Param3}",
                                style = TextStyle(
                                    fontSize = MaterialTheme.typography.titleMedium.fontSize,
                                    fontWeight = FontWeight.Bold,
                                    color = MaterialTheme.colorScheme.onSecondaryContainer
                                ),
                                modifier = Modifier.padding(start = 5.dp, end = 10.dp)
                            )
                            Text(
                                text = "Процент распознанной информации: ${msg.Param4}",
                                style = TextStyle(
                                    fontSize = MaterialTheme.typography.titleMedium.fontSize,
                                    fontWeight = FontWeight.Bold,
                                    color = MaterialTheme.colorScheme.onSecondaryContainer
                                ),
                                modifier = Modifier.padding(start = 5.dp, end = 10.dp)
                            )
                            Text(
                                text = "Резерв: ${msg.Param5}", style = TextStyle(
                                    fontSize = MaterialTheme.typography.titleMedium.fontSize,
                                    fontWeight = FontWeight.Bold,
                                    color = MaterialTheme.colorScheme.onSecondaryContainer
                                ),
                                modifier = Modifier.padding(start = 5.dp, end = 10.dp)
                            )
                            Text(
                                text = "Температура внутри блока: ${msg.Param6}",
                                style = TextStyle(
                                    fontSize = MaterialTheme.typography.titleMedium.fontSize,
                                    fontWeight = FontWeight.Bold,
                                    color = MaterialTheme.colorScheme.onSecondaryContainer
                                ),
                                modifier = Modifier.padding(start = 5.dp, end = 10.dp)
                            )
                        }
                    }
                }
            }
            Spacer(
                modifier = Modifier
                    .padding(start = 5.dp, end = 5.dp)
                    .height(3.dp)
                    .fillMaxWidth()
                    .background(color = MaterialTheme.colorScheme.onSecondaryContainer)
            )
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(color = MaterialTheme.colorScheme.secondaryContainer),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "Длина пакета ( байт ): $size", style = TextStyle(
                        fontSize = MaterialTheme.typography.titleMedium.fontSize,
                        fontWeight = FontWeight.Bold,
                        color = MaterialTheme.colorScheme.onSecondaryContainer
                    ),
                    modifier = Modifier.padding(start = 5.dp, end = 10.dp)
                )
            }
        }
    }
}

@Preview
@Composable
fun PreviewLOG() {
    MKP_MBSY_diagnosticTheme(darkTheme = false) {
        val header = byteArrayOf(
            0x10,
            0x00,
            0x00,
            0x00,
            0x08,
            0x00,
            0x00,
            0x00,
            0xE7.toByte(),
            0x07,
            0x0b,
            0x00,
            0x01,
            0x00,
            0x1b,
            0x00,
            0x0a,
            0x00,
            0x36,
            0x00,
            0x16,
            0x00,
            0x02,
            0x02,
            0x01
        )
        val year = BigInteger(byteArrayOf(header[9], header[8])).toInt()
        val moth = header[10].toInt()
        val day = header[14].toInt()
        val hour = header[16]
        val minute = header[18]
        val second = header[20]
        val nano = BigInteger(byteArrayOf(header[23], header[22])).toInt()
        val date = "${day}.${moth}.${year}  ${hour}:${minute}:${second}.${nano}"
        PackagesView(
            pos = 0,
            incoming_message = header[header.size - 1],
            id = header[0].toUInt(),
            date_time = date,
            size = header[4].toInt(),
            data = byteArrayOf(0x01, 0x10, 0x01, 0x01, 0x01, 0x00, 0x00, 0x00)
        )
    }
}