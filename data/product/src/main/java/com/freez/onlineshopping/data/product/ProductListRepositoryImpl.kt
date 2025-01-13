package com.freez.onlineshopping.data.product

import com.freez.onlineshopping.data.product.model.ProductDao
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class ProductListRepositoryImpl @Inject constructor() : ProductListRepository {
    override suspend fun getAllProducts(): Flow<List<ProductDao>> {
        return flow {
            // Simulate fetching data (API or database)
            val products = listOf(ProductDao(1, "Product 1", 240000.0, 4.2, false, "url",
                "https://lafrenchtouch.co/wp-content/uploads/2022/10/Blanc-frontthumb-84-1200x1200.jpg"),
                ProductDao(2, "Product 2", 500000.0, 3.2, true, "sadsa",
                    "https://i.etsystatic.com/23266855/r/il/823d6f/4124076991/il_1588xN.4124076991_gsw4.jpg"),
                ProductDao(1, "Product 1", 240000.0, 4.2, false, "url",
                    "https://lafrenchtouch.co/wp-content/uploads/2022/10/Blanc-frontthumb-84-1200x1200.jpg"),
                ProductDao(2, "Product 2", 500000.0, 3.2, true, "sadsa",
                    "https://i.etsystatic.com/23266855/r/il/823d6f/4124076991/il_1588xN.4124076991_gsw4.jpg"),
                ProductDao(1, "Product 1", 240000.0, 4.2, false, "url",
                    "https://lafrenchtouch.co/wp-content/uploads/2022/10/Blanc-frontthumb-84-1200x1200.jpg"),
                ProductDao(2, "Product 2", 500000.0, 3.2, true, "sadsa",
                    "https://i.etsystatic.com/23266855/r/il/823d6f/4124076991/il_1588xN.4124076991_gsw4.jpg"))
            emit(products)
        }
    }

}