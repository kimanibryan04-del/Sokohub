package com.kim.sokohub.ui.screens.auth

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Black
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kim.sokohub.R
import com.kim.sokohub.ui.theme.newme

@Composable
fun LoginScreen(){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .paint(painter = painterResource(R.drawable.background), contentScale = ContentScale.FillBounds),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    ) {
        Image(
            painter = painterResource(R.drawable.product),
            contentDescription = "",
            modifier = Modifier.size(200.dp),
        )

        Spacer(modifier = Modifier.height(10.dp))

        Text(
            text = "Welcome Back",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
        )

        Spacer(modifier = Modifier.height(10.dp))

        //Variables
        var email by remember { mutableStateOf("") }
        var password by remember { mutableStateOf("") }

        //Email
        OutlinedTextField(
            value = email,
            onValueChange = {email = it},
            modifier = Modifier.width(350.dp),
            leadingIcon = { Icon(imageVector = Icons.Default.Email, contentDescription = "") },
            label = { Text("Email Address") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
            colors = OutlinedTextFieldDefaults.colors(
                unfocusedBorderColor = newme,
                focusedBorderColor = Black,
                unfocusedLeadingIconColor = newme,
                focusedLabelColor = newme
            )
        )

        Spacer(modifier = Modifier.height(10.dp))

        //Password
        OutlinedTextField(
            value = password,
            onValueChange = {password = it},
            modifier = Modifier.width(350.dp),
            leadingIcon = { Icon(imageVector = Icons.Default.Lock, contentDescription = "") },
            label = { Text("Password") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            colors = OutlinedTextFieldDefaults.colors(
                unfocusedBorderColor = newme,
                focusedBorderColor = Black,
                unfocusedLeadingIconColor = newme,
                focusedLabelColor = newme
            ),
            visualTransformation = PasswordVisualTransformation(),
        )

        Spacer(modifier = Modifier.height(10.dp))

        Button(
            onClick = {},
            colors = ButtonDefaults.buttonColors(newme),
            shape = RoundedCornerShape(size = 10.dp),
            modifier = Modifier.width(85.dp)

        ) {
            Text(
                text = "Login"
            )

        }

        Spacer(modifier = Modifier.height(10.dp))
        Text(
            text = "Don't have an Account? Register",
            fontWeight = FontWeight.Medium,
        )
















    }
}
@Preview(showBackground = true)
@Composable
fun LoginScreenPreview(){
    LoginScreen()
}