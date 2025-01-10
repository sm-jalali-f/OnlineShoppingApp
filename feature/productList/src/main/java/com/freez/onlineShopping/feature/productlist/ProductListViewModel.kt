package com.freez.onlineShopping.feature.productlist

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.freez.onlineshopping.domain.product.GetProductListUseCase
import com.freez.onlineshopping.domain.product.model.Product
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.toCollection

//import kotlinx.coroutines.flow.MutableStateFlow
//import kotlinx.coroutines.flow.StateFlow
//import kotlinx.coroutines.flow.collect
//import kotlinx.coroutines.launch

class ProductListViewModel(private val productListUseCase: GetProductListUseCase) : ViewModel() {
    private val _products = MutableStateFlow<List<Product>>(emptyList())
    val products: StateFlow<List<Product>> get() = _products

    private fun loadProductList() {
        viewModelScope.launch {
//            productListUseCase.execute().collect()
            productListUseCase.execute().toCollection() { productList: List<Product> ->
                _products.value = productList
            }
        }
    }

}