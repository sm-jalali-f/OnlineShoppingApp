package com.freez.onlineshopping.data.product

import com.freez.onlineshopping.data.product.model.ProductDao
import com.freez.onlineshopping.domain.product.model.Product
import kotlinx.coroutines.flow.Flow

interface ProductListRepository {
    suspend fun getAllProducts(): Flow<List<ProductDao>>
}