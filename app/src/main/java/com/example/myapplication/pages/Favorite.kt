package com.example.myapplication.pages

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.myapplication.data.ListBook
import com.example.myapplication.data.getFavoriteBooks

@Composable
fun Favorite(navController: NavController, modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Text(
            text = "Perpustakaan",
            style = TextStyle(
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold
            ),
            modifier = Modifier.padding(14.dp)
        )
        LazyVerticalGrid(
            columns = GridCells.Fixed(2),
            modifier = Modifier
                .fillMaxSize(),
            verticalArrangement = Arrangement.spacedBy(16.dp),
            horizontalArrangement = Arrangement.spacedBy(0.dp)
        ) {
            itemsIndexed(getFavoriteBooks(), itemContent = { index, item ->
                FavBookItem(item = item, index = index, navController = navController)
            })
        }
    }
}

@Composable
fun FavBookItem(item: ListBook,  index: Int, navController: NavController) {
    val context = LocalContext.current
    val colors = listOf(Color(0x30F8BBD0), Color(0x30D1C4E9))
    val backgroundColor = colors[index % colors.size]
    Row(
        modifier = Modifier
            .padding(horizontal = 14.dp, vertical = 2.dp)
            .width(150.dp)
            .height(230.dp)
            .clickable {
                navController.navigate("detail/${item.imageRes}/${item.title}/${item.author}/${item.genre}/${item.synopsis}")
                Toast.makeText(context, "Clicked ${item.title}", Toast.LENGTH_SHORT).show()
            }
            .background(color = backgroundColor, shape = RoundedCornerShape(topStart = 30.dp, topEnd = 30.dp, bottomStart = 30.dp, bottomEnd = 30.dp)
            ),
            verticalAlignment = Alignment.CenterVertically
    ) {
        Column(
            modifier = Modifier
                .padding(14.dp)
                .size(240.dp)
                .wrapContentHeight()
                .clip(MaterialTheme.shapes.medium),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = item.imageRes),
                contentDescription = item.title,
                modifier = Modifier
                    .size(160.dp)
                    .clip(MaterialTheme.shapes.medium)
            )
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = item.title,
                style = TextStyle(
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold
                ),
                maxLines = 2
            )
            Text(
                text = item.author,
                style = TextStyle(fontSize = 14.sp),
                modifier = Modifier.padding(top = 2.dp)
            )
        }
    }
}