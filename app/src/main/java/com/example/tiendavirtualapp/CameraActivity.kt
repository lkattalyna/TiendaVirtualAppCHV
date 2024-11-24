package com.example.tiendavirtualapp

import android.app.Activity
import android.app.Instrumentation
import android.content.Intent
import android.graphics.Bitmap
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.activity.result.ActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class CameraActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_camera)

        val regresarButton = findViewById<Button>(R.id.regresarButton)
        // Set click listener
        regresarButton.setOnClickListener {
            // Intent to navigate to SecondActivity
            val intent = Intent(this, Inicio::class.java)
            startActivity(intent)
        }
        val tomarFotoButton = findViewById<Button>(R.id.tomarFotoButton)

        tomarFotoButton.setOnClickListener{
            startForResult.launch(Intent(MediaStore.ACTION_IMAGE_CAPTURE))
    }

    }
private val startForResult = registerForActivityResult(ActivityResultContracts.StartActivityForResult()){
    result: ActivityResult ->
    if(result.resultCode == Activity.RESULT_OK){
        val intent = result.data
        val imageBitmap = intent?.extras?.get("data") as Bitmap
        val imageView = findViewById<ImageView>(R.id.imageView)
        imageView.setImageBitmap(imageBitmap)
    }

}
}
