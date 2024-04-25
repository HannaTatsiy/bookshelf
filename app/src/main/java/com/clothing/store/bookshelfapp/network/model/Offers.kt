package com.clothing.store.bookshelfapp.network.model

import com.google.gson.annotations.SerializedName


data class Offers (

  @SerializedName("finskyOfferType" ) var finskyOfferType : Int?         = null,
  @SerializedName("listPrice"       ) var listPrice       : ListPrice?   = ListPrice(),
  @SerializedName("retailPrice"     ) var retailPrice     : RetailPrice? = RetailPrice()

)