package com.freez.onlineshopping.data.product

import com.freez.onlineshopping.domain.product.model.Product
import kotlinx.coroutines.flow.Flow

interface ProductListRepository {
    suspend fun getAllProducts(): Flow<List<Product>>
}