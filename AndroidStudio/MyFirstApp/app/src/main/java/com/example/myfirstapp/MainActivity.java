package com.example.myfirstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMessage(View view) {
        System.out.println("DEBUG: Ejecutando sendMessage()");
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText = findViewById(R.id.editText);
        System.out.println("DEBUG: " + editText);
        message = editText.getText().toString();
        System.out.println("DEBUG: " + message);
        startActivity(intent);
    }
    private static String message;
    public static String getMessage() {
        return message;
    }
}
