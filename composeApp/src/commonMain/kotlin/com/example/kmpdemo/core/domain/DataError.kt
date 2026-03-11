package com.example.kmpdemo.core.domain

sealed interface DataError: Error{

    enum class Remote: DataError{
        REQUEST_TIMEOUT,
        TOO_MANY_REQUESTS,
        SERVER_ERROR,
        NO_INTERNET,
        SERIALIZATION,
        UNKNOWN
    }

    enum class Local: DataError{
        EMPTY_RESPONSE,
        UNKNOWN
    }


}