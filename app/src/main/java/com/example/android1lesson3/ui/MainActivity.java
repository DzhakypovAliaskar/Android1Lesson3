package com.example.android1lesson3.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.android1lesson3.R;

public class MainActivity extends AppCompatActivity {
    Button start,exit,review;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initClickers();
    }
    private void initView() {
        start = findViewById(R.id.start_btn);
        exit = findViewById(R.id.exit_btn);

    }
    private void initClickers() {
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, LevelActivity.class);
                startActivity(intent);

            }
        });
    }


}