package com.kim.sokohub.ui.screens.intent

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.kim.sokohub.ui.theme.newme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun IntentScreen(navController: NavController){
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        val mContent = LocalContext.current


        //Start of topbar
        TopAppBar(
            title = { Text(text = "Home") },
            navigationIcon = {
                IconButton(onClick = {}) {
                    Icon(imageVector = Icons.Default.Menu, contentDescription = "")
                }
            },
            actions = {
                IconButton(onClick = {}) {
                    Icon(imageVector = Icons.Default.ShoppingCart, contentDescription = "")
                }
                IconButton(onClick = {}) {
                    Icon(imageVector = Icons.Default.Notifications, contentDescription = "")
                }

            },
            colors = TopAppBarDefaults.topAppBarColors(
                containerColor = newme,
                navigationIconContentColor = Color.White,
            )
        )
        //End of topbar

        Spacer(modifier = Modifier.height(20.dp))

        //STK

        OutlinedButton(
            onClick = { },
            shape = RoundedCornerShape(size = 10.dp),
            modifier = Modifier.fillMaxWidth().padding(start =20.dp, end = 20.dp )
        )

        {
            Text(
                text = "Pay via M-pesa"
            )

        }

        Spacer(modifier = Modifier.height(20.dp))

        OutlinedButton(
            onClick = { },
            shape = RoundedCornerShape(size = 10.dp),
            modifier = Modifier.fillMaxWidth().padding(start =20.dp, end = 20.dp )
        )

        {
            Text(
                text = "Email"
            )

        }

        Spacer(modifier = Modifier.height(20.dp))

        OutlinedButton(
            onClick = { },
            shape = RoundedCornerShape(size = 10.dp),
            modifier = Modifier.fillMaxWidth().padding(start =20.dp, end = 20.dp )
        )

        {
            Text(
                text = "Send Message"
            )

        }

        Spacer(modifier = Modifier.height(20.dp))

        OutlinedButton(
            onClick = { },
            shape = RoundedCornerShape(size = 10.dp),
            modifier = Modifier.fillMaxWidth().padding(start =20.dp, end = 20.dp )
        )

        {
            Text(
                text = "Call"
            )

        }

        Spacer(modifier = Modifier.height(20.dp))

        OutlinedButton(
            onClick = { },
            shape = RoundedCornerShape(size = 10.dp),
            modifier = Modifier.fillMaxWidth().padding(start =20.dp, end = 20.dp )
        )

        {
            Text(
                text = "Share"
            )

        }

        Spacer(modifier = Modifier.height(20.dp))

        OutlinedButton(
            onClick = { },
            shape = RoundedCornerShape(size = 10.dp),
            modifier = Modifier.fillMaxWidth().padding(start =20.dp, end = 20.dp )
        )

        {
            Text(
                text = "Camera"
            )

        }




    }
}
@Preview(showBackground = true)
@Composable
fun IntentScreenPreview(){
    IntentScreen(rememberNavController())
}