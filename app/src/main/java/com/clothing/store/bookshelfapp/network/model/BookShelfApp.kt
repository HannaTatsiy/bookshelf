package com.clothing.store.bookshelfapp.network.model

import com.google.gson.annotations.SerializedName


data class BookShelfApp (

  @SerializedName("kind"       ) var kind       : String?          = null,
  @SerializedName("totalItems" ) var totalItems : Int?             = null,
  @SerializedName("items"      ) var items      : ArrayList<Items> = arrayListOf()

)