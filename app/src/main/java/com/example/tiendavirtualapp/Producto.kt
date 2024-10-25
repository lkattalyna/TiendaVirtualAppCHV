package com.example.tiendavirtualapp

import java.text.DecimalFormat
import java.text.DecimalFormatSymbols
import java.util.Locale

data class Producto(val nombre: String, val precio: Double) {
    fun getPrecioFormateado(): String {
        // Configura el formato para el precio
        val symbols = DecimalFormatSymbols(Locale("es", "CO")) // Establece la localización a Colombia
        val formato = DecimalFormat("#,##0.00", symbols)
        return "${formato.format(precio)} COP"
    }
}

object Cart {
    private val productos = mutableListOf<Producto>()

    fun agregarProducto(producto: Producto) {
        productos.add(producto)
    }

    fun obtenerProductos(): List<Producto> {
        return productos
    }
}
