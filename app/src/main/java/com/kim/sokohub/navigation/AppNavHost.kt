package com.kim.sokohub.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.kim.sokohub.navigation.ROUT_REGISTER
import com.kim.sokohub.ui.screens.about.AboutScreen
import com.kim.sokohub.ui.screens.auth.LoginScreen
import com.kim.sokohub.ui.screens.auth.RegisterScreen
import com.kim.sokohub.ui.screens.home.HomeScreen
import com.kim.sokohub.ui.screens.intent.IntentScreen
import com.kim.sokohub.ui.screens.onboarding.OnBoardingScreen
import com.kim.sokohub.ui.screens.payment.PaymentScreen
import com.kim.sokohub.ui.screens.products.AddProductScreen
import com.kim.sokohub.ui.screens.products.UpdateProductScreen
import com.kim.sokohub.ui.screens.products.ViewProductScreen
import com.kim.sokohub.ui.screens.scalfold.ScaffoldScreen
import com.kim.sokohub.ui.screens.service.ServiceScreen
import com.kim.sokohub.ui.screens.splash.SplashScreen

@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination: String = ROUT_SPLASH
) {

    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier
    ) {
        composable(ROUT_HOME) {
            HomeScreen(navController)
        }
        composable(ROUT_ABOUT) {
            AboutScreen(navController)
        }
        composable(ROUT_LOGIN) {
            LoginScreen(navController)
        }
        composable(ROUT_REGISTER) {
            RegisterScreen(navController)
        }
        composable(ROUT_ONBOARDING) {
            OnBoardingScreen(navController)
        }
        composable(ROUT_PAYMENT) {
            PaymentScreen(navController)
        }
        composable(ROUT_SERVICE) {
            ServiceScreen(navController)
        }
        composable(ROUT_INTENT) {
            IntentScreen(navController)
        }
        composable(ROUT_SPLASH) {
            SplashScreen(navController)
        }
        composable(ROUT_SCAFFOLD) {
            ScaffoldScreen(navController)
        }

        composable(ROUTE_ADD_PRODUCT) { AddProductScreen(navController) }

        composable(ROUTE_VIEW_PRODUCTS) { ViewProductScreen(navController) }

        composable(
            ROUTE_UPDATE_PRODUCT,
            arguments = listOf(navArgument("productId") { type = NavType.StringType })
        ) { backStackEntry ->
            val productId = backStackEntry.arguments?.getString("productId")!!
            UpdateProductScreen(navController, productId)
        }


    }

}