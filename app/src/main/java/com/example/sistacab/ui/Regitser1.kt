package com.example.sistacab.ui

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
import com.example.sistacab.MainActivity
import com.example.sistacab.R
import com.example.sistacab.Register
import com.example.sistacab.ui.ui.theme.SistaCabTheme

class Register1 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SistaCabTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    LoginDriver()
                }
            }
        }
    }
}


@Composable
fun LoginDriver() {
    val mContext = LocalContext.current
    val focus = LocalFocusManager.current

    Column {
        Row(
            Modifier
                .background(Color(230, 206, 85))
                .fillMaxWidth()
                .padding(1.dp, 5.dp, 50.dp, 5.dp),

            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center

        ) {
            Image(
                painter = painterResource(id = R.drawable.sistacab),
                contentDescription = "None",
                modifier = Modifier
                    .size(150.dp, 100.dp),
                contentScale = ContentScale.Inside,


                )
            Text(
                text = "Register As Driver",
                fontSize = 35.sp,

                fontWeight = FontWeight.SemiBold,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(5.dp, 6.dp, 10.dp, 6.dp),

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
                onValueChange = { name = it },
                singleLine = true,
                label = { Text(text = "Your Name") },
                placeholder = { Text(text = "Enter Your Name") },
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Ascii,
                    imeAction = ImeAction.Next
                ),
                colors = TextFieldDefaults.textFieldColors(backgroundColor = Color(
                    71,
                    71,
                    71,
                    255
                )),

                keyboardActions = KeyboardActions(onNext = { focus.moveFocus(FocusDirection.Down) })
            )

            Text(
                text = "Email",
                fontSize = 18.sp,

                fontWeight = FontWeight.SemiBold,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(56.dp, 6.dp, 6.dp, 6.dp),

                )
            var email by remember {
                mutableStateOf("")
            }
            TextField(
                value = email,
                onValueChange = { email = it },
                singleLine = true,
                label = { Text(text = "abc@example.com") },
                placeholder = { Text(text = "Enter Your Email") },
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Ascii,
                    imeAction = ImeAction.Next
                ),
                colors = TextFieldDefaults.textFieldColors(backgroundColor = Color(
                    71,
                    71,
                    71,
                    255
                )),
                keyboardActions = KeyboardActions(onNext = { focus.moveFocus(FocusDirection.Down) })
            )

            Text(
                text = "Date of Birth",
                fontSize = 18.sp,

                fontWeight = FontWeight.SemiBold,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(56.dp, 6.dp, 6.dp, 6.dp),

                )
            var dob by remember {
                mutableStateOf("")
            }
            TextField(
                value = dob,
                onValueChange = { dob = it },
                singleLine = true,
                label = { Text(text = "dd/mm/yyyy") },
                placeholder = { Text(text = "Enter Your date of birth ") },
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Ascii,
                    imeAction = ImeAction.Next
                ),
                colors = TextFieldDefaults.textFieldColors(backgroundColor = Color(
                    71,
                    71,
                    71,
                    255
                )),
                keyboardActions = KeyboardActions(onNext = { focus.moveFocus(FocusDirection.Down) })
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
                onValueChange = { pass = it },
                label = { Text(text = "Your Password") },
                placeholder = { Text(text = "Enter Your Password") },
                visualTransformation = PasswordVisualTransformation(),
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Password,
                    imeAction = ImeAction.Done
                ),
                colors = TextFieldDefaults.textFieldColors(backgroundColor = Color(
                    71,
                    71,
                    71,
                    255
                )),
                keyboardActions = KeyboardActions(onDone = { focus.clearFocus(true) })
            )

            Text(
                text = "Document",
                fontSize = 18.sp,
                fontWeight = FontWeight.SemiBold,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(56.dp, 6.dp, 6.dp, 6.dp),


                )
            var doc by remember {
                mutableStateOf("")
            }
            TextField(
                value = doc,
                singleLine = true,
                onValueChange = { doc = it },
                label = { Text(text = "Upload your Driving Licence") },
                placeholder = { Text(text = "Enter Your Password") },
                visualTransformation = PasswordVisualTransformation(),
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Password,
                    imeAction = ImeAction.Done
                ),
                colors = TextFieldDefaults.textFieldColors(backgroundColor = Color(
                    71,
                    71,
                    71,
                    255
                )),
                keyboardActions = KeyboardActions(onDone = { focus.clearFocus(true) })
            )

            Spacer(modifier = Modifier.size(10.dp))

            Text(
                text = "Term And Condition",
                color = Color.Black,
                textAlign = TextAlign.Center,
                fontSize = 18.sp,
                modifier = Modifier
                    .size(200.dp, 30.dp)
                    .padding(4.dp),
            )
            Spacer(modifier = Modifier.size(10.dp))

            Button(
                onClick = { mContext.startActivity(Intent(mContext, HomePage::class.java)) },
                colors = ButtonDefaults.buttonColors(Color.Black)
            ) {
                Text(
                    text = "Sign Up",
                    color = Color.White,
                    textAlign = TextAlign.Center,
                    fontSize = 18.sp,
                    modifier = Modifier
                        .size(100.dp, 30.dp)
                        .padding(2.dp),
                )
            }

            TextButton(onClick = {
                mContext.startActivity(Intent(mContext, MainActivity::class.java))
            }) {
                Text(
                    text = "Already Registered? Login here",
                    fontSize = 18.sp,
                )
            }
        }
    }
}

