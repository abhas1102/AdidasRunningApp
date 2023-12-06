package com.example.runningapp.ui

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.runningapp.Login
import com.example.runningapp.R

@Composable
fun OpeningScreen(navController: NavHostController) {
    Surface(modifier = Modifier.fillMaxSize()) {
        Column(modifier = Modifier.fillMaxSize()) {
            Box(modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.7f)) {
                val openingScrenImage = painterResource(id = R.drawable.openingscreenimage)
                val logo = painterResource(id = R.drawable.logo)
                Image(painter = openingScrenImage, contentDescription = "opening screen image", modifier = Modifier.fillMaxSize(), contentScale = ContentScale.Crop)
                Image(painter = logo , contentDescription = "logo",
                    Modifier
                        .padding(100.dp)
                        .size(150.dp)
                        .align(
                            Alignment.TopCenter
                        ))
            }
            Spacer(modifier = Modifier.size(0.dp))

            Button(onClick = { },modifier = Modifier.padding(10.dp).height(50.dp),shape = RectangleShape,
                 colors = ButtonDefaults.buttonColors(containerColor = Color.Black) ) {
                Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween, verticalAlignment = Alignment.CenterVertically,) {
                    Text(text = "LOG IN WITH ADIDAS")
                    Image(painter = painterResource(id = R.drawable.ic_logo), modifier = Modifier.size(30.dp), contentDescription = "")
                }
                
            }
            Spacer(modifier = Modifier.size(0.dp))

            OutlinedButton(onClick = { navController.navigate(Login.route)},modifier = Modifier.padding(10.dp).height(50.dp), shape = RectangleShape, border = BorderStroke(1.dp,Color.Black)) {
                Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween, verticalAlignment = Alignment.CenterVertically,) {
                    Text(text = "USE A DIFFERENT ACCOUNT", color = Color.Black)
                    Image(painter = painterResource(id = R.drawable.arrow_forward), modifier = Modifier.size(30.dp), contentDescription = "")
                }

            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun OpeningScreenPreview() {
 //   OpeningScreen(navController)
}
