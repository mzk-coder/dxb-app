package mohammed.zahid.khan.dxbapps.ui.screens.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import mohammed.zahid.khan.dxbapps.R
import mohammed.zahid.khan.dxbapps.utility.Utils.homeItemList

@Composable
fun Home() {
    Box(modifier = Modifier.fillMaxSize()
        .padding(bottom = 120.dp)
    ) {

        Image(
            painter = painterResource(id = R.drawable.group_background),
            contentDescription = stringResource(id = R.string.background_image),
            modifier = Modifier
                .fillMaxWidth()
                .clip(
                    shape = RoundedCornerShape(
                        topStart = 0.dp,
                        topEnd = 0.dp,
                        bottomEnd = 48.dp,
                        bottomStart = 48.dp
                    )
                ),
            contentScale = ContentScale.FillWidth
        )
        Box(modifier = Modifier.padding(vertical = 32.dp, horizontal = 24.dp)) {
            Image(
                painter = painterResource(id = R.drawable.logo),
                contentDescription = stringResource(id = R.string.app_logo),
            )
        }

        Box(
            modifier = Modifier
                .padding(vertical = 32.dp, horizontal = 16.dp)
                .align(Alignment.TopEnd)
        ) {
            IconButton(onClick = {

            }) {
                Icon(
                    painter = painterResource(id = R.drawable.menu_icon),
                    contentDescription = stringResource(id = R.string.app_logo),
                    tint = Color.White
                )
            }
        }

        LazyColumn(
            modifier = Modifier.fillMaxWidth()
                .padding(horizontal = 24.dp)
                .align(Alignment.BottomCenter),
            verticalArrangement = Arrangement.spacedBy(8.dp)

        ){

            itemsIndexed(homeItemList) { index, item ->
                ListItem(homeItem = item, index = index)
            }

        }

    }
}

@Preview
@Composable
fun HomePreview() {
    Home()
}