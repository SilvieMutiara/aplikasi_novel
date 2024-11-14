@file:OptIn(ExperimentalMaterial3Api::class)

package com.example.myapplication

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import androidx.navigation.compose.currentBackStackEntryAsState
import com.example.myapplication.navigation.NavItem
import com.example.myapplication.pages.About
import com.example.myapplication.pages.Books
import com.example.myapplication.pages.DetailBook
import com.example.myapplication.pages.Favorite

@Composable
fun MainScreen(modifier: Modifier = Modifier){
    val navController = rememberNavController()
    val navItemList = listOf(
        NavItem("Home", R.drawable.home, "books"),
        NavItem("Favorite", R.drawable.agenda, "favorite"),
        NavItem("About", R.drawable.user , "about"),

        )

    var selectedIndex by remember {
        mutableIntStateOf(0)
    }

    Scaffold(
        modifier = Modifier.fillMaxSize(),

        topBar = {
                TopAppBar(
                    title = {
                        val currentBackStackEntry by navController.currentBackStackEntryAsState()
                        val currentRoute = currentBackStackEntry?.destination?.route

                        Box(modifier = Modifier.fillMaxWidth()) {
                            Text(
                                text = when (currentRoute) {
                                    "books" -> "Jelajahi Buku"
                                    "favorite" -> "Buku Favorit"
                                    "about" -> "Tentang Saya"
                                    else -> "Detail Buku"
                                },
                                style = TextStyle(
                                    fontSize = 22.sp,
                                    fontWeight = FontWeight.Bold
                                ),
                            )
                        }
                    },
                    navigationIcon = {
                        val currentBackStackEntry by navController.currentBackStackEntryAsState()
                        val currentRoute = currentBackStackEntry?.destination?.route

                        if (currentRoute?.startsWith("detail/") == true)  {
                            IconButton(onClick = { navController.popBackStack() }) {
                                Icon(
                                    imageVector = Icons.Default.ArrowBack,
                                    contentDescription = "Back"
                                )
                            }
                        }
                    },
                    actions = {
                        IconButton(onClick = { },
                            modifier = Modifier.offset(x = -9.dp)
                            ) {
                            Icon(
                                imageVector = Icons.Default.Menu,
                                contentDescription = "menu",
                                modifier = Modifier
                                    .size(30.dp)
                            )
                        }
                    }
                )
        },

        bottomBar = {
            Box (
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp, vertical = 10.dp)
                    .height(70.dp)
                    .background(
                        color = Color(0xFFEDE7F6),
                        shape = RoundedCornerShape(25.dp)
                    ),
                contentAlignment = Alignment.Center
            ) {
                Row (
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceAround
                ){
                    val currentBackStackEntry by navController.currentBackStackEntryAsState()
                    val currentRoute = currentBackStackEntry?.destination?.route

                    navItemList.forEachIndexed { index, navItem ->
                        NavigationBarItem(
                            selected = currentRoute == navItem.route,
                            onClick = {
                                navController.navigate(navItem.route){
                                    popUpTo(navController.graph.startDestinationId) { saveState= true
                                    }
                                    launchSingleTop= true
                                    restoreState = true
                                }
                            },
                            icon = {
                                Icon(
                                    painter = painterResource(id = navItem.icon),
                                    contentDescription = navItem.label,
                                    modifier = Modifier.size(24.dp),
                                    tint = Color.Unspecified
                                )
                            },
                            label = {
                                Text(text = navItem.label)
                            }
                        )
                    }
                }
            }
        }
        ) { innerPadding ->
        NavHost(
            navController = navController,
            startDestination = "books",
            modifier = Modifier.padding(innerPadding)
        ){
            composable("books") { Books(navController) }
            composable(
                "detail/{imageRes}/{title}/{author}/{genre}/{synopsis}",
                arguments = listOf(
                    navArgument("imageRes") {type = NavType.IntType},
                    navArgument("title") {type = NavType.StringType},
                    navArgument("author") {type = NavType.StringType},
                    navArgument("genre") {type = NavType.StringType},
                    navArgument("synopsis") {type = NavType.StringType}

                )
            ) { backStackEntry ->
                val imageRes = backStackEntry.arguments?.getInt("imageRes") ?.toInt() ?: R.drawable.c1
                val title = backStackEntry.arguments?.getString("title") ?: ""
                val author = backStackEntry.arguments?.getString("author") ?: ""
                val genre = backStackEntry.arguments?.getString("genre") ?: ""
                val synopsis = backStackEntry.arguments?.getString("synopsis") ?: ""

                DetailBook(
                    imageRes = imageRes,
                    title = title,
                    author = author,
                    genre = genre,
                    synopsis = synopsis,
                )
            }
            composable("favorite") { Favorite(navController) }
            composable("about") { About() }


        }
    }
}


@Composable
fun ContentScreen(modifier: Modifier = Modifier, selectedIndex : Int, navController: NavController){
    when(selectedIndex){
        0 -> Books(modifier = modifier, navController = navController)
        1 -> Favorite(modifier = modifier, navController = navController)
        2 -> About(modifier = modifier)

    }


}