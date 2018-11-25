package com.example.mikkel.grocerylist

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class GroceryListActivity : AppCompatActivity() {

    val groceryList = listOf("Milk", "Eggs", "Butter", "Granola")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_grocery_list)

        val textView = findViewById<TextView>(R.id.grocery_list_text)
        textView.text = groceryList.joinToString(separator = "\n")
    }
}
