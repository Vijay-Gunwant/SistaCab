package com.example.sistacab

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.sistacab.ui.ui.theme.SistaCabTheme


class ForgotPassword : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SistaCabTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    ForgotPasswordScreen()
                }
            }
        }
    }
}

@Composable
fun ForgotPasswordScreen() {
    val mContext = LocalContext.current
    var email by remember { mutableStateOf("") }
    Column (
        modifier = Modifier.fillMaxWidth().background(Color(230,206,82)),
        horizontalAlignment = Alignment.CenterHorizontally
    ){

        Image(
            painter = painterResource(id = R.drawable.logo),
            contentDescription = "",
            modifier = Modifier.size(240.dp)
        )
        Text(
            text = "FORGOT YOUR PASSWORD?",

            fontFamily = FontFamily(Font(R.font.poppins_extrabold)),
            color = Color(0, 0, 0, 255),
            textAlign = TextAlign.Center,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 80.dp),
            fontWeight = FontWeight.ExtraBold,
            fontSize = 16.sp
        )
        Card(


            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp)
        ) {

            Column(
                modifier = Modifier.background(Color.White).padding(10.dp)
            ) {
                Text(
                    text = "Enter your registered email below to receive password reset instruction",
                    fontFamily = FontFamily(Font(R.font.poppins_extrabold)),
                    color = Color(0, 0, 0, 255),
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 10.dp),
                    fontWeight = FontWeight.ExtraBold,
                    fontSize = 12.sp
                )
                TextField(
                    value = email, onValueChange = { email = it },
                    Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 20.dp)
                        .padding(top = 20.dp),
                    colors = TextFieldDefaults.textFieldColors(
                        textColor = Color(0, 0, 0, 255),

                        cursorColor = Color(0, 0, 0, 255),

                    ),
                    singleLine = true,
                    leadingIcon = {
                        Row(
                            modifier = Modifier.padding(start = 8.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {

                            Icon(
                                painter = painterResource(id = R.drawable.logo),
                                contentDescription = "",
                                tint = Color(1,1,1),
                                modifier = Modifier.size(20.dp)
                            )
                            Spacer(
                                modifier = Modifier
                                    .width(6.dp)
                            )
                            Spacer(
                                modifier = Modifier
                                    .width(1.dp)
                                    .height(24.dp)
                                    .background(Color(1, 1, 1))
                            )
                        }
                    },
                    placeholder = {
                        Text(text = "Email Address", color = Color.Gray)
                    },
                    textStyle = TextStyle(
                        fontSize = 14.sp,
                        fontWeight = FontWeight.SemiBold,
                        fontFamily = FontFamily(Font(R.font.poppins_extrabold))
                    )
                )


                Button(
                    onClick = {mContext.startActivity(Intent(mContext, MainActivity::class.java))},
                    colors = ButtonDefaults.buttonColors(
                        Color(1,1,1)
                    ),
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 20.dp)
                        .padding(top = 20.dp),
                    contentPadding = PaddingValues(vertical = 14.dp),


                    ) {
                    Text(
                        text = "Send Reset Link",
                        fontFamily =FontFamily(Font(R.font.poppins_extrabold)),
                        color = Color(255, 255, 255, 255),
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Bold
                    )
                }


            }

        }
        TextButton(onClick = { mContext.startActivity(Intent(mContext, MainActivity::class.java)) },
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 20.dp)
        ) {
            Text(text = "Remember password? Login",
                fontFamily = FontFamily(Font(R.font.poppins_extrabold)),
                color= Color(1,1,1),
                fontSize = 12.sp,
                fontWeight = FontWeight.SemiBold,
            )
        }
    }
}