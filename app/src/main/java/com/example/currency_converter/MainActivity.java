package com.example.currency_converter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    public void btnclick(View view) {
        EditText dollarAmount = findViewById(R.id.dollarAmount);
        EditText outInr = findViewById(R.id.inr);
        String dollarS = dollarAmount.getText().toString();
        Double dollarNum = Double.parseDouble(dollarS);
        Double inr =  dollarNum*74;
        String output = inr.toString();
        outInr.setText(output);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
