package com.example.bottomnavigationv2

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.bottomnavigationv2.ui.theme.HomeScreen
import com.example.bottomnavigationv2.ui.theme.ProfileScreen
import com.example.bottomnavigationv2.ui.theme.SettingsScreen

@Composable
fun BottomNavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = BottomBarScreen.Home.route,
    ) {
        composable(route = BottomBarScreen.Home.route){
            HomeScreen()
        }
        composable(route = BottomBarScreen.Profile.route){
            ProfileScreen()
        }
        composable(route = BottomBarScreen.Settings.route){
            SettingsScreen()
        }
    }}