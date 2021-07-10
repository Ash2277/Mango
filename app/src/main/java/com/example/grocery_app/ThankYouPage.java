package com.example.grocery_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.R;

import com.R;

public class ThankYouPage extends AppCompatActivity
{
    Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thank_you_page);

        b = findViewById(R.id.button7);
        b.setOnClickListener(v -> click());
    }

    public void click()
    {
        Intent i = new Intent(ThankYouPage.this, Homepage.class);
        startActivity(i);
        finish();
    }

}