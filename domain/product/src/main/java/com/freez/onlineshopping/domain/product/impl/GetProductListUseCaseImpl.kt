package com.freez.onlineshopping.domain.product.impl

import com.freez.onlineshopping.data.product.ProductListRepository
import com.freez.onlineshopping.domain.product.GetProductListUseCase
import com.freez.onlineshopping.domain.product.model.Product
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetProductListUseCaseImpl @Inject constructor (private val productRepository: ProductListRepository) :
    GetProductListUseCase {
    override suspend fun execute(): Flow<List<Product>> {
        return productRepository.getAllProducts()
    }

}