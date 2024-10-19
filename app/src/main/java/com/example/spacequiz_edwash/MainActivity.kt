package com.example.spacequiz_edwash

import android.content.Context
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.spacequiz_edwash.ui.theme.SpaceQuiz_edwashTheme

class MainActivity : ComponentActivity() {
    var context: Context = this
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SpaceQuiz_edwashTheme {
                Box(contentAlignment = Alignment.Center, modifier = Modifier.fillMaxSize().background(
                    Color(0xFFE0E0E0)
                )) {
                    Navigation(context)
                }
            }
        }
    }

}

