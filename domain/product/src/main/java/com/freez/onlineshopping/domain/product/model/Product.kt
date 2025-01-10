package com.freez.onlineshopping.domain.product.model

data class Product(val id: Long,
                   val name: String,
                   val price: Long,
                   val rating: Double,
                   val url: String,
                   val imageUrl: String) {

}