package com.freez.onlineshopping.data.product.model

data class ProductDao(val id: Long, val name: String, val price: Double, val rating: Double,
                      val isFavorite: Boolean, val url: String, val imageUrl: String)
