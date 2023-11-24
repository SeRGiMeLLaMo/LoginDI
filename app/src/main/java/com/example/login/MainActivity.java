package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.login.model.User;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private EditText met_user;
    private EditText met_password;

    private ArrayList<User> listUser;
    private User objUser;


   @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        met_user = (EditText) findViewById(R.id.editTextText);
        met_password = (EditText) findViewById(R.id.editTextTextPassword);
    }

    public void  insert(View view){
       Intent i = new Intent(this, MainRegister.class);
       startActivity(i);

    }

    public void llenarUser(){
       listUser = new ArrayList<User>();
       listUser.add(new User("Pepe", "admin"));
    }

    private void insert(){
       llenarUser();
       String name = met_user.getText().toString();
       String password = met_password.getText().toString();
       if(name.length()==0){
           Toast.makeText(this, "Falta el usuario", Toast.LENGTH_SHORT).show();
       }
        if(password.length()==0){
            Toast.makeText(this, "Falta la contraseña", Toast.LENGTH_SHORT).show();
        }
        if(name.length()!=0 && password.length() !=0){
            Toast.makeText(this, "correct Login", Toast.LENGTH_SHORT).show();
        }

    }


}