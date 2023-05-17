package com.example.sistacab.ui.ui

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.sistacab.Login
import com.example.sistacab.MainActivity
import com.example.sistacab.R
import com.example.sistacab.ui.SignUp
import com.example.sistacab.ui.ui.ui.theme.SistaCabTheme

class TermsAndCondition : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val mContext = LocalContext.current
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
                        .size(300.dp, 360.dp)
                        .padding(10.dp),
                    fontSize = 22.sp,
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

