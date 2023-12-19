package com.example.addappt.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp

class HomeScreen {

    val route = "home"

    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    fun Create() {
        Scaffold (
            topBar = {
                TopAppBar(
                    title = { Text("Home", fontSize = 24.sp) }
                )
            },
            content = {
                Column(
                    modifier = Modifier
                        .padding(it)
                        .fillMaxSize(),
                    Arrangement.Center,
                    Alignment.CenterHorizontally
                ){
                    Text("Home Screen", fontSize = 32.sp)
                }
            }
        )
    }
}