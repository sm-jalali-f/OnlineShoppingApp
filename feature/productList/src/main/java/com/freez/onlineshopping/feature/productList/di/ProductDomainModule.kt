package com.freez.onlineshopping.feature.productList.di

import com.freez.onlineshopping.data.product.ProductListRepository
import com.freez.onlineshopping.data.product.ProductListRepositoryImpl
import com.freez.onlineshopping.domain.product.GetProductListUseCase
import com.freez.onlineshopping.domain.product.impl.GetProductListUseCaseImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
object ProductDomainModule {
    @Provides
    fun provideGetProductListUseCase(repository: ProductListRepository): GetProductListUseCase {
        return GetProductListUseCaseImpl(repository)
    }

}