package com.diplom.mkp_mbsy_diagnostic.ui.screens

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import com.diplom.mkp_mbsy_diagnostic.ui.theme.MKP_MBSY_diagnosticTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopBar(title: String)
{
    TopAppBar(title =
    { Text(text = title,
        style = TextStyle(
            fontSize = MaterialTheme.typography.titleLarge.fontSize,
            color = MaterialTheme.colorScheme.onPrimary)
    )
    },
        colors = TopAppBarDefaults.smallTopAppBarColors(containerColor = MaterialTheme.colorScheme.primary)
    )
}


@Preview
@Composable
fun TopBarDarkPreview(){
    MKP_MBSY_diagnosticTheme(darkTheme = true) {
        TopBar(title = "Preview")
    }
}

@Preview
@Composable
fun TopBarLightPreview(){
    MKP_MBSY_diagnosticTheme(darkTheme = false) {
        TopBar(title = "Preview")
    }
}
