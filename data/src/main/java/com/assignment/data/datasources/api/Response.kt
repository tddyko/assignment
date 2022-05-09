package com.assignment.data.datasources.api

import kotlinx.serialization.Serializable

@Serializable
data class ProductList (
    val code: String,
    val category: Category,
    val productions: Productions
)
@Serializable
data class Category (
    val key: String,
    val name: String
)
@Serializable
data class Productions (
    val key: String,
    val categoryKey: String,
    val name: String,
    val price: String
)