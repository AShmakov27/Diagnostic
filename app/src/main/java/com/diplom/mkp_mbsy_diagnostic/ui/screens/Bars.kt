package com.diplom.mkp_mbsy_diagnostic.ui.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.diplom.mkp_mbsy_diagnostic.ui.theme.MKP_MBSY_diagnosticTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopBar(title: String) {
    TopAppBar(
        title =
        {
            Text(
                text = title,
                style = TextStyle(
                    fontSize = MaterialTheme.typography.titleLarge.fontSize,
                    color = MaterialTheme.colorScheme.onPrimary
                )
            )
        },
        colors = TopAppBarDefaults.smallTopAppBarColors(containerColor = MaterialTheme.colorScheme.primary)
    )
}

@Composable
fun IDsDialog(
    showDialog: Boolean,
    onDismiss: () -> Unit,
    onConfirm: (String, String) -> Unit
) {
    var text1 by remember { mutableStateOf("") }
    var text2 by remember { mutableStateOf("") }

    if (showDialog) {
        AlertDialog(
            onDismissRequest = {
                text1 = ""
                text2 = ""
                onDismiss()
            },
            title = {
                Text(
                    text = "Введите границы интервала номеров устройств",
                    style = TextStyle(
                        fontSize = MaterialTheme.typography.titleLarge.fontSize,
                        fontWeight = FontWeight.Bold,
                        color = MaterialTheme.colorScheme.onSecondaryContainer
                    )
                )
            },
            confirmButton = {
                Button(onClick = {
                    if (text1 == "") {
                        text1 = "Введите значение"
                    }
                    if (text2 == "") {
                        text2 = "Введите значение"
                    }
                    if (text1 != "Введите значение" && text2 != "Введите значение") {
                        onConfirm(text1, text2)
                        text1 = ""
                        text2 = ""
                        onDismiss()
                    }
                }) {
                    Text("Отправить")
                }
            },
            dismissButton = {
                Button(onClick = {
                    text1 = ""
                    text2 = ""
                    onDismiss()
                }) {
                    Text("Отмена")
                }
            },
            text = {
                Column {
                    Text(
                        text = "Начало интервала",
                        modifier = Modifier.padding(start = 5.dp),
                        style = TextStyle(
                            fontSize = MaterialTheme.typography.titleMedium.fontSize,
                            fontWeight = FontWeight.Bold,
                            color = MaterialTheme.colorScheme.onSecondaryContainer
                        )
                    )
                    BasicTextField(
                        value = text1,
                        onValueChange = { text1 = it },
                        keyboardOptions = KeyboardOptions(
                            imeAction = androidx.compose.ui.text.input.ImeAction.Done,
                            keyboardType = KeyboardType.Number
                        ),
                        keyboardActions = KeyboardActions(
                            onDone = {
                                if (text1 == "") {
                                    text1 = "Введите значение"
                                }
                                if (text2 == "") {
                                    text2 = "Введите значение"
                                }
                                if (text1 != "Введите значение" && text2 != "Введите значение") {
                                    onConfirm(text1, text2)
                                    text1 = ""
                                    text2 = ""
                                    onDismiss()
                                }
                            }
                        ),
                        modifier = Modifier
                            .height(25.dp)
                            .fillMaxWidth()
                            .border(
                                BorderStroke(
                                    width = 2.dp,
                                    color = MaterialTheme.colorScheme.primary
                                ),
                                shape = RoundedCornerShape(15)
                            )
                            .padding(horizontal = 5.dp, vertical = 5.dp)
                    )
                    Spacer(modifier = Modifier.height(16.dp))
                    Text(
                        text = "Конец интервала",
                        modifier = Modifier.padding(start = 5.dp),
                        style = TextStyle(
                            fontSize = MaterialTheme.typography.titleMedium.fontSize,
                            fontWeight = FontWeight.Bold,
                            color = MaterialTheme.colorScheme.onSecondaryContainer
                        )
                    )
                    BasicTextField(
                        value = text2,
                        onValueChange = { text2 = it },
                        keyboardOptions = KeyboardOptions(
                            imeAction = androidx.compose.ui.text.input.ImeAction.Done,
                            keyboardType = KeyboardType.Number
                        ),
                        keyboardActions = KeyboardActions(
                            onDone = {
                                if (text1 == "") {
                                    text1 = "Введите значение"
                                }
                                if (text2 == "") {
                                    text2 = "Введите значение"
                                }
                                if (text1 != "Введите значение" && text2 != "Введите значение") {
                                    onConfirm(text1, text2)
                                    text1 = ""
                                    text2 = ""
                                    onDismiss()
                                }
                            }
                        ),
                        modifier = Modifier
                            .height(25.dp)
                            .fillMaxWidth()
                            .border(
                                BorderStroke(
                                    width = 2.dp,
                                    color = MaterialTheme.colorScheme.primary
                                ),
                                shape = RoundedCornerShape(15)
                            )
                            .padding(horizontal = 5.dp, vertical = 5.dp)
                    )
                }
            }
        )
    }
}

@Composable
fun NumberDialog(
    showDialog: Boolean,
    onDismiss: () -> Unit,
    onConfirm: (String) -> Unit
) {
    var text1 by remember { mutableStateOf("") }

    if (showDialog) {
        AlertDialog(
            onDismissRequest = {
                text1 = ""
                onDismiss()
            },
            title = {
                Text(
                    text = "Введите кол-во записей",
                    style = TextStyle(
                        fontSize = MaterialTheme.typography.titleLarge.fontSize,
                        fontWeight = FontWeight.Bold,
                        color = MaterialTheme.colorScheme.onSecondaryContainer
                    )
                )
            },
            confirmButton = {
                Button(onClick = {
                    if (text1 == "") {
                        text1 = "Введите значение"
                    }
                    if (text1 != "Введите значение") {
                        onConfirm(text1)
                        text1 = ""
                        onDismiss()
                    }
                }) {
                    Text("Записать")
                }
            },
            dismissButton = {
                Button(onClick = {
                    text1 = ""
                    onDismiss()
                }) {
                    Text("Отмена")
                }
            },
            text = {
                Column {
                    Text(
                        text = "Введите кол-во записей",
                        modifier = Modifier.padding(start = 5.dp),
                        style = TextStyle(
                            fontSize = MaterialTheme.typography.titleMedium.fontSize,
                            fontWeight = FontWeight.Bold,
                            color = MaterialTheme.colorScheme.onSecondaryContainer
                        )
                    )
                    BasicTextField(
                        value = text1,
                        onValueChange = { text1 = it },
                        keyboardOptions = KeyboardOptions(
                            imeAction = androidx.compose.ui.text.input.ImeAction.Done,
                            keyboardType = KeyboardType.Number
                        ),
                        keyboardActions = KeyboardActions(
                            onDone = {
                                if (text1 == "") {
                                    text1 = "Введите значение"
                                }
                                if (text1 != "Введите значение") {
                                    onConfirm(text1)
                                    text1 = ""
                                    onDismiss()
                                }
                            }
                        ),
                        modifier = Modifier
                            .height(25.dp)
                            .fillMaxWidth()
                            .border(
                                BorderStroke(
                                    width = 2.dp,
                                    color = MaterialTheme.colorScheme.primary
                                ),
                                shape = RoundedCornerShape(15)
                            )
                            .padding(horizontal = 5.dp, vertical = 5.dp)
                    )
                }
            }
        )
    }
}

@Composable
fun IDsMKPDialog(
    showDialog: Boolean,
    onDismiss: () -> Unit,
    onConfirm: (String, String, String) -> Unit
) {
    var text1 by remember { mutableStateOf("") }
    var text2 by remember { mutableStateOf("") }
    var text3 by remember { mutableStateOf("") }

    if (showDialog) {
        AlertDialog(
            onDismissRequest = {
                text1 = ""
                text2 = ""
                text3 = ""
                onDismiss()
            },
            title = {
                Text(
                    text = "Введите номер МБСУ и границы интервала номеров устройств",
                    style = TextStyle(
                        fontSize = MaterialTheme.typography.titleLarge.fontSize,
                        fontWeight = FontWeight.Bold,
                        color = MaterialTheme.colorScheme.onSecondaryContainer
                    )
                )
            },
            confirmButton = {
                Button(onClick = {
                    if (text1 == "") {
                        text1 = "Введите значение"
                    }
                    if (text2 == "") {
                        text2 = "Введите значение"
                    }
                    if (text3 == "") {
                        text3 = "Введите значение"
                    }
                    if (text1 != "Введите значение" && text2 != "Введите значение" && text3 != "Введите значение") {
                        onConfirm(text1, text2, text3)
                        text1 = ""
                        text2 = ""
                        text3 = ""
                        onDismiss()
                    }
                }) {
                    Text("Отправить")
                }
            },
            dismissButton = {
                Button(onClick = {
                    text1 = ""
                    text2 = ""
                    text3 = ""
                    onDismiss()
                }) {
                    Text("Отмена")
                }
            },
            text = {
                Column {
                    Text(
                        text = "Номер МБСУ",
                        modifier = Modifier.padding(start = 5.dp),
                        style = TextStyle(
                            fontSize = MaterialTheme.typography.titleMedium.fontSize,
                            fontWeight = FontWeight.Bold,
                            color = MaterialTheme.colorScheme.onSecondaryContainer
                        )
                    )
                    BasicTextField(
                        value = text1,
                        onValueChange = { text1 = it },
                        keyboardOptions = KeyboardOptions(
                            imeAction = androidx.compose.ui.text.input.ImeAction.Done,
                            keyboardType = KeyboardType.Number
                        ),
                        keyboardActions = KeyboardActions(
                            onDone = {
                                if (text1 == "") {
                                    text1 = "Введите значение"
                                }
                                if (text2 == "") {
                                    text2 = "Введите значение"
                                }
                                if (text3 == "") {
                                    text3 = "Введите значение"
                                }
                                if (text1 != "Введите значение" && text2 != "Введите значение" && text3 != "Введите значение") {
                                    onConfirm(text1, text2, text3)
                                    text1 = ""
                                    text2 = ""
                                    text3 = ""
                                    onDismiss()
                                }
                            }
                        ),
                        modifier = Modifier
                            .height(25.dp)
                            .fillMaxWidth()
                            .border(
                                BorderStroke(
                                    width = 2.dp,
                                    color = MaterialTheme.colorScheme.primary
                                ),
                                shape = RoundedCornerShape(15)
                            )
                            .padding(horizontal = 5.dp, vertical = 5.dp)
                    )
                    Spacer(modifier = Modifier.height(16.dp))
                    Text(
                        text = "Начало интервала",
                        modifier = Modifier.padding(start = 5.dp),
                        style = TextStyle(
                            fontSize = MaterialTheme.typography.titleMedium.fontSize,
                            fontWeight = FontWeight.Bold,
                            color = MaterialTheme.colorScheme.onSecondaryContainer
                        )
                    )
                    BasicTextField(
                        value = text2,
                        onValueChange = { text2 = it },
                        keyboardOptions = KeyboardOptions(
                            imeAction = androidx.compose.ui.text.input.ImeAction.Done,
                            keyboardType = KeyboardType.Number
                        ),
                        keyboardActions = KeyboardActions(
                            onDone = {
                                if (text1 == "") {
                                    text1 = "Введите значение"
                                }
                                if (text2 == "") {
                                    text2 = "Введите значение"
                                }
                                if (text3 == "") {
                                    text3 = "Введите значение"
                                }
                                if (text1 != "Введите значение" && text2 != "Введите значение" && text3 != "Введите значение") {
                                    onConfirm(text1, text2, text3)
                                    text1 = ""
                                    text2 = ""
                                    text3 = ""
                                    onDismiss()
                                }
                            }
                        ),
                        modifier = Modifier
                            .height(25.dp)
                            .fillMaxWidth()
                            .border(
                                BorderStroke(
                                    width = 2.dp,
                                    color = MaterialTheme.colorScheme.primary
                                ),
                                shape = RoundedCornerShape(15)
                            )
                            .padding(horizontal = 5.dp, vertical = 5.dp)
                    )
                    Spacer(modifier = Modifier.height(16.dp))
                    Text(
                        text = "Конец интервала",
                        modifier = Modifier.padding(start = 5.dp),
                        style = TextStyle(
                            fontSize = MaterialTheme.typography.titleMedium.fontSize,
                            fontWeight = FontWeight.Bold,
                            color = MaterialTheme.colorScheme.onSecondaryContainer
                        )
                    )
                    BasicTextField(
                        value = text3,
                        onValueChange = { text3 = it },
                        keyboardOptions = KeyboardOptions(
                            imeAction = androidx.compose.ui.text.input.ImeAction.Done,
                            keyboardType = KeyboardType.Number
                        ),
                        keyboardActions = KeyboardActions(
                            onDone = {
                                if (text1 == "") {
                                    text1 = "Введите значение"
                                }
                                if (text2 == "") {
                                    text2 = "Введите значение"
                                }
                                if (text3 == "") {
                                    text3 = "Введите значение"
                                }
                                if (text1 != "Введите значение" && text2 != "Введите значение" && text3 != "Введите значение") {
                                    onConfirm(text1, text2, text3)
                                    text1 = ""
                                    text2 = ""
                                    text3 = ""
                                    onDismiss()
                                }
                            }
                        ),
                        modifier = Modifier
                            .height(25.dp)
                            .fillMaxWidth()
                            .border(
                                BorderStroke(
                                    width = 2.dp,
                                    color = MaterialTheme.colorScheme.primary
                                ),
                                shape = RoundedCornerShape(15)
                            )
                            .padding(horizontal = 5.dp, vertical = 5.dp)
                    )
                }
            }
        )
    }
}

@Preview
@Composable
fun TopBarDarkPreview() {
    MKP_MBSY_diagnosticTheme(darkTheme = true) {
        TopBar(title = "Preview")
    }
}

@Preview
@Composable
fun TopBarLightPreview() {
    MKP_MBSY_diagnosticTheme(darkTheme = false) {
        TopBar(title = "Preview")
    }
}

@Preview
@Composable
fun DialogLightPreview() {
    MKP_MBSY_diagnosticTheme(darkTheme = false) {
        IDsDialog(
            showDialog = true,
            onDismiss = {},
            onConfirm = { text1, text2 ->
                println("Text 1: $text1")
                println("Text 2: $text2")
            }
        )
    }
}

@Preview
@Composable
fun DialogDarkPreview() {
    MKP_MBSY_diagnosticTheme(darkTheme = true) {
        IDsDialog(
            showDialog = true,
            onDismiss = {},
            onConfirm = { text1, text2 ->
                println("Text 1: $text1")
                println("Text 2: $text2")
            }
        )
    }
}

@Preview
@Composable
fun DialogMKPLightPreview() {
    MKP_MBSY_diagnosticTheme(darkTheme = false) {
        IDsMKPDialog(
            showDialog = true,
            onDismiss = {},
            onConfirm = { text1, text2, text3 ->
                println("Text 1: $text1")
                println("Text 2: $text2")
                println("Text 3: $text3")
            }
        )
    }
}

@Preview
@Composable
fun DialogMKPDarkPreview() {
    MKP_MBSY_diagnosticTheme(darkTheme = true) {
        IDsMKPDialog(
            showDialog = true,
            onDismiss = {},
            onConfirm = { text1, text2, text3 ->
                println("Text 1: $text1")
                println("Text 2: $text2")
                println("Text 3: $text3")
            }
        )
    }
}