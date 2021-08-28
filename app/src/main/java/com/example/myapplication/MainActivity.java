package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView tx_principal;
    private float numero1 = 0.0f;
    private float numero2 = 0.0f;
    private String operador = "";
    int contador=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tx_principal = (TextView)findViewById(R.id.tvPrincipal);
    }
    ///////////////////////////////////CALCULADORA/////////////////////////////////////////////////
    public void Calcular1(View view){
        float valor = Float.parseFloat(tx_principal.getText().toString());
        if(valor == 0.0f){
            tx_principal.setText("1");
        }else{
            tx_principal.setText(tx_principal.getText() + "1");
        }
    }
    public void Calcular2(View view){
        float valor = Float.parseFloat(tx_principal.getText().toString());
        if(valor == 0.0f){
            tx_principal.setText("2");
        }else{
            tx_principal.setText(tx_principal.getText() + "2");
        }
    }
    public void Calcular3(View view){
        float valor = Float.parseFloat(tx_principal.getText().toString());
        if(valor == 0.0f){
            tx_principal.setText("3");
        }else{
            tx_principal.setText(tx_principal.getText() + "3");
        }
    }
    public void Calcular4(View view){
        float valor = Float.parseFloat(tx_principal.getText().toString());
        if(valor == 0.0f){
            tx_principal.setText("4");
        }else{
            tx_principal.setText(tx_principal.getText() + "4");
        }
    }
    public void Calcular5(View view){
        float valor = Float.parseFloat(tx_principal.getText().toString());
        if(valor == 0.0f){
            tx_principal.setText("5");
        }else{
            tx_principal.setText(tx_principal.getText() + "5");
        }
    }
    public void Calcular6(View view){
        float valor = Float.parseFloat(tx_principal.getText().toString());
        if(valor == 0.0f){
            tx_principal.setText("6");
        }else{
            tx_principal.setText(tx_principal.getText() + "6");
        }
    }
    public void Calcular7(View view){
        float valor = Float.parseFloat(tx_principal.getText().toString());
        if(valor == 0.0f){
            tx_principal.setText("7");
        }else{
            tx_principal.setText(tx_principal.getText() + "7");
        }
    }
    public void Calcular8(View view){
        float valor = Float.parseFloat(tx_principal.getText().toString());
        if(valor == 0.0f){
            tx_principal.setText("8");
        }else{
            tx_principal.setText(tx_principal.getText() + "8");
        }
    }
    public void Calcular9(View view){
        float valor = Float.parseFloat(tx_principal.getText().toString());
        if(valor == 0.0f){
            tx_principal.setText("9");
        }else{
            tx_principal.setText(tx_principal.getText() + "9");
        }
    }
    public void Calcular0(View view){
        float valor = Float.parseFloat(tx_principal.getText().toString());
        if(valor == 0.0f){
            tx_principal.setText("0");
        }else{
            tx_principal.setText(tx_principal.getText() + "0");
        }
    }
    public void Vaciar(View view){
        tx_principal.setText("0");
        numero1 = 0.0f;
        numero2 = 0.0f;
        operador = "";
    }
    public void Sumar(View view){
        numero1 = Float.parseFloat(String.valueOf(tx_principal.getText().toString()));
        operador = "+";
        tx_principal.setText("0");
    }
    public void Restar(View view){
        numero1 = Float.parseFloat(String.valueOf(tx_principal.getText().toString()));
        operador = "-";
        tx_principal.setText("0");
    }
    public void Multiplicar(View view){
        numero1 = Float.parseFloat(String.valueOf(tx_principal.getText().toString()));
        operador = "*";
        tx_principal.setText("0");
    }
    public void Dividir(View view){
        numero1 = Float.parseFloat(String.valueOf(tx_principal.getText().toString()));
        operador = "/";
        tx_principal.setText("0");
    }
    /*public void CambioSigno(View view) {
        float valor = Float.parseFloat(String.valueOf(tx_principal.getText()));
        valor = valor * -1.0f;
        tx_principal.setText("" + valor);
    }*/
    public void DEL(View view){
        numero2 = 0.0f;
        tx_principal.setText("0");

    }
    public void Resultado(View view) {
        try {
            numero2 = Float.parseFloat(String.valueOf(tx_principal.getText().toString()));
            float resultado = 0.0f;
            if (operador.equals("+")) {
                resultado = numero1 + numero2;

            } else if (operador.equals("-")) {
                resultado = numero1 - numero2;
            } else if (operador.equals("*")) {
                resultado = numero1 * numero2;
            } else if (operador.equals("/")) {
                if (numero2 == 0.0f) {
                    Toast.makeText(this, "Valor no valido", Toast.LENGTH_LONG).show();
                } else {
                    resultado = numero1 / numero2;
                }
            }
            String resultado_String = String.valueOf(resultado);
            tx_principal.setText(resultado_String);
        }catch (IllegalArgumentException ex){
            Toast.makeText(this, "Error: " + ex.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }
}