package com.example.mikkel.grocerylist

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_grocery_list.*

class GroceryListActivity : AppCompatActivity() {

    private val groceryList = mutableListOf("Milk", "Eggs", "Butter", "Granola")
    private lateinit var groceryListItemAdapter: ArrayAdapter<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_grocery_list)
        groceryListItemAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, groceryList)
        groceryListListView.adapter = groceryListItemAdapter
    }

    fun addGroceryToList(view: View) {
        val newItem = addItemEditText.text.toString()
        if( newItem.isNotBlank() ) {
            groceryListItemAdapter.add(newItem)
            groceryListItemAdapter.notifyDataSetChanged()
        }
    }
}
