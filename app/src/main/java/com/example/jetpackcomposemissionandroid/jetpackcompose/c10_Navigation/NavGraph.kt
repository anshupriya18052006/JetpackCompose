package com.example.jetpackcomposemissionandroid.jetpackcompose.c10_Navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute


@Composable
fun NavGraph(){

    // navController -> handle navigation
    // rememberNavController -> Create and remember the navController
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = MyNavRoutes.LoginScreen
    ){
        composable<MyNavRoutes.LoginScreen>{
            LoginScreenUI(navController)
        }
        composable<MyNavRoutes.HomeScreen>{
            HomeScreenUI(navController)
        }


        // backStackEntry is a lambda Function having data and arguments
        composable<MyNavRoutes.WelcomeScreen>{ backStackEntry ->

            val data  = backStackEntry.toRoute<MyNavRoutes.WelcomeScreen>()
            WelcomeScreenUI(data.userName, navController)
        }
    }
}