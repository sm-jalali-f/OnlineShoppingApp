package com.freez.onlineshopping.domain.productDetail

class GetProductDetailUseCaseImpl : GetProductDetailUseCase {
    override fun execute(productId: Long): ProductDetail {
//        return flow {
        val temp = ProductDetail(
            1, "Product 1", "description", 240000.0,
            4.2, false, "url",
            "https://lafrenchtouch.co/wp-content/uploads/2022/10/Blanc-frontthumb-84-1200x1200.jpg"
        )
        return temp
//            emit(temp)
//        }
    }
}