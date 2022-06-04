package com.example.calci201b374;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText et1, et2;
    Button ADD, SUB, MUL, DIV;
    TextView TV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1 = findViewById(R.id.et1);
        et2 = findViewById(R.id.et2);
        ADD = findViewById(R.id.ADD);
        SUB = findViewById(R.id.SUB);
        MUL = findViewById(R.id.MUL);
        DIV = findViewById(R.id.DIV);
        TV = findViewById(R.id.TV);
        ADD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int f, a, s;
                f = Integer.parseInt(et1.getText().toString());
                s = Integer.parseInt(et2.getText().toString());
                a = f + s;
                TV.setText("Result=" + a);

            }
        });

        SUB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int f, a, s;
                f = Integer.parseInt(et1.getText().toString());
                s = Integer.parseInt(et2.getText().toString());
                a = f - s;
                TV.setText("Result=" + a);

            }
        });
        MUL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int f, a, s;
                f = Integer.parseInt(et1.getText().toString());
                s = Integer.parseInt(et2.getText().toString());
                a = f * s;
                TV.setText("Result=" + a);

            }
        });
        DIV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int f, a, s;
                f = Integer.parseInt(et1.getText().toString());
                s = Integer.parseInt(et2.getText().toString());
                a = f / s;
                TV.setText("Result=" + a);

            }
        });


    }
}


