package com.example.covidtracker;

import android.content.Intent;
import android.content.SharedPreferences;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import java.io.Serializable;

public class SecondActivity extends AppCompatActivity {
    Button btn, btn4;
    TextView txt2, txt3, txt4, txt5, txt6;
    EditText ediTxt1, ediTxt2, ediTxt3;
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;
    String NAME = "Name";
    String PHONE_NUMBER = "Phone number";
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        setUp();
        sharedPreferences = getSharedPreferences("COVID", MODE_PRIVATE);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = ediTxt1.getText().toString();
                String phone = ediTxt2.getText().toString();
                editor = sharedPreferences.edit();
                editor.putString(NAME, name);
                editor.putString(PHONE_NUMBER, phone);
                editor.commit();
            }
        });

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(SecondActivity.this, ThirdActivity.class);
                startActivity(intent);
            }
        });
    }

    private void setUp(){
        btn = findViewById(R.id.button2);
        btn4 = findViewById(R.id.button4);
        txt2 = findViewById(R.id.textView2);
        txt3 = findViewById(R.id.textView3);
        txt4 = findViewById(R.id.textView4);
        txt5 = findViewById(R.id.textView5);
        txt6 = findViewById(R.id.textView6);
        ediTxt1 = findViewById(R.id.editTextTextPersonName);
        ediTxt2 = findViewById(R.id.editTextTextPersonName2);
        ediTxt3 = findViewById(R.id.editTextTextPersonName3);
    }
}