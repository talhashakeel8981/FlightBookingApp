package com.example.flightbookingapp.ui.Screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun FlightSearch()
{
    val departure= remember { mutableStateOf("") }
    val arrival= remember { mutableStateOf("") }
    val date = remember { mutableStateOf("") }
    val persons= remember { mutableStateOf("") }
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(red = 0, green = 81, blue = 63))
    )
    {
        Row (
            modifier = Modifier
                .padding(start = 20.dp,)
        ){
            Text(text = "Where You\n want to Travel?")
        }
        Card(

            modifier = Modifier
                .padding(top = 200.dp)
                .padding(start = 10.dp, end = 10.dp)
                .fillMaxWidth()
                .height(300.dp)
            ,

            shape = RoundedCornerShape(50.dp),
            elevation = CardDefaults.cardElevation(16.dp)
        ) {
            Column (
                modifier = Modifier
                    .fillMaxSize()
                    .padding(10.dp)
            ){
                TextField(value = departure.value,
                    onValueChange = {departure.value=(it)},
                    label = { Text(text = "Enter Country") }


                )
                TextField(value = arrival.value,
                    onValueChange = {arrival.value=(it)},
                    label = { Text(text = "To") }


                )

                Row (

                ){
                    TextField(value = date.value,
                        onValueChange = {date.value=(it)},
                        label = { Text(text = "Date") }
                    )
                    TextField(value = persons.value,
                        onValueChange = {persons.value=(it)},
                        label = { Text(text = "adults") }
                    )
                }

            }



        }
    }
}