package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText polup, a, b, c;
    ConstraintLayout myLayout;
    TextView result;
    Button myButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        result = findViewById(R.id.textview);
        myLayout = findViewById(R.id.layoutgai);
        a = findViewById(R.id.editTextNumber);
        b = findViewById(R.id.editTextNumber2);
        c = findViewById(R.id.editTextNumber3);
        polup = findViewById(R.id.editTextNumber4);
        myButton = findViewById(R.id.button);
        double p =  Double.parseDouble(polup.getText().toString());
        final double res = Math.sqrt(p*(p-Double.parseDouble(a.getText().toString()))*(p-Double.parseDouble(b.getText().toString()))*(p-Double.parseDouble(c.getText().toString())));;
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            result.setText(String.valueOf(res));
            }
        });
    }
}