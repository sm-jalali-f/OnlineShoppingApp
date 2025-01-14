package com.freez.onlineshopping.domain.productDetail

data class ProductDetail(val id: Long,
                         val name: String,
                         val description: String,
                         val price: Double,
                         val rating: Double,
                         val isFavorite: Boolean,
                         val url: String,
                         val imageUrl: String)
