package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TableLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<Button> numeros = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        GenerarInterfazNumeros();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void GenerarInterfazNumeros() {
        TableLayout num_table = (TableLayout) findViewById(R.id.num_table);
        for(int i = 1; i < 9; i++){
            Button b = new Button(this);
            b.setText(i);
            numeros.add(b);
            num_table.addView(b);
        }


    }
}
