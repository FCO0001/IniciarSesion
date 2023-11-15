package com.example.iniciarsesion;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.FirebaseApp;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


public class IngresoPlantas extends AppCompatActivity {

    private DatabaseReference mDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ingreso_plantas);


        mDatabase = FirebaseDatabase.getInstance().getReference();


        Button btnIngresarPlanta = findViewById(R.id.btnIngresarPlanta);
        btnIngresarPlanta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ingresarPlanta();
            }
        });
    }

    private void ingresarPlanta() {
        String nombreComun = ((EditText) findViewById(R.id.nombreComun)).getText().toString();
        String nombreCientifico = ((EditText) findViewById(R.id.nombreCientifico)).getText().toString();
        String tipoPlanta = ((EditText) findViewById(R.id.tipoPlanta)).getText().toString();
        String categoria = ((EditText) findViewById(R.id.categoria)).getText().toString();
        String informacionAdicional = ((EditText) findViewById(R.id.informacionAdicional)).getText().toString();

        // Validar los datos aquí según tus criterios

        Planta planta = new Planta(nombreComun, nombreCientifico, tipoPlanta, categoria, informacionAdicional);
        mDatabase.child("plantas").push().setValue(planta);

    }
}
