package com.example.jetpackcomposemissionandroid.jetpackcompose.c10_Navigation

import kotlinx.serialization.Serializable


//sealed class creates a restricted hierarchy of classes,
// so its subclasses can only be defined in the same file

//Each subclass of sealed class can have its own data and behavior

@Serializable
sealed class MyNavRoutes {


    @Serializable
    object LoginScreen: MyNavRoutes()

    @Serializable
    object HomeScreen: MyNavRoutes()

    @Serializable
    data class WelcomeScreen(val userName: String): MyNavRoutes()

}