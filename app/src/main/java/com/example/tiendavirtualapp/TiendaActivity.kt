package com.example.tiendavirtualapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class TiendaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_tienda)
        /*ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
                   val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
                   v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
                   insets
               }*/
        // Botón para ir a GoogleMaps
        val mapsButton = findViewById<Button>(R.id.mapsButton)
        mapsButton.setOnClickListener {
            val intent = Intent(this, GoogleMaps::class.java)
            startActivity(intent)
        }

        // Botón para ir a CameraActivity
        val cameraButton = findViewById<Button>(R.id.cameraButton)
        cameraButton.setOnClickListener {
            val intent = Intent(this, CameraActivity::class.java)
            startActivity(intent)
        }
    }

}