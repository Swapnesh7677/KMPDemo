package com.example.kmpdemo.book.domain.use_case

import app.cash.turbine.test
import com.example.kmpdemo.book.presentation.booklist.FakeBookRepository
import kotlinx.coroutines.test.runTest
import kotlin.test.BeforeTest
import kotlin.test.Test
import kotlin.test.assertTrue

class GetFavoriteBooksUseCaseTest {

    private lateinit var getFavoriteBooksUseCase: GetFavoriteBooksUseCase
    private lateinit var repository: FakeBookRepository

    @BeforeTest
    fun setUp() {
        repository = FakeBookRepository()
        getFavoriteBooksUseCase = GetFavoriteBooksUseCase(repository)
    }

    @Test
    fun `returns favorite books flow from repository`() = runTest {
        getFavoriteBooksUseCase().test {
            val books = awaitItem()
            assertTrue(books.isEmpty())
            awaitComplete()
        }
    }
}
