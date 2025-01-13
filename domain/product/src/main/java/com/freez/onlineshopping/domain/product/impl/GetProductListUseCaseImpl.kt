package com.freez.onlineshopping.domain.product.impl

import com.freez.onlineshopping.data.product.ProductListRepository
import com.freez.onlineshopping.data.product.model.ProductDao
import com.freez.onlineshopping.domain.product.GetProductListUseCase
import com.freez.onlineshopping.domain.product.model.Product
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class GetProductListUseCaseImpl (private val productRepository: ProductListRepository) :
    GetProductListUseCase {
    override suspend fun execute(): Flow<List<Product>> {
        val allProductDao = productRepository.getAllProducts()
        return allProductDao.map { productDaoList -> productDaoList.map { p -> p.toProduct() } }
    }
}

fun ProductDao.toProduct(): Product {
    return Product(id = this.id, name = this.name, price = this.price, url = this.url,
        isFavorite = this.isFavorite, rating = this.rating, imageUrl = this.imageUrl)
}