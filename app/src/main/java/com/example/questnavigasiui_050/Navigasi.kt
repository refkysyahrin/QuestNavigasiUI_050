package com.example.questnavigasiui_050

import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHost
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

enum class Navigasi{
    Formulirku,

    Detail
}

@Composable
fun DataApp(
    navController: NavHostController = rememberNavController()
){
    Scaffold { isiRuang->
        NavHost(
            navController = navController,
            startDestination = Navigasi.Formulirku.name,


        )
    }

}