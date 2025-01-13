package com.freez.onlineshopping.feature.productList


import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.freez.onlineshopping.domain.product.GetProductListUseCase
import com.freez.onlineshopping.domain.product.impl.GetProductListUseCaseImpl
import com.freez.onlineshopping.domain.product.model.Product
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch


class ProductListViewModel() : ViewModel() {
    private val productListUseCase: GetProductListUseCase = GetProductListUseCaseImpl()
    private var _products = MutableStateFlow<List<Product>>(emptyList())
    val products: StateFlow<List<Product>> get() = _products

    init {
        loadProductList()
    }

    private fun loadProductList() {
        viewModelScope.launch {

            val x = productListUseCase.execute().collectLatest { p ->
                _products.value = p
            }


        }
    }

}