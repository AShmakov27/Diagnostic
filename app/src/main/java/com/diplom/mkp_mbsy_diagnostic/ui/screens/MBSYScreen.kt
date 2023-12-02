package com.diplom.mkp_mbsy_diagnostic.ui.screens

import android.content.Context
import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.LinearOutSlowInEasing
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.MailOutline
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SmallFloatingActionButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.runtime.*
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalLifecycleOwner
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.diplom.mkp_mbsy_diagnostic.data.usb.MBSYMessage
import com.diplom.mkp_mbsy_diagnostic.ui.navigation.Routes
import com.diplom.mkp_mbsy_diagnostic.ui.theme.MKP_MBSY_diagnosticTheme
import com.diplom.mkp_mbsy_diagnostic.viewmodel.MBSYViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MBSYScreen(
    navController: NavHostController,
    viewModel: MBSYViewModel = hiltViewModel()
) {
    var showDialog by remember { mutableStateOf(false) }
    val data by viewModel.data_list.observeAsState(initial = emptyList())
    val lifeCycleOwner = LocalLifecycleOwner.current
    val context = LocalContext.current
    Scaffold(
        topBar = {
            TopBar(title = "Мобильная диагностика МКП и МБСУ. Связь с МБСУ")
        },
        content = {
            Box(modifier = Modifier.padding(it))
            {
                MBSYContent(
                    navController = navController,
                    viewModel = viewModel,
                    context = context,
                    data = data
                )
            }
            IDsDialog(
                showDialog = showDialog,
                onDismiss = { showDialog = false },
                onConfirm = { start, end ->
                    viewModel.SendArrayOfMessages(
                        context = context,
                        start = start.toInt(),
                        end = end.toInt()
                    )
                }
            )
        },
        floatingActionButton = {
            Column(
                horizontalAlignment = Alignment.End,
                verticalArrangement = Arrangement.Center,
            ) {
                SmallFloatingActionButton(
                    containerColor = MaterialTheme.colorScheme.primary,
                    contentColor = MaterialTheme.colorScheme.onPrimary,
                    shape = CircleShape,
                    onClick = { showDialog = true }
                ) {
                    Icon(imageVector = Icons.Filled.Email, contentDescription = "Send Array")
                }
                Spacer(modifier = Modifier.height(8.dp))
                SmallFloatingActionButton(
                    containerColor = MaterialTheme.colorScheme.primary,
                    contentColor = MaterialTheme.colorScheme.onPrimary,
                    shape = CircleShape,
                    onClick = { viewModel.ConnectToUsb(context, lifeCycleOwner) }
                ) {
                    Icon(imageVector = Icons.Filled.Share, contentDescription = "Connect")
                }
            }
        }
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MBSYContent(
    navController: NavHostController,
    viewModel: MBSYViewModel = hiltViewModel(),
    context: Context,
    data: List<MBSYMessage>
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
            items(items = data, key = { it.Mes17.MB_id.toString() }) {
                MessageMBSYView(
                    navController = navController,
                    viewModel = viewModel,
                    context = context,
                    send = it.count_send,
                    receive = it.count_receive,
                    MB_id = it.Mes17.MB_id.toString(),
                    Version = it.Mes17.Version.toString(),
                    PodVersion = it.Mes17.PodVersion.toString(),
                    Month = it.Mes17.Month.toString(),
                    Year = it.Mes17.Year.toString(),
                    kolErr = it.Mes21?.KolErr.toString(),
                    Sec = it.Mes21?.Sec.toString(),
                    Param1 = it.Mes63?.Param1.toString(),
                    Param2 = it.Mes63?.Param2.toString(),
                    Param3 = it.Mes63?.Param3.toString(),
                    Param4 = it.Mes63?.Param4.toString(),
                    Param5 = it.Mes63?.Param5.toString(),
                    Param6 = it.Mes63?.Param6.toString()
                )
            }
        }
    }
}

@ExperimentalMaterial3Api
@Composable
fun MessageMBSYView(
    navController: NavHostController, viewModel: MBSYViewModel = hiltViewModel(), context: Context,
    send: Int, receive: Int,
    MB_id: String, Version: String, PodVersion: String, Month: String, Year: String,
    kolErr: String, Sec: String,
    Param1: String, Param2: String, Param3: String, Param4: String, Param5: String, Param6: String
) {
    var expandedState by remember { mutableStateOf(true) }
    val rotationState by animateFloatAsState(
        targetValue = if (expandedState) 180f else 0f
    )
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
    )
    {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(color = MaterialTheme.colorScheme.secondaryContainer)
        ) {
            Text(
                text = "МБСУ №$MB_id",
                style = TextStyle(
                    fontSize = MaterialTheme.typography.titleLarge.fontSize,
                    fontWeight = FontWeight.Bold,
                    color = MaterialTheme.colorScheme.onSecondaryContainer
                ),
                modifier = Modifier.padding(start = 5.dp, end = 10.dp)
            )
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.End
            )
            {
                IconButton(modifier = Modifier
                    .padding(end = 5.dp)
                    .rotate(rotationState),
                    onClick = { expandedState = !expandedState })
                {
                    Icon(
                        modifier = Modifier.fillMaxSize(),
                        imageVector = Icons.Default.ArrowDropDown,
                        contentDescription = "Close",
                        tint = MaterialTheme.colorScheme.onSecondaryContainer
                    )
                }
            }
        }
        if (expandedState) {
            Row(
                modifier = Modifier
                    .height(20.dp)
                    .fillMaxWidth()
                    .background(color = MaterialTheme.colorScheme.secondaryContainer)
                    .padding(start = 5.dp)
            ) {
                Row(
                    horizontalArrangement = Arrangement.Start
                ) {
                    Icon(
                        imageVector = Icons.Default.MailOutline,
                        contentDescription = "Send",
                        tint = MaterialTheme.colorScheme.onSecondaryContainer
                    )
                    Icon(
                        imageVector = Icons.Default.ArrowForward,
                        contentDescription = "Send",
                        tint = MaterialTheme.colorScheme.onSecondaryContainer
                    )
                    Text(
                        text = "$send",
                        style = TextStyle(
                            fontSize = MaterialTheme.typography.labelLarge.fontSize,
                            fontWeight = FontWeight.Bold,
                            color = MaterialTheme.colorScheme.onSecondaryContainer,
                            textAlign = TextAlign.Center
                        )
                    )
                    Icon(
                        modifier = Modifier
                            .padding(start = 20.dp),
                        imageVector = Icons.Default.MailOutline,
                        contentDescription = "Receive",
                        tint = MaterialTheme.colorScheme.onSecondaryContainer
                    )
                    Icon(
                        imageVector = Icons.Default.ArrowBack,
                        contentDescription = "Receive",
                        tint = MaterialTheme.colorScheme.onSecondaryContainer
                    )
                    Text(
                        text = "$receive",
                        style = TextStyle(
                            fontSize = MaterialTheme.typography.labelLarge.fontSize,
                            fontWeight = FontWeight.Bold,
                            color = MaterialTheme.colorScheme.onSecondaryContainer,
                            textAlign = TextAlign.Center
                        )
                    )
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
                    .background(color = MaterialTheme.colorScheme.secondaryContainer)
            )
            {
                Text(
                    text = "Версия: $Version",
                    style = TextStyle(
                        fontSize = MaterialTheme.typography.bodyLarge.fontSize,
                        fontWeight = FontWeight.Normal,
                        color = MaterialTheme.colorScheme.onSecondaryContainer
                    ),
                    modifier = Modifier.padding(start = 5.dp, end = 10.dp)
                )
                Text(
                    text = "Подверсия: $PodVersion",
                    style = TextStyle(
                        fontSize = MaterialTheme.typography.bodyLarge.fontSize,
                        fontWeight = FontWeight.Normal,
                        color = MaterialTheme.colorScheme.onSecondaryContainer
                    ),
                    modifier = Modifier.padding(start = 5.dp, end = 10.dp)
                )
                Text(
                    text = "Месяц: $Month",
                    style = TextStyle(
                        fontSize = MaterialTheme.typography.bodyLarge.fontSize,
                        fontWeight = FontWeight.Normal,
                        color = MaterialTheme.colorScheme.onSecondaryContainer
                    ),
                    modifier = Modifier.padding(start = 5.dp, end = 10.dp)
                )
                Text(
                    text = "Год: $Year",
                    style = TextStyle(
                        fontSize = MaterialTheme.typography.bodyLarge.fontSize,
                        fontWeight = FontWeight.Normal,
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
            )
            {
                Text(
                    text = "Количество ошибок: $kolErr",
                    style = TextStyle(
                        fontSize = MaterialTheme.typography.bodyLarge.fontSize,
                        fontWeight = FontWeight.Normal,
                        color = MaterialTheme.colorScheme.onSecondaryContainer
                    ),
                    modifier = Modifier.padding(start = 5.dp, end = 10.dp)
                )
                Text(
                    text = "Время: $Sec с",
                    style = TextStyle(
                        fontSize = MaterialTheme.typography.bodyLarge.fontSize,
                        fontWeight = FontWeight.Normal,
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
            )
            {
                Text(
                    text = "Напряжение МСУ: $Param1 В",
                    style = TextStyle(
                        fontSize = MaterialTheme.typography.bodyLarge.fontSize,
                        fontWeight = FontWeight.Normal,
                        color = MaterialTheme.colorScheme.onSecondaryContainer
                    ),
                    modifier = Modifier.padding(start = 5.dp, end = 10.dp)
                )
                Text(
                    text = "Напряжение аккумулятора модема: $Param2 В",
                    style = TextStyle(
                        fontSize = MaterialTheme.typography.bodyLarge.fontSize,
                        fontWeight = FontWeight.Normal,
                        color = MaterialTheme.colorScheme.onSecondaryContainer
                    ),
                    modifier = Modifier.padding(start = 5.dp, end = 10.dp)
                )
                Text(
                    text = "Напряжение разблокировки: $Param3 В",
                    style = TextStyle(
                        fontSize = MaterialTheme.typography.bodyLarge.fontSize,
                        fontWeight = FontWeight.Normal,
                        color = MaterialTheme.colorScheme.onSecondaryContainer
                    ),
                    modifier = Modifier.padding(start = 5.dp, end = 10.dp)
                )
                Text(
                    text = "Процент распознанной информации: $Param4 %",
                    style = TextStyle(
                        fontSize = MaterialTheme.typography.bodyLarge.fontSize,
                        fontWeight = FontWeight.Normal,
                        color = MaterialTheme.colorScheme.onSecondaryContainer
                    ),
                    modifier = Modifier.padding(start = 5.dp, end = 10.dp)
                )
                Text(
                    text = "Резерв: $Param5 В",
                    style = TextStyle(
                        fontSize = MaterialTheme.typography.bodyLarge.fontSize,
                        fontWeight = FontWeight.Normal,
                        color = MaterialTheme.colorScheme.onSecondaryContainer
                    ),
                    modifier = Modifier.padding(start = 5.dp, end = 10.dp)
                )
                Text(
                    text = "Температура внутри блока: $Param6 г.ц.",
                    style = TextStyle(
                        fontSize = MaterialTheme.typography.bodyLarge.fontSize,
                        fontWeight = FontWeight.Normal,
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
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(color = MaterialTheme.colorScheme.secondaryContainer),
                horizontalArrangement = Arrangement.Center
            )
            {
                Button(
                    onClick = { navController.navigate(Routes.MKP.route) },
                    colors = ButtonDefaults.buttonColors(containerColor = MaterialTheme.colorScheme.secondary)
                )
                {
                    Text(
                        text = "Управление МКП",
                        style = TextStyle(
                            fontSize = MaterialTheme.typography.labelSmall.fontSize,
                            fontWeight = FontWeight.Bold,
                            color = MaterialTheme.colorScheme.onSecondary,
                            textAlign = TextAlign.Center
                        )
                    )
                }
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(color = MaterialTheme.colorScheme.secondaryContainer),
                horizontalArrangement = Arrangement.Center
            )
            {
                Button(
                    modifier = Modifier
                        .padding(end = 5.dp)
                        .width(120.dp),
                    onClick = { viewModel.SendMessage16(context = context, MB_id = MB_id) },
                    colors = ButtonDefaults.buttonColors(containerColor = MaterialTheme.colorScheme.secondary)
                )
                {
                    Text(
                        text = "Версия",
                        style = TextStyle(
                            fontSize = MaterialTheme.typography.labelSmall.fontSize,
                            fontWeight = FontWeight.Bold,
                            color = MaterialTheme.colorScheme.onSecondary,
                            textAlign = TextAlign.Center
                        )
                    )
                }
                Button(
                    modifier = Modifier
                        .padding(end = 5.dp)
                        .width(120.dp),
                    onClick = { viewModel.SendMessage20(context = context, MB_id = MB_id) },
                    colors = ButtonDefaults.buttonColors(containerColor = MaterialTheme.colorScheme.secondary)
                )
                {
                    Text(
                        text = "Ошибки",
                        style = TextStyle(
                            fontSize = MaterialTheme.typography.labelSmall.fontSize,
                            fontWeight = FontWeight.Bold,
                            color = MaterialTheme.colorScheme.onSecondary,
                            textAlign = TextAlign.Center
                        )
                    )
                }
                Button(
                    modifier = Modifier
                        .padding(end = 5.dp)
                        .width(120.dp),
                    onClick = { viewModel.SendMessage62(context = context, MB_id = MB_id) },
                    colors = ButtonDefaults.buttonColors(containerColor = MaterialTheme.colorScheme.secondary)
                )
                {
                    Text(
                        text = "Напряжение",
                        style = TextStyle(
                            fontSize = MaterialTheme.typography.labelSmall.fontSize,
                            fontWeight = FontWeight.Bold,
                            color = MaterialTheme.colorScheme.onSecondary,
                            textAlign = TextAlign.Center
                        )
                    )
                }
            }
        }
    }
}