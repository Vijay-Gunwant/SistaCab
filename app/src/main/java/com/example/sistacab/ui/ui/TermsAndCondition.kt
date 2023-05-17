package com.example.sistacab.ui.ui

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.sistacab.MainActivity
import com.example.sistacab.R

class TermsAndCondition : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val mContext = LocalContext.current
            val myfont = FontFamily(
                Font(R.font.copse, FontWeight.Light)
            )
            Column(
                Modifier
                    .background(Color(202, 225, 240, 235))
                    .fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                Image(
                    painter = painterResource(id = R.drawable.first),
                    contentDescription = "Image",
                modifier = Modifier
                    .size(400.dp, 305.dp),


                )
                Text(
                    text="Introducing SISTA CAB, the women's safety taxi app that prioritizes your security. Our screened and trained drivers ensure a worry-free experience. With real-time GPS tracking and a panic button, help is just a touch away. Feel empowered and travel with confidence. Choose SISTA CAB for safety that never compromises.\n",
                    modifier = Modifier
                        .size(300.dp, 290.dp)
                        .padding(8.dp),
                    fontSize = (19.5).sp,
                    textAlign = TextAlign.Center,
                    fontFamily =  myfont

                )
                Button(
                    onClick = {
                        print("Hello")
                        mContext.startActivity(Intent(mContext, MainActivity::class.java))
                    },
                    modifier = Modifier.size(100.dp, 50.dp),
                    colors = ButtonDefaults.buttonColors(backgroundColor = Color.Black)
                ) {
                    Text(
                        text = "NEXT",
                        textAlign = TextAlign.Center,
                        fontSize = 14.sp,
                        color = Color.White,

                    )
                }
                TextButton(onClick = { print("Hello")}) {
                    Text(
                        text = "Terms And Condition",
                        textDecoration = TextDecoration.Underline,
                        modifier = Modifier.padding(8.dp)
                    )
                }


            }
        }
    }
}

