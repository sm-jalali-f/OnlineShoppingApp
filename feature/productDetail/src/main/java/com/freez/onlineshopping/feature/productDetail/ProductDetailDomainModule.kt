package com.freez.onlineshopping.feature.productDetail

import com.freez.onlineshopping.domain.productDetail.GetProductDetailUseCase
import com.freez.onlineshopping.domain.productDetail.GetProductDetailUseCaseImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent


@Module
@InstallIn(ViewModelComponent::class)
object ProductDetailDomainModule {
    @Provides
    fun provideGetProductListUseCase(): GetProductDetailUseCase {
        return GetProductDetailUseCaseImpl()
    }

//    @Provides
//    fun provideProductListRepository(): ProductListRepository {
//        return ProductListRepositoryImpl()
//
//    }

}