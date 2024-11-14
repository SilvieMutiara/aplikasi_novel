package com.example.myapplication.pages

import androidx.compose.foundation.background
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.R

@Composable
fun About(modifier: Modifier = Modifier){
    Column (
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFEDE7F6))
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
    ){
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(180.dp)
                .background(
                    brush = Brush.verticalGradient(
                        colors = listOf(Color(0xFFF8BBD0), Color(0xFFD1C4E9))
                    ),
                    shape = RoundedCornerShape(bottomEnd = 32.dp, bottomStart = 32.dp)
                ),
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = painterResource(id = R.drawable.slv2),
                contentDescription = "Profile Picture Silvie",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(140.dp)
                    .clip(CircleShape)
                    .border(4.dp, Color.White, CircleShape)
                    .background(Color.White, CircleShape)
            )
        }

            Spacer(modifier = Modifier.height(24.dp))

            Text(
                text = "Silvie Mutiara Elisfa",
                style = TextStyle(
                    fontSize = 24.sp, fontWeight = FontWeight.Bold),
                color = Color(0xFF6A1B9A)
            )

            Spacer(modifier = Modifier.height(8.dp))

            Text(
                text = "Email : silvimutiara16@gmail.com",
                style = TextStyle(
                    fontSize = 16.sp),
                color = Color(0xFF6A1B9A)
            )

            Spacer(modifier = Modifier.height(12.dp))

            Text(
                text = "Jurusan : Sistem Informasi",
                style = TextStyle(
                    fontSize = 16.sp),
                color = Color(0xFF6A1B9A),
            )


            Spacer(modifier = Modifier.height(12.dp))

            Row (
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(horizontal = 16.dp)
                ){
                Icon(
                    imageVector = Icons.Default.LocationOn,
                    contentDescription = "univ",
                    tint = Color (0xFF6A1B9A)
                )
                Spacer(modifier = Modifier.width(8.dp))

                Text(
                    text = "Universitas Putra Indonesia \"YPTK\" Padang" ,
                    style = TextStyle(
                        fontSize = 16.sp),
                    color = Color(0xFF6A1B9A),
                )
            }

            Spacer(modifier = Modifier.height(50.dp))

            Box(
                modifier = Modifier
                .fillMaxWidth()
                    .background(Color(0xFFD1C4E9), shape = RoundedCornerShape(16.dp))
                    .padding(16.dp)
            ){
                Text(
                    text = "\"Membaca adalah jendela menuju dunia penuh inspirasi dan pengetahuan.📚✨\"",
                    style = TextStyle(
                        fontSize = 15.sp),
                    color = Color(0xFF6A1B9A),
                    textAlign = TextAlign.Center
                )
            }
        }
    }


