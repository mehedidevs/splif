package com.arif.spliff.di

import android.provider.SyncStateContract
import com.arif.spliff.network.Api
import com.arif.spliff.utils.AUTH_BASE_URL
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
class NetWorkModule {

    @Provides
    @Singleton
    fun providesRetrofit(): Retrofit.Builder {
        return Retrofit.Builder()
            .baseUrl(AUTH_BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
    }



    @Provides
    @Singleton
    fun providesSecuredApi(
        retrofitBuilder: Retrofit.Builder
    ): Api {
        return retrofitBuilder.build().create(Api::class.java)
    }




}