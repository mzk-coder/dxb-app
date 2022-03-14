package mohammed.zahid.khan.dxbapps.ui.screens.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import mohammed.zahid.khan.dxbapps.data.models.HomeItem
import mohammed.zahid.khan.dxbapps.R
import mohammed.zahid.khan.dxbapps.ui.theme.AscentColor
import mohammed.zahid.khan.dxbapps.ui.theme.PrimaryDark

@Composable
fun ListItem(homeItem: HomeItem, index : Int) {

    val primary = if (index%2==0) AscentColor else PrimaryDark
    val secondary = if (index%2==0) PrimaryDark else AscentColor


    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(
                color = primary, shape = RoundedCornerShape(8.dp)
            )
            .clickable {

            }
            .padding(horizontal = 24.dp, vertical = 18.dp),
        verticalAlignment = Alignment.CenterVertically

    ) {
        Image(
            painter = painterResource(id = homeItem.icon),
            contentDescription = homeItem.label,
            modifier = Modifier.size(40.dp),
        )
        Spacer(modifier = Modifier.width(24.dp))

        Text(
            text = homeItem.label, style = TextStyle(
                color = secondary,
                fontWeight = FontWeight.Bold,
                fontSize = 22.sp
            ), modifier = Modifier.weight(1f)
        )

        Box(
            modifier = Modifier
                .size(30.dp)
                .background(secondary, shape = CircleShape),
            contentAlignment = Alignment.Center
        ) {
            Icon(painter = painterResource(id = R.drawable.ic_baseline_chevron_right_24),
                contentDescription = stringResource(id = R.string.app_name),
                tint = primary)
        }



    }
}
