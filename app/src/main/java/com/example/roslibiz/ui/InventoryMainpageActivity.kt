package com.example.roslibiz.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.roslibiz.R
import com.example.roslibiz.adapter.InventoryAdapter
import com.example.roslibiz.model.InventoriesItem
import com.google.android.material.floatingactionbutton.FloatingActionButton


class InventoryMainpageActivity : AppCompatActivity() {

    val recycleView = findViewById<RecyclerView>(R.id.stokRecycleView)
    val fab = findViewById<FloatingActionButton>(R.id.tambahStokBtn)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inventory_mainpage)

        val inventories = mutableListOf<InventoriesItem>()

        recycleView.apply {
            layoutManager = LinearLayoutManager(this@InventoryMainpageActivity)
            adapter = InventoryAdapter(inventories)
        }
    }
}