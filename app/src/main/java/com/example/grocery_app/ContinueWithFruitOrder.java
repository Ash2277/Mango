package com.example.grocery_app;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ContinueWithFruitOrder extends AppCompatActivity
{
    TextView tl1, tl2, tl3, tl4, tr1, tr2, tr3, tr4, total;
    Button proceed, re;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_continue_with_fruit_order);

        int cost = getIntent().getExtras().getInt("cost");
        String ap = getIntent().getExtras().getString("apples");
        String or = getIntent().getExtras().getString("oranges");
        String man = getIntent().getExtras().getString("mangoes");
        String wm = getIntent().getExtras().getString("watermelons");

        tl1 = (TextView) findViewById(R.id.textView7);
        tl2 = (TextView) findViewById(R.id.textView11);
        tl3 = (TextView) findViewById(R.id.textView16);
        tl4 = (TextView) findViewById(R.id.textView18);
        tr1 = (TextView) findViewById(R.id.textView8);
        tr2 = (TextView) findViewById(R.id.textView14);
        tr3 = (TextView) findViewById(R.id.textView17);
        tr4 = (TextView) findViewById(R.id.textView19);
        total = findViewById(R.id.textView10);

        if (Integer.parseInt(ap) > 0)
        {
            tl1.setText("Apples");
            tr1.setText(ap);
        }
        if (Integer.parseInt(or) > 0)
        {
            tl2.setText("Oranges");
            tr2.setText(or);
        }
        if (Integer.parseInt(man) > 0)
        {
            tl3.setText("Mangoes");
            tr3.setText(man);
        }
        if (Integer.parseInt(wm) > 0)
        {
            tl4.setText("Watermelons");
            tr4.setText(wm);
        }

        proceed = findViewById(R.id.button10);
        re = findViewById(R.id.button9);
        proceed.setOnClickListener(v -> proc());
        re.setOnClickListener(v -> ret());
    }

    public void ret()
    {

    }

    private void proc()
    {

    }
}
