package com.example.shoppinglist_kotlintask2

import android.os.Parcel
import android.os.Parcelable
import kotlinx.android.parcel.Parceler
import kotlinx.android.parcel.Parcelize
import java.io.Serializable

// data class ShoppingList (val key: String, val value: String, val image : Image)

data class ShoppingList( val itemImage: Int, val itemName: String, val itemPrice: String) {

    companion object : Parceler<ShoppingList> {

        override fun create(parcel: Parcel): ShoppingList = TODO()
        override fun ShoppingList.write(dest: Parcel, flags: Int) {
        }
    }
}

