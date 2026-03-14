package com.example.kmpdemo.app

import androidx.compose.animation.slideInHorizontally
import androidx.compose.animation.slideOutHorizontally
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.*
import androidx.compose.runtime.getValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.ViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.navigation.NavBackStackEntry
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import androidx.navigation.compose.rememberNavController
import com.example.kmpdemo.book.presentation.SelectedBookViewModel
import com.example.kmpdemo.book.presentation.book_detail.BookDetailAction
import com.example.kmpdemo.book.presentation.book_detail.BookDetailScreenRoot
import com.example.kmpdemo.book.presentation.book_detail.BookDetailViewModel
import com.example.kmpdemo.book.presentation.booklist.BookListScreenRoot
import com.example.kmpdemo.book.presentation.booklist.BookListViewModel
import com.example.kmpdemo.settings.SettingsScreen
import com.example.kmpdemo.splash.SplashScreen
import com.example.kmpdemo.theme.AppTheme
import org.koin.compose.viewmodel.koinViewModel

@Composable
@Preview
fun App() {
    var isDarkMode by remember { mutableStateOf<Boolean?>(null) }
    val darkTheme = isDarkMode ?: isSystemInDarkTheme()

    AppTheme(
        darkTheme = darkTheme
    ) {
        val navController = rememberNavController()
        NavHost(
            navController = navController,
            startDestination = Route.Splash
        ) {
            composable<Route.Splash> {
                SplashScreen(
                    onTimeout = {
                        navController.navigate(Route.BookGraph) {
                            popUpTo(Route.Splash) { inclusive = true }
                        }
                    }
                )
            }
            
            navigation<Route.BookGraph>(
                startDestination = Route.BookList
            ) {
                composable<Route.BookList>(
                    exitTransition = { slideOutHorizontally() },
                    popEnterTransition = { slideInHorizontally() }
                ) {
                    val viewModel = koinViewModel<BookListViewModel>()
                    val selectedBookViewModel =
                        it.sharedKoinViewModel<SelectedBookViewModel>(navController)

                    LaunchedEffect(true) {
                        selectedBookViewModel.onSelectBook(null)
                    }

                    BookListScreenRoot(
                        viewModel = viewModel,
                        onBookClick = { book ->
                            selectedBookViewModel.onSelectBook(book)
                            navController.navigate(
                                Route.BookDetail(book.id)
                            )
                        },
                        onSettingsClick = {
                            navController.navigate(Route.Settings)
                        }
                    )
                }
                composable<Route.BookDetail>(
                    enterTransition = {
                        slideInHorizontally { initialOffset ->
                            initialOffset
                        }
                    },
                    exitTransition = {
                        slideOutHorizontally { initialOffset ->
                            initialOffset
                        }
                    }
                ) {
                    val selectedBookViewModel =
                        it.sharedKoinViewModel<SelectedBookViewModel>(navController)
                    val viewModel = koinViewModel<BookDetailViewModel>()
                    val selectedBook by selectedBookViewModel.selectedBook.collectAsStateWithLifecycle()

                    LaunchedEffect(selectedBook) {
                        selectedBook?.let {
                            viewModel.onAction(BookDetailAction.OnSelectedBookChange(it))
                        }
                    }

                    BookDetailScreenRoot(
                        viewModel = viewModel,
                        onBackClick = {
                            navController.navigateUp()
                        }
                    )
                }
                
                composable<Route.Settings> {
                    SettingsScreen(
                        isDarkMode = darkTheme,
                        onThemeChange = { isDarkMode = it },
                        onBackClick = { navController.navigateUp() }
                    )
                }
            }
        }
    }
}


@Composable
private inline fun <reified T : ViewModel> NavBackStackEntry.sharedKoinViewModel(
    navController: NavController
): T {
    val navGraphRoute = destination.parent?.route ?: return koinViewModel<T>()
    val parentEntry = remember(this) {
        navController.getBackStackEntry(navGraphRoute)
    }
    return koinViewModel(
        viewModelStoreOwner = parentEntry
    )
}
