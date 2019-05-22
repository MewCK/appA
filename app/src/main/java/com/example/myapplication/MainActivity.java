package com.example.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.myapplication.R;

public class MainActivity extends AppCompatActivity {


    public static String key ="message";
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editText);




    }



    public void buttonclickone(View view) {
        Intent intent = new Intent(this,ActOne.class);
        intent.putExtra("EXTRA_MESSAGE",editText.getText().toString());
        startActivity(intent);
    }
    public void buttonclicktwo(View view) {
        Intent intent = new Intent(this,ActTwo.class);
        startActivity(intent);
    }
}