package com.example.kmpdemo.book.presentation.book_detail

import androidx.lifecycle.SavedStateHandle
import app.cash.turbine.test
import com.example.kmpdemo.book.domain.use_case.GetBookDescriptionUseCase
import com.example.kmpdemo.book.domain.use_case.ObserveFavoriteStatusUseCase
import com.example.kmpdemo.book.domain.use_case.ToggleFavoriteUseCase
import com.example.kmpdemo.book.presentation.booklist.FakeBookRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.StandardTestDispatcher
import kotlinx.coroutines.test.resetMain
import kotlinx.coroutines.test.runTest
import kotlinx.coroutines.test.setMain
import kotlin.test.AfterTest
import kotlin.test.BeforeTest
import kotlin.test.Test
import kotlin.test.assertEquals

class BookDetailViewModelTest {

    private lateinit var viewModel: BookDetailViewModel
    private lateinit var repository: FakeBookRepository
    private lateinit var getBookDescriptionUseCase: GetBookDescriptionUseCase
    private lateinit var observeFavoriteStatusUseCase: ObserveFavoriteStatusUseCase
    private lateinit var toggleFavoriteUseCase: ToggleFavoriteUseCase
    private val testDispatcher = StandardTestDispatcher()

    @OptIn(ExperimentalCoroutinesApi::class)
    @BeforeTest
    fun setUp() {
        Dispatchers.setMain(testDispatcher)
        repository = FakeBookRepository()
        
        getBookDescriptionUseCase = GetBookDescriptionUseCase(repository)
        observeFavoriteStatusUseCase = ObserveFavoriteStatusUseCase(repository)
        toggleFavoriteUseCase = ToggleFavoriteUseCase(repository)
        
        // Note: In real scenarios using Navigation Type Safety, 
        // SavedStateHandle might need the route object directly.
        val savedStateHandle = SavedStateHandle(mapOf("id" to "123"))
        
        viewModel = BookDetailViewModel(
            getBookDescriptionUseCase = getBookDescriptionUseCase,
            observeFavoriteStatusUseCase = observeFavoriteStatusUseCase,
            toggleFavoriteUseCase = toggleFavoriteUseCase,
            savedStateHandle = savedStateHandle
        )
    }

    @OptIn(ExperimentalCoroutinesApi::class)
    @AfterTest
    fun tearDown() {
        Dispatchers.resetMain()
    }

    @Test
    fun `initial state has isLoading true`() = runTest {
        viewModel.state.test {
            val state = awaitItem()
            assertEquals(true, state.isLoading)
        }
    }
}
