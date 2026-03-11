package com.example.kmpdemo.book.presentation.book_detail

import androidx.lifecycle.SavedStateHandle
import app.cash.turbine.test
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
    private val testDispatcher = StandardTestDispatcher()

    @OptIn(ExperimentalCoroutinesApi::class)
    @BeforeTest
    fun setUp() {
        Dispatchers.setMain(testDispatcher)
        repository = FakeBookRepository()
        
        val savedStateHandle = SavedStateHandle(mapOf("id" to "123"))
        viewModel = BookDetailViewModel(repository, savedStateHandle)
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
