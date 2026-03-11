package com.example.kmpdemo.di

import androidx.sqlite.driver.bundled.BundledSQLiteDriver
import com.example.kmpdemo.book.data.database.DatabaseFactory
import com.example.kmpdemo.book.data.database.FavoriteBookDatabase
import com.example.kmpdemo.book.data.network.KtorRemoteBookDataSource
import com.example.kmpdemo.book.data.network.RemoteBookDataSource
import com.example.kmpdemo.book.data.repository.DefaultBookRepository
import com.example.kmpdemo.book.domain.BookRepository
import com.example.kmpdemo.book.presentation.SelectedBookViewModel
import com.example.kmpdemo.book.presentation.book_detail.BookDetailViewModel
import com.example.kmpdemo.book.presentation.booklist.BookListViewModel
import com.example.kmpdemo.core.data.HttpClientFactory

import org.koin.core.module.Module
import org.koin.core.module.dsl.singleOf
import org.koin.core.module.dsl.viewModelOf
import org.koin.dsl.bind
import org.koin.dsl.module

expect val platformModule: Module

val sharedModule = module {
    single { HttpClientFactory.create(get()) }
    singleOf(::KtorRemoteBookDataSource).bind<RemoteBookDataSource>()
    singleOf(::DefaultBookRepository).bind<BookRepository>()

    single {
        get<DatabaseFactory>().create()
            .setDriver(BundledSQLiteDriver())
            .build()
    }

    single { get<FavoriteBookDatabase>().favoriteBookDao }

    viewModelOf(::BookListViewModel)
    viewModelOf(::BookDetailViewModel)
    viewModelOf(::SelectedBookViewModel)
}