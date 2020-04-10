package com.example.shoppinglist_kotlintask2

import android.os.Parcel
import android.os.Parcelable
import kotlinx.android.parcel.Parcelize



// data class ShoppingList (val key: String, val value: String, val image : Image)

data class ShoppingList( val itemImage: Int, val itemName: String, val itemPrice: String, val itemDescription:String): Parcelable{
    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.readInt().toString(itemImage)
        parcel.readString().toString(itemName)
        parcel.readString().toString(itemPrice)
        parcel.readString().toString(itemDescription)
    }

    override fun describeContents(): Int {
        return 0
    }

    constructor(parcel: Parcel) : this(
        parcel.readInt(),
        parcel.readString().toString(),
        parcel.readString().toString(),
        parcel.readString().toString()

    )
    companion object CREATOR: Parcelable.Creator<ShoppingList>{
        override fun createFromParcel(parcel: Parcel): ShoppingList {
            return ShoppingList(parcel)
        }

        override fun newArray(size: Int): Array<ShoppingList?> {
            return arrayOfNulls (size)
        }
    }

    /*companion object CREATOR : Parcelable.Creator<ShoppingList> {
        override fun createFromParcel(parcel: Parcel): ShoppingList {
            return ShoppingList(parcel)
        }

        override fun newArray(size: Int): Array<ShoppingList?> {
            return arrayOfNulls(size)
        }
    }*/
}

private fun String?.toString(itemName: String) {
    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
}


/*
{
    constructor(parcel: Parcel) : this(
        parcel.readInt(),
        parcel.readString(),
        parcel.readString()
    ) {
    }

    companion object : Parceler<ShoppingList> {

        override fun create(parcel: Parcel): ShoppingList = TODO()
        override fun ShoppingList.write(dest: Parcel, flags: Int) {
        }
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(itemImage)
        parcel.writeString(itemName)
        parcel.writeString(itemPrice)
    }

    override fun describeContents(): Int {
        return 0
    }

    */
/*companion object CREATOR : Parcelable.Creator<ShoppingList> {
        override fun createFromParcel(parcel: Parcel): ShoppingList {
            return ShoppingList(parcel)
        }

        override fun newArray(size: Int): Array<ShoppingList?> {
            return arrayOfNulls(size)
        }
    }*//*

}
*/
