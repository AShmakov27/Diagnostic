package com.diplom.mkp_mbsy_diagnostic.ui.screens

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
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.Email
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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.runtime.*
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.diplom.mkp_mbsy_diagnostic.model.MBSYMessage
import com.diplom.mkp_mbsy_diagnostic.model.Message_17
import com.diplom.mkp_mbsy_diagnostic.model.Message_21
import com.diplom.mkp_mbsy_diagnostic.model.Message_63
import com.diplom.mkp_mbsy_diagnostic.ui.navigation.Routes
import com.diplom.mkp_mbsy_diagnostic.ui.theme.MKP_MBSY_diagnosticTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MBSYScreen(
    navController: NavHostController,
    data: List<MBSYMessage>/*,
    onSendArrayClicked: () -> Unit,
    on16Clicked: () -> Unit,
    on20Clicked: () -> Unit,
    on62Clicked: () -> Unit,
    onDeleteClick: () -> Unit,
    onSaveClick: () -> Unit*/
) {
    Scaffold(
        topBar = {
            TopBar(title = "Мобильная диагностика МКП и МБСУ. Связь с МБСУ")
        },
        content = {
            Box(modifier = Modifier.padding(it))
            {
                MBSYContent(
                    navController = navController,
                    data = data/*,
                    on16licked = on16licked,
                    on20Clicked = on20Clicked,
                    on62Clicked = on62Clicked,
                    onDeleteClick = onDeleteClick,
                    onSaveClick = onSaveClick*/
                )
            }
        },
        floatingActionButton = {
            FloatingActionButton(
                containerColor = MaterialTheme.colorScheme.primary,
                contentColor = MaterialTheme.colorScheme.onPrimary,
                shape = CircleShape,
                onClick = {}/*onSendArrayClicked*/,
            ) {
                Icon(imageVector = Icons.Filled.Email, contentDescription = "Send Array")
            }
        },
        floatingActionButtonPosition = FabPosition.End
    )
}

@OptIn(ExperimentalUnsignedTypes::class, ExperimentalMaterial3Api::class)
@Composable
fun MBSYContent(
    navController: NavHostController,
    data: List<MBSYMessage>/*,
    on16licked: () -> Unit,
    on20Clicked: () -> Unit,
    on62Clicked: () -> Unit,
    onDeleteClick: () -> Unit,
    onSaveClick: () -> Unit*/

) {
    Column (modifier = Modifier
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
                    MB_id = it.Mes17.MB_id.toString(),
                    Version = it.Mes17.Version.toString(),
                    PodVersion = it.Mes17.PodVersion.toString(),
                    Month = it.Mes17.Month.toString(),
                    Year = it.Mes17.Year.toString(),
                    kolErr = it.Mes21.KolErr.toString(),
                    Sec = it.Mes21.Sec.toString(),
                    Param1 = it.Mes63.Param1.toString(),
                    Param2 = it.Mes63.Param2.toString(),
                    Param3 = it.Mes63.Param3.toString(),
                    Param4 = it.Mes63.Param4.toString(),
                    Param5 = it.Mes63.Param5.toString(),
                    Param6 = it.Mes63.Param6.toString()/*,
                    on16licked = on16licked,
                    on20Clicked = on20Clicked,
                    on62Clicked = on62Clicked,
                    onDeleteClick = onDeleteClick,
                    onSaveClick = onSaveClick*/
                )
            }
        }
    }
}

@ExperimentalMaterial3Api
@Composable
fun MessageMBSYView(navController: NavHostController,
                MB_id: String, Version: String, PodVersion: String, Month: String, Year: String,
                kolErr: String, Sec: String,
                Param1: String, Param2: String, Param3: String, Param4: String, Param5: String, Param6: String
                /*,on16licked: () -> Unit, on20Clicked: () -> Unit, on62Clicked: () -> Unit, onDeleteClick: () -> Unit, onSaveClick: () -> Unit*/)
{
    var expandedState by remember { mutableStateOf(true)}
        val rotationState by animateFloatAsState(
            targetValue = if (expandedState) 180f else 0f
        )
        Card (
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
            Row (modifier = Modifier
                .fillMaxWidth()
                .background(color = MaterialTheme.colorScheme.secondaryContainer)
            ){
                Text(
                    text = "МБСУ №$MB_id",
                    style = TextStyle(
                        fontSize = MaterialTheme.typography.titleLarge.fontSize,
                        fontWeight = FontWeight.Bold,
                        color = MaterialTheme.colorScheme.onSecondaryContainer
                    ),
                    modifier = Modifier.padding(start = 5.dp, end = 10.dp)
                )
                Row (modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.End)
                {
                    IconButton(modifier = Modifier
                        .padding(end = 5.dp)
                        .rotate(rotationState),
                        onClick = { expandedState = !expandedState })
                    {
                        Icon(modifier = Modifier.fillMaxSize(), imageVector = Icons.Default.ArrowDropDown, contentDescription = "Close", tint = MaterialTheme.colorScheme.onSecondaryContainer)
                    }
                }
            }
            if(expandedState)
            {
                Row (modifier = Modifier
                    .height(20.dp)
                    .fillMaxWidth()
                    .background(color = MaterialTheme.colorScheme.secondaryContainer)
                ){
                    Row (modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.End)
                    {
                        IconButton(modifier = Modifier
                            .padding(end = 5.dp),
                            onClick = { /*onDeleteClick*/ })
                        {
                            Icon(modifier = Modifier.fillMaxSize(), imageVector = Icons.Default.Delete, contentDescription = "Delete", tint = Color.Red)
                        }
                        IconButton(modifier = Modifier
                            .padding(end = 5.dp),
                            onClick = { /*onSaveClick*/ })
                        {
                            Icon(modifier = Modifier.fillMaxSize(), imageVector = Icons.Default.AddCircle, contentDescription = "Save", tint = MaterialTheme.colorScheme.onSecondaryContainer)
                        }
                    }
                }
                Spacer(modifier = Modifier
                    .padding(start = 5.dp, end = 5.dp)
                    .height(3.dp)
                    .fillMaxWidth()
                    .background(color = MaterialTheme.colorScheme.onSecondaryContainer))
                Column (modifier = Modifier
                    .fillMaxWidth()
                    .background(color = MaterialTheme.colorScheme.secondaryContainer))
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
                Spacer(modifier = Modifier
                    .padding(start = 5.dp, end = 5.dp)
                    .height(3.dp)
                    .fillMaxWidth()
                    .background(color = MaterialTheme.colorScheme.onSecondaryContainer))
                Column (modifier = Modifier
                    .fillMaxWidth()
                    .background(color = MaterialTheme.colorScheme.secondaryContainer))
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
                Spacer(modifier = Modifier
                    .padding(start = 5.dp, end = 5.dp)
                    .height(3.dp)
                    .fillMaxWidth()
                    .background(color = MaterialTheme.colorScheme.onSecondaryContainer))
                Column (modifier = Modifier
                    .fillMaxWidth()
                    .background(color = MaterialTheme.colorScheme.secondaryContainer))
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
                Spacer(modifier = Modifier
                    .padding(start = 5.dp, end = 5.dp)
                    .height(3.dp)
                    .fillMaxWidth()
                    .background(color = MaterialTheme.colorScheme.onSecondaryContainer))
                Row (modifier = Modifier
                    .fillMaxWidth()
                    .background(color = MaterialTheme.colorScheme.secondaryContainer),
                    horizontalArrangement = Arrangement.Center)
                {
                    Button(onClick = { navController.navigate(Routes.MKP.route) },
                        colors = ButtonDefaults.buttonColors(containerColor = MaterialTheme.colorScheme.secondary))
                    {
                        Text(text = "Управление МКП",
                            style = TextStyle(
                                fontSize = MaterialTheme.typography.labelSmall.fontSize,
                                fontWeight = FontWeight.Bold,
                                color = MaterialTheme.colorScheme.onSecondary,
                                textAlign = TextAlign.Center
                            ))
                    }
                }
                Row (modifier = Modifier
                    .fillMaxWidth()
                    .background(color = MaterialTheme.colorScheme.secondaryContainer),
                    horizontalArrangement = Arrangement.Center)
                {
                    Button(modifier = Modifier
                        .padding(end = 5.dp)
                        .width(120.dp),
                        onClick = { /*on16Clicked*/ },
                        colors = ButtonDefaults.buttonColors(containerColor = MaterialTheme.colorScheme.secondary)
                    )
                    {
                        Text(text = "Версия",
                            style = TextStyle(
                                fontSize = MaterialTheme.typography.labelSmall.fontSize,
                                fontWeight = FontWeight.Bold,
                                color = MaterialTheme.colorScheme.onSecondary,
                                textAlign = TextAlign.Center
                            ))
                    }
                    Button(modifier = Modifier
                        .padding(end = 5.dp)
                        .width(120.dp),
                        onClick = { /*on20Clicked*/ },
                        colors = ButtonDefaults.buttonColors(containerColor = MaterialTheme.colorScheme.secondary))
                    {
                        Text(text = "Ошибки",
                            style = TextStyle(
                                fontSize = MaterialTheme.typography.labelSmall.fontSize,
                                fontWeight = FontWeight.Bold,
                                color = MaterialTheme.colorScheme.onSecondary,
                                textAlign = TextAlign.Center
                            ))
                    }
                    Button(modifier = Modifier
                        .padding(end = 5.dp)
                        .width(120.dp),
                        onClick = { /*on62Clicked*/ },
                        colors = ButtonDefaults.buttonColors(containerColor = MaterialTheme.colorScheme.secondary))
                    {
                        Text(text = "Напряжение",
                            style = TextStyle(
                                fontSize = MaterialTheme.typography.labelSmall.fontSize,
                                fontWeight = FontWeight.Bold,
                                color = MaterialTheme.colorScheme.onSecondary,
                                textAlign = TextAlign.Center
                            ))
                    }
                }
            }
    }
}

@Preview
@Composable
fun MBSYDarkPreview(){
    val testlist = mutableListOf<MBSYMessage>()
    testlist.add(MBSYMessage(
        Message_17(2u,2u,2u,2u,1u,1u,1,1,1,23),
        Message_21(2u,2u,2u,2u,1u,1u,0u,24u),
        Message_63(2u,2u,2u,2u,1u,1u,1u,1u,1u,1u,1u,1u)))
    testlist.add(MBSYMessage(
        Message_17(2u,2u,2u,2u,2u,1u,2,2,2,23),
        Message_21(2u,2u,2u,2u,2u,2u,2u,24u),
        Message_63(2u,2u,2u,2u,2u,2u,2u,2u,2u,2u,2u,2u)))
    MKP_MBSY_diagnosticTheme(darkTheme = true) {
        MBSYScreen(navController = rememberNavController(), data = testlist)
    }
}

@Preview
@Composable
fun MBSYLightPreview(){
    val testlist = mutableListOf<MBSYMessage>()
    testlist.add(MBSYMessage(
        Message_17(2u,2u,2u,2u,1u,1u,1,1,1,23),
        Message_21(2u,2u,2u,2u,1u,1u,0u,24u),
        Message_63(2u,2u,2u,2u,1u,1u,1u,1u,1u,1u,1u,1u)))
    testlist.add(MBSYMessage(
        Message_17(2u,2u,2u,2u,2u,1u,2,2,2,23),
        Message_21(2u,2u,2u,2u,2u,2u,2u,24u),
        Message_63(2u,2u,2u,2u,2u,2u,2u,2u,2u,2u,2u,2u)))
    MKP_MBSY_diagnosticTheme(darkTheme = false) {
        MBSYScreen(navController = rememberNavController(), data = testlist)
    }
}


@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun MBSYViewLightPreview(){
    MKP_MBSY_diagnosticTheme(darkTheme = false) {
        MessageMBSYView(
            MB_id = "1",
            Version = "1",
            PodVersion = "1",
            Month = "1",
            Year = "1",
            kolErr = "0",
            Sec = "1",
            Param1 = "1",
            Param2 = "1",
            Param3 = "1",
            Param4 = "1",
            Param5 = "1",
            Param6 = "1",
            navController = rememberNavController()
        )
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun MBSYViewDarkPreview(){
    MKP_MBSY_diagnosticTheme(darkTheme = true) {
        MessageMBSYView(
            MB_id = "1",
            Version = "1",
            PodVersion = "1",
            Month = "1",
            Year = "1",
            kolErr = "0",
            Sec = "1",
            Param1 = "1",
            Param2 = "1",
            Param3 = "1",
            Param4 = "1",
            Param5 = "1",
            Param6 = "1",
            navController = rememberNavController()
        )
    }
}