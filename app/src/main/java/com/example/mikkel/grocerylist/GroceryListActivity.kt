package com.example.mikkel.grocerylist

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class GroceryListActivity : AppCompatActivity() {

    val groceryList = mutableListOf("Milk", "Eggs", "Butter", "Granola")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_grocery_list)

        val textView = findViewById<TextView>(R.id.grocery_list_text)
        textView.text = groceryList.joinToString(separator = "\n")
    }

    fun addGroceryToList(view: View) {
        val editText = findViewById<EditText>(R.id.add_item_edit_text)
        val textView = findViewById<TextView>(R.id.grocery_list_text)
        groceryList.add(editText.text.toString())
        textView.text = groceryList.joinToString (separator = "\n")
    }
}
