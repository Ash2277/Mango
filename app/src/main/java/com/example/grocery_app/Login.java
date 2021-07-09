package com.example.grocery_app;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Login extends AppCompatActivity
{
    TextView name, address, mobile, email;
    Button submit;
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        submit = findViewById(R.id.submit);
        submit.setOnClickListener(v -> click());

    }

    public void click()
    {
        name = findViewById(R.id.name);
        address = findViewById(R.id.name);
        mobile = findViewById(R.id.name);
        email = findViewById(R.id.name);
    }
}
