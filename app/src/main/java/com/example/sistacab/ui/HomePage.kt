package com.example.sistacab.ui

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.outlined.Search
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.sistacab.Profile
import com.example.sistacab.R
import com.example.sistacab.Search
import com.example.sistacab.ui.ui.theme.SistaCabTheme
import kotlinx.coroutines.launch


class HomePage : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SistaCabTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Home()
                }
            }
        }
    }
}

@Composable
fun Home(){
    val mContext = LocalContext.current
    var textInput by remember { mutableStateOf("") }
    val state = rememberScaffoldState()
    val scope = rememberCoroutineScope()
    Surface() {
        Scaffold(
            scaffoldState = state,
            drawerContent = {
                Drawer()
            }
        ) {


            Box() {
                Image(
                    painter = painterResource(id = R.drawable.bg),
                    contentDescription = null,
                    Modifier.fillMaxSize(1f),
                    contentScale = ContentScale.FillBounds
                )
                Column(
                    Modifier.fillMaxSize(),
                    verticalArrangement = Arrangement.SpaceBetween
                )
                {

                    Row(
                        Modifier
                            .fillMaxWidth()
                            .padding(0.dp, 10.dp, 0.dp, 0.dp),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        IconButton(onClick = {
                            scope.launch { state.drawerState.open() }
                        }) {
                            Icon(
                                imageVector = Icons.Filled.Menu,
                                contentDescription = null,
                                modifier = Modifier.size(50.dp),
                                tint = Color(239, 208, 55)
                            )
                        }
                        Button(
                            onClick = {
                                mContext.startActivity(Intent(mContext, Search::class.java))},
                            Modifier.size(200.dp,60.dp)
                        ) {
                            Text(text = "Search",Modifier.background(Color.White).padding(10.dp).width(180.dp),
                            color = Color.Black)

                        }
                        Image(
                            painter = painterResource(id = R.drawable.profile),
                            contentDescription = "Profile",
                            modifier = Modifier
                                .size(60.dp)
                                .border(
                                    BorderStroke(2.dp, Color.Transparent),
                                    shape = RoundedCornerShape(10.dp)
                                )
                                .clickable {
                                    mContext.startActivity(
                                        Intent(
                                            mContext,
                                            Profile::class.java
                                        )
                                    )
                                }

                        )
                    }

                    Row(
                        Modifier
                            .fillMaxWidth()
                            .padding(0.dp, 0.dp, 0.dp, 10.dp),

                        horizontalArrangement = Arrangement.SpaceAround,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Button(
                            onClick = {
                                print("Hello")

                            },
                            modifier = Modifier.size(100.dp, 50.dp),
                        ) {
                            Text(
                                text = "Support",
                                textAlign = TextAlign.Center,
                                fontSize = 16.sp
                            )
                        }
                        Button(
                            onClick = {
                                print("Hello World")
                            },
                            colors = ButtonDefaults.buttonColors(Color.Red),
                            modifier = Modifier.size(100.dp),
                            border = BorderStroke(1.dp, Color.Transparent),
                            shape = CircleShape
                        ) {
                            Text(
                                text = "SOS",
                                textAlign = TextAlign.Center,
                                fontSize = 26.sp,
                                color = Color.White
                            )
                        }
                        Button(
                            onClick = {
                                print("Hello")
                            },
                            modifier = Modifier.size(100.dp, 50.dp),
                        ) {
                            Text(
                                text = "Recent Rides",
                                textAlign = TextAlign.Center,
                                fontSize = 14.sp
                            )
                        }
                    }

                }
            }
        }
    }
}
@Composable
fun Drawer(){
    val mContext = LocalContext.current
    Column(

        modifier = Modifier.fillMaxSize().background(Color.White)
        ) {

        Row (
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center,
            modifier = Modifier.padding(8.dp)
                )
        {
            Image(
                painter = painterResource(id = R.drawable.profile),
                contentDescription = null,
                modifier = Modifier
                    .size(100.dp)
                    .clip(CircleShape)
                    .border(BorderStroke(2.dp, Color.Black), CircleShape)
                )
            Text(
                text = "Name",
                fontSize = 24.sp,
                modifier = Modifier.padding(10.dp,0.dp,0.dp,0.dp)
                )
        }

        Column(


            modifier = Modifier.padding(8.dp)
        ){
            TextButton(onClick = {
                mContext.startActivity(Intent(mContext, Register1::class.java))
            }) {
                Text(
                    text = "Register as A Driver",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    fontFamily = FontFamily.SansSerif,
                    color = Color.Black
                    )
            }
            TextButton(onClick = { print("Hello") }) {
                Text(
                    text = "Settings",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    fontFamily = FontFamily.SansSerif,
                    color = Color.Black
                )
            }
            TextButton(onClick = { print("Hello") }) {
                Text(
                    text = "Help",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    fontFamily = FontFamily.SansSerif,
                    color = Color.Black
                )
            }
            TextButton(onClick = { print("Hello") }) {
                Text(
                    text = "Log Out",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    fontFamily = FontFamily.SansSerif,
                    color = Color.Black
                )
            }
        }
    }
}
