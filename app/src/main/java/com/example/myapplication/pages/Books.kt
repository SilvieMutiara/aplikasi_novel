@file:OptIn(ExperimentalMaterial3Api::class)

package com.example.myapplication.pages

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.myapplication.data.ListBook
import com.example.myapplication.data.getAllHorizontalListBook
import com.example.myapplication.data.getAllListBooks


@Composable
fun Books(navController: NavController,modifier: Modifier = Modifier) {
    var searchBook by remember { mutableStateOf("") }
    val focusManager = LocalFocusManager.current

    val allVerticalBooks = getAllListBooks()
    val allHorizontalBooks = getAllHorizontalListBook()

    val filteredVertical = allVerticalBooks.filter {
            it.title.contains(searchBook, ignoreCase = true) || it.author.contains(searchBook, ignoreCase = true)
        }

    val filteredHorizontal = allHorizontalBooks.filter {
            it.title.contains(searchBook, ignoreCase = true) || it.author.contains(searchBook, ignoreCase = true)
        }


    Column (modifier = modifier){
        Row (
            modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
        ) {
            TextField(
                value = searchBook,
                onValueChange = { searchBook = it },
                label = { Text("Cari Buku/Penulis...") },
                singleLine = true,
                shape = RoundedCornerShape(24.dp),
                modifier = Modifier
                    .weight(1f)
                    .background(Color(0XFFF0F0F0),shape = RoundedCornerShape(24.dp)),
                trailingIcon = {
                    IconButton(onClick = { focusManager.clearFocus() }) {
                        Icon(
                            imageVector = Icons.Default.Search,
                            contentDescription = "Search Icon",
                            tint = Color.Gray
                        )
                    }
                },
                colors = TextFieldDefaults.textFieldColors(
                    containerColor = Color(0xFFEDE7F6),
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent,
                    cursorColor = Color.Gray
                ),
                textStyle = TextStyle(fontSize = 15.sp),
                )
        }


        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = "Fiksi Terjemahan",
            style = TextStyle(fontSize = 20.sp, fontWeight = FontWeight.Bold),
            modifier = Modifier.padding(horizontal = 14.dp, vertical = 2.dp)
        )
        LazyRowBook(navController = navController, books = filteredHorizontal)


        Text(
            text = "Fiksi Indonesia",
            style = TextStyle(fontSize = 20.sp, fontWeight = FontWeight.Bold),
            modifier = Modifier.padding(horizontal = 14.dp, vertical = 6.dp)
        )
        LazyColumnBook(navController = navController, books = filteredVertical)
    }
}

@Composable
fun LazyRowBook(navController: NavController, books: List<ListBook>){
    LazyRow (modifier = Modifier
        .fillMaxWidth()
    ) {
        itemsIndexed(books) { index, item ->
            BookHorizontalItem(item = item, index = index, navController = navController)
        }
    }
}

@Composable
fun LazyColumnBook (navController: NavController, modifier: Modifier = Modifier, books: List<ListBook>){
    LazyColumn (modifier = modifier
        ) {
        itemsIndexed(books) { index, item ->
            BookItem(item = item, index = index, navController = navController)
        }
    }
}

@Composable
fun BookHorizontalItem(item: ListBook, index: Int, navController: NavController){
    val context = LocalContext.current
    val colors = listOf(Color(0x30F8BBD0), Color(0x30D1C4E9))
    val backgroundColor = colors[index % colors.size]
    Box (
        modifier = Modifier
            .padding(18.dp)
            .width(170.dp)
            .height(230.dp)
            .clickable {
                navController.navigate("detail/${item.imageRes}/${item.title}/${item.author}/${item.genre}/${item.synopsis}")
                Toast.makeText(context, "Clicked ${item.title}",Toast.LENGTH_SHORT).show()
            }
            .background(color = backgroundColor,
                shape = RoundedCornerShape(topStart = 30.dp, topEnd = 30.dp, bottomStart = 30.dp, bottomEnd = 30.dp)
            )
    ) {
    Column(
        modifier = Modifier
            .padding(horizontal = 10.dp)
            .size(230.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(id = item.imageRes),
            contentDescription = item.title,
            modifier = Modifier
                .size(150.dp)
        )
        Text(
            text = item.title,
            style = TextStyle(fontSize = 16.sp, fontWeight = FontWeight.Bold),
            maxLines = 2,
            modifier = Modifier.padding(top = 10.dp)
        )
        Text(
            text = item.author,
            style = TextStyle(fontSize = 14.sp),
            modifier = Modifier.padding(top = 5.dp)
        )
        }
    }
}

@Composable
fun BookItem(item: ListBook, index: Int ,navController: NavController){
    val context = LocalContext.current
    val colors = listOf(Color(0x30F8BBD0), Color(0x30D1C4E9))
    val backgroundColor = colors[index % colors.size]
    Row (
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
            .width(220.dp)
            .height(150.dp)
            .background(color = backgroundColor,
                shape = RoundedCornerShape(topStart = 30.dp, topEnd = 30.dp, bottomStart = 30.dp, bottomEnd = 30.dp)
            )
            .clickable {
                navController.navigate("detail/${item.imageRes}/${item.title}/${item.author}/${item.genre}/${item.synopsis}")
                Toast.makeText(context, "Clicked ${item.title}",Toast.LENGTH_SHORT).show()
            },
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painter = painterResource(id = item.imageRes),
            contentDescription = item.title,
            modifier = Modifier.size(120.dp).scale(1.0f)
        )

    Column (modifier = Modifier
        .fillMaxWidth()
        .padding(16.dp),
        horizontalAlignment = Alignment.Start
    ) {
        Text(
            text = item.title,
            style = TextStyle(fontSize = 16.sp, fontWeight = FontWeight.Bold),
            modifier = Modifier.padding(bottom = 5.dp)
        )
        Text(
            text = item.author,
            style = TextStyle(fontSize = 15.sp),
            modifier = Modifier.padding(bottom = 50.dp)
        )
        Text(
            text = item.genre,
            style = TextStyle(fontSize = 14.sp),
        )
        }
    }
}






