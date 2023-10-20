package com.diplom.mkp_mbsy_diagnostic.ui.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
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
            onDismissRequest = onDismiss,
            title = { Text("Введите границы интервала номеров устройств") },
            confirmButton = {
                Button(onClick = {
                    onConfirm(text1, text2)
                    onDismiss()
                }) {
                    Text("Отправить")
                }
            },
            dismissButton = {
                Button(onClick = onDismiss) {
                    Text("Отмена")
                }
            },
            text = {
                Column {
                    BasicTextField(
                        value = text1,
                        onValueChange = { text1 = it },
                        keyboardOptions = KeyboardOptions.Default.copy(
                            imeAction = androidx.compose.ui.text.input.ImeAction.Done
                        ),
                        keyboardActions = KeyboardActions(
                            onDone = {
                                val inputText = text1
                                val inputText2 = text2

                                if (inputText.isNotEmpty() && inputText2.isNotEmpty()) {
                                    onConfirm(text1, text2)
                                    onDismiss()
                                }
                            }
                        ),
                        modifier = Modifier
                            .fillMaxWidth()
                            .border(
                                BorderStroke(
                                    width = 2.dp,
                                    color = MaterialTheme.colorScheme.primary
                                ),
                                shape = RoundedCornerShape(50)
                            )
                    )
                    Spacer(modifier = Modifier.height(16.dp))
                    BasicTextField(
                        value = text2,
                        onValueChange = { text2 = it },
                        keyboardOptions = KeyboardOptions.Default.copy(
                            imeAction = androidx.compose.ui.text.input.ImeAction.Done
                        ),
                        keyboardActions = KeyboardActions(
                            onDone = {
                                val inputText = text1
                                val inputText2 = text2

                                if (inputText.isNotEmpty() && inputText2.isNotEmpty()) {
                                    onConfirm(text1, text2)
                                    onDismiss()
                                }
                            }
                        ),
                        modifier = Modifier
                            .fillMaxWidth()
                            .border(
                                BorderStroke(
                                    width = 2.dp,
                                    color = MaterialTheme.colorScheme.primary
                                ),
                                shape = RoundedCornerShape(50)
                            )
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