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
import com.example.addappt.ui.theme.ADDapptTheme

class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ADDapptTheme {
                Scaffold (
                    bottomBar = {
                        NavigationBar {
                            NavigationBarItem(
                                selected = false,
                                onClick = { /*TODO*/ },
                                label = {
                                    Text("Home")
                                },
                                icon = {
                                    Icon(painter = painterResource(id = R.drawable.ic_home), contentDescription = "Home Icon")
                                }
                            )
                            NavigationBarItem(
                                selected = false,
                                onClick = { /*TODO*/ },
                                label = {
                                    Text("Motivation")
                                },
                                icon = {
                                    Icon(painter = painterResource(id = R.drawable.ic_calendar), contentDescription = "Calendar Icon")
                                }
                            )
                            NavigationBarItem(
                                selected = false,
                                onClick = { /*TODO*/ },
                                label = {
                                    Text("Add")
                                },
                                icon = {
                                    Icon(painter = painterResource(id = R.drawable.ic_add), contentDescription = "Add Icon")
                                }
                            )
                            NavigationBarItem(
                                selected = false,
                                onClick = { /*TODO*/ },
                                label = {
                                    Text("Stats")
                                },
                                icon = {
                                    Icon(painter = painterResource(id = R.drawable.ic_graph), contentDescription = "Graph Icon")
                                }
                            )
                            NavigationBarItem(
                                selected = false,
                                onClick = { /*TODO*/ },
                                label = {
                                    Text("Profile")
                                },
                                icon = {
                                    Icon(painter = painterResource(id = R.drawable.ic_profile), contentDescription = "Profile Icon")
                                }
                            )
                        }
                    },
                    content = {

                    }
                )
            }
        }
    }
}

@Composable
fun MainScreen(){

}