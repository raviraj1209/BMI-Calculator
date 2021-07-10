package com.example.bmicalculator;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Underweigt extends AppCompatActivity {

    TextView under ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_underweigt);
        under = findViewById(R.id.textobs);
        String unc = getIntent().getStringExtra("unwec");
        under.setText(unc);
    };



}
