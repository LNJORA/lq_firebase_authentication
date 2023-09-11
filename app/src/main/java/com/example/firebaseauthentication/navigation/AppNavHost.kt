package com.example.firebaseauthentication.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.firebaseauthentication.ui.theme.screens.About.AboutScreen
import com.example.firebaseauthentication.ui.theme.screens.Home.Homescreen
import com.example.firebaseauthentication.ui.theme.screens.Login.LoginScreen
import com.example.firebaseauthentication.ui.theme.screens.Products.AddProductScreen
import com.example.firebaseauthentication.ui.theme.screens.Products.UpdateProductScreen
import com.example.firebaseauthentication.ui.theme.screens.Products.ViewProductsScreen
import com.example.firebaseauthentication.ui.theme.screens.Register.RegisterScreen

@Composable
fun AppNavHost(modifier: Modifier=Modifier,navController:NavHostController= rememberNavController(),startDestination:String= ROUT_LOGIN) {
    NavHost(
        navController = navController,
        modifier = modifier,
        startDestination = startDestination
    ) {
        composable(ROUT_LOGIN) {
            LoginScreen(navController)
        }
        composable(ROUTE_REGISTER) {
            RegisterScreen(navController)
        }
        composable(ROUTE_UPDATE_PRODUCT+"/{id}"){passedData->
            UpdateProductScreen(navController,passedData.arguments?.getString("id")!!)
        }
        composable(ROUTE_ABOUT){
            AboutScreen(navController)
        }
        composable(ROUTE_HOME){
            Homescreen(navController)

        }
        composable(ROUTE_ADD_PRODUCT){
            AddProductScreen(navController)
        }
        composable(ROUTE_VIEW_PRODUCT){
            ViewProductsScreen(navController)

        }


    }
}