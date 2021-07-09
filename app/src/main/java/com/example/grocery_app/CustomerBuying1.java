package com.example.grocery_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomerBuying1 extends AppCompatActivity
{
    ImageView v;
    TextView t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_buying);

        t = findViewById(R.id.textView3);
        v = findViewById(R.id.imageView9);

        t.setText("Om Sri Sai Fruits & Vegetables");
        v.setOnClickListener(v -> click());
    }

    public void click()
    {
        Intent i = new Intent(CustomerBuying1.this, BuyingFruits1.class);
        startActivity(i);
    }
}