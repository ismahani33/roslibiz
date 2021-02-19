package com.example.roslibiz.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView
import com.example.roslibiz.R

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<CardView>(R.id.stokCard).setOnClickListener {
            val intent = Intent(this, InventoryMainpageActivity::class.java)
            startActivity(intent)
        }
        findViewById<CardView>(R.id.hasilCard).setOnClickListener{
            val intent = Intent(this, SalesMainpageActivity::class.java)
            startActivity(intent)
        }
        findViewById<CardView>(R.id.belanjaCard).setOnClickListener{
            val intent = Intent(this, ExpensesMainpageActivity::class.java)
            startActivity(intent)
        }



        //fab main barcode button
        //val butonBarcode = findViewById<CardView>(R.id.barcodeBtnMain).setOnClickListener{

        //}

    }
}