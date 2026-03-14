package com.example.kmpdemo.book.presentation.booklist

import com.example.kmpdemo.book.domain.Book

sealed interface BookListAction {
    data class OnSearchQueryChange(val query: String): BookListAction
    data class OnBookClick(val book: Book): BookListAction
    data class OnTabSelected(val index: Int): BookListAction
    data object OnToggleBottomSheet : BookListAction
    data object OnSettingsClick : BookListAction
}
