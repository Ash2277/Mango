package com.example.grocery_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import com.R;

public class ItemsRegistration extends AppCompatActivity
{

    ImageView v1, v2,v3,v4,v5,v6;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_items_registration);

        v1 = findViewById(R.id.imageView9);
        v2 = findViewById(R.id.imageView);
        v3 = findViewById(R.id.imageView2);
        v4 = findViewById(R.id.imageView4);
        v5 = findViewById(R.id.imageView16);
        v6 = findViewById(R.id.imageView15);

        v1.setOnClickListener(v -> click());
        v2.setOnClickListener(v -> click2());
        v3.setOnClickListener(v -> click3());
        v4.setOnClickListener(v -> click4());
        v5.setOnClickListener(v -> click5());
        v6.setOnClickListener(v -> click6());
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
    public void click3()
    {
        Intent i = new Intent(ItemsRegistration.this, SellingGreens.class);
        startActivity(i);
    }
    public void click4()
    {
        Intent i = new Intent(ItemsRegistration.this, SellingRice.class);
        startActivity(i);
    }
    public void click5()
    {
        Intent i = new Intent(ItemsRegistration.this, SellingFlour.class);
        startActivity(i);
    }
    public void click6()
    {
        Intent i = new Intent(ItemsRegistration.this, SellGrains.class);
        startActivity(i);
    }
}