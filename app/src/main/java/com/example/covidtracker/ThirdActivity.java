package com.example.covidtracker;

import android.content.Intent;
import android.content.SharedPreferences;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class ThirdActivity extends AppCompatActivity {

    Button btn;
    TextView txt7, txt8, txt9, txt10, txt11, txt12, txt13;
    EditText ediTxt4, ediTxt5, ediTxt6;
    String LOCATION_REGION = "region";
    String LOCATION_COUNTRY = "country";
    String STATUS = "status";
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        setUp();
        final SharedPreferences sharedPreferences = getSharedPreferences("COVID", MODE_PRIVATE);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(ThirdActivity.this, FourthActivity.class);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                String region = ediTxt4.getText().toString();
                String country = ediTxt5.getText().toString();
                int status = Integer.parseInt(ediTxt6.getText().toString());
                editor.putString(LOCATION_COUNTRY, country);
                editor.putString(LOCATION_REGION, region);
                editor.putInt(STATUS, status);
                editor.commit();
                startActivity(intent);
            }
        });
    }

    private void setUp(){
        btn = findViewById(R.id.button2);
        txt7 = findViewById(R.id.textView7);
        txt8 = findViewById(R.id.textView8);
        txt9 = findViewById(R.id.textView9);
        txt10 = findViewById(R.id.textView10);
        txt11 = findViewById(R.id.textView11);
        txt12 = findViewById(R.id.textView12);
        txt13 = findViewById(R.id.textView13);
        ediTxt4 = findViewById(R.id.editTextTextPersonName4);
        ediTxt5 = findViewById(R.id.editTextTextPersonName5);
        ediTxt6 = findViewById(R.id.editTextTextPersonName6);
    }
}