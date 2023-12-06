package com.example.runningapp.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.runningapp.R

@Composable
fun LoginScreen() {
    Column(modifier = Modifier.fillMaxSize()) {
        AppBar()
        Spacer(modifier = Modifier.size(20.dp))
        Text(text = "WELCOME", color = Color.Black, fontSize = 30.sp, fontWeight = FontWeight.Bold, modifier = Modifier.padding(start = 20.dp))
        Spacer(modifier = Modifier.size(10.dp))
        Text(text = "Login with one of the following options and get started",color = Color.Black,fontSize = 18.sp, modifier = Modifier.padding(start = 20.dp, end = 20.dp))

        LoginOptions()
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AppBar() {
    Scaffold(modifier = Modifier.fillMaxHeight(0.1f), topBar = { TopAppBar(title = { Text(text = "")}, navigationIcon = { IconButton(
        onClick = { }) {
        Icon(imageVector = Icons.Filled.ArrowBack, contentDescription = "Back")
        
    }}, colors = TopAppBarDefaults.smallTopAppBarColors(containerColor = Color.White))}){
        it
    }
}
@Composable
fun LoginOptions() {
    Column(modifier = Modifier
        .fillMaxWidth()
        .fillMaxHeight()
        .padding(20.dp), verticalArrangement = Arrangement.Bottom) {
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Start) {
            Image(painter = painterResource(id = R.drawable.googlelogo), contentDescription = "google sign in", modifier = Modifier.size(30.dp))
            Spacer(modifier = Modifier.size(30.dp))
            Text(text = "Google", fontSize = 18.sp)
        }
        Spacer(modifier = Modifier.size(10.dp))
        Divider()
        Spacer(modifier = Modifier.size(10.dp))
        Row(modifier = Modifier.fillMaxWidth()) {
            Image(painter = painterResource(id = R.drawable.facebook), contentDescription = "facebook sign in",modifier = Modifier.size(30.dp))
            Spacer(modifier = Modifier.size(30.dp))
            Text(text = "Facebook", fontSize = 18.sp)
        }
        Spacer(modifier = Modifier.size(10.dp))
        Divider()
        Spacer(modifier = Modifier.size(10.dp))
        Row(modifier = Modifier.fillMaxWidth()) {
            Image(painter = painterResource(id = R.drawable.mail), contentDescription = "email sign in",modifier = Modifier.size(30.dp))
            Spacer(modifier = Modifier.size(30.dp))
            Text(text = "Email", fontSize = 18.sp)
        }
        Spacer(modifier = Modifier.size(10.dp))
        Divider()
        
    }
}

@Preview(showBackground = true)
@Composable
fun LoginScreenPreview() {
    LoginScreen()
}