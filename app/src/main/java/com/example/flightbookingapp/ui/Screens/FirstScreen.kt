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
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable

import androidx.compose.foundation.layout.*


import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.painterResource
import com.example.flightbookingapp.R
import androidx.compose.material.icons.filled.Person // You can choose any icon
import androidx.compose.ui.text.font.FontWeight

@Composable
fun FirstScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(red = 0, green = 81, blue = 63))
//            .padding(top = 100.dp)
    )
    {
        Column(

        ){
            Image(
                painter = painterResource(id = R.drawable.homescreenlogo),
                contentDescription = "",
                modifier = Modifier.size(100.dp)

            )
//            Spacer(modifier = Modifier.height(4.dp))
            Text(
                text = "Tragelio",
                fontSize = 60.sp,
                color=Color(220,255,255)
            )
        }
        Row(
            modifier = Modifier
                .padding(top = 500.dp)
                .padding(end = 25.dp)
                .padding(start = 15.dp)

        ) {
            Text(
                text = "Find",
                fontSize = 45.sp
            )
            Image(
                painter = painterResource(id = R.drawable.homescreenlogo),
                contentDescription = "",
                modifier = Modifier.size(40.dp)

            )
//            Text(
//                text = "Flights to the Places You Love Most",
//                fontSize = 45.sp
//            )
        }



        // Sign Up Button with Apple Icon
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
                Image(
                    painter = painterResource(id = R.drawable.apple),
                    contentDescription = "Apple Icon",
                    modifier = Modifier.size(24.dp)
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text(
                    text = "Sign Up With Apple",
                    color = Color.Black,
                    fontSize = 18.sp
                )
            }
        }

        // I have an Account Button
        Button(
            onClick = { /* TODO */ },
            modifier = Modifier
                .align(Alignment.Center)
                .offset(y = 320.dp)
                .height(50.dp)
                .width(350.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(red = 68, green = 133, blue = 56)
            )
        )

        {
            Text(
                text = "I have an Account",
                color = Color.White,
                fontSize = 19.sp
            )
        }
        Row (
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .padding(bottom = 24.dp), // Space from bottom edge
            horizontalArrangement = Arrangement.Center
        ){

            Text(
                text = "Don't have an account?",
                color = Color(161,217,207),
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.clickable {
                    println("Text clicked!")
                }
            )
            Spacer(modifier = Modifier.width(15.dp))
            Text(
                text = "Register",
                color = Color(red = 186, green =221 , blue =214 ),
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,

                modifier = Modifier.clickable {
                    println("Text clicked!")
                }
            )




        }
        Text(
            text = "Register",
            color = Color(red = 186, green =221 , blue =214 ),
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,

            modifier = Modifier.clickable {
                println("Text clicked!")
            }
        )
    }
}