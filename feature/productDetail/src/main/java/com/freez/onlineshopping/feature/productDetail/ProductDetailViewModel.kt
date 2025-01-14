package com.freez.onlineshopping.feature.productDetail

import androidx.compose.runtime.collectAsState
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.freez.onlineshopping.domain.productDetail.GetProductDetailUseCase
import com.freez.onlineshopping.domain.productDetail.ProductDetail
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch
import javax.inject.Inject


@HiltViewModel
class ProductDetailViewModel @Inject constructor(
    private val productDetailUseCase: GetProductDetailUseCase
) : ViewModel() {
    private var _productDetail = MutableStateFlow<ProductDetail?>(null)
    val productDetail: StateFlow<ProductDetail?> get() = _productDetail

    init {
        loadProductList()
    }

    private fun loadProductList() {
        viewModelScope.launch {

            _productDetail.value = productDetailUseCase.execute(23123)
        }
    }

}