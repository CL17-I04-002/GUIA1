package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MenuPrincipal extends AppCompatActivity {
    ///////////////////////////////////PAGINA PRINCIPAL/////////////////////////////////////////////////
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_principal);
    }

    public void RedireccionarCalculadora(View view){
        Intent calculadora = new Intent(this, MainActivity.class);
        startActivity(calculadora);
    }
    public void RedireccionarLogin(View view){
        Intent login = new Intent(this, Login.class);
        startActivity(login);
    }
    public void RedireccionarMisDatos(View view){
        Intent misDatos = new Intent(this, MisDatos.class);
        startActivity(misDatos);
    }
}
