package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ActOne extends AppCompatActivity {

    TextView tv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_one_layout);

        tv = findViewById(R.id.showdata);
        Intent intent =getIntent();
        String message = intent.getStringExtra("EXTRA_MESSAGE");
        tv.setText( message);
    }
}
