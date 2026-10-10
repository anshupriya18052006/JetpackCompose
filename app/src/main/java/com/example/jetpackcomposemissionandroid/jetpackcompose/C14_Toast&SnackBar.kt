package com.example.jetpackcomposemissionandroid.jetpackcompose

import android.widget.Toast
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarDuration
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.launch

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ToastExample(){

    // In android, context means the current state of the application
    // or current environment/surrounding information such as
    // which activity the app is running in
    // which screen it is on
    // which resource needs to be accessed
    // which service needs to be called

    // Get current context (required for toast)
    // The current Android context of the composable on the screen

    val context = LocalContext.current

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 24.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){

        Button(
            onClick = {
                Toast.makeText(
                    context,
                    "This is a toast message",
                    Toast.LENGTH_SHORT
                ).show()

            },
            modifier = Modifier.fillMaxWidth()
        ){

            Text(text = "Show Toast")

        }
    }

}

@Composable
fun SnackBarExample(){

    // snackBarHostState controls the snack bar
    val snackBarHostState = remember{ SnackbarHostState() }

    // coroutines Scope -> to show snack bar
    val scope = rememberCoroutineScope()

    Scaffold(

        snackbarHost = {
            SnackbarHost(hostState = snackBarHostState)
        }

    ) { innerPadding ->


        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 24.dp)
                .padding(innerPadding),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {

            Button(
                onClick = {
                    scope.launch {
                        // show snack bar
                        snackBarHostState.showSnackbar(
                            message = "This is a snack bar message",
                            actionLabel = "UNDO",
                            duration =  SnackbarDuration.Short
                        )
                    }
                          },
                modifier = Modifier.fillMaxWidth()
            ) {

                Text(text = "Show Snack Bar")

            }
        }
    }

}
