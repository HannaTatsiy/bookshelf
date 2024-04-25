package com.clothing.store.bookshelfapp.ui.screens

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.clothing.store.bookshelfapp.data.Book
import com.clothing.store.bookshelfapp.ui.BooksUiState

@Composable
fun HomeScreen(
    booksUiState: BooksUiState,
    retryAction: () -> Unit,
    modifier: Modifier,
    onBookClicked: (Book) -> Unit
) {
    when (booksUiState) {
        is BooksUiState.Loading -> LoadingScreen(modifier)
        is BooksUiState.Success -> BooksGridScreen(
            books = booksUiState.bookSearch,
            modifier = modifier,
            onBookClicked
        )
        is BooksUiState.Error -> ErrorScreen(retryAction = retryAction, modifier)
    }
}