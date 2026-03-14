package com.example.kmpdemo.book.presentation.booklist

import com.example.kmpdemo.book.domain.Book
import com.example.kmpdemo.core.presentation.UiText

data class BookListState(
    val searchQuery: String = "Kotlin",
    val searchResults: List<Book> = emptyList(),
    val favoriteBooks: List<Book> = emptyList(),
    val isLoading: Boolean = false,
    val selectedTabIndex: Int = 0,
    val errorMessage: UiText? = null,
    val isBottomSheetVisible: Boolean = false
)
