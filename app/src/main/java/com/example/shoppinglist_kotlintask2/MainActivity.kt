package com.example.shoppinglist_kotlintask2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.view.size
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.shopping_list_item.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        main_recycler.adapter = ShoppingAdapter(populate())
        main_recycler.layoutManager = LinearLayoutManager(this)
    }

    private fun populate(): List<ShoppingList>{
        return listOf(
            ShoppingList(R.drawable.rice, "Rice",  "$10/bag" , "parboiled, polished"),
            ShoppingList(R.drawable.beans, "Beans",  "$12/bag" , "destoned"),
            ShoppingList(R.drawable.salt, "Salt", "$2/pack" , "iodized"),
            ShoppingList(R.drawable.palmoil, "P-Oil",  "$7/keg", "non-bleached" ),
            ShoppingList(R.drawable.rice, "Rice",  "$10/bag" , "parboiled, polished"),
            ShoppingList(R.drawable.beans, "Beans",  "$12/bag", "destoned" ),
            ShoppingList(R.drawable.salt, "Salt",  "$2/pack", "iodized" ),
            ShoppingList(R.drawable.palmoil, "P-Oil",  "$7/keg", "non-bleached" ),
            ShoppingList(R.drawable.rice, "Rice",  "$10/bag", "parboiled, polished" ),
            ShoppingList(R.drawable.beans, "Beans",  "$12/bag", "iodized" ),
            ShoppingList(R.drawable.salt, "Salt",  "$2/pack", "non-bleached" ),
            ShoppingList(R.drawable.palmoil, "P-Oil",  "$7/keg", "non-bleached")
        )
    }
   /* override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ShoppingListAdapter.Viewholder {

        val vie  = LayoutInflater.from(p0.context).inflate(R.layout.shopping_list_item, p0, false)

        return ShoppingListAdapter.Viewholder(vie)

    }

    override fun getItemCount() = shopping_list_item.size

    override fun onBindViewHolder(p0: ShoppingListAdapter.Viewholder, p1: Int) {


        p0.bind(listitem[p1],  listener)

    }
*/
}
