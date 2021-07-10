package com.example.grocery_app;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.R;

public class ContinueWithFlourOrder extends AppCompatActivity
{
    TextView tl1, tl2, tl3, tl4, tr1, tr2, tr3, tr4, total;
    Button proceed, re;
    String cost;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_continue_with_order);


        cost = getIntent().getExtras().getString("cost");

        String ap = getIntent().getExtras().getString("wheat");
        String or = getIntent().getExtras().getString("rice");
        String man = getIntent().getExtras().getString("almond");
        String wm = getIntent().getExtras().getString("all");

        tl1 = (TextView) findViewById(R.id.textView7);
        tl2 = (TextView) findViewById(R.id.textView11);
        tl3 = (TextView) findViewById(R.id.textView16);
        tl4 = (TextView) findViewById(R.id.textView18);
        tr1 = (TextView) findViewById(R.id.textView8);
        tr2 = (TextView) findViewById(R.id.textView14);
        tr3 = (TextView) findViewById(R.id.textView17);
        tr4 = (TextView) findViewById(R.id.textView19);
        total = findViewById(R.id.textView10);

        total.setText("Subtotal: Rs.".concat(cost));

        if (Integer.parseInt(ap) > 0)
        {
            tl1.setText("Wheat (kg)");
            tr1.setText(ap);
        }
        if (Integer.parseInt(or) > 0)
        {
            tl2.setText("Rice (kg)");
            tr2.setText(or);
        }
        if (Integer.parseInt(man) > 0)
        {
            tl3.setText("Almond (kg)");
            tr3.setText(man);
        }
        if (Integer.parseInt(wm) > 0)
        {
            tl4.setText("All purposes (kg)");
            tr4.setText(wm);
        }


        proceed = findViewById(R.id.button10);
        re = findViewById(R.id.button9);
        proceed.setOnClickListener(v -> proc());
        re.setOnClickListener(v -> ret());
    }

    public void ret()
    {
        Intent i = new Intent(ContinueWithFlourOrder.this, CustomerBuying1.class);
        i.putExtra("cost", cost);
        startActivity(i);
    }

    private void proc()
    {
        Intent i = new Intent(ContinueWithFlourOrder.this, ThankYouPage.class);
        startActivity(i);
        finish();
    }
}
