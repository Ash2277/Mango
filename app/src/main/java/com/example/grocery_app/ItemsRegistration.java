package com.example.grocery_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import com.R;

public class ItemsRegistration extends AppCompatActivity
{

    ImageView v1, v2;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_items_registration);

        v1 = findViewById(R.id.imageView9);
        v2 = findViewById(R.id.imageView);

        v1.setOnClickListener(v -> click());
        v2.setOnClickListener(v -> click2());
    }

    public void click()
    {
        Intent i = new Intent(ItemsRegistration.this, ItemsRegisterationFruits.class);
        startActivity(i);
    }
    public void click2()
    {
        Intent i = new Intent(ItemsRegistration.this, ItemsRegistrationVeggies.class);
        startActivity(i);
    }
}