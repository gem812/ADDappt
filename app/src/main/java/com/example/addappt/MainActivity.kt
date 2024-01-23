package com.example.addappt

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.res.painterResource
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.addappt.screens.AddScreen
import com.example.addappt.screens.HomeScreen
import com.example.addappt.screens.IntroScreen
import com.example.addappt.screens.MotivationScreen
import com.example.addappt.screens.ProfileScreen
import com.example.addappt.screens.SettingsScreen
import com.example.addappt.screens.SplashScreen
import com.example.addappt.screens.StatsScreen
import com.example.addappt.ui.theme.ADDapptTheme

class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ADDapptTheme {

                val navController = rememberNavController()
                val backstackEntry = navController.currentBackStackEntryAsState()
                val bottomNavVisibility = remember{
                    mutableStateOf(false)
                }

                Scaffold(
                    bottomBar = {
                        AnimatedVisibility(visible = bottomNavVisibility.value) {
                            NavigationBar {
                                NavigationBarItem(
                                    selected = backstackEntry.value?.destination?.route.equals(
                                        HomeScreen().route
                                    ),
                                    onClick = { navController.navigate(HomeScreen().route) },
                                    label = {
                                        Text("Home")
                                    },
                                    icon = {
                                        Icon(
                                            painter = painterResource(id = R.drawable.ic_home),
                                            contentDescription = "Home Icon"
                                        )
                                    }
                                )
                                NavigationBarItem(
                                    selected = backstackEntry.value?.destination?.route.equals(
                                        MotivationScreen().route
                                    ),
                                    onClick = { navController.navigate(MotivationScreen().route) },
                                    label = {
                                        Text("Motivation")
                                    },
                                    icon = {
                                        Icon(
                                            painter = painterResource(id = R.drawable.ic_calendar),
                                            contentDescription = "Calendar Icon"
                                        )
                                    }
                                )
                                NavigationBarItem(
                                    selected = backstackEntry.value?.destination?.route.equals(AddScreen().route),
                                    onClick = { navController.navigate(AddScreen().route) },
                                    label = {
                                        Text("Add")
                                    },
                                    icon = {
                                        Icon(
                                            painter = painterResource(id = R.drawable.ic_add),
                                            contentDescription = "Add Icon"
                                        )
                                    }
                                )
                                NavigationBarItem(
                                    selected = backstackEntry.value?.destination?.route.equals(
                                        StatsScreen().route
                                    ),
                                    onClick = { navController.navigate(StatsScreen().route) },
                                    label = {
                                        Text("Stats")
                                    },
                                    icon = {
                                        Icon(
                                            painter = painterResource(id = R.drawable.ic_graph),
                                            contentDescription = "Graph Icon"
                                        )
                                    }
                                )
                                NavigationBarItem(
                                    selected = backstackEntry.value?.destination?.route.equals(
                                        SettingsScreen().route
                                    ),
                                    onClick = { navController.navigate(SettingsScreen().route) },
                                    label = {
                                        Text("Settings")
                                    },
                                    icon = {
                                        Icon(
                                            painter = painterResource(id = R.drawable.ic_settings),
                                            contentDescription = "Settings Icon"
                                        )
                                    }
                                )
                            }
                        }
                    },
                    content = {
                        NavHost(
                            navController = navController,
                            startDestination = SplashScreen().route
                        ) {
                            composable(SplashScreen().route){
                                bottomNavVisibility.value = false
                                SplashScreen().Create(navController = navController)
                            }
                            composable(IntroScreen().route){
                                bottomNavVisibility.value = false
                                IntroScreen().Create(navController = navController)
                            }
                            composable(HomeScreen().route) {
                                bottomNavVisibility.value = true
                                HomeScreen().Create()
                            }
                            composable(MotivationScreen().route) {
                                bottomNavVisibility.value = true
                                MotivationScreen().Create()
                            }
                            composable(AddScreen().route) {
                                bottomNavVisibility.value = true
                                AddScreen().Create()
                            }
                            composable(StatsScreen().route) {
                                bottomNavVisibility.value = true
                                StatsScreen().Create()

                            }
                            composable(SettingsScreen().route) {
                                bottomNavVisibility.value = true
                                SettingsScreen().Create(navController = navController)
                            }
                            composable(ProfileScreen().route) {
                                bottomNavVisibility.value = true
                                ProfileScreen().Create(navController = navController)
                            }
                        }
                    }
                )
            }
        }
    }
}
