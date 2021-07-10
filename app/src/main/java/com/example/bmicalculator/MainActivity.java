package com.example.bmicalculator;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.text.DecimalFormat;


public class MainActivity extends AppCompatActivity {


    EditText ed1 ;
    EditText ed2 ;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    ;

    public void hello(View view) {
        Toast.makeText(this, "You opened the Chart Box of BMI", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(this, quick_check.class);
        startActivity(i);

    }

    public void Getbmi(View view){
        ed1 = findViewById(R.id.edit_text);
        String ed1s = ed1.getText().toString();

        ed2 = findViewById(R.id.edit);
        String ed2s = ed2.getText().toString();

        double wei = Double.parseDouble(ed2s);
        double hei = Double.parseDouble(ed1s);
        float f1 = (float) (wei/(hei*hei));


        float f = Float.parseFloat(new DecimalFormat("##.##").format(f1));

        if (f<18.5){
            String unc = "Your BMI is "+f+"\nYou are UnderWeight.";
            Intent i = new Intent(this, Underweigt.class);
            i.putExtra("unwec",unc);
            startActivity(i);
            Toast.makeText(MainActivity.this, "Your BMI is "+ f+"\nYou are UnderWeight", Toast.LENGTH_SHORT).show();
                    }
        else {
            if (f<25){
                Intent i = new Intent(this, Normal.class);
                String unc = "Your BMI is "+f+"\nYou are Normal.";
                i.putExtra("unwec",unc);
                startActivity(i);
                Toast.makeText(MainActivity.this, "Your BMI is "+ f+"\nYou are Normal", Toast.LENGTH_SHORT).show();
                }
            else {
                if (f<30){
                    Intent i = new Intent(this, OverWeight.class);
                    String obw = "Your BMI is "+f+"\nYou are OverWeight.";
                    i.putExtra("iovw",obw);
                    startActivity(i);

                    Toast.makeText(MainActivity.this, "Your BMI is "+ f+"\nYor are OverWeight", Toast.LENGTH_SHORT).show();
                }else {
                    Intent i = new Intent(this, Obese.class);
                    String iamobese = "Your BMI is "+f+"\nYou are Obesed. ";
                    i.putExtra("youobese",iamobese);
                    startActivity(i);
                    Toast.makeText(MainActivity.this, "Your BMI is "+ f+"\nYor are Obesed", Toast.LENGTH_SHORT).show();
                }
            }
        }

    }
}

