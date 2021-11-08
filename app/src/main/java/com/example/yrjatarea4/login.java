package com.example.yrjatarea4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class login extends AppCompatActivity {

    EditText valpassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        valpassword = findViewById(R.id.password);
    }

    public void validar(View v){
        String pass = "Android2021";
        if(pass.equals(valpassword.getText().toString())){
            Toast.makeText(this, "Cargando", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this, Validado.class);
            startActivity(intent);
            finish();
        }else{
            Toast.makeText(this, "Error de contraseña", Toast.LENGTH_SHORT).show();
            finish();
        }
    }
}