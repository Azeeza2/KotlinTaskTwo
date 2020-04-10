package com.example.shoppinglist_kotlintask2

import android.content.Intent
import android.media.Image
import android.os.Parcelable
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.second_list_item.view.*
import kotlinx.android.synthetic.main.shopping_list_item.view.*

class SecondViewHolder (itemView: View) : RecyclerView.ViewHolder (itemView){

    companion object{
        const val productKey = "PRODUCT_KEY"
    }

    private var product: ShoppingList? = null

    val itemImage : ImageView = itemView.findViewById(R.id.itemImage)
    val itemName : TextView = itemView.findViewById(R.id.itemName)
    val itemPrice : TextView = itemView.findViewById(R.id.itemPrice)


    fun bind(data: ShoppingList) {
        this.product = data

        // setImageResource is a method, thus, data.itemImage is passed as an argument
        this.itemImage.setImageResource( data.itemImage!!)
        this.itemName.text = data.itemName
        this.itemPrice.text = data.itemPrice
       // this.itemDescription.text = data.itemDescription
    }

    init {
        itemView.setOnClickListener{
            val context = itemView.context
            val shoppingListIntent = Intent (context, SecondActivity::class.java)
            shoppingListIntent.putExtra(productKey, product)
            context.startActivity(shoppingListIntent)
        }
    }

}

private fun Parcelable.putExtra(productKey: String, product: ShoppingList?) {
}





