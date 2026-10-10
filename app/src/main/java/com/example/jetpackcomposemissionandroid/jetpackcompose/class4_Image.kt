package com.example.jetpackcomposemissionandroid.jetpackcompose


import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetpackcomposemissionandroid.R

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ImageExample(){

    Image(

        painter = painterResource(R.drawable.green),
        contentDescription = "Image of Green",
        modifier = Modifier
            .padding(16.dp)
            .size(300.dp)
            .clip(shape=RoundedCornerShape(16.dp)),
        contentScale = ContentScale.Fit
    )

}