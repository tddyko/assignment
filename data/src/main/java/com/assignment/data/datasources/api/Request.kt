package com.assignment.data.datasources.api

import retrofit2.http.GET

interface Request {

    @GET("prod/list")
    suspend fun listProduct(): ProductList
}