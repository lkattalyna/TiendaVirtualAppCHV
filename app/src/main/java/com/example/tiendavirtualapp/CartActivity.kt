package com.example.tiendavirtualapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class CartActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cart)

        // Obtenemos los productos en el carrito
        val productosEnCarrito = Cart.obtenerProductos()

        // Configuramos el RecyclerView
        val recyclerViewCart = findViewById<RecyclerView>(R.id.recyclerViewCart)
        recyclerViewCart.layoutManager = LinearLayoutManager(this)
        recyclerViewCart.adapter = CartAdapter(productosEnCarrito)
    }
}
