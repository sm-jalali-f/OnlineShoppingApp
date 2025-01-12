package com.freez.onlineshopping.domain.product.di

import com.freez.onlineshopping.data.product.ProductListRepository
import com.freez.onlineshopping.domain.product.GetProductListUseCase
import com.freez.onlineshopping.domain.product.impl.GetProductListUseCaseImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn

@Module
@InstallIn(ViewModelComponent::class)
object ProductDomainModule {

    @Provides
    fun provideGetProductListUseCase(
        repository: ProductListRepository
    ): GetProductListUseCase {
        return GetProductListUseCaseImpl(repository)
    }
}