package com.diplom.mkp_mbsy_diagnostic.ui.navigation

import android.util.Log
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.diplom.mkp_mbsy_diagnostic.model.MBSYMessage
import com.diplom.mkp_mbsy_diagnostic.model.MKPMessage
import com.diplom.mkp_mbsy_diagnostic.ui.screens.ChooseTypeScreen
import com.diplom.mkp_mbsy_diagnostic.ui.screens.MBSYScreen
import com.diplom.mkp_mbsy_diagnostic.ui.screens.MKPScreen


@Composable
fun NavGraph() {

    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = Routes.Choose.route)
    {
        composable(Routes.Choose.route) {
            ChooseTypeScreen(navController = navController)
        }
        composable(Routes.MBSY.route) {
            MBSYScreen(navController = navController, data = emptyList<MBSYMessage>(), onSendArrayClicked = { start, end -> Log.d("VALUE", (start+end).toString()) })
        }
        composable(Routes.MKP.route) {
            MKPScreen(data = emptyList<MKPMessage>())
        }
    }
}