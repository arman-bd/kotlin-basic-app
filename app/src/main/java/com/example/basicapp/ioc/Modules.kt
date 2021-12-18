package com.example.basicapp.ioc

import android.content.Context
import com.example.basicapp.BuildConfig
import com.example.basicapp.api.ApiHelper
import com.example.basicapp.api.ApiHelperImpl
import com.example.basicapp.api.ApiService
import com.example.basicapp.repositories.MainRepository
import com.example.basicapp.utils.NetworkHelper
import com.example.basicapp.viewmodels.MainViewModel
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import org.koin.android.ext.koin.androidContext
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

private fun provideNetworkHelper(context: Context) = NetworkHelper(context)

private fun provideOkHttpClient() = if (BuildConfig.DEBUG) {
    val loggingInterceptor = HttpLoggingInterceptor()
    loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY)
    OkHttpClient.Builder()
        .addInterceptor(loggingInterceptor)
        .build()
} else OkHttpClient
    .Builder()
    .build()

private fun provideRetrofit(okHttpClient: OkHttpClient, BASE_URL: String):
    Retrofit = Retrofit.Builder()
        .addConverterFactory(GsonConverterFactory.create())
        .baseUrl(BASE_URL)
        .client(okHttpClient)
        .build()

private fun provideApiService(retrofit: Retrofit): ApiService = retrofit.create(ApiService::class.java)
private fun provideApiHelper(apiHelper: ApiHelperImpl): ApiHelper = apiHelper

val appModule = module {
    single { provideOkHttpClient() }
    single { provideRetrofit(get(), BuildConfig.BASE_URL) }
    single { provideApiService(get()) }
    single { provideNetworkHelper(androidContext()) }
    single<ApiHelper> {
        return@single ApiHelperImpl(get())
    }
}

val repoModule = module {
    single {
        MainRepository(get())
    }
}

val viewModelModule = module {
    viewModel {
        MainViewModel(get(), get())
    }
}
