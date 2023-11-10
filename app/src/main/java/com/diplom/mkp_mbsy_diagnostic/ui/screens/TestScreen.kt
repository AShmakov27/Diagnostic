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
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.PlayArrow
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
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.diplom.mkp_mbsy_diagnostic.data.usb.Message_16
import com.diplom.mkp_mbsy_diagnostic.viewmodel.TestViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TestScreen(
    viewModel: TestViewModel = hiltViewModel()/*,
    onDeleteClick: () -> Unit,
    onSaveClick: () -> Unit*/
) {
    val context = LocalContext.current
    Scaffold(
        topBar = {
            TopBar(title = "Мобильная диагностика МКП и МБСУ. Связь c МКП")
        },
        content = {
            Box(modifier = Modifier.padding(it))
            {
                TestContent(
                    data = viewModel.data_parsed/*,
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
                onClick = { viewModel.TestReading(context) }
            ) {
                Icon(imageVector = Icons.Filled.PlayArrow, contentDescription = "StartTest")
            }
        },
        floatingActionButtonPosition = FabPosition.End
    )
}

@Composable
fun TestContent(
    data: Message_16?/*,
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
        if (data != null) {
            TestMessageView(
                id_head = data.id_head.toString(),
                id = data.id.toString(),
                LoSumm = data.LoSumm.toString(),
                HiSumm = data.HiSumm.toString(),
                MB_id = data.MB_id.toString(),
                MK_id = data.MK_id.toString()
            )
        }
    }
}

@Composable
fun TestMessageView(
    id_head: String,
    id: String,
    LoSumm: String,
    HiSumm: String,
    MB_id: String,
    MK_id: String,
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
                text = "МБСУ №$MB_id МКП №$MK_id",
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
            ) {
                Row(
                    horizontalArrangement = Arrangement.Start
                ) {
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
                    text = "ID_head: $id_head",
                    style = TextStyle(
                        fontSize = MaterialTheme.typography.bodyLarge.fontSize,
                        fontWeight = FontWeight.Normal,
                        color = MaterialTheme.colorScheme.onSecondaryContainer
                    ),
                    modifier = Modifier.padding(start = 5.dp, end = 10.dp)
                )
                Text(
                    text = "ID: $id",
                    style = TextStyle(
                        fontSize = MaterialTheme.typography.bodyLarge.fontSize,
                        fontWeight = FontWeight.Normal,
                        color = MaterialTheme.colorScheme.onSecondaryContainer
                    ),
                    modifier = Modifier.padding(start = 5.dp, end = 10.dp)
                )
                Text(
                    text = "HiSumm: $HiSumm",
                    style = TextStyle(
                        fontSize = MaterialTheme.typography.bodyLarge.fontSize,
                        fontWeight = FontWeight.Normal,
                        color = MaterialTheme.colorScheme.onSecondaryContainer
                    ),
                    modifier = Modifier.padding(start = 5.dp, end = 10.dp)
                )
                Text(
                    text = "LoSumm: $LoSumm",
                    style = TextStyle(
                        fontSize = MaterialTheme.typography.bodyLarge.fontSize,
                        fontWeight = FontWeight.Normal,
                        color = MaterialTheme.colorScheme.onSecondaryContainer
                    ),
                    modifier = Modifier.padding(start = 5.dp, end = 10.dp)
                )
            }
        }
    }
}