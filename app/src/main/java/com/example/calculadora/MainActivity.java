package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int firstNumber = 0;
    int nextNumber = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button cambio = findViewById(R.id.button);

        TextView screen = findViewById(R.id.textScreen);
        Button ce = findViewById(R.id.buttonCE);
        Button c = findViewById(R.id.buttonC);

        Button one = findViewById(R.id.button1);
        Button two = findViewById(R.id.button2);
        Button three = findViewById(R.id.button3);
        Button four = findViewById(R.id.button4);
        Button five = findViewById(R.id.button5);
        Button six = findViewById(R.id.button6);
        Button seven = findViewById(R.id.button7);
        Button eight = findViewById(R.id.button8);
        Button nine = findViewById(R.id.button9);
        Button zero = findViewById(R.id.button0);



        cambio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, KotlinMainActivity.class);
                startActivity(intent);
            }
        });

        ce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                screen.setText("");
                firstNumber = 0;
                nextNumber = 0;
            }
        });

        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                screen.setText("");
            }
        });

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(screen.getText().equals(null) | screen.getText().equals("0")) {
                    screen.setText("1");
                } else {
                    screen.setText(screen.getText() + "1");
                }
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(screen.getText().equals(null) | screen.getText().equals("0")) {
                    screen.setText("2");
                } else {
                    screen.setText(screen.getText() + "2");
                }
            }
        });



    }
}