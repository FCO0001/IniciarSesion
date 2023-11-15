package com.example.iniciarsesion;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.content.Intent;
import com.google.firebase.auth.FirebaseAuth;

public class Login extends AppCompatActivity {

    private EditText Username;
    private EditText Password;
    private Button buttonLogin;
    private FirebaseAuth mAuth; // Firebase Authentication

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        mAuth = FirebaseAuth.getInstance(); // Inicializar Firebase Auth

        Username = findViewById(R.id.entradaUsuario);
        Password = findViewById(R.id.entradaContraseña);
        buttonLogin = findViewById(R.id.btnIngresarlogin);

        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = Username.getText().toString();
                String password = Password.getText().toString();

                // Autenticar con Firebase
                mAuth.signInWithEmailAndPassword(username, password)
                        .addOnCompleteListener(Login.this, task -> {
                            if (task.isSuccessful()) {
                                // Iniciar sesión exitosa
                                Intent intent = new Intent(Login.this, Menu.class); // Reemplaza Menu.class con tu clase de pantalla principal
                                startActivity(intent);
                                finish();
                            } else {
                                // Si el inicio de sesión falla, muestra un mensaje al usuario
                                Toast.makeText(Login.this, "Autenticación fallida.",
                                        Toast.LENGTH_SHORT).show();
                            }
                        });
            }
        });

    }
}
