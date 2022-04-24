package com.makowski.musictransfer.screens

import androidx.compose.foundation.layout.RowScope
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.navigation.NavController
import androidx.navigation.NavDestination
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.makowski.musictransfer.navigation.NavigationGraph
import com.makowski.musictransfer.navigation.NavigationItem
import com.makowski.musictransfer.widgets.BottomNavigationBar

@Composable
fun MainScreen(){
    val navController = rememberNavController()
    Scaffold(bottomBar = { BottomNavigationBar(navController = navController)}
    ) {
        NavigationGraph(navController = navController)

    }
}
