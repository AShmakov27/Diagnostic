package com.diplom.mkp_mbsy_diagnostic.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.diplom.mkp_mbsy_diagnostic.ui.navigation.Routes
import com.diplom.mkp_mbsy_diagnostic.ui.theme.MKP_MBSY_diagnosticTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ChooseTypeScreen(
    navController: NavHostController
) {
    Scaffold(
        topBar = {
            TopBar(title = "Мобильная диагностика МКП и МБСУ")
        },
        content = {
            Box(modifier = Modifier.padding(it)) {
                ChooseTypeContent(
                    navController = navController
                )
            }
        }
    )
}

@Composable
fun ChooseTypeContent(
    navController: NavHostController
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(start = 12.dp, end = 12.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    )
    {
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        )
        {
            Text(
                text = "Выберите тип связи",
                style = TextStyle(
                    fontSize = MaterialTheme.typography.titleLarge.fontSize
                )
            )
        }
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        )
        {
            Button(
                modifier = Modifier.fillMaxWidth(),
                onClick = { navController.navigate(Routes.MKP.route) },
            ) {
                Text(text = "Связь с МКП")
            }
        }
        Spacer(modifier = Modifier.height(12.dp))
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        )
        {
            Button(
                modifier = Modifier.fillMaxWidth(),
                onClick = { navController.navigate(Routes.MBSY.route) },
            ) {
                Text(text = "Связь с МБСУ")
            }
        }
        Spacer(modifier = Modifier.height(12.dp))
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        )
        {
            Button(
                modifier = Modifier.fillMaxWidth(),
                onClick = { navController.navigate(Routes.Log.route) },
            ) {
                Text(text = "Просмотр логов")
            }
        }
        Spacer(modifier = Modifier.height(12.dp))
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        )
        {
            Button(
                modifier = Modifier.fillMaxWidth(),
                onClick = { navController.navigate(Routes.Test.route) },
            ) {
                Text(text = "Тестирование")
            }
        }
    }
}

@Preview
@Composable
fun ChooseScreenDarkPreview() {
    MKP_MBSY_diagnosticTheme(darkTheme = true) {
        ChooseTypeScreen(navController = rememberNavController())
    }
}

@Preview
@Composable
fun ChooseScreenLightPreview() {
    MKP_MBSY_diagnosticTheme(darkTheme = false) {
        ChooseTypeScreen(navController = rememberNavController())
    }
}