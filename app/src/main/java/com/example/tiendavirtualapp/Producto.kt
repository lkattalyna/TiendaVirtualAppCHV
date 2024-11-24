package com.example.tiendavirtualapp

import java.text.DecimalFormat
import java.text.DecimalFormatSymbols
import java.util.Locale

data class Producto(val name: String, val price: Double) {
    fun getPrecioFormateado(): String {
        // Configura el formato para el precio
        val symbols = DecimalFormatSymbols(Locale("es", "CO")) // Establece la localización a Colombia
        val formato = DecimalFormat("#,##0.00", symbols)
        return "${formato.format(price)} COP"

    }
}

object Cart {
    private val productos = mutableListOf<Producto>()

    fun agregarProducto(producto: Producto) {
        productos.add(producto)
    }

    fun quitarProducto(producto: Producto) {
        productos.remove(producto)
    }

    fun obtenerProductos(): List<Producto> {
        return productos
    }
}
