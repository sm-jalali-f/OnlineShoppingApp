package com.freez.onlineshopping

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Icon
import androidx.compose.material.TopAppBar
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.core.view.WindowCompat
import com.freez.onlineshopping.feature.productDetail.ProductDetailScreen
import com.freez.onlineshopping.feature.productList.ProductListScreen
import com.freez.onlineshopping.ui.theme.OnlineShoppingTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

//        enableEdgeToEdge()
        setContent {

            OnlineShoppingTheme(darkTheme = false, dynamicColor = false) {
                WindowCompat.getInsetsController(window, window.decorView).apply {
                    isAppearanceLightStatusBars = false // Dark icons for status bar
                    window.statusBarColor = MaterialTheme.colorScheme.tertiary.toArgb()
                }
                Scaffold(
                    modifier = Modifier.fillMaxSize(),
                    topBar = {
                        TopAppBar(
//                            modifier = Modifier
//                                .fillMaxWidth()
//                                .height(56.dp),
                            backgroundColor = MaterialTheme.colorScheme.tertiary
                        ) {
                            TopBar()
                        }
                    },
                ) { innerPadding ->
                    ProductListScreen(
                        Modifier
                            .padding(innerPadding)
                    )
//                    ProductDetailScreen()
                }
            }
        }
    }
}

@Composable
fun TopBar(modifier: Modifier = Modifier) {
    Row(
        modifier = modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {

        Text("Online Market", modifier = modifier.padding(8.dp), color = Color.White)
        IconButton(onClick = {}) {
            Icon(
                painter = painterResource(id = R.drawable.baseline_shopping_cart_24),
                contentDescription = "Cart",
                tint = Color.White
            )
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(text = "Hello $name!", modifier = modifier)
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    OnlineShoppingTheme {
        Greeting("Android")
    }
}