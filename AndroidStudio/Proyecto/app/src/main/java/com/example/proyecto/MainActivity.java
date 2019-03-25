package com.example.proyecto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TableLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    TextView binView, octView, hexView, decView;
    String focus;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView binView = (TextView)findViewById(R.id.bin_view);
        TextView octView = (TextView)findViewById(R.id.oct_view);
        TextView hexView = (TextView)findViewById(R.id.hex_view);
        TextView decView = (TextView)findViewById(R.id.dec_view);


        binView.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (hasFocus) {
                    focus = "bin";
                    System.out.println(focus);
                }
            }
        });


        octView.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (hasFocus) {
                    focus = "oct";
                    System.out.println(focus);
                }
            }
        });


        hexView.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (hasFocus) {
                    focus = "hex";
                    System.out.println(focus);
                }
            }
        });


        decView.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (hasFocus) {
                    focus = "dec";
                    System.out.println(focus);
                }
            }
        });
    }

    protected void printNumbers(View view) {
        String buttonPressed = view.getTag().toString();
        TextView binView = (TextView)findViewById(R.id.bin_view);
        TextView octView = (TextView)findViewById(R.id.oct_view);
        TextView hexView = (TextView)findViewById(R.id.hex_view);
        TextView decView = (TextView)findViewById(R.id.dec_view);
        switch (focus) {
            case "bin": binView.setText(buttonPressed);
                break;
            case "oct": octView.setText(buttonPressed);
                break;
            case "hex": hexView.setText(buttonPressed);
                break;
            case "dec": decView.setText(buttonPressed);
                break;
        }
    }
}
