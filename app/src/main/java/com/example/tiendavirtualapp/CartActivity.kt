package com.example.tiendavirtualapp

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.tiendavirtualapp.R

class CartActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cart)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerViewCart)
        val totalAmount = findViewById<TextView>(R.id.totalAmount)
        val btnCheckout = findViewById<Button>(R.id.btnCheckout)

        btnCheckout.setOnClickListener {
            // Acción al finalizar compra
        }


        // Crear lista de productos
        //val products: MutableList<Producto> = ArrayList()
        //products.add(Producto("Producto 1", 35500.0))
        //products.add(Producto("Producto 2", 42000.0))

        // Configurar el adaptador y RecyclerView
        val adapter = CartAdapter(Cart.obtenerProductos()) { total: Double ->
            // Actualiza el TextView del total
            totalAmount.text = String.format("Total: $%.2f", total)
        }

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter

        // Calcular el total inicial
        adapter.calculateTotal()
    }
}
