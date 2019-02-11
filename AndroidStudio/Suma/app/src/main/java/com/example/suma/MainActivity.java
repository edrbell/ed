package com.example.suma;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int sumando = 0;
    int sumador = 0;
    int resultado = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Suma(View view) {
        EditText sumandoInput = findViewById(R.id.sumando_input);
        EditText sumadorInput = findViewById(R.id.sumador_input);
        TextView resultadoOutput = findViewById(R.id.resultado);
        sumando = Integer.parseInt(sumandoInput.getText().toString());
        sumador = Integer.parseInt(sumadorInput.getText().toString());
        resultado = sumando + sumador;
        resultadoOutput.setText(String.valueOf(resultado));
    }
}
