package com.gagan.day1_sample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.util.Log;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        final TextView message = (TextView) findViewById(R.id.etwelcome);
        String username = getIntent().getStringExtra("name");

        message.setText("welcome"+(username));
        message.setTextColor(Color.RED);
        message.setTextSize(32);


        }

    }

