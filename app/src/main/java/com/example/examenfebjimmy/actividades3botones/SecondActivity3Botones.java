package com.example.examenfebjimmy.actividades3botones;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.examenfebjimmy.R;

public class SecondActivity3Botones extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_activity3_botones);

        Button pikachuBtn = (Button) findViewById(R.id.Pikachu3Btn);
        Button charmanderBtn = (Button) findViewById(R.id.Charmander3Btn);
        Button pipluBtn = (Button) findViewById(R.id.Piplu3Btn);

        pikachuBtn.setOnClickListener(v -> {

        });
    }
}