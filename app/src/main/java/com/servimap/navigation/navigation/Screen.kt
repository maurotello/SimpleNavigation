package com.servimap.navigation.navigation

sealed class Screen(val route: String) {
    object Login: Screen(Route.LOGIN)
    object Home: Screen(Route.HOME)
}