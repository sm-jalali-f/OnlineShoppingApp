package com.freez.onlineshopping.feature.productDetail

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import coil3.compose.rememberAsyncImagePainter
import coil3.request.ImageRequest
import com.freez.onlineshopping.domain.productDetail.ProductDetail

@Composable
fun ProductDetailScreen(viewModel: ProductDetailViewModel = hiltViewModel()
) {
    val product by viewModel.productDetail.collectAsState()
    val painter = rememberAsyncImagePainter(
        model = ImageRequest.Builder(LocalContext.current).data(product?.imageUrl)
            .size(coil3.size.Size.ORIGINAL) // Set the target size to load the image at.
            .build()
    )
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Spacer(modifier = Modifier.height(5.dp))
        Image(
            painter = painter,
            contentDescription = product?.name,
            modifier = Modifier
                .fillMaxWidth()
                .height(250.dp),
            contentScale = ContentScale.Fit
        )

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = product?.name?:"",
            style = MaterialTheme.typography.headlineSmall,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = product?.description?:"", style = MaterialTheme.typography.bodyLarge
        )

        Spacer(modifier = Modifier.weight(1f))

        Button(
            onClick = {  }, modifier = Modifier.fillMaxWidth()
        ) {
            Text(text = "Add to Cart")
        }
    }
}
