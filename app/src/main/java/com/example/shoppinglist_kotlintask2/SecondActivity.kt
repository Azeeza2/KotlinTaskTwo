package com.example.shoppinglist_kotlintask2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_second.*
import kotlinx.android.synthetic.main.second_list_item.*
import kotlinx.android.synthetic.main.shopping_list_item.*

class SecondActivity : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.second_list_item, container, false)
    }

   /* override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        with(second_list_item){
            layoutManager = LinearLayoutManager(requireContext())
            setHasFixedSize(true)
            // add adapter class: shopping list adapter
            adapter = ShoppingAdapter(populate())
        }

        second_list_item.setOnClickListener {
            findNavController().navigate(R.id.main_recycler)to(R.id.second_list_item)
        }

        *//*view.findViewById<Button>(R.id.next_page_button).setOnClickListener {
            findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment)
        }*//*
    }
*/
    private fun populate():List<ShoppingList>{
       return listOf(
           ShoppingList(R.drawable.rice, "Rice", "White Rice, polished, sorted, imported", "$10/bag" ),
           ShoppingList(R.drawable.beans, "Beans", "Brown Oloyin beans, sorted, destoned", "$12/bag" ),
           ShoppingList(R.drawable.salt, "Salt", "Salt,White, Iodized", "$2/pack" ),
           ShoppingList(R.drawable.palmoil, "Palm Oil", "Red wine, fine palm oil processed in conducive environment, not leached", "$7/keg" ),
           ShoppingList(R.drawable.rice, "Rice", "White Rice, polished, sorted, imported", "$10/bag" ),
           ShoppingList(R.drawable.beans, "Beans", "Brown Oloyin beans, sorted, destoned", "$12/bag" ),
           ShoppingList(R.drawable.salt, "Salt", "Salt,White, Iodized", "$2/pack" ),
           ShoppingList(R.drawable.palmoil, "Palm Oil", "Red wine, fine palm oil processed in conducive environment, not leached", "$7/keg" ), ShoppingList(R.drawable.rice, "Rice", "White Rice, polished, sorted, imported", "$10/bag" ),
           ShoppingList(R.drawable.rice, "Rice", "White Rice, polished, sorted, imported", "$10/bag" ),
           ShoppingList(R.drawable.beans, "Beans", "Brown Oloyin beans, sorted, destoned", "$12/bag" ),
           ShoppingList(R.drawable.salt, "Salt", "Salt,White, Iodized", "$2/pack" ),
           ShoppingList(R.drawable.palmoil, "Palm Oil", "Red wine, fine palm oil processed in conducive environment, not leached", "$7/keg" )
       )
    }
}