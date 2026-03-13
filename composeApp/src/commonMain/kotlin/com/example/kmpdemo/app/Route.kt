package com.example.kmpdemo.app

import kotlinx.serialization.Serializable

sealed interface Route{

    @Serializable
    data object Splash: Route

    @Serializable
    data object BookGraph: Route
    @Serializable
    data object BookList: Route

    @Serializable
    data class BookDetail(val id: String): Route
}
