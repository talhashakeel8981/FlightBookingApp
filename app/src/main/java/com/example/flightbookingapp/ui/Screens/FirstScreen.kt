package com.example.flightbookingapp.ui.Screens

import android.widget.Button
import android.widget.Space
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.material.icons.Icons


import androidx.compose.material.icons.filled.Person // You can choose any icon

@Composable
fun FirstScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(red = 0, green = 81, blue = 63))
    ) {
        Button(
            onClick = { /* TODO */ },
            modifier = Modifier
                .align(Alignment.Center)
                .offset(y = 250.dp)
                .height(50.dp)
                .width(350.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(red = 232, green = 255, blue = 38)
            )
        ) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Icon(
                    imageVector = Icons.Default.Person, // 🔁 Replace with your icon
                    contentDescription = "Icon",
                    tint = Color.Black
                )
                Spacer(modifier = Modifier.width(8.dp)) // Space between icon and text
                Text(
                    text = "Sign Up With Apple",
                    color = Color.Black,
                    fontSize = 18.sp
                )
            }
        }
    }



//        Button(onClick = {
//
//        },
//            modifier = Modifier
//                .align(Alignment.Center)
//                .offset(y=320.dp)
//                .height(50.dp)
//                .width(350.dp),
//            colors = ButtonDefaults.buttonColors(containerColor = Color(red = 68, green = 133, blue = 56)),
//        )
//        {
//            Text(text = "I have an Account",
//                color =Color.White,
//                fontSize = 19.sp
//            )
//        }
//    }

}
