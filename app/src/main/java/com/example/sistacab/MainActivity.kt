package com.example.sistacab

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusDirection
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.sistacab.ui.HomePage
import com.example.sistacab.ui.SignUp
import com.example.sistacab.ui.theme.SistaCabTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SistaCabTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Login()
                }
            }
        }
    }
}

@Composable
fun Login() {
    Scaffold(
        content = {
            val focus = LocalFocusManager.current
            val mContext = LocalContext.current
            Column {
                Column(
                    Modifier.background(Color(230, 206, 85)),

                    ) {
                    Image(
                        painter = painterResource(id = R.drawable.upper),
                        contentDescription = "None",
                        modifier = Modifier.fillMaxWidth(),
                        contentScale = ContentScale.FillWidth
                    )
                }

                Column(
                    Modifier
                        .background(Color(253, 203, 22))
                        .fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {

                    Text(
                        text = "Name",
                        fontSize = 18.sp,

                        fontWeight = FontWeight.SemiBold,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(56.dp, 6.dp, 6.dp, 6.dp),

                        )
                    var name by remember {
                        mutableStateOf("")
                    }
                    TextField(
                        value = name,
                        onValueChange = {name=it},
                        singleLine = true,
                        label = {Text( text="Your Name")},
                        placeholder = { Text(text = "Enter Your Name")},
                        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Ascii,imeAction = ImeAction.Next),
                        keyboardActions = KeyboardActions (onNext ={ focus.moveFocus(FocusDirection.Down)} )
                    )
                    Text(
                        text = "Password",
                        fontSize = 18.sp,
                        fontWeight = FontWeight.SemiBold,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(56.dp, 6.dp, 6.dp, 6.dp),


                        )
                    var pass by remember {
                        mutableStateOf("")

                    }
                    TextField(
                        value = pass,
                        singleLine = true,
                        onValueChange = {pass=it},
                        label = {Text( text="Your Password")},
                        placeholder = { Text(text = "Enter Your Password")},
                        visualTransformation = PasswordVisualTransformation(),
                        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password,imeAction = ImeAction.Done),
                        keyboardActions = KeyboardActions (onDone={focus.clearFocus(true)} )
                    )
                    TextButton(onClick = {print("Working") }) {
                        Text(
                            text = "Forgot Password?",
                            fontSize = 18.sp,
                            textAlign = TextAlign.Right,
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(4.dp, 4.dp, 40.dp, 4.dp),
                        )
                    }


                    Button(
                        onClick = {
                            mContext.startActivity(Intent(mContext,HomePage::class.java))

                        },
                        colors = ButtonDefaults.buttonColors(backgroundColor = Color.Black)
                    ) {
                        Text(
                            text = "LogIn",
                            color = Color.White,
                            textAlign = TextAlign.Center,
                            fontSize = 18.sp,
                            modifier = Modifier
                                .size(100.dp, 35.dp)
                                .padding(4.dp),
                        )
                    }

                    TextButton(onClick = {print("Working")
                        mContext.startActivity(Intent(mContext,SignUp::class.java))
                    }) {
                        Text(
                            text = "Don't have an Account?",
                            fontSize = 18.sp,
                        )
                    }
                }
            }
        }
    )


}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    SistaCabTheme {

    }
}