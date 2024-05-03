package com.pakgva.myapplication

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.pakgva.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        var listOfNumbers = mutableListOf("Manzana", "Pera", "Mango", "Melon","Manzana", "Pera", "Mango", "Melon","Manzana", "Pera", "Mango", "Melon","Manzana", "Pera", "Mango", "Melon")

        val fruitAdapter = FruitAdapter(listOfNumbers)
        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        binding.recyclerView.adapter = fruitAdapter

        Toast.makeText(this, "qdwqdqw", Toast.LENGTH_SHORT).show()
    }
}