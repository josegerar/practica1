package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    private TextView lblSaludo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        //Recuperamos la informacion proporcionada por la actividad anterior
        Bundle b = this.getIntent().getExtras();

        //Localizamos el control de saludo
        lblSaludo = findViewById(R.id.lblSaludo);

        //Saludamos
        lblSaludo.setText("Bienvenido " + b.getString("Nombre") +
                "\n Telefono: " + b.getString("Telefono") +
                "\n Fecha nacimiento: " + b.getString("FechaNacimiento") +
                "\n Genero: " + b.getString("Genero"));
    }
}