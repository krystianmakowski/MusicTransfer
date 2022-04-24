package com.makowski.musictransfer.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.rememberNavController
import com.makowski.musictransfer.R

@Preview
@Composable
fun Home(){
    val navController = rememberNavController()
    Scaffold(bottomBar = {}
    ) {
        Surface(modifier = Modifier.fillMaxSize()) {
            Row(verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.Center) {
                Card(modifier = Modifier
                    .size(180.dp, 140.dp)
                    .padding(10.dp)
                    .size(150.dp)
                    .clip(RoundedCornerShape(20.dp)),
                    backgroundColor = Color(0xFF1DB954)
                ) {
                    Box(contentAlignment = Alignment.Center) {
                        Image(painter = painterResource(id = R.drawable.spotify), contentDescription = "Spotify", Modifier.size(100.dp))
                    }
                }
                Card(modifier = Modifier
                    .size(180.dp, 140.dp)
                    .padding(10.dp)
                    .size(150.dp)
                    .clip(RoundedCornerShape(25.dp)),
                    backgroundColor = (Color(0xFFf94c57))
                ) {
                    Box(contentAlignment = Alignment.Center) {
                        Image(painter = painterResource(id = R.drawable.apple), contentDescription = "Apple", Modifier.size(100.dp))
                    }
                }

            }
        }

    }
}
