package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    private RadioButton radioMasculino;
    private RadioButton radioFemenino;
    private EditText txtNombre;
    private EditText txtFechaNac;
    private EditText txtTelefono;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioMasculino = findViewById(R.id.rbMasculino);
        radioFemenino = findViewById(R.id.rbFemenino);
        txtNombre = findViewById(R.id.txtNombre);
        txtFechaNac = findViewById(R.id.txtFechaNac);
        txtTelefono = findViewById(R.id.txtTelefono);
    }

    public void enviarDatos(View v){
        //Inicializamos la nueva actividad
        Intent activity2 = new Intent(MainActivity.this, MainActivity2.class);

        //Creamos objeto para pasar datos entre actividades
        Bundle b = new Bundle();

        //Llenamos el objeto a pasar a la siguiente actividad
        b.putString("Nombre", txtNombre.getText().toString());
        b.putString("Genero", this.obtenerGenero());
        b.putString("FechaNacimiento", txtFechaNac.getText().toString());
        b.putString("Telefono", txtTelefono.getText().toString());

        //Añadimos la informacion a la nueva actividad
        activity2.putExtras(b);

        //Iniciamos la nueva actividad a mostrar
        startActivity(activity2);
    }

    private String obtenerGenero(){
        String genero = "";
        if(radioMasculino.isChecked()){
            genero = "Masculino";
        } else if(radioFemenino.isChecked()){
            genero = "Femenino";
        } else{
            genero = "Meco";
        }
        return genero;
    }
}