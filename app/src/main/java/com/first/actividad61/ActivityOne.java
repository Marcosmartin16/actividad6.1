package com.first.actividad61;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

public class ActivityOne extends AppCompatActivity {

    private EditText et1;
    String mensaje;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activityone);
    }

    public void convertir(View vista) {

        et1 = findViewById(R.id.et1);
        mensaje = et1.getText().toString();



        Intent my_intent = new Intent(this,ActivityTwo.class);
        my_intent.putExtra("Numero_convertido",mensaje);
        startActivity(my_intent);
    }
}

