package com.freez.onlineshopping.feature.productList


import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.freez.onlineshopping.domain.product.GetProductListUseCase
import com.freez.onlineshopping.domain.product.model.Product
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch


class ProductListViewModel(private val productListUseCase: GetProductListUseCase) : ViewModel() {

    private val _products = MutableStateFlow<List<Product>>(emptyList())
    val products: StateFlow<List<Product>> get() = _products

    init {
        loadProductList()
    }

    private fun loadProductList() {
        viewModelScope.launch {

            val x = productListUseCase.execute().collect()


        }
    }

}