package com.freez.onlineshopping.domain.productDetail

import kotlinx.coroutines.flow.Flow

interface GetProductDetailUseCase {

    fun execute(productId: Long): ProductDetail
}