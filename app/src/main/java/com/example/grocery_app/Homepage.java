package com.example.grocery_app;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;
import androidx.appcompat.app.AppCompatActivity;
import com.R;
import com.pnuema.android.foursite.mainscreen.ui.MainActivity;


public class Homepage extends AppCompatActivity
{
    Button b, b1, s1, s2, s3;
    ImageButton location;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);

        b = findViewById(R.id.log);
        b1 = findViewById(R.id.button2);
        s1 = findViewById(R.id.store1);
        s2 = findViewById(R.id.store2);
        s3 = findViewById(R.id.store3);
        location = findViewById(R.id.nearme);

        b.setOnClickListener(v -> click());
        b1.setOnClickListener(v -> click1());
        s1.setOnClickListener(v -> click2());
        s2.setOnClickListener(v -> click3());
        s3.setOnClickListener(v -> click4());
        location.setOnClickListener(v -> click5());
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
    public void click2()
    {
        Intent i = new Intent(Homepage.this, CustomerBuying1.class);
        i.putExtra("cost", "0");
        startActivity(i);
    }
    public void click3()
    {
        Intent i = new Intent(Homepage.this, CustomerBuying2.class);
        startActivity(i);
    }
    public void click4()
    {
        Intent i = new Intent(Homepage.this, CustomerBuying3.class);
        startActivity(i);
    }
    public void click5()
    {
        Intent i = new Intent(Homepage.this, MainActivity.class);
        startActivity(i);
    }
}
