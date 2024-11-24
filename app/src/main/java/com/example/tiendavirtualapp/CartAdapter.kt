package com.example.tiendavirtualapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.tiendavirtualapp.R

class CartAdapter(
    private val productList: List<Producto>,
    private val totalChangeListener: (Double) -> Unit
) : RecyclerView.Adapter<CartAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_cart_product, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val product = productList[position]
        holder.bind(product)
    }

    override fun getItemCount(): Int = productList.size

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val productName: TextView = itemView.findViewById(R.id.textViewProductName)
        private val productPrice: TextView = itemView.findViewById(R.id.textViewProductPrice)

        fun bind(product: Producto) {
            productName.text = product.name
            productPrice.text = String.format("Precio: $%.2f", product.price)
        }
    }

    // Método para calcular el total
    fun calculateTotal() {
        val total = productList.sumOf { it.price }
        totalChangeListener(total)
    }
}
