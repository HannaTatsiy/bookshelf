package com.clothing.store.bookshelfapp.network.model

import com.google.gson.annotations.SerializedName


data class Epub (

  @SerializedName("isAvailable" ) var isAvailable : Boolean? = null

)