package com.example.kmpdemo.book.domain.use_case

import com.example.kmpdemo.book.domain.Book
import com.example.kmpdemo.book.domain.BookRepository
import com.example.kmpdemo.book.presentation.booklist.FakeBookRepository
import com.example.kmpdemo.core.domain.Result
import kotlinx.coroutines.test.runTest
import kotlin.test.BeforeTest
import kotlin.test.Test
import kotlin.test.assertIs
import kotlin.test.assertTrue

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
}
