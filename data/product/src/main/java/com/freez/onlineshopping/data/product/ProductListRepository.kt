package com.freez.onlineshopping.data.product

import com.freez.onlineshopping.data.product.model.ProductDao
import kotlinx.coroutines.flow.Flow

interface ProductListRepository {
    suspend fun getAllProducts(): Flow<List<ProductDao>>
}