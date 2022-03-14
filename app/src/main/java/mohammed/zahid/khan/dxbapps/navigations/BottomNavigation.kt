package mohammed.zahid.khan.dxbapps.navigations

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import mohammed.zahid.khan.dxbapps.R
import mohammed.zahid.khan.dxbapps.ui.theme.AscentColor
import mohammed.zahid.khan.dxbapps.ui.theme.PrimaryDark

@Composable
fun AppBottomNavigation(navController: NavController) {
    val menuItems = listOf(
        Screens.Home,
        Screens.Order,
        Screens.Empty,
        Screens.Notifications,
        Screens.MyAccount
    )

    Box(modifier = Modifier
        .fillMaxWidth()
    ) {
        BottomNavigation(
            Modifier
                .height(64.dp)
                .align(Alignment.BottomCenter),
            backgroundColor = Color.White,
        ) {

            val navBackStackEntry by navController.currentBackStackEntryAsState()
            val currentRoute = navBackStackEntry?.destination?.route

            menuItems.forEach { screens ->

                BottomNavigationItem(
                    label = {
                        Text(
                            text = screens.title,
                            fontSize = 10.sp,
                            color = Color.Black
                        )
                    },
                    alwaysShowLabel = true,
                    selected = currentRoute == screens.route,
                    onClick = {
                        if (screens.isActive) {
                            navController.navigate(screens.route){
                                navController.graph.startDestinationRoute?.let { screen_route ->
                                    popUpTo(screen_route) {
                                        saveState = true
                                    }
                                }
                                launchSingleTop = true
                                restoreState = true
                            }
                        }
                    },
                    icon = {
                        if (screens.isActive) {
                            Icon(
                                painter = painterResource(id = screens.icon(currentRoute == screens.route)),
                                contentDescription = screens.title
                            )
                        }
                    },
                    selectedContentColor = PrimaryDark,
                    unselectedContentColor = AscentColor,
                    enabled = screens.isActive

                )

            }
        }

        IconButton(
            onClick = {
                navController.navigate(Screens.NewOrder.route){
                    navController.graph.startDestinationRoute?.let { screen_route ->
                        popUpTo(screen_route) {
                            saveState = true
                        }
                    }
                    launchSingleTop = true
                    restoreState = true
                }
            },
            modifier = Modifier
                .padding(bottom = 4.dp)
                .size(76.dp)
                .background(color = AscentColor, shape = CircleShape)
                .align(Alignment.Center),
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ){
                Icon(
                    painter = painterResource(id = R.drawable.new_order_icon),
                    contentDescription = Screens.NewOrder.title, tint = Color.White)
                Spacer(modifier = Modifier.height(4.dp))
                Text(
                    text = Screens.NewOrder.title,
                    fontSize = 10.sp,
                    color = Color.White
                )
            }

        }

    }

}



