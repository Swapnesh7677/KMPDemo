package com.example.kmpdemo.book.domain.use_case

import com.example.kmpdemo.book.domain.Book
import com.example.kmpdemo.book.domain.BookRepository
import com.example.kmpdemo.core.domain.DataError
import com.example.kmpdemo.core.domain.Result

class SearchBooksUseCase(
    private val bookRepository: BookRepository
) {
    suspend operator fun invoke(query: String): Result<List<Book>, DataError.Remote> {
        return bookRepository.searchBooks(query)
    }
}
