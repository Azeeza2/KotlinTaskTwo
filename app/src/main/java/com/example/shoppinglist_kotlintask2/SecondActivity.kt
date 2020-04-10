package com.example.shoppinglist_kotlintask2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcel
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.shoppinglist_kotlintask2.SecondViewHolder.Companion.productKey
import kotlinx.android.parcel.Parceler
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.second_list_item.*
import kotlinx.android.synthetic.main.shopping_list_item.*



class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_list_item)

      /*  val product = intent.extras.getParcelable<ShoppingList>(SecondViewHolder.productKey)
        itemDescription.text = product.toString()*/




        val intent = intent.getParcelableExtra<ShoppingList>(SecondViewHolder.productKey)
        intent?.let{

            item_name.text = itemName.toString()
            item_price.text = itemPrice.toString()
            item_image.setImageResource(itemImage)
            itemDescription.text = intent.toString()

            /*fun bind (itemDescription: String){
                itemDescription.text = "Rice., white, parboiled, destoned, polished"
            }*/


        }

    }
}

private fun ImageView.setImageResource(itemImage: ImageView?) {}

