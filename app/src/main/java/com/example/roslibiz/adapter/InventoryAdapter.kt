package com.example.roslibiz.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.roslibiz.R
import com.example.roslibiz.model.InventoriesItem

class InventoryAdapter(private val inventories: MutableList<InventoriesItem>) : RecyclerView.Adapter<InventoryAdapter.ViewHolder>() {

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val nama:TextView = itemView.findViewById(R.id.namaStokRV)
        val kategori:TextView = itemView.findViewById(R.id.kategoriStokRV)
        val harga:TextView = itemView.findViewById(R.id.hargaStokRV)
        val kuantiti:TextView = itemView.findViewById(R.id.kuantitiStokRV)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.inventory_card, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.nama.text = inventories[position].stock_name
        holder.kategori.text = inventories[position].category_id
        holder.harga.text = inventories[position].stock_price
        holder.kuantiti.text = inventories[position].stock_quantity
    }

    override fun getItemCount(): Int {
        return inventories.size
    }

}
