package com.example.mikkel.grocerylist

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import kotlinx.android.synthetic.main.activity_grocery_list.*

class GroceryListActivity : AppCompatActivity() {

    private lateinit var groceryListService: GroceryListService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_grocery_list)
        groceryListService = GroceryListService(this)
        groceryListListView.adapter = groceryListService.getGroceryListItemAdapter()
    }

    fun addGroceryToList(view: View) {
        val newItem = addItemEditText.text.toString()
        if( newItem.isNotBlank() ) {
            groceryListService.addGroceryItemToList(newItem)
            addItemEditText.setText("")
        }
    }
}
