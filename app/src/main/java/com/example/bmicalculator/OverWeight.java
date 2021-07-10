

package com.example.bmicalculator;

        import android.os.Bundle;
        import android.widget.TextView;

        import androidx.appcompat.app.AppCompatActivity;

public class OverWeight extends AppCompatActivity {

    TextView overw;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_over_weight);
        overw = findViewById(R.id.over);
        String obw = getIntent().getStringExtra("iovw");
        overw.setText(obw);


    };



}