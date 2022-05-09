package com.assignment

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.assignment.ui.main.MainScreen

sealed interface Navigate {
    fun route(vararg argument: Any): String =
        this::class.qualifiedName + argument.joinToString("") { "/$it" }

    object Main : Navigate
    object Product : Navigate
}

@Composable
fun AssignmenttNavigator() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = Navigate.Main.route()
    ) {
        composable(Navigate.Main.route()) {
            MainScreen(
//                openProduct = { navController.navigate(Navigate.Product.route()) }
            )
        }
    }
}