package com.makowski.musictransfer.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.makowski.musictransfer.screens.*

@Composable
fun NavigationGraph (navController: NavHostController){
    NavHost(
        navController = navController,
        startDestination = NavigationItem.Home.route
    ){
        composable(route = NavigationItem.Home.route){
            Home()
        }
        composable(route = NavigationItem.Profile.route){
            Profile()
        }
        composable(route = NavigationItem.Settings.route){
            Settings()
        }

    }
}