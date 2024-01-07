package com.example.ballesteroslarae01;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText inputUsuario, inputPassword;
    private Button btnLogin;
    private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        inputUsuario = findViewById(R.id.inputUsuario);
        inputPassword = findViewById(R.id.inputPassword);
        btnLogin = findViewById(R.id.btnLogin);
        resultado = findViewById(R.id.resultado);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validarLogin();
            }
        });
    }

    private void validarLogin() {
        String usuario = inputUsuario.getText().toString();
        String password = inputPassword.getText().toString();

        if (usuario.equals("admin") && password.equals("admin")) {
            // Login correcto, redirigir a la segunda pantalla
            resultado.setText("Login correcto");

            // Enviar usuario a la siguiente actividad
            Intent intent = new Intent(MainActivity.this, SegundaActivity.class);
            intent.putExtra("usuario", usuario);
            startActivity(intent);
        } else {
            // Login incorrecto
            resultado.setText("Usuario o contraseña incorrectos");
        }
    }
}