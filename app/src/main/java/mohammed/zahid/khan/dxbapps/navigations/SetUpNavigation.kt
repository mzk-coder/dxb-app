package mohammed.zahid.khan.dxbapps.navigations

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import mohammed.zahid.khan.dxbapps.ui.screens.home.Home
import mohammed.zahid.khan.dxbapps.ui.screens.others.OtherScreens


@Composable
fun SetUpNavigation(navController: NavHostController) {


    NavHost(navController = navController, startDestination = Screens.Home.route) {


        composable(route = Screens.Home.route) {
            Home()
        }

        composable(route = Screens.Order.route) {
            OtherScreens(Screens.Order.title)
        }

        composable(route = Screens.Notifications.route) {
            OtherScreens(Screens.Notifications.title)
        }

        composable(route = Screens.NewOrder.route) {
            OtherScreens(Screens.NewOrder.title)
        }

        composable(route = Screens.MyAccount.route) {
            OtherScreens(Screens.MyAccount.title)
        }

    }

}