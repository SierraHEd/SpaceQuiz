package com.example.spacequiz_edwash

import android.content.Context
import android.view.animation.OvershootInterpolator
import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember

import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import kotlinx.coroutines.delay


@Composable
fun Navigation(context: Context) {
    val navController= rememberNavController()
    val modifier = Modifier
    NavHost(navController = navController, startDestination = "splash_screen"  ){
        composable("splash_screen"
        ) {
            SpalshScreen(navController)

        }

        composable("first_screen"
        ) {
            FirstScreen(navController)

        }


        composable("quiz_screen") {
            QuizScreen(navController, context)
        }

        composable("quiz_screen2") {
            QuizScreen2(navController, context)
        }

        composable("quiz_screen3") {
            QuizScreen3(navController, context)
        }

        composable("quiz_screen4") {
            QuizScreen4(navController, context)
        }

        composable("quiz_screen5") {
            QuizScreen5(navController, context)
        }

        composable("quiz_screen6") {
            QuizScreen6(navController, context)
        }

        composable("quiz_screen7") {
            QuizScreen7(navController, context)
        }

        composable("final_screen") {
            FinalScreen(navController)
        }


    }

}

@Composable
fun FirstScreen(navController: NavController) {
    Box (contentAlignment = Alignment.Center){
        Column ( modifier = Modifier.padding(horizontal = 20.dp).wrapContentSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally){
            Text(text = "First Screen")

            Button(onClick = { navController.navigate("second_screen") }) {
                Text(text ="Go to Second Screen")
            }

        }
    }
}


@Composable
fun SpalshScreen(navController: NavController){
    val scale= remember {
        Animatable(0f, 1f)
    }
    LaunchedEffect(key1 = true) {
        scale.animateTo(
            targetValue = 0.5f,
            animationSpec = tween(durationMillis = 1000,0, easing = {
                OvershootInterpolator(2f).getInterpolation(it)
            }
            ))
        delay(3000)
        navController.navigate("quiz_screen")
    }

    Box (contentAlignment = Alignment.Center){
        Image(painter = painterResource(id = R.drawable.planet), contentDescription ="" )
    }
}
