package com.diplom.mkp_mbsy_diagnostic

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.diplom.mkp_mbsy_diagnostic.ui.navigation.NavGraph
import com.diplom.mkp_mbsy_diagnostic.ui.theme.MKP_MBSY_diagnosticTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MKP_MBSY_diagnosticTheme{
                NavGraph()
            }
        }
    }
}