package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Login extends AppCompatActivity {
    private EditText edit_email;
    private EditText edit_pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        edit_email = (EditText)findViewById(R.id.edtEmail);
        edit_pass = (EditText)findViewById(R.id.edtPassword);
    }
    public void Login(View view) {
        String edit_email_string = String.valueOf(edit_email.getText().toString());
        String edit_pass_string = String.valueOf(edit_pass.getText().toString());

        if (edit_email_string.length() == 0 || edit_pass_string.length() == 0) {
            Toast.makeText(this, "Por favor llene los datos", Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(this, "Bienvenido: " + edit_email_string, Toast.LENGTH_LONG).show();
        }
    }
}
