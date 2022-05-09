package com.assignment.data.datasources.network

import com.assignment.data.datasources.network.adapter.FlowCallAdapterFactory
import com.assignment.data.BuildConfig
import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import kotlinx.serialization.ExperimentalSerializationApi
import okhttp3.OkHttpClient
import javax.inject.Inject
import javax.inject.Singleton
import kotlinx.serialization.json.Json
import okhttp3.MediaType.Companion.toMediaType
import retrofit2.Retrofit

@Singleton
class AssignmentRetrofit @Inject constructor(
    okHttpClient: OkHttpClient,
){
    @OptIn(ExperimentalSerializationApi::class)
    val retrofit: Retrofit = Retrofit.Builder()
        .baseUrl(BuildConfig.TEST_URL)
        .addCallAdapterFactory(FlowCallAdapterFactory())
        .addConverterFactory(Json.asConverterFactory("application/json".toMediaType()))
        .client(okHttpClient)
        .build()
}