
package com.example.iniciarsesion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;


public class CerrarSesion extends AppCompatActivity {

    private Button btnCerrarSesion;
    private Button btnVolver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cerrar_sesion); // Reemplaza con el nombre real de tu archivo layout

        btnCerrarSesion = findViewById(R.id.btnCerrarCerrarsesion);
        btnVolver = findViewById(R.id.btnVolver);

        btnCerrarSesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Redirige al usuario a la pantalla de inicio de sesión
                Intent intent = new Intent(CerrarSesion.this, Login.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(intent);
                finish(); // Finaliza esta actividad
            }
        });

        btnVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Redirige al usuario al menú
                Intent intent = new Intent(CerrarSesion.this, IngresoPlantas.class);
                startActivity(intent);
            }
        });
    }
}
