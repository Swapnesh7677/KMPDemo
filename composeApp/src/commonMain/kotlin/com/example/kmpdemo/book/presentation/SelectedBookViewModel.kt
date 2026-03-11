package com.example.kmpdemo.book.presentation

import androidx.lifecycle.ViewModel
import com.example.kmpdemo.book.domain.Book
import kotlinx.coroutines.flow.MutableStateFlow

class SelectedBookViewModel : ViewModel() {
   private val _selectedBook = MutableStateFlow<Book?>(null)

    val selectedBook: MutableStateFlow<Book?> = _selectedBook

    fun onSelectBook(book:Book?){
        _selectedBook.value = book
    }



}