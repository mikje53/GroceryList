package com.example.mikkel.grocerylist

import android.content.Context
import android.widget.ArrayAdapter

class GroceryListService(context: Context) {
    private val groceryList = mutableListOf("Milk", "Eggs", "Butter", "Granola")
    private val groceryListItemAdapter: ArrayAdapter<String>

    init {
        groceryListItemAdapter = ArrayAdapter(context, android.R.layout.simple_list_item_1, groceryList)
    }

    fun getGroceryListItemAdapter(): ArrayAdapter<String> {
        return groceryListItemAdapter
    }

    fun addGroceryItemToList(item: String) {
        groceryListItemAdapter.add(item)
        groceryListItemAdapter.notifyDataSetChanged()
    }

}