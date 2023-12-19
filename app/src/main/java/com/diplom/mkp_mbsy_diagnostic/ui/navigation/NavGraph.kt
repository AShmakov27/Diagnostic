package com.diplom.mkp_mbsy_diagnostic.ui.navigation

import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.diplom.mkp_mbsy_diagnostic.ui.screens.ChooseTypeScreen
import com.diplom.mkp_mbsy_diagnostic.ui.screens.LogScreen
import com.diplom.mkp_mbsy_diagnostic.ui.screens.MBSYScreen
import com.diplom.mkp_mbsy_diagnostic.ui.screens.MKPScreen
import com.diplom.mkp_mbsy_diagnostic.ui.screens.TestScreen
import com.diplom.mkp_mbsy_diagnostic.viewmodel.LogViewModel
import com.diplom.mkp_mbsy_diagnostic.viewmodel.MBSYViewModel
import com.diplom.mkp_mbsy_diagnostic.viewmodel.MKPViewModel
import com.diplom.mkp_mbsy_diagnostic.viewmodel.TestViewModel


@Composable
fun NavGraph() {

    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Routes.Choose.route)
    {
        composable(Routes.Choose.route) {
            ChooseTypeScreen(navController = navController)
        }
        composable(Routes.MBSY.route) {
            val MBSYviewModel: MBSYViewModel = hiltViewModel()
            MBSYScreen(navController = navController, viewModel = MBSYviewModel)
        }
        composable(Routes.MKP.route) {
            val MKPviewModel: MKPViewModel = hiltViewModel()
            MKPScreen(viewModel = MKPviewModel)
        }
        composable(Routes.Log.route) {
            val LogviewModel: LogViewModel = hiltViewModel()
            LogScreen(viewModel = LogviewModel)
        }
        composable(Routes.Test.route) {
            val TestviewModel: TestViewModel = hiltViewModel()
            TestScreen(viewModel = TestviewModel)
        }
    }
}