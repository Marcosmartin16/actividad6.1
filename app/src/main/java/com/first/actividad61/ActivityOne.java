package com.first.actividad61;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class ActivityOne extends AppCompatActivity {

    private EditText et1;
    private String mensaje;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activityone);
    }

    public void cambiar(View vista){

        et1 = findViewById(R.id.et1);
        mensaje = et1.getText().toString();

        Intent intent = new Intent(this,ActivityTwo.class);
        intent.putExtra("Numero_convertir", mensaje);

        startActivity(intent);
    }
}
