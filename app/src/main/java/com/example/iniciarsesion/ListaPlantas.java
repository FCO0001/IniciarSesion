package com.example.iniciarsesion;

import android.os.Bundle;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class ListaPlantas extends AppCompatActivity {

    private ListView listView;
    private ArrayList<Planta> listaDePlantas;
    private PlantaAdaptador plantaAdapter; // Usando el adaptador personalizado
    private DatabaseReference mDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lista_de_plantas); // Asegúrate de que este es el layout correcto

        listView = findViewById(R.id.lista_plantas); // Asegúrate de que este ID corresponda a tu ListView en lista_de_plantas.xml
        listaDePlantas = new ArrayList<>();
        plantaAdapter = new PlantaAdaptador(this, listaDePlantas);
        listView.setAdapter(plantaAdapter);

        mDatabase = FirebaseDatabase.getInstance().getReference("plantas");

        mDatabase.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                listaDePlantas.clear();
                for (DataSnapshot postSnapshot: dataSnapshot.getChildren()) {
                    Planta planta = postSnapshot.getValue(Planta.class);
                    listaDePlantas.add(planta);
                }
                plantaAdapter.notifyDataSetChanged(); // Notificando al adaptador personalizado
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
                // Log error
            }
        });
    }
}
