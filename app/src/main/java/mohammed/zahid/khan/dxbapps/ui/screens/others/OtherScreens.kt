package mohammed.zahid.khan.dxbapps.ui.screens.others

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.sp
import mohammed.zahid.khan.dxbapps.ui.theme.PrimaryDark

@Composable
fun OtherScreens(screen: String) {
    Box(modifier = Modifier.fillMaxSize()){
        Text(text = screen, style = TextStyle(
            color = PrimaryDark,
            fontSize = 24.sp
        ),
            modifier = Modifier.align(Alignment.Center)
        )
    }
}