package com.example.mvc.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.mvc.R;

public class MainActivity extends AppCompatActivity{
    Button buttonInc, buttonDec, buttonReset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    private void initViews() {
        buttonDec = findViewById(R.id.buttonDec);
        buttonInc = findViewById(R.id.buttonInc);
        buttonReset = findViewById(R.id.buttonReset);
    }

    private void initListener() {

        buttonDec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });


        buttonInc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        buttonReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                
            }
        });
    }


}