package com.example.myapplication.pages

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun DetailBook (
    imageRes: Int,
    title: String,
    author: String,
    genre: String,
    synopsis: String
){
    Column (
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Image(
            painter = painterResource(id = imageRes),
            contentDescription = title,
            modifier = Modifier
                .size(280.dp)
                .clip(RoundedCornerShape(20.dp))
                .padding(bottom = 6.dp)
        )
        Spacer(modifier = Modifier.height(10.dp))
        Text(
            text = "$title",
            style = TextStyle(fontSize = 20.sp, fontWeight = FontWeight.Bold))

        Spacer(modifier = Modifier.height(4.dp))

        Text(text = "$author",
            style = TextStyle(fontSize = 15.sp))

        Spacer(modifier = Modifier.height(4.dp))

        Text(text = "$genre",
            style = TextStyle(fontSize = 15.sp))

        Spacer(modifier = Modifier.height(14.dp))

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(
                    color = Color(0xFFEDE7F6),
                    shape = RoundedCornerShape(15.dp)
                )
                .padding(14.dp)

        ){
        Column {
            Text(text = "Sinopsis",
                style = TextStyle(fontSize = 20.sp, fontWeight = FontWeight.SemiBold),
                modifier = Modifier.padding(8.dp),
                )

            Text(text = "$synopsis",
                style = TextStyle(fontSize = 17.sp),
                modifier = Modifier.padding(8.dp),
                textAlign = TextAlign.Justify
                )
            }
        }
    }
}

