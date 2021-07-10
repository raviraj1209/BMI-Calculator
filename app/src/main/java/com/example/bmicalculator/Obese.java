package com.example.bmicalculator;

        import android.os.Bundle;
        import android.widget.TextView;

        import androidx.appcompat.app.AppCompatActivity;

public class Obese extends AppCompatActivity {

    TextView under ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_obese);
        under = findViewById(R.id.textobs);
        String iamobese = getIntent().getStringExtra("youobese");
        under.setText(iamobese);
//        String unc = getIntent().getStringExtra("unwec");
//        under.setText(unc);
    };



}