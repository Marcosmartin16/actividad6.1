package com.first.actividad61;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class ActivityFour extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activityfour);
    }

    public void cambiar(View vista) {
        Intent intent = new Intent(this, ActivityOne.class);

        startActivity(intent);
    }
}
