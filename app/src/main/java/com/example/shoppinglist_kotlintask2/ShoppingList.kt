package com.example.shoppinglist_kotlintask2

import android.media.Image
import kotlinx.android.parcel.Parcelize
import java.io.Serializable

// data class ShoppingList (val key: String, val value: String, val image : Image)
@Parcelize
data class ShoppingList(val itemImage: Int, val itemName: String,val itemDescription: String, val itemPrice: String)