package com.example.iniciarsesion;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;


public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);


        // Botón para cerrar sesión
        Button btnCerrarSesion = findViewById(R.id.btnCerrar_sesion2);
        btnCerrarSesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Menu.this, com.example.iniciarsesion.CerrarSesion.class);
                startActivity(intent);
            }
        });


        // Botón para ingreso de plantas
        Button btnIngresoPlantas = findViewById(R.id.btningresarPlantas);
        btnIngresoPlantas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentIngresoPlantas = new Intent(Menu.this, IngresoPlantas.class);
                startActivity(intentIngresoPlantas);
            }
        });

        // Botón para ver la lista de plantas
        Button btnListaPlantas = findViewById(R.id.btnListaplantas);
        btnListaPlantas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentListaPlantas = new Intent(Menu.this, ListaPlantas.class);
                startActivity(intentListaPlantas);
            }
        });



    }
}