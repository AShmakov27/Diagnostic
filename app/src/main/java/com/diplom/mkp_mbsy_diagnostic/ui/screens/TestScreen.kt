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
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalLifecycleOwner
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.diplom.mkp_mbsy_diagnostic.data.usb.Header
import com.diplom.mkp_mbsy_diagnostic.viewmodel.TestViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TestScreen(
    viewModel: TestViewModel = hiltViewModel()
) {
    val data by viewModel.data_list.observeAsState(initial = emptyList())
    Scaffold(
        topBar = {
            TopBar(title = "Мобильная диагностика МКП и МБСУ. Тестирование")
        },
        content = {
            Box(modifier = Modifier.padding(it))
            {
                TestContent(
                    viewModel = viewModel,
                    data = data
                )
            }
        }
    )
}

@Composable
fun TestContent(
    viewModel: TestViewModel = hiltViewModel(),
    data: List<Header>
) {
    val lifeCycleOwner = LocalLifecycleOwner.current
    val context = LocalContext.current
    var showDialog by remember { mutableStateOf(false) }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(start = 0.dp, end = 0.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    )
    {
        LazyColumn(
            modifier = Modifier
                .weight(1f)
                .height(300.dp)
        )
        {
            items(items = data, key = { it.id_head.toString() }) {
                TestMessageView(
                    id_head = it.id_head.toString(),
                    id = it.id.toString(),
                    LoSumm = it.LoSumm.toString(),
                    HiSumm = it.HiSumm.toString()
                )
            }
        }
        Column(
            modifier = Modifier
                .padding(top = 5.dp, start = 5.dp, end = 5.dp)
                .fillMaxWidth()
        ) {
            Button(modifier = Modifier.fillMaxWidth(),
                onClick = { viewModel.TestReading(context, lifeCycleOwner) }) {
                Text(text = "Тестирование чтения")
            }
            Button(modifier = Modifier.fillMaxWidth(),
                onClick = { viewModel.TestWriting(context) }) {
                Text(text = "Тестирование записи")
            }
            Button(modifier = Modifier.fillMaxWidth(),
                onClick = { showDialog = true }) {
                Text(text = "Тестирование записи MSS")
            }
        }
        NumberDialog(
            showDialog = showDialog,
            onDismiss = { showDialog = false },
            onConfirm = { num -> viewModel.TestMSSWrite(num.toInt()) })
    }
}

@Composable
fun TestMessageView(
    id_head: String,
    id: String,
    LoSumm: String,
    HiSumm: String
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
                text = "ID_HEAD $id_head ID $id",
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
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(color = MaterialTheme.colorScheme.secondaryContainer)
            )
            {
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