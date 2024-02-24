package com.example.inchestometers;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    EditText inches;
    Button calculateButton;
    TextView meters;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViews();
        calculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String in_string = inches.getText().toString();
                if (in_string.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Inches field is empty! Please enter a number.", Toast.LENGTH_LONG).show();
                    meters.setText("");
                } else {
                    displayResult(convertToMeters(Double.parseDouble(in_string)));
                }

            }


        });

    }

    private void findViews() {
        inches = findViewById(R.id.inchesEditText);
        calculateButton = findViewById(R.id.convertButton);
        meters = findViewById(R.id.metersTextView);
    }

    private double convertToMeters(double in) {
        return in * 0.0254;
    }

    private void displayResult(double inches) {
        DecimalFormat inchFormatted = new DecimalFormat("0.00");
        meters.setText("Your height in meters is: " + inchFormatted.format(inches) + "m");
    }

}