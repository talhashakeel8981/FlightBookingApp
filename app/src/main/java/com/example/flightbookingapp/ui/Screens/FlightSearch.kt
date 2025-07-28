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
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.DividerDefaults.color
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
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
import androidx.compose.material3.TextFieldDefaults


@OptIn(ExperimentalMaterial3Api::class)
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
                .height(325.dp)

            ,

            shape = RoundedCornerShape(25.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color(0xFFFDFFFF) // Light white-blue
                // or simply Color.White
            ),
            elevation = CardDefaults.cardElevation(50.dp)
        ) {
            Column (
                modifier = Modifier
                    .fillMaxSize()
                    .padding(10.dp)
                    .fillMaxWidth()



                ) {
                // 🔁 TabRow manages tab selection and layout
                TabRow(
                    selectedTabIndex = selectedTabIndex.value,
                    containerColor = Color.Transparent, // 🔹 Transparent so it doesn't override outer Box background
                    contentColor = Color.Gray,          // 🔹 Default text color for unselected tabs
                    divider = {},                       // ❌ Remove underline below the tab row
                    indicator = {}                      // ❌ Remove the default moving indicator under tabs
                ) {

                    // 🔁 Loop through the titles to create tabs
                    tabTitles.forEachIndexed { index, title ->

                        Tab(
                            selected = selectedTabIndex.value == index,
                            onClick = { selectedTabIndex.value = index }, // 🔹 Update selected tab index
                            modifier = Modifier
                                .clip(RoundedCornerShape(30.dp)) // 🔹 Rounds each tab slightly (helps with inside shape)
                                .background(
                                    if (selectedTabIndex.value == index)
                                        Color.Black              // 🔸 Selected tab background = black
                                    else
                                        Color(241,241,241)       // 🔸 Unselected tab blends with light gray container
                                )
                                .padding(vertical = 10.dp),     // 🔹 Padding top & bottom to give tab height

                            // 🔤 Tab text label
                            text = {
                                Text(
                                    text = title,
                                    color = if (selectedTabIndex.value == index)
                                        Color(241,241,241)            // 🔸 Selected tab text = white
                                    else
                                        Color.Gray              // 🔸 Unselected tab text = gray
                                )
                            }
                        )
                    }
                }
                OutlinedTextField(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(56.dp),  // typical button height
                    value = departure.value,
                    onValueChange = { departure.value = it },
                    label = { Text(text = "Enter Country") },
                    shape = RoundedCornerShape(100.dp),  // rounded corners like button
                    colors = TextFieldDefaults.outlinedTextFieldColors(
                        focusedBorderColor = Color.Red,        // example: red border when focused
                        unfocusedBorderColor = Color(240,240,240),     // example: gray border when not focused
                        cursorColor = Color.Black,
                        containerColor = Color.Transparent,
//                        focusedLabelColor = Color.Red,
                        unfocusedLabelColor = Color.Gray,
//                        textColor = Color.Black
                    )
                )

                OutlinedTextField(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(56.dp)
                    ,
                    value = arrival.value,
                    onValueChange = {arrival.value=(it)},
                    label = { Text(text = "To") },
                            shape = RoundedCornerShape(100.dp),  // rounded corners like button
                    colors = TextFieldDefaults.outlinedTextFieldColors(
                        focusedBorderColor = Color.Red,        // example: red border when focused
                        unfocusedBorderColor = Color(240,240,240),     // example: gray border when not focused
                        cursorColor = Color.Black,
                        containerColor = Color.Transparent,
//                        focusedLabelColor = Color.Red,
                        unfocusedLabelColor = Color.Gray,
//                        textColor = Color.Black
                    )
                )



                Row (

                ){
                    OutlinedTextField(
                        modifier = Modifier
                            .weight(1f)
                            .height(56.dp),
                        value = date.value,
                        onValueChange = { date.value = it },
                        label = { Text("Date") },
                        shape = RoundedCornerShape(50),
                        singleLine = true,
                        leadingIcon = {
                            Icon(
                                imageVector = Icons.Default.DateRange, // 📅 icon from material icons
                                contentDescription = "Date Icon",
                                tint = Color.Black
                            )
                        },
                        colors = TextFieldDefaults.outlinedTextFieldColors(
                            containerColor = Color.White,
                            focusedBorderColor = Color.Red,
                            unfocusedBorderColor = Color(0xFFEFEFEF),
                            cursorColor = Color.Black,
                            unfocusedLabelColor = Color.Gray,
                            focusedLabelColor = Color.Red,
//                            textColor = Color.Black
                        )
                    )


                    // Adults Field
                    OutlinedTextField(
                        modifier = Modifier
                            .weight(1f)
                            .height(56.dp),
                        value = persons.value,
                        onValueChange = { persons.value = it },
                        label = { Text("Adults") },
                        shape = RoundedCornerShape(50),
                        singleLine = true,
                        leadingIcon = {
                            Icon(
                                imageVector = Icons.Default.Person,
                                contentDescription = "Adult",
                                tint = Color.Black
                            )
                        },
                        colors = TextFieldDefaults.outlinedTextFieldColors(
                            containerColor = Color.White,
                            focusedBorderColor = Color.Red,
                            unfocusedBorderColor = Color(0xFFEFEFEF),
                            cursorColor = Color.Black,
                            unfocusedLabelColor = Color.Gray,
                            focusedLabelColor = Color.Red,
//                            textColor = Color.Black
                        )
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
                .padding(start = 12.dp, end = 12.dp, top = 540.dp)
                .fillMaxWidth() // Important: makes the row expand full width
        ) {
            Text(
                text = "Last Trip",
                color=Color.White
            )

            Spacer(modifier = Modifier.weight(1f)) // Pushes "See All" to the end

            Text(
                text = "See All",
                color=Color.White
//                hhhshshxnhxshxnsxsahx
            )
        }

        }
    }
