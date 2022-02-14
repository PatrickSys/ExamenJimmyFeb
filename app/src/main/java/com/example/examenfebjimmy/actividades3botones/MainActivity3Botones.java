package com.example.examenfebjimmy.actividades3botones;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.examenfebjimmy.MainActivity;
import com.example.examenfebjimmy.R;

/**
 * Botón de ir a actividad 2, en actividad 2,
 * 3 botones para volver a la actividad 1 y según el botón con el que hayas vuelto,
 * se pone un fondo de pantalla u otro
 */
public class MainActivity3Botones extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity3_botones);

        Button goToAct2 = (Button) findViewById(R.id.ButtonMainAct3Btn);

        // Con el boton vamos a la second activity
        goToAct2.setOnClickListener(v -> {
        Intent intent = new Intent(MainActivity3Botones.this, SecondActivity3Botones.class);
        startActivityForResult(intent, 200);
        });
    }


}