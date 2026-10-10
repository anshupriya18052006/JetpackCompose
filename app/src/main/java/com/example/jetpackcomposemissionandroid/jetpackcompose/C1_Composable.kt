package com.example.jetpackcomposemissionandroid.jetpackcompose

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.input.rememberTextFieldState
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.ui.graphics.Color
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun TextExample() {
    Text(
        text = "Mission Android 2026",
        color = Color.Blue,
        fontSize = 10.sp,
        fontWeight = FontWeight.Thin,
        fontFamily = FontFamily.Serif,
        letterSpacing = 2.sp,
        textAlign = TextAlign.Center
    )
}


@Composable
fun TextFieldExample() {

    var name by remember { mutableStateOf(value = "") }

    //val textState = rememberTextFieldState("Anshu Priya")
    TextField(
        value = name,
        onValueChange = {
            name = it
        },
        //label= {Text(text="Enter Your Name") }
        placeholder = { Text(text = "Enter Your Name") },
        leadingIcon = {
            Text(
                text = "*", fontSize = 20.sp, fontWeight = FontWeight.Bold
            )
        },
        trailingIcon = {
            Text(
                text = "#",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold
            )
        },
        singleLine = true,
        shape = RoundedCornerShape(15.dp),
        colors = TextFieldDefaults.colors(
            unfocusedTextColor = Color.Blue,
            focusedTextColor = Color.Blue,
            unfocusedContainerColor = Color.White,
            focusedContainerColor = Color.Yellow,
            unfocusedIndicatorColor = Color.Transparent,
            focusedIndicatorColor = Color.Transparent,
            unfocusedPlaceholderColor = Color.Gray,
            unfocusedLeadingIconColor = Color.Blue,
            focusedLeadingIconColor = Color.Red,
            unfocusedTrailingIconColor = Color.Red,
            focusedTrailingIconColor = Color.Green,
            unfocusedLabelColor = Color.Blue,
            focusedLabelColor = Color.Red,
            cursorColor = Color.Blue


        )
    )
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun OutlinedTextFieldExample(){

    var name by remember { mutableStateOf(value = "") }
    OutlinedTextField(
        value = name,
        onValueChange = {
            name = it
        },
        placeholder = { Text(text = "Enter Your Name") },
        leadingIcon = {
            Text(
                text = "*", fontSize = 20.sp, fontWeight = FontWeight.Bold
            )
        },
        trailingIcon = {
            Text(
                text = "#",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold
            )
        },
        singleLine = true,
        shape = CircleShape,
        colors = OutlinedTextFieldDefaults.colors(
            unfocusedTextColor = Color.Blue,
            focusedTextColor = Color.Blue,
            unfocusedContainerColor = Color.White,
            focusedContainerColor = Color.White,
            //unfocusedIndicatorColor = Color.Transparent,
            //focusedIndicatorColor = Color.Transparent,
            unfocusedPlaceholderColor = Color.Gray,
            focusedBorderColor = Color.Blue,
            unfocusedBorderColor = Color.Red,
            unfocusedLeadingIconColor = Color.Blue,
            focusedLeadingIconColor = Color.Red,
            unfocusedTrailingIconColor = Color.Red,
            focusedTrailingIconColor = Color.Green,
            unfocusedLabelColor = Color.Blue,
            focusedLabelColor = Color.Red,
            cursorColor = Color.Blue,
            )
    )

}



