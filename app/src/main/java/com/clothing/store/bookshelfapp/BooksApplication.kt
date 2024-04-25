package com.clothing.store.bookshelfapp

import android.app.Application
import com.clothing.store.bookshelfapp.data.AppContainer
import com.clothing.store.bookshelfapp.data.DefaultAppContainer

class BooksApplication : Application() {
    lateinit var container: AppContainer
    override fun onCreate() {
        super.onCreate()
        container = DefaultAppContainer()
    }
}