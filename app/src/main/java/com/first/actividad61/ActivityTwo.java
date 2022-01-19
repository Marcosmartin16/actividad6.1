package com.first.actividad61;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.telecom.TelecomManager;
import android.view.View;
import android.widget.Button;
import android.widget.EdgeEffect;
import android.widget.EditText;
import android.widget.TextView;

public class ActivityTwo extends AppCompatActivity {

    private TextView tv1;
    String mensaje;
    String resultado2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activitytwo);

        tv1 = findViewById(R.id.tv1);

        Intent intent = this.getIntent();
        mensaje = intent.getStringExtra("Numero_convertido").toString();
        tv1.setText(mensaje);

        

    }
    public void convertir(View vista) {

        Intent my_intent = new Intent(this,ActivityThree.class);
        my_intent.putExtra("Numero_convertido",mensaje);
        startActivity(my_intent);
    }
}