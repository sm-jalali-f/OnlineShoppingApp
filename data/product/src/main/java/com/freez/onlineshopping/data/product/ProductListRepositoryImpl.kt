package com.freez.onlineshopping.data.product

import com.freez.onlineshopping.domain.product.model.Product
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class ProductListRepositoryImpl : ProductListRepository {
    override suspend fun getAllProducts(): Flow<List<Product>> {
        return flow {
            // Simulate fetching data (API or database)
            val products = listOf(Product(1, "Product 1", 240000, 4.2, "url",
                "https://lafrenchtouch.co/wp-content/uploads/2022/10/Blanc-frontthumb-84-1200x1200.jpg"),
                Product(2, "Product 2", 500000, 3.2, "sadsa",
                    "https://i.etsystatic.com/23266855/r/il/823d6f/4124076991/il_1588xN.4124076991_gsw4.jpg"))
            emit(products)
        }
    }

}