package com.example.tiendavirtualapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

// RegistroActivity.java
public class RegistroActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        Button buttonRegistrar = findViewById(R.id.buttonRegistrar);
        ((View) buttonRegistrar).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Aquí puedes agregar la lógica para registrar al usuario
                // ...

                // Después de registrar al usuario, navega a la actividad de inicio
                Intent intent = new Intent(RegistroActivity.this, Inicio.class);
                startActivity(intent);
                finish(); // Cierra la actividad de registro
            }
        });
    }
}

