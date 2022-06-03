package com.example.mvc.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.mvc.R;
import com.example.mvc.model.Counter;

public class MainActivity extends AppCompatActivity implements INotify {
    Button buttonInc, buttonDec, buttonReset;
    TextView textCounter;

    private Counter counter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        initListener();
    }

    private void initViews() {
        buttonDec = findViewById(R.id.buttonDec);
        buttonInc = findViewById(R.id.buttonInc);
        buttonReset = findViewById(R.id.buttonReset);
        textCounter = findViewById(R.id.textCounter);
    }

    private void initListener() {
        counter = new Counter(this);
        buttonInc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter.setValue(1);
            }
        });

        buttonDec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter.setValue(2);
            }
        });

        buttonReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter.setValue(3);
            }
        });
    }


    @Override
    public void onNotify() {
        textCounter.setText(String.valueOf(counter.getValue()));
    }
}