package com.servimap.navigation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.servimap.navigation.ui.screens.HomeScreen
import com.servimap.navigation.ui.screens.LoginScreen


@Composable
fun RootNavHost() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = Screen.Login.route
    ) {
        composable(Screen.Login.route) {
            LoginScreen { navController.navigate(Screen.Home.route) }
        }
        composable(Screen.Home.route) {
            HomeScreen { navController.navigate(Screen.Login.route) }
        }
    }
}