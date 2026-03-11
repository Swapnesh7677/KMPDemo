package com.example.kmpdemo.book.presentation.book_detail

import com.example.kmpdemo.book.domain.Book


data class BookDetailState(
    val isLoading: Boolean = true,
    val isFavorite: Boolean = false,
    val book: Book? = null,
)
