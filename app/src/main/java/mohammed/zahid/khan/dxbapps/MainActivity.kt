package mohammed.zahid.khan.dxbapps

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import mohammed.zahid.khan.dxbapps.navigations.AppBottomNavigation
import mohammed.zahid.khan.dxbapps.navigations.SetUpNavigation
import mohammed.zahid.khan.dxbapps.ui.screens.home.Home
import mohammed.zahid.khan.dxbapps.ui.theme.DXBAppsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            //App theme to define colors, fonts
            DXBAppsTheme {

                //surface for background color across app
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    //navigation controller which helps to navigate from one screen to another
                    val navController = rememberNavController()


                    /*
                    scaffold is having some pre built components like bottom navigation, drawer, appbar etc
                    using here bottom navigation
                     */

                    Scaffold(
                        bottomBar = {
                            AppBottomNavigation(navController = navController)
                        }
                    ) {
                        /*
                        nav host where all screens are define to navigate base on route
                         */
                        SetUpNavigation(navController = navController)
                    }
                }
            }
        }
    }
}

