package com.example.grocery_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.R;

public class CustomerBuying1 extends AppCompatActivity
{
    ImageView v1, v2;
    TextView t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_buying);

        t = findViewById(R.id.textView3);
        v1 = findViewById(R.id.imageView9);
        v2 = findViewById(R.id.imageView);

        t.setText("Om Sri Sai Fruits & Vegetables");
        v1.setOnClickListener(v -> click());
        v2.setOnClickListener(v -> click2());
    }

    public void click()
    {
        Intent i = new Intent(CustomerBuying1.this, BuyingFruits1.class);
        startActivity(i);
    }
    public void click2()
    {
        Intent i = new Intent(CustomerBuying1.this, BuyingVegetables1.class);
        startActivity(i);
    }
}