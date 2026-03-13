package com.example.kmpdemo.book.domain.use_case

import com.example.kmpdemo.book.domain.BookRepository
import com.example.kmpdemo.core.domain.DataError
import com.example.kmpdemo.core.domain.Result

class GetBookDescriptionUseCase(
    private val repository: BookRepository
) {
    suspend operator fun invoke(bookId: String): Result<String?, DataError> {
        return repository.getBookDescription(bookId)
    }
}
