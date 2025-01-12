package com.freez.onlineShopping.feature.productlist

//import kotlinx.coroutines.flow.MutableStateFlow
//import kotlinx.coroutines.flow.StateFlow
//import kotlinx.coroutines.launch
//import kotlinx.coroutines.flow.flow

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.freez.onlineshopping.domain.product.GetProductListUseCase
import com.freez.onlineshopping.domain.product.model.Product
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ProductListViewModel @Inject constructor(
    private val productListUseCase: GetProductListUseCase
) : ViewModel() {

    private val _products = MutableStateFlow<List<Product>>(emptyList())
    val products: StateFlow<List<Product>> get() = _products

    init {
        loadProductList()
    }

    private fun loadProductList() {
        viewModelScope.launch {
//            productListUseCase.execute().collect(FlowCollector<>(){})

            val x = productListUseCase.execute().collect()

        }
    }

}