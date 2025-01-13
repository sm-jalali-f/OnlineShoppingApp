package com.freez.onlineshopping.domain.product.model

data class Product(val id: Long,
                   val name: String,
                   val price: Double,
                   val rating: Double,
                   val isFavorite: Boolean,
                   val url: String,
                   val imageUrl: String) {

}