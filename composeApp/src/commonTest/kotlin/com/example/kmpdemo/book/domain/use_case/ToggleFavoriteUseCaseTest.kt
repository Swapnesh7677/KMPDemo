package com.example.kmpdemo.book.domain.use_case

import com.example.kmpdemo.book.domain.Book
import com.example.kmpdemo.book.presentation.booklist.FakeBookRepository
import com.example.kmpdemo.core.domain.Result
import kotlinx.coroutines.test.runTest
import kotlin.test.BeforeTest
import kotlin.test.Test
import kotlin.test.assertIs
import kotlin.test.assertNull

class ToggleFavoriteUseCaseTest {

    private lateinit var toggleFavoriteUseCase: ToggleFavoriteUseCase
    private lateinit var repository: FakeBookRepository

    @BeforeTest
    fun setUp() {
        repository = FakeBookRepository()
        toggleFavoriteUseCase = ToggleFavoriteUseCase(repository)
    }

    @Test
    fun `when isFavorite is false, calls markAsFavorite`() = runTest {
        val book = Book(
            id = "1",
            title = "Kotlin",
            authors = emptyList(),
            imageUrl = "",
            averageRating = 4.5,
            ratingCount = 10,
            description = null,
            languages = emptyList(),
            firstPublishYear = null,
            numPages = null,
            numEditions = 0
        )
        val result = toggleFavoriteUseCase(book, isFavorite = false)
        
        assertIs<Result.Success<Unit>>(result)
    }

    @Test
    fun `when isFavorite is true, calls deleteFromFavorites`() = runTest {
        val book = Book(
            id = "1",
            title = "Kotlin",
            authors = emptyList(),
            imageUrl = "",
            averageRating = 4.5,
            ratingCount = 10,
            description = null,
            languages = emptyList(),
            firstPublishYear = null,
            numPages = null,
            numEditions = 0
        )
        val result = toggleFavoriteUseCase(book, isFavorite = true)
        
        assertNull(result)
    }


}
