package com.diplom.mkp_mbsy_diagnostic.ui.navigation

sealed class Routes(val route: String) {
    object Choose : Routes("choose")
    object MBSY : Routes("MBSY")
    object MKP : Routes("MKP")
}