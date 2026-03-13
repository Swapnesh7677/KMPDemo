package com.example.kmpdemo.book.presentation.book_detail

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.kmpdemo.app.Route
import com.example.kmpdemo.book.domain.use_case.GetBookDescriptionUseCase
import com.example.kmpdemo.book.domain.use_case.ObserveFavoriteStatusUseCase
import com.example.kmpdemo.book.domain.use_case.ToggleFavoriteUseCase
import com.example.kmpdemo.core.domain.onSuccess
import androidx.navigation.toRoute
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.flow.onStart
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch


class BookDetailViewModel(
    private val getBookDescriptionUseCase: GetBookDescriptionUseCase,
    private val observeFavoriteStatusUseCase: ObserveFavoriteStatusUseCase,
    private val toggleFavoriteUseCase: ToggleFavoriteUseCase,
    private val savedStateHandle: SavedStateHandle
) : ViewModel() {

    private val bookId = savedStateHandle.toRoute<Route.BookDetail>().id


    private val _state = MutableStateFlow(BookDetailState())
    val state = _state
        .onStart {
            fetchBookDescription()
            observeFavoriteStatus()
        }
        .stateIn(
            viewModelScope,
            SharingStarted.WhileSubscribed(5000L),
            _state.value
        )

    fun onAction(action: BookDetailAction) {
        when(action) {
            is BookDetailAction.OnSelectedBookChange -> {
                _state.update { it.copy(
                    book = action.book
                ) }
            }
            is BookDetailAction.OnFavoriteClick -> {
                viewModelScope.launch {
                    state.value.book?.let { book ->
                        toggleFavoriteUseCase(book, state.value.isFavorite)
                    }
                }
            }
            else -> Unit
        }
    }

    private fun observeFavoriteStatus() {
        observeFavoriteStatusUseCase(bookId)
            .onEach { isFavorite ->
                _state.update { it.copy(
                    isFavorite = isFavorite
                ) }
            }
            .launchIn(viewModelScope)
    }

    private fun fetchBookDescription() {
        viewModelScope.launch {
            getBookDescriptionUseCase(bookId)
                .onSuccess { description ->
                    _state.update { it.copy(
                        book = it.book?.copy(
                            description = description
                        ),
                        isLoading = false
                    ) }
                }
        }
    }
}
