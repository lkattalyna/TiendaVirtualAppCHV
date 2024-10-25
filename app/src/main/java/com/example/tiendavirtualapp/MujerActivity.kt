package com.example.tiendavirtualapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MujerActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mujer)

        //  productos
        val producto1 = Producto("Camiseta Oversize CALIFORNIA", 35.000)
        val producto2 = Producto("Camiseta Oversize GREENANGELS 2", 35.500)
        val producto3 = Producto("Camiseta Oversize CAFE", 30.500)
        val producto4 = Producto("Camiseta Oversize NIRVANA", 35.500)

        // Referencias a los botones del layout
        val button1 = findViewById<Button>(R.id.button1)
        val button2 = findViewById<Button>(R.id.button2)
        val button3 = findViewById<Button>(R.id.button3)
        val button4 = findViewById<Button>(R.id.button4)

        // Listeners para los botones cundo le de clic en  agregar al carrito
        button1.setOnClickListener {
            Cart.agregarProducto(producto1)
            Toast.makeText(this, "Producto agregado al carrito", Toast.LENGTH_SHORT).show()
        }

        button2.setOnClickListener {
            Cart.agregarProducto(producto2)
            Toast.makeText(this, "Producto agregado al carrito", Toast.LENGTH_SHORT).show()
        }

        button3.setOnClickListener {
            Cart.agregarProducto(producto3)
            Toast.makeText(this, "Producto agregado al carrito", Toast.LENGTH_SHORT).show()
        }

        button4.setOnClickListener {
            Cart.agregarProducto(producto4)
            Toast.makeText(this, "Producto agregado al carrito", Toast.LENGTH_SHORT).show()
        }

        // Botón para ver el carrito en otra actividad
        val verCarritoButton = findViewById<Button>(R.id.verCarritoButton)
        verCarritoButton.setOnClickListener {
            // Navegar a la actividad del carrito
            val intent = Intent(this, CartActivity::class.java)
            startActivity(intent)
        }
    }
}
