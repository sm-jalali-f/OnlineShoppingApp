package com.freez.onlineshopping.domain.product.model

data class Product( val id: String,
                    val name: String,
                    val price: Double,
                    val rating: Double,
                    val url: String,
                    val imageUrl: String) {

}