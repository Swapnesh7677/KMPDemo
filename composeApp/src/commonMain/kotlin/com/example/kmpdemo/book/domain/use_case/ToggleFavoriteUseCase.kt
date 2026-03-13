package com.example.kmpdemo.book.domain.use_case

import com.example.kmpdemo.book.domain.Book
import com.example.kmpdemo.book.domain.BookRepository
import com.example.kmpdemo.core.domain.DataError
import com.example.kmpdemo.core.domain.EmptyResult

class ToggleFavoriteUseCase(
    private val repository: BookRepository
) {
    suspend operator fun invoke(book: Book, isFavorite: Boolean): EmptyResult<DataError.Local>? {
        return if (isFavorite) {
            repository.deleteFromFavorites(book.id)
            null
        } else {
            repository.markAsFavorite(book)
        }
    }
}
