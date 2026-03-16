package com.example.kmpdemo.book.domain.use_case

import com.example.kmpdemo.book.domain.Book
import com.example.kmpdemo.book.domain.BookRepository
import com.example.kmpdemo.book.presentation.booklist.FakeBookRepository
import com.example.kmpdemo.core.domain.DataError
import com.example.kmpdemo.core.domain.Result
import kotlinx.coroutines.test.runTest
import kotlin.test.BeforeTest
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertIs

class SearchBooksUseCaseTest {

    private lateinit var searchBooksUseCase: SearchBooksUseCase
    private lateinit var repository: FakeBookRepository

    @BeforeTest
    fun setUp() {
        repository = FakeBookRepository()
        searchBooksUseCase = SearchBooksUseCase(repository)
    }

    @Test
    fun `when query is valid, returns success result`() = runTest {
        val result = searchBooksUseCase("Kotlin")
        
        assertIs<Result.Success<List<Book>>>(result)
    }

    @Test
    fun `when repository returns error, use case returns same error`() = runTest {
        val expectedError = DataError.Remote.SERVER_ERROR
        repository.searchBooksResult = Result.Error(expectedError)

        val result = searchBooksUseCase("Kotlin")

        assertIs<Result.Error<DataError.Remote>>(result)
        assertEquals(expectedError, result.error)
    }

    @Test
    fun `when query is empty, returns empty result`() = runTest {
        val result = searchBooksUseCase("")
        assertIs<Result.Success<List<Book>>>(result)
    }
}
