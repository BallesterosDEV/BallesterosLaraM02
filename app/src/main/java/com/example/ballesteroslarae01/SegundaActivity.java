package com.example.ballesteroslarae01;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SegundaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView2 = findViewById(R.id.textView2);

        // Obtener el nombre de usuario de la actividad anterior
        String usuario = getIntent().getStringExtra("usuario");
        textView2.setText("By " + usuario);
    }
}
