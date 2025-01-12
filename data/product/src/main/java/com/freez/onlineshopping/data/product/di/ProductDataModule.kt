package com.freez.onlineshopping.data.product.di

import com.freez.onlineshopping.data.product.ProductListRepository
import com.freez.onlineshopping.data.product.ProductListRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
object ProductDataModule {

    @Provides
    fun provideProductListRepository(): ProductListRepository {
        return ProductListRepositoryImpl()
    }
}