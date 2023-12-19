package com.example.addappt

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.addappt.screens.AddScreen
import com.example.addappt.screens.HomeScreen
import com.example.addappt.screens.MotivationScreen
import com.example.addappt.screens.ProfileScreen
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

                Scaffold(
                    bottomBar = {
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
                                    ProfileScreen().route) ,
                                onClick = { navController.navigate(ProfileScreen().route)},
                                label = {
                                    Text("Profile")
                                },
                                icon = {
                                    Icon(
                                        painter = painterResource(id = R.drawable.ic_profile),
                                        contentDescription = "Profile Icon"
                                    )
                                }
                            )
                        }
                    },
                    content = {
                        NavHost(
                            navController = navController,
                            startDestination = HomeScreen().route
                        ) {
                            composable(HomeScreen().route) {
                                HomeScreen().Create()
                            }
                            composable(MotivationScreen().route) {
                                MotivationScreen().Create()
                            }
                            composable(AddScreen().route) {
                                AddScreen().Create()
                            }
                            composable(StatsScreen().route) {
                                StatsScreen().Create()

                            }
                            composable(ProfileScreen().route) {
                                ProfileScreen().Create()

                        }
                        }
                    }
                )
            }
        }
    }
}
