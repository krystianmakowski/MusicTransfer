package com.makowski.musictransfer.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Settings
import androidx.compose.ui.graphics.vector.ImageVector

sealed class NavigationItem(var route: String, var icon: ImageVector, var title: String) {
    object Home : NavigationItem("home", Icons.Default.Home, "Home")
    object Profile : NavigationItem("profile", Icons.Default.AccountBox, "Profile")
    object Settings : NavigationItem("settings", Icons.Default.Settings, "Settings")
    }
