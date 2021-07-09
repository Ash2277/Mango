package com.example.grocery_app;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.widget.Button;


import androidx.appcompat.app.AppCompatActivity;
public class Homepage extends AppCompatActivity
{
    Button b;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);

        b = findViewById(R.id.log);
        b.setOnClickListener(v -> click());
    }

    public void click()
    {
        Intent i = new Intent(Homepage.this, Login.class);
        startActivity(i);
    }

}
