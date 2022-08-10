package com.example.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        EditText ET1 = findViewById(R.id.ET1);
        EditText ET2 = findViewById(R.id.ET2);
        TextView t = findViewById(R.id.result);
        Button b = findViewById(R.id.button);


        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            int num1 = Integer.parseInt(ET1.getText().toString());
            int num2 = Integer.parseInt(ET2.getText().toString());

            int result = num1+num2;

            t.setText(String.valueOf(result));
            }
        });







    }
}