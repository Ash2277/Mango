package com.example.grocery_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class CustomerBuying extends AppCompatActivity
{
    ImageView v;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_buying);

        v = findViewById(R.id.imageView9);

        v.setOnClickListener(v -> click());
    }

    public void click()
    {
        Intent i = new Intent(CustomerBuying.this, BuyingFruits.class);
        startActivity(i);
    }
}