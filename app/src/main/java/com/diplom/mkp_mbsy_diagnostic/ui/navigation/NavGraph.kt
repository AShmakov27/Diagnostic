package com.diplom.mkp_mbsy_diagnostic.ui.navigation

import android.util.Log
import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.diplom.mkp_mbsy_diagnostic.model.MBSYMessage
import com.diplom.mkp_mbsy_diagnostic.model.MKPMessage
import com.diplom.mkp_mbsy_diagnostic.ui.screens.ChooseTypeScreen
import com.diplom.mkp_mbsy_diagnostic.ui.screens.MBSYScreen
import com.diplom.mkp_mbsy_diagnostic.ui.screens.MKPScreen
import com.diplom.mkp_mbsy_diagnostic.viewmodel.MBSYViewModel


@Composable
fun NavGraph() {

    val navController = rememberNavController()
    val MBSYviewModel: MBSYViewModel = hiltViewModel()
    NavHost(navController = navController, startDestination = Routes.Choose.route)
    {
        composable(Routes.Choose.route) {
            ChooseTypeScreen(navController = navController)
        }
        composable(Routes.MBSY.route) {
            MBSYScreen(navController = navController, viewModel = MBSYviewModel)
        }
        composable(Routes.MKP.route) {
            MKPScreen(data = emptyList<MKPMessage>(), onSendArrayClicked = { start, end -> Log.d("VALUE", (start+end).toString()) })
        }
    }
}