package com.example.kmpdemo.book.data.network

import com.example.kmpdemo.book.data.dto.BookWorkDto
import com.example.kmpdemo.book.data.dto.SearchResponseDto
import com.example.kmpdemo.core.domain.DataError
import com.example.kmpdemo.core.domain.Result

interface RemoteBookDataSource {
    suspend fun searchBooks(
        query: String,
        resultLimit: Int? = null
    ): Result<SearchResponseDto, DataError.Remote>

    suspend fun getBookDetails(bookWorkId: String): Result<BookWorkDto, DataError.Remote>
}