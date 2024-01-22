package com.example.addappt.screens

import android.view.animation.OvershootInterpolator
import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.addappt.R
import com.example.addappt.constants.Constants
import kotlinx.coroutines.delay

class SplashScreen {

    val route = Constants.ScreenRoutes.SPLASH_SCREEN_ROUTE
    @Composable
    fun Create() {

        val scale = remember { Animatable(0f) }

        LaunchedEffect(
            key1 = true,
            block = {
                scale.animateTo(
                    targetValue = 0.9f,
                    animationSpec = tween(
                        durationMillis = 1000,
                        easing = {
                            OvershootInterpolator(8f)
                                .getInterpolation(it)
                        }
                    )
                )
                delay(2000)
//                navController.navigate(route = HomeScreen().route)
            }
        )

        Surface(
            modifier = Modifier
                .fillMaxSize()
        ) {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .paint(
                        painterResource(id = R.drawable.img_splash_background),
                        contentScale = ContentScale.FillBounds
                    )
            ){
                Column(
                    modifier = Modifier
                        .fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ){
                    Image(
                        painter = painterResource(id = R.drawable.img_splash_title),
                        contentDescription = "Splash Title Image",
                        contentScale = ContentScale.Fit,
                        modifier = Modifier
                            .size(300.dp))
                }
            }

        }

    }


    @Preview
    @Composable
    fun PreviewSplashScreen(){
        Create()
    }


}