package com.example.kmpdemo.book.domain.use_case

import com.example.kmpdemo.book.domain.Book
import com.example.kmpdemo.book.domain.BookRepository
import kotlinx.coroutines.flow.Flow

class GetFavoriteBooksUseCase(
    private val bookRepository: BookRepository
) {
    operator fun invoke(): Flow<List<Book>> {
        return bookRepository.getFavoriteBooks()
    }
}
