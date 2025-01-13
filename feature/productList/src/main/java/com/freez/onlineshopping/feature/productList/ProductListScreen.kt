package com.freez.onlineshopping.feature.productList

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import coil3.compose.rememberAsyncImagePainter
import com.freez.onlineshopping.domain.product.model.Product


@Composable
fun ProductListScreen(viewModel: ProductListViewModel = hiltViewModel<ProductListViewModel>()) {
    val products by viewModel.products.collectAsStateWithLifecycle()
    Log.d("ProductListScreen", "ProductListScreen: ssssssssssssssssss")
    LazyVerticalGrid(
        columns = GridCells.Fixed(2),
        modifier = Modifier.fillMaxSize()
    ) {
        items(products) { product ->
            ProductCard(product, {})
        }
        Log.d("ProductListScreen", "ProductListScreen: ")
    }
}

@Preview(showBackground = true)
@Composable
fun ProductListScreenPreview() {
    ProductListScreen()
//    val viewModel: ProductListViewModel = hiltViewModel()
//    // Create mock data for preview
//    val mockViewModel = object : ProductListViewModel {
//        override val products: StateFlow<List<Product>> = MutableStateFlow(
//            listOf(
//                Product(1, "Baked Bread", 29.99, 2.2, "url", 4.5),
//                Product(2, "Fresh Soup", 19.99, 4.3, "url", 4.0)
//            )
//        )
//
//        override fun loadProductList() {
//            // Do nothing in the preview
//        }
//    }
//
//    // Pass the mock view model to your ProductListScreen for preview purposes
//    ProductListScreen(viewModel = mockViewModel)
}


@Composable
fun ProductCard(product: Product, onMoreDetailClick: (Long) -> Unit) {
    Log.d("ProductListScreen", "ProductCard: ")
    Card(
        modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth(),
        elevation = CardDefaults.cardElevation(defaultElevation = 5.dp),
        shape = RoundedCornerShape(16.dp)
    ) {
        Column(
            modifier = Modifier.padding(16.dp)
        ) {
            // Product Image
            Image(
                painter = rememberAsyncImagePainter(product.imageUrl),
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(180.dp)
                    .clip(RoundedCornerShape(16.dp)),
                contentScale = ContentScale.Crop
            )

            Spacer(modifier = Modifier.height(8.dp))

            // Product Name
            Text(
                text = product.name,
                style = MaterialTheme.typography.headlineLarge,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis
            )

            Spacer(modifier = Modifier.height(4.dp))

            // Price Section
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = product.price.toString(),
                    style = MaterialTheme.typography.bodyLarge,
                    color = MaterialTheme.colorScheme.primary
                )
                /*    Spacer(modifier = Modifier.width(8.dp))
                    Text(
                        text = oldPrice,
                        style = MaterialTheme.typography.body2.copy(
                            textDecoration = TextDecoration.LineThrough
                        ),
                        color = Color.Gray
                    )*/
            }

            Spacer(modifier = Modifier.height(8.dp))

            // Description
            Text(
                text = "Some description about the product goes here...",
                style = MaterialTheme.typography.bodySmall,
                maxLines = 2,
                overflow = TextOverflow.Ellipsis
            )

            Spacer(modifier = Modifier.height(8.dp))

            // Favorite and Buy Button
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                IconButton(onClick = { /* Handle favorite */ }) {
                    Icon(
                        imageVector = if (product.isFavorite) Icons.Default.Favorite else Icons.Default.FavoriteBorder,
                        contentDescription = null,
                        tint = if (product.isFavorite) Color.Red else Color.Gray
                    )
                }

                Button(
                    onClick = { onMoreDetailClick(product.id) },
                    shape = RoundedCornerShape(50),
                    modifier = Modifier.defaultMinSize(minHeight = 48.dp)
                ) {
                    Text(text = "BUY NOW")
                }
            }
        }
    }
}