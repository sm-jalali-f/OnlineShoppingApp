package com.freez.onlineshopping.domain.product

import com.freez.onlineshopping.domain.product.model.Product
import kotlinx.coroutines.flow.Flow

interface GetProductListUseCase {
    suspend fun execute(): Flow<List<Product>>
}