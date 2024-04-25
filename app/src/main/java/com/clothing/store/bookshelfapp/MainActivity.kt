package com.clothing.store.bookshelfapp

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.core.content.ContextCompat
import com.clothing.store.bookshelfapp.ui.BooksApp
import com.clothing.store.bookshelfapp.ui.theme.BookshelfAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BookshelfAppTheme {
                BooksApp(
                    onBookClicked = {
                        ContextCompat.startActivity(
                            this,
                            Intent(Intent.ACTION_VIEW, Uri.parse(it.previewLink)),
                            null
                        )
                    }
                )
            }
        }
    }
}
