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
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.sistacab.ui.HomePage
import com.example.sistacab.ui.Register1
import com.example.sistacab.ui.theme.SistaCabTheme

class Register : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SistaCabTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background) {
                    RegisterFun()
                }
            }
        }
    }
}

@Composable
fun RegisterFun() {
    val mContext = LocalContext.current
    val focus = LocalFocusManager.current
    Column {
        Column(
            Modifier.background(Color(230, 206, 85)),

            )
        {
            Image(
                painter = painterResource(id = R.drawable.logo),
                contentDescription = "None",
                modifier = Modifier.fillMaxWidth().size(250.dp),
                contentScale = ContentScale.Fit
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
                text = "Login For Driver",
                fontSize = 28.sp,

                fontWeight = FontWeight.SemiBold,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(106.dp, 16.dp, 66.dp, 26.dp),

                )

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
            Spacer(modifier=Modifier.size(20.dp))


            Button(
                onClick = {mContext.startActivity(Intent(mContext, HomePage::class.java)) },
                colors = ButtonDefaults.buttonColors( Color.Black)
            ) {
                Text(
                    text = "LogIn",
                    color = Color.White,
                    textAlign = TextAlign.Center,
                    fontSize = 18.sp,
                    modifier = Modifier
                        .size(150.dp, 35.dp)
                        .padding(4.dp),
                )
            }
            TextButton(onClick = {mContext.startActivity(Intent(mContext, ForgotPassword::class.java))}) {
                Text(
                    text = "Forgot Password?",
                    fontSize = 18.sp,
                    textAlign = TextAlign.Right,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(4.dp, 4.dp, 100.dp, 4.dp),
                )
            }

            TextButton(onClick = {mContext.startActivity(Intent(mContext, Register1::class.java))}) {
                Text(
                    text = "Don't have an Account?",
                    fontSize = 18.sp,
                )
            }
        }
    }
}

