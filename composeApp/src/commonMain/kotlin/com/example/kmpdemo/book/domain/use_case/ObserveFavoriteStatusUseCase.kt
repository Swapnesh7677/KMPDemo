package com.example.kmpdemo.book.domain.use_case

import com.example.kmpdemo.book.domain.BookRepository
import kotlinx.coroutines.flow.Flow

class ObserveFavoriteStatusUseCase(
    private val repository: BookRepository
) {
    operator fun invoke(bookId: String): Flow<Boolean> {
        return repository.isBookFavorite(bookId)
    }
}
