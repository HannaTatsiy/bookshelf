package com.clothing.store.bookshelfapp.network

import com.clothing.store.bookshelfapp.network.model.BookShelfApp
import retrofit2.http.GET
import retrofit2.http.Query

interface BookService {
    @GET("volumes")
    suspend fun bookSearch(
        @Query("q") searchQuery: String,
        @Query("maxResults") maxResults: Int
    ): BookShelfApp
}