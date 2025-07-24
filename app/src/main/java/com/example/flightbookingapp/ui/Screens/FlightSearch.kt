package com.example.flightbookingapp.ui.Screens

import android.R.attr.color
import android.R.color
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.DividerDefaults.color
import androidx.compose.material3.Icon
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.flightbookingapp.R

@Composable
fun FlightSearch()
{

    val tabTitles = listOf("One Way", "Round Trip") // Titles for the pager
    val selectedTabIndex = remember { mutableStateOf(0) } // Track selected tab
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
//                .padding(start = 20.dp, top = 50.dp)
        ){
            Text(

                modifier = Modifier
                    .padding(start = 10.dp, top = 40.dp),

                text = "Where You\nwant to Travel?",
                color = Color(red = 216, green = 236, blue = 235),
                fontSize = 38.sp,


            )
            Box(
                modifier = Modifier
                    .padding(start = 60.dp, top = 60.dp, end = 8.dp)
                    .size(50.dp)                      // Bigger circle size
                    .clip(CircleShape)
                    .background(Color(2, 63, 49)),   // Background color for circle
                contentAlignment = Alignment.Center  // Center the icon inside the box
            ) {
                Image(
                    painter = painterResource(id = R.drawable.bell),
                    contentDescription = "",
                    modifier = Modifier.size(30.dp), // Smaller icon size inside bigger circle
                    colorFilter = ColorFilter.tint(Color(212, 248, 240))
                )
            }



        }
        Card(

            modifier = Modifier
                .padding(top = 200.dp)
                .padding(start = 15.dp, end = 15.dp)
                .fillMaxWidth()
                .height(300.dp)
            ,

            shape = RoundedCornerShape(25.dp),
            elevation = CardDefaults.cardElevation(16.dp)
        ) {
            Column (
                modifier = Modifier
                    .fillMaxSize()
                    .padding(10.dp)
            ){
                // 🔁 Tab Row for One Way / Round Trip
                TabRow(
                    selectedTabIndex = selectedTabIndex.value,
                    contentColor = Color.Black
                ) {
                    tabTitles.forEachIndexed { index, title ->
                        Tab(
                            selected = selectedTabIndex.value == index,
                            onClick = { selectedTabIndex.value = index },
                            text = { Text(title) }
                        )
                    }
                }


                TextField(

                    value = departure.value,
                    onValueChange = {departure.value=(it)},
                    label = { Text(text = "Enter Country") }


                )
                TextField(value = arrival.value,
                    onValueChange = {arrival.value=(it)},
                    label = { Text(text = "To") }


                )

                Row (

                ){
                    TextField(

                        modifier = Modifier
                            .width(165.dp),
                        value = date.value,
                        onValueChange = {date.value=(it)},
                        label = { Text(text = "Date") }
                    )
                    TextField(
                        modifier = Modifier
                            .width(165.dp),


                        value = persons.value,
                        onValueChange = {persons.value=(it)},
                        label = { Text(text = "adults") }
                    )


                }

                Button(
                    onClick = { },
                    modifier = Modifier
                        .width(340.dp)
                        .padding(start = 0.dp, top = 10.dp)
                        .height(50.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(red = 232, green = 255, blue = 38)
                    )
                ) {
                    Text(
                        color = Color(red =83 ,green=92,blue=11),
                        fontSize = 20.sp,
                        text = "Search Flights")
                }
                }

            }


        Row(
            modifier = Modifier
                .padding(start = 12.dp, end = 12.dp, top = 520.dp)
                .fillMaxWidth() // Important: makes the row expand full width
        ) {
            Text(
                text = "Last Trip"
            )

            Spacer(modifier = Modifier.weight(1f)) // Pushes "See All" to the end

            Text(
                text = "See All"
            )
        }

        }
    }
