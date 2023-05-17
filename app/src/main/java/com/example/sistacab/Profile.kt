package com.example.sistacab

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
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.sistacab.ui.HomePage
import com.example.sistacab.ui.theme.SistaCabTheme

class Profile : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SistaCabTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Driver()
                }
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun Driver() {
    val mContext = LocalContext.current

    Column (
        verticalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier.background(Color(255,255,255,255))
    ){
        Column {
            Row(
                Modifier
                    .background(Color(255, 255, 255))
                    .fillMaxWidth()
                    .padding(1.dp, 5.dp, 50.dp, 5.dp),

                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center

            ) {
                Image(
                    painter = painterResource(id = R.drawable.sistacab),
                    contentDescription = "None",
                    modifier = Modifier
                        .size(150.dp, 150.dp),
                    contentScale = ContentScale.Inside,


                    )

                Column {
                    Text(
                        text = "User name",
                        fontSize = 20.sp,

                        color=Color(0, 0, 0, 255),
                        fontWeight = FontWeight.SemiBold,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(5.dp, 6.dp, 10.dp, 6.dp),

                        )



                    (Text(
                        text = "Ph no xxxxxxxxxx",
                        fontSize = 20.sp,

                        color=Color(0, 0, 0, 255),

                        fontWeight = FontWeight.SemiBold,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(0.dp, 0.dp, 0.dp, 0.dp),

                        ))
                    (Text(
                        text = "E-mail:abc@example.com",
                        fontSize = 16.sp,


                        fontWeight = FontWeight.SemiBold,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(0.dp, 0.dp, 0.dp, 0.dp),

                        ))
                }

            }
            Column(
                Modifier
                    .background(Color(255, 255, 255)),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            )
            {

                Text(
                    text = "Security And Privacy",
                    fontSize = 30.sp,
                    color=Color(0, 0, 0, 255),
                    fontWeight = FontWeight.SemiBold,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(0.dp, 0.dp, 0.dp, 0.dp),

                    )




                Text(
                    text = "2-Step Verification",
                    fontSize = 18.sp,
                    color=Color(0, 0, 0, 255),
                    fontWeight = FontWeight.SemiBold,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(40.dp, 20.dp, 6.dp, 6.dp),

                    )


                Text(
                    text = "Emergency Contacts",
                    fontSize = 18.sp,
                    color=Color(0, 0, 0, 255),

                    fontWeight = FontWeight.SemiBold,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(40.dp, 20.dp, 6.dp, 6.dp),

                    )


                Text(
                    text = "Password",
                    color=Color(0, 0, 0, 255),
                    fontSize = 18.sp,
                    fontWeight = FontWeight.SemiBold,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(40.dp, 6.dp, 6.dp, 6.dp),


                    )


            }
        }
        Row(Modifier.background(Color(255, 255, 255, 255))) {

                TextButton(
                    onClick = {
                        mContext.startActivity(Intent(mContext, HomePage::class.java))
                    },


                    ){
                    Text(text  = "Back",
                    fontSize = 30.sp,

                    fontWeight = FontWeight.SemiBold,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(20.dp),)
                }
            }
        }
    }


