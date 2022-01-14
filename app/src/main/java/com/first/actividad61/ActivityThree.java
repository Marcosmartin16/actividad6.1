package com.first.actividad61;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ActivityThree extends AppCompatActivity {

    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activitythree);

        tv1 = findViewById(R.id.tv1);

        Bundle extras = getIntent().getExtras();
        String mensaje = extras.getString("Numero_convertir");
        tv1.setText(mensaje);

    }

    public void cambiar(View vista) {
        Intent intent = new Intent(this, ActivityFour.class);

        startActivity(intent);
    }
}
