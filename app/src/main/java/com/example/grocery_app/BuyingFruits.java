package com.example.grocery_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class BuyingFruits extends AppCompatActivity
{
    Button b1p, b1m, b2m, b2p, b3p, b3m, b4m, b4p, conf, back;
    TextView t1, t2, t3, t4, pr1, pr2, pr3, pr4;
    String s, sp1, sp2, sp3, sp4;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buying_fruits);

        b1m = findViewById(R.id.button1m);
        b1p = findViewById(R.id.button1p);
        b2m = findViewById(R.id.button2m);
        b2p = findViewById(R.id.button2p);
        b3m = findViewById(R.id.button3m);
        b3p = findViewById(R.id.button3p);
        b4m = findViewById(R.id.button4m);
        b4p = findViewById(R.id.button4p);
        t1 = (TextView) findViewById(R.id.textView1t);
        t2 = (TextView) findViewById(R.id.textView2t);
        t3 = (TextView) findViewById(R.id.textView3t);
        t4 = (TextView) findViewById(R.id.textView4t);
        pr1 = (TextView) findViewById(R.id.textView1pr);
        pr2 = (TextView) findViewById(R.id.textView2pr);
        pr3= (TextView) findViewById(R.id.textView3pr);
        pr4 = (TextView) findViewById(R.id.textView4pr);
        conf = findViewById(R.id.button16);
        back = findViewById(R.id.button17);

        b1p.setOnClickListener(v -> addt1());
        b2p.setOnClickListener(v -> addt2());
        b3p.setOnClickListener(v -> addt3());
        b4p.setOnClickListener(v -> addt4());
        b1m.setOnClickListener(v -> subt1());
        b2m.setOnClickListener(v -> subt2());
        b3m.setOnClickListener(v -> subt3());
        b4m.setOnClickListener(v -> subt4());
        conf.setOnClickListener(v -> cont());
        back.setOnClickListener(v -> ret());
    }

    public void addt1()
    {
        s =(String) t1.getText();
        s = Integer.toString(1 + Integer.parseInt(s));
        t1.setText(s);
        sp1 = Integer.toString(55 * Integer.parseInt(s));
        pr1.setText("Rs. ".concat(sp1));
    }

    public void addt2()
    {
        s =(String) t2.getText();
        s = Integer.toString( Integer.parseInt(s) + 1);
        t2.setText(s);
        sp2 = Integer.toString(54 * Integer.parseInt(s));
        pr2.setText("Rs. ".concat(sp2));
    }

    public void addt3()
    {
        s =(String) t3.getText();
        s = Integer.toString(1 + Integer.parseInt(s));
        t3.setText(s);
        sp3 = Integer.toString(20 * Integer.parseInt(s));
        pr3.setText("Rs. ".concat(sp3));
    }

    public void addt4()
    {
        s =(String) t4.getText();
        s = Integer.toString(1 + Integer.parseInt(s));
        t4.setText(s);
        sp4 = Integer.toString(80 * Integer.parseInt(s));
        pr4.setText("Rs. ".concat(sp4));
    }

    public void subt1()
    {
        s =(String) t1.getText();
        if(Integer.parseInt(s) > 0)
        {
            s = Integer.toString( Integer.parseInt(s) - 1);
            t1.setText(s);
            sp1 = Integer.toString(55 * Integer.parseInt(s));
            pr1.setText("Rs. ".concat(sp1));
        }
    }

    public void subt2()
    {
        s =(String) t2.getText();
        if(Integer.parseInt(s) > 0)
        {
            s = Integer.toString( Integer.parseInt(s) - 1);
            t2.setText(s);
            sp2 = Integer.toString(54 * Integer.parseInt(s));
            pr2.setText("Rs. ".concat(sp2));
        }
    }

    public void subt3()
    {
        s =(String) t3.getText();
        if(Integer.parseInt(s) > 0)
        {
            s = Integer.toString( Integer.parseInt(s) - 1);
            t3.setText(s);
            sp3 = Integer.toString(20 * Integer.parseInt(s));
            pr3.setText("Rs. ".concat(sp3));
        }
    }

    public void subt4()
    {
        s =(String) t4.getText();
        if(Integer.parseInt(s) > 0)
        {
            s = Integer.toString( Integer.parseInt(s) - 1);
            t4.setText(s);
            sp4 = Integer.toString(80 * Integer.parseInt(s));
            pr4.setText("Rs. ".concat(sp4));
        }
    }

    public void ret()
    {
        Intent i = new Intent(BuyingFruits.this, CustomerBuying.class);
        startActivity(i);
        finish();
    }

    public void cont()
    {

    }

    @Override
    public void onBackPressed()
    {
    }
}