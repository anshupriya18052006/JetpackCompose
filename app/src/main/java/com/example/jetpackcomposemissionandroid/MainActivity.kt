package com.example.jetpackcomposemissionandroid

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import com.example.jetpackcomposemissionandroid.androidbasics.c2_viewmodel.CounterApp
import com.example.jetpackcomposemissionandroid.androidbasics.c2_viewmodel.ScoreViewModel
import com.example.jetpackcomposemissionandroid.jetpackcompose.SnackBarExample
import com.example.jetpackcomposemissionandroid.jetpackcompose.ToastExample
import com.example.jetpackcomposemissionandroid.jetpackcompose.c13_navigation_bar.NavBarHomeScreen
import com.example.jetpackcomposemissionandroid.jetpackcompose.c13_navigation_bar.NavBarNavigation
import com.example.jetpackcomposemissionandroid.ui.theme.JetpackComposeMissionAndroidTheme

class MainActivity : ComponentActivity() {

    private val viewModel : ScoreViewModel by this.viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        println("OnCreate() called")
        enableEdgeToEdge()
        setContent {
            JetpackComposeMissionAndroidTheme {

                CounterApp(viewModel)

            }
        }
    }
}

