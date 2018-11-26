package com.example.mikkel.grocerylist

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_grocery_list.*

class GroceryListActivity : AppCompatActivity() {

    private val groceryList = mutableListOf("Milk", "Eggs", "Butter", "Granola")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_grocery_list)

        groceryListTextView.text = groceryList.joinToString(separator = "\n")
    }

    fun addGroceryToList(view: View) {
        groceryList.add(addItemEditText.text.toString())
        groceryListTextView.text = groceryList.joinToString (separator = "\n")
    }
}
