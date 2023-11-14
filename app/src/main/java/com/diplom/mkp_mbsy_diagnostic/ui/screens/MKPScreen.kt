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
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.selection.selectable
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.MailOutline
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FabPosition
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.style.TextAlign
import androidx.hilt.navigation.compose.hiltViewModel
import com.diplom.mkp_mbsy_diagnostic.data.usb.MKPMessage
import com.diplom.mkp_mbsy_diagnostic.viewmodel.MKPViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MKPScreen(
    viewModel: MKPViewModel = hiltViewModel()/*,
    onDeleteClick: () -> Unit,
    onSaveClick: () -> Unit*/
) {
    var showDialog by remember { mutableStateOf(false) }
    val data by viewModel.data_list.observeAsState(initial = emptyList())
    val context = LocalContext.current
    Scaffold(
        topBar = {
            TopBar(title = "Мобильная диагностика МКП и МБСУ. Связь c МКП")
        },
        content = {
            Box(modifier = Modifier.padding(it))
            {
                MKPContent(
                    viewModel = viewModel,
                    context = context,
                    data = data/*,
                    onDeleteClick = onDeleteClick,
                    onSaveClick = onSaveClick*/
                )
            }/*
            IDsMKPDialog(
                showDialog = showDialog,
                onDismiss = { showDialog = false },
                onConfirm = { MB_id, start, end ->
                    viewModel.SendArrayOfMessages(
                        context = context,
                        MB_id = MB_id,
                        start = start.toInt(),
                        end = end.toInt()
                    )
                }
            )
            */
        },
        floatingActionButton = {
            FloatingActionButton(
                containerColor = MaterialTheme.colorScheme.primary,
                contentColor = MaterialTheme.colorScheme.onPrimary,
                shape = CircleShape,
                onClick = { showDialog = true }
            ) {
                Icon(imageVector = Icons.Filled.Email, contentDescription = "Send Array")
            }
        },
        floatingActionButtonPosition = FabPosition.End
    )
}

@OptIn(ExperimentalUnsignedTypes::class)
@Composable
fun MKPContent(
    viewModel: MKPViewModel = hiltViewModel(),
    context: Context,
    data: List<MKPMessage>/*,
    onDeleteClick: () -> Unit,
    onSaveClick: () -> Unit*/

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
            items(items = data, key = { it.Mes21.MK_id.toString() }) {
                MessageMKPView(
                    viewModel = viewModel,
                    context = context,
                    send = it.count_send,
                    receive = it.count_receive,
                    MB_id = it.Mes21.MB_id.toString(),
                    MK_id = it.Mes21.MK_id.toString(),
                    kolErr = it.Mes21.KolErr.toString(),
                    Sec = it.Mes21.Sec.toString(),
                    Param1 = it.Mes63?.Param1.toString(),
                    Param2 = it.Mes63?.Param2.toString(),
                    Param3 = it.Mes63?.Param3.toString(),
                    Param4 = it.Mes63?.Param4.toString(),
                    Param5 = it.Mes63?.Param5.toString(),
                    Param6 = it.Mes63?.Param6.toString(),
                    Charge = it.Mes39?.Charge/*,
                    onDeleteClick = onDeleteClick,
                    onSaveClick = onSaveClick*/
                )
            }
        }
    }
}


@OptIn(ExperimentalUnsignedTypes::class)
@Composable
fun MessageMKPView(
    viewModel: MKPViewModel = hiltViewModel(), context: Context,
    send: Int, receive: Int,
    MB_id: String, MK_id: String, kolErr: String, Sec: String,
    Param1: String, Param2: String, Param3: String, Param4: String, Param5: String, Param6: String,
    Charge: UShortArray?
    /*, onDeleteClick: () -> Unit, onSaveClick: () -> Unit*/
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
                text = "МКП №$MK_id",
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
            val Underminning0 = UShortArray(20)
            for (i in Underminning0.indices) {
                Underminning0.set(index = i, value = 0u)
            }
            Row(
                modifier = Modifier
                    .height(20.dp)
                    .fillMaxWidth()
                    .background(color = MaterialTheme.colorScheme.secondaryContainer)
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
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.End
                )
                {
                    IconButton(modifier = Modifier
                        .padding(end = 5.dp),
                        onClick = { /*onDeleteClick*/ })
                    {
                        Icon(
                            modifier = Modifier.fillMaxSize(),
                            imageVector = Icons.Default.Delete,
                            contentDescription = "Delete",
                            tint = Color.Red
                        )
                    }
                    IconButton(modifier = Modifier
                        .padding(end = 5.dp),
                        onClick = { /*onSaveClick*/ })
                    {
                        Icon(
                            modifier = Modifier.fillMaxSize(),
                            imageVector = Icons.Default.AddCircle,
                            contentDescription = "Save",
                            tint = MaterialTheme.colorScheme.onSecondaryContainer
                        )
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
            if (Charge != null) {
                val color_notselected = MaterialTheme.colorScheme.secondary
                val color_selected = MaterialTheme.colorScheme.tertiaryContainer
                var color = color_notselected
                val values = Charge.toList()
                val size_val = values.size
                val counter = values.count { it.toUInt() == 1u }
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(color = MaterialTheme.colorScheme.secondaryContainer),
                    horizontalArrangement = Arrangement.Center
                )
                {
                    Text(
                        modifier = Modifier
                            .padding(top = 5.dp, bottom = 5.dp),
                        text = "Зарядов: $counter/$size_val",
                        style = TextStyle(
                            fontSize = MaterialTheme.typography.titleSmall.fontSize,
                            fontWeight = FontWeight.Bold,
                            color = MaterialTheme.colorScheme.onSecondaryContainer,
                            textAlign = TextAlign.Center
                        )
                    )
                }
                LazyVerticalGrid(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(120.dp)
                        .background(color = MaterialTheme.colorScheme.secondaryContainer),
                    columns = GridCells.Fixed(5),
                    userScrollEnabled = false
                )
                {
                    items(size_val)
                    {
                        val selected = remember { mutableStateOf(false) }
                        val index = it + 1
                        if (Charge.get(it).toUInt() == 1u) {
                            Column(horizontalAlignment = Alignment.CenterHorizontally)
                            {
                                Text(
                                    modifier = Modifier
                                        .padding(
                                            top = 5.dp,
                                            bottom = 5.dp,
                                            start = 3.dp,
                                            end = 3.dp
                                        )
                                        .width(20.dp)
                                        .height(20.dp)
                                        .background(
                                            color = color,
                                            shape = RoundedCornerShape(5.dp)
                                        )
                                        .selectable(
                                            selected = selected.value,
                                            onClick = {
                                                selected.value = !selected.value
                                                if (selected.value) {
                                                    Underminning0.set(index = it, value = 1u)
                                                    color = color_selected
                                                } else {
                                                    Underminning0.set(index = it, value = 0u)
                                                    color = color_notselected
                                                }
                                            }
                                        ),
                                    text = "$index",
                                    style = TextStyle(
                                        fontSize = MaterialTheme.typography.labelLarge.fontSize,
                                        fontWeight = FontWeight.Bold,
                                        color = MaterialTheme.colorScheme.onSecondary,
                                        textAlign = TextAlign.Center
                                    )
                                )
                            }
                        } else {
                            Column(horizontalAlignment = Alignment.CenterHorizontally)
                            {
                                Text(
                                    modifier = Modifier
                                        .padding(
                                            top = 5.dp,
                                            bottom = 5.dp,
                                            start = 3.dp,
                                            end = 3.dp
                                        )
                                        .width(20.dp)
                                        .height(20.dp)
                                        .background(
                                            color = MaterialTheme.colorScheme.error,
                                            shape = RoundedCornerShape(5.dp)
                                        ),
                                    text = "$index",
                                    style = TextStyle(
                                        fontSize = MaterialTheme.typography.labelLarge.fontSize,
                                        fontWeight = FontWeight.Bold,
                                        color = MaterialTheme.colorScheme.onError,
                                        textAlign = TextAlign.Center
                                    )
                                )
                            }
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
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(color = MaterialTheme.colorScheme.secondaryContainer),
                horizontalArrangement = Arrangement.Center
            )
            {
                Button(
                    modifier = Modifier
                        .padding(end = 120.dp)
                        .width(120.dp),
                    onClick = {
                        /*viewModel.SendMessage54(
                            context = context,
                            MB_id = MB_id,
                            MK_id = MK_id,
                            Underminning0 = Underminning0
                        )*/
                    },
                    colors = ButtonDefaults.buttonColors(containerColor = MaterialTheme.colorScheme.secondary)
                )
                {
                    Text(
                        text = "Подрыв",
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
                    onClick = {
                        /*viewModel.SendMessage38(
                            context = context,
                            MB_id = MB_id,
                            MK_id = MK_id
                        )*/
                    },
                    colors = ButtonDefaults.buttonColors(containerColor = MaterialTheme.colorScheme.secondary)
                )
                {
                    Text(
                        text = "Заряды",
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
                        .padding(end = 120.dp)
                        .width(120.dp),
                    onClick = {
                        /*viewModel.SendMessage20(
                            context = context,
                            MB_id = MB_id,
                            MK_id = MK_id
                        )*/
                    },
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
                    onClick = {
                        /*viewModel.SendMessage62(
                            context = context,
                            MB_id = MB_id,
                            MK_id = MK_id
                        )*/
                    },
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
