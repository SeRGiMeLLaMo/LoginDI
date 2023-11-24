package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText met_user;
    private EditText met_password;


   @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        met_user = (EditText) findViewById(R.id.editTextText);
        met_password = (EditText) findViewById(R.id.editTextTextPassword);
    }
    /**public void Entrar(View view){
        String usuario = met_usuario.getText().toString();
        String password = met_password.getText().toString();
        if(usuario.length()==0){
            Toast.makeText(this, "Falta el usuario", Toast.LENGTH_SHORT).show();
        }
        if(password.length()==0){
            Toast.makeText(this, "Falta la contraseña", Toast.LENGTH_SHORT).show();
        }
        if(usuario.length()!=0 && password.length() !=0){
            Toast.makeText(this, "correct Login", Toast.LENGTH_SHORT).show();
        }
    }*/
}