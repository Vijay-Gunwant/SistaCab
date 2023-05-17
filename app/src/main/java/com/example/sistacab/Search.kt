package com.example.sistacab

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Search
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.sistacab.ui.HomePage
import com.example.sistacab.ui.theme.SistaCabTheme

class Search : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SistaCabTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Find()
                }
            }
        }
    }
}

@Composable
fun Find() {
    val mContext = LocalContext.current

    var textInput by remember {
        mutableStateOf("")
    }
    var textInput2 by remember {
        mutableStateOf("")
    }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(230, 206, 85)),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.size(10.dp))
        TextField(
            value = textInput,
            colors = TextFieldDefaults.textFieldColors(backgroundColor = Color.White,textColor = Color.Black,),
            onValueChange = { textInput = it },
            label = { Text("Enter Your Position") },
            singleLine = true,
            modifier = Modifier
                .border(
                    BorderStroke(2.dp, Color.White),
                    shape = RoundedCornerShape(5.dp)
                )
                .size(350.dp, 50.dp)
            ,
            leadingIcon = {
                Icon(
                    Icons.Outlined.Search,
                    contentDescription = null,
                    Modifier
                        .background(Color.Yellow)
                        .padding(8.dp)
                        .size(25.dp),
                    tint = Color.Black,
                )
            }
        )
        Spacer(modifier = Modifier.size(10.dp))
        TextField(
            value = textInput2,
            colors = TextFieldDefaults.textFieldColors(backgroundColor = Color.White, textColor = Color.Black),
            onValueChange = { textInput2 = it },
            label = { Text("Enter Destination") },
            singleLine = true,
            modifier = Modifier
                .border(
                    BorderStroke(2.dp, Color.White),
                    shape = RoundedCornerShape(5.dp)
                )
                .size(350.dp, 60.dp),
            leadingIcon = {
                Icon(
                    Icons.Outlined.Search,
                    contentDescription = null,
                    Modifier
                        .background(Color.Yellow)
                        .padding(8.dp)
                        .size(25.dp),
                    tint = Color.Black,
                )
            }
        )
        Spacer(modifier = Modifier.size(10.dp))
        Text(text = "Result",
            fontFamily = FontFamily(
                Font(R.font.poppins_extrabold)),
            fontSize = 26.sp
            )
        Spacer(modifier = Modifier.size(10.dp))
        Image(
            painter = painterResource(id = R.drawable.result),
            contentDescription = "Null",
            modifier = Modifier.size(600.dp,500.dp)
        )
        Spacer(modifier = Modifier.size(3.dp))
        TextButton(onClick = {  mContext.startActivity(Intent(mContext, HomePage::class.java)) }) {
            Text(text = "Back", fontSize = 18.sp)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview2() {
    SistaCabTheme {
        Find()
    }
}