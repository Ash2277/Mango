package com.example.grocery_app;

import android.content.Intent;
import android.os.Bundle;

import com.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Button;

public class ItemsRegisterationFruits extends AppCompatActivity
{
    Button b1, b2;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_items_registeration_fruits);
        b1 = findViewById(R.id.button17);
        b2 = findViewById(R.id.button16);
        b1.setOnClickListener(v -> click());
        b2.setOnClickListener(v -> click2());
    }
    public void click()
    {
        Intent i = new Intent(ItemsRegisterationFruits.this, ItemsRegistration.class);
        startActivity(i);
        finish();
    }
    public void click2()
    {
        Intent i = new Intent(ItemsRegisterationFruits.this, Homepage.class);
        startActivity(i);
        finish();
    }
}