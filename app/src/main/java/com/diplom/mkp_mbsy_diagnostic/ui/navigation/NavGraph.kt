package com.diplom.mkp_mbsy_diagnostic.ui.navigation

import android.util.Log
import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.diplom.mkp_mbsy_diagnostic.datamodel.MKPMessage
import com.diplom.mkp_mbsy_diagnostic.ui.screens.ChooseTypeScreen
import com.diplom.mkp_mbsy_diagnostic.ui.screens.MBSYScreen
import com.diplom.mkp_mbsy_diagnostic.ui.screens.MKPScreen
import com.diplom.mkp_mbsy_diagnostic.viewmodel.MBSYViewModel
import com.diplom.mkp_mbsy_diagnostic.viewmodel.MKPViewModel


@Composable
fun NavGraph() {

    val navController = rememberNavController()
    val MBSYviewModel: MBSYViewModel = hiltViewModel()
    val MKPviewModel: MKPViewModel = hiltViewModel()
    NavHost(navController = navController, startDestination = Routes.Choose.route)
    {
        composable(Routes.Choose.route) {
            ChooseTypeScreen(navController = navController)
        }
        composable(Routes.MBSY.route) {
            MBSYScreen(navController = navController, viewModel = MBSYviewModel)
        }
        composable(Routes.MKP.route) {
            MKPScreen(viewModel = MKPviewModel)
        }
    }
}