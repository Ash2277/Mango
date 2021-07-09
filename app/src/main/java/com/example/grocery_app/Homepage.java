package com.example.grocery_app;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.widget.Button;


import androidx.appcompat.app.AppCompatActivity;
public class Homepage extends AppCompatActivity
{
    Button b,b1;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);

        b = findViewById(R.id.log);
        b1 = findViewById(R.id.button2);
        b.setOnClickListener(v -> click());
        b1.setOnClickListener(v -> click1());
    }

    public void click()
    {
        Intent i = new Intent(Homepage.this, Login.class);
        startActivity(i);
    }
    public void click1()
    {
        Intent i = new Intent(Homepage.this, RetailerSignup.class);
        startActivity(i);
    }

}
