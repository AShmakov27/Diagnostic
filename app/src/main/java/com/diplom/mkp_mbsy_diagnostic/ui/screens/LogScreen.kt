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
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.diplom.mkp_mbsy_diagnostic.utils.MSSLog.Flag
import com.diplom.mkp_mbsy_diagnostic.utils.MSSLog.MsgFromLog
import com.diplom.mkp_mbsy_diagnostic.utils.MSSLog.PD_chooser_be
import com.diplom.mkp_mbsy_diagnostic.utils.MSSLog.PD_chooser_ikrl
import com.diplom.mkp_mbsy_diagnostic.utils.MSSLog.PD_chooser_pan
import com.diplom.mkp_mbsy_diagnostic.utils.MSSLog.PD_chooser_pms
import com.diplom.mkp_mbsy_diagnostic.utils.MSSLog.TStructField
import com.diplom.mkp_mbsy_diagnostic.utils.MSSLog.process_data_be
import com.diplom.mkp_mbsy_diagnostic.utils.MSSLog.process_data_ikrl
import com.diplom.mkp_mbsy_diagnostic.utils.MSSLog.process_data_pan
import com.diplom.mkp_mbsy_diagnostic.utils.MSSLog.process_data_pms
import com.diplom.mkp_mbsy_diagnostic.viewmodel.LogViewModel

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
                viewModel.onFilePathsListChange(context, it)
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
                    data = data,
                    lib = viewModel.libName
                )
            }
        },
        floatingActionButton = {
            SmallFloatingActionButton(
                containerColor = MaterialTheme.colorScheme.primary,
                contentColor = MaterialTheme.colorScheme.onPrimary,
                shape = CircleShape,
                onClick = { filePickerLauncher.launch(arrayOf("*/*")) }
            ) {
                Icon(imageVector = Icons.Filled.List, contentDescription = "File choose")
            }
        }
    )
}

@Composable
fun LogContent(
    data: List<MsgFromLog>,
    lib: String
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
                    lib = lib,
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
    lib: String,
    pos: Int,
    incoming_message: Byte,
    id: UInt,
    date_time: String,
    size: Int,
    data: ByteArray
) {
    var showData by remember { mutableStateOf(false) }
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
                    text = date_time, style = TextStyle(
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
                var msg: List<Comparable<*>>? = null
                var PD: List<TStructField>? = null
                when (lib) {
                    "CommMessages_pms"->
                    {
                        PD = PD_chooser_pms(id.toInt())
                        msg = process_data_pms(id.toInt(), data)
                    }
                    "CommMessages_smo" ->
                    {
                        PD = PD_chooser_pms(id.toInt())
                        msg = process_data_pms(id.toInt(), data)
                    }
                    "CommMessages_pan" ->
                    {
                        PD = PD_chooser_pan(id.toInt())
                        msg = process_data_pan(id.toInt(), data)
                    }
                    "CommMessages_ikrl" ->
                    {
                        PD = PD_chooser_ikrl(id.toInt())
                        msg = process_data_ikrl(id.toInt(), data)
                    }
                    "CommMessages_be3" ->
                    {
                        PD = PD_chooser_be(id.toInt())
                        msg = process_data_be(id.toInt(), data)
                    }
                }
                var additional = ""
                if (PD != null) {
                    if (msg != null) {
                        for (i in msg.indices) {

                            if (PD[i].m_nEnumOp == Flag.T_OP_EQ) {
                                for (j in PD[i].m_nEnumValue.indices) {
                                    if (PD[i].m_nEnumValue[j].toString() == msg[i].toString()) {
                                        additional = PD[i].m_sEnumValue[j]
                                        break
                                    } else {
                                        additional = PD[i].m_elseEnumValue
                                    }
                                }
                            }

                            var tire = ""
                            if (additional != "") {
                                tire = "--"
                            }

                            Text(
                                text = "${PD[i].m_sName}: ${msg[i]} $tire $additional",
                                style = TextStyle(
                                    fontSize = MaterialTheme.typography.titleMedium.fontSize,
                                    fontWeight = FontWeight.Bold,
                                    color = MaterialTheme.colorScheme.onSecondaryContainer
                                ),
                                modifier = Modifier.padding(start = 5.dp, end = 10.dp)
                            )
                            additional = ""
                            Spacer(
                                modifier = Modifier
                                    .padding(start = 5.dp, end = 5.dp)
                                    .height(1.dp)
                                    .fillMaxWidth()
                                    .background(color = MaterialTheme.colorScheme.onSecondaryContainer)
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