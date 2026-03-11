package com.example.kmpdemo.book.presentation.booklist

import app.cash.turbine.test
import com.example.kmpdemo.book.domain.Book
import com.example.kmpdemo.book.domain.BookRepository
import com.example.kmpdemo.core.domain.DataError
import com.example.kmpdemo.core.domain.EmptyResult
import com.example.kmpdemo.core.domain.Result
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.test.StandardTestDispatcher
import kotlinx.coroutines.test.resetMain
import kotlinx.coroutines.test.runTest
import kotlinx.coroutines.test.setMain
import kotlin.test.AfterTest
import kotlin.test.BeforeTest
import kotlin.test.Test
import kotlin.test.assertEquals

class BookListViewModelTest {

    private lateinit var viewModel: BookListViewModel
    private lateinit var repository: FakeBookRepository
    private val testDispatcher = StandardTestDispatcher()

    @OptIn(ExperimentalCoroutinesApi::class)
    @BeforeTest
    fun setUp() {
        Dispatchers.setMain(testDispatcher)
        repository = FakeBookRepository()
        viewModel = BookListViewModel(repository)
    }

    @OptIn(ExperimentalCoroutinesApi::class)
    @AfterTest
    fun tearDown() {
        Dispatchers.resetMain()
    }

    @Test
    fun `OnSearchQueryChange updates state`() = runTest {
        viewModel.state.test {
            // Initial state (due to stateIn and onStart)
            val initialState = awaitItem()
            
            viewModel.onAction(BookListAction.OnSearchQueryChange("Kotlin"))
            
            val updatedState = awaitItem()
            assertEquals("Kotlin", updatedState.searchQuery)
        }
    }
}

class FakeBookRepository : BookRepository {
    override suspend fun searchBooks(query: String): Result<List<Book>, DataError.Remote> {
        return Result.Success(emptyList())
    }

    override suspend fun getBookDescription(bookId: String): Result<String?, DataError> {
        return Result.Success("")
    }

    override fun getFavoriteBooks(): Flow<List<Book>> = flowOf(emptyList())

    override fun isBookFavorite(id: String): Flow<Boolean> = flowOf(false)

    override suspend fun markAsFavorite(book: Book): EmptyResult<DataError.Local> {
        return Result.Success(Unit)
    }

    override suspend fun deleteFromFavorites(id: String) {}
}
