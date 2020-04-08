package com.example.shoppinglist_kotlintask2

import android.graphics.Rect
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.*
import kotlinx.android.synthetic.main.second_list_item.view.*

class ShoppingAdapter (private val items: List<ShoppingList>) : RecyclerView.Adapter<SecondViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SecondViewHolder {
        return SecondViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.second_list_item,
                parent,
                false
            )
        )
    }

    override fun getItemCount(): Int = items.size

    override fun onBindViewHolder(holder: SecondViewHolder, position: Int) {
        // val product = ShoppingList.get(position)

        holder.bind(items[position])

        /*holder.itemImage.setImageResource(product.itemImage)
        holder.itemName.text = product.itemImage
        holder.itemPrice.text = product.itemPrice
        holder.itemDescription.text = product.itemDescription*/

    }
}