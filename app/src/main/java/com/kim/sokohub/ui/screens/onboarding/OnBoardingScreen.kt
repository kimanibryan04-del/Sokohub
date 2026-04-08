package com.kim.sokohub.ui.screens.onboarding

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.kim.sokohub.R
import com.kim.sokohub.ui.theme.newme

@Composable
fun OnBoardingScreen(navController: NavController){

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center

    ) {
        Image(
            painter = painterResource(R.drawable.product),
            contentDescription = "product",
            modifier = Modifier.size(300.dp)
        )

        Spacer(
            modifier = Modifier.height(20.dp)
        )

        Text(
            text = "Welcome to SokoHub",
            fontSize = 35.sp,
            fontWeight = FontWeight.ExtraBold,
            fontFamily = FontFamily.Cursive,
            color = newme
        )

        Text(
            text = "Shop Smarter,",
            fontSize = 25.sp,
        )

        Text(
            text = "everywhere you go !,",
            fontSize = 25.sp,
        )

        Text(
            text = "A long paragraph typically exceeds 8–15 sentences or spans half a page, often appearing unfocused or academic, which can intimidate readers and reduce engagement. They are best used sparingly, often better split into smaller, thematic sections of 3–5 sentences to improve readability and maintain a single, cohesive topic. ",
            fontSize = 15.sp,
            textAlign = TextAlign.Center,
        )
        Spacer(
            modifier = Modifier.height(20.dp)
        )

        Button(
            onClick = {},
            colors = ButtonDefaults.buttonColors(newme),
            shape = RoundedCornerShape(size = 10.dp),
            modifier = Modifier.width(150.dp)

        ) {
            Text(
                text = "Get Started"
            )

        }









    }


}
@Preview(showBackground = true)
@Composable
fun OnBoardingPreview(){
    OnBoardingScreen(rememberNavController())
}