package com.makowski.musictransfer.screens

import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController

@Composable
fun Settings(){
    val navController = rememberNavController()
    Scaffold(bottomBar = {}
    ) {
        Text(text = "Settings")

    }
}
