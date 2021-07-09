package com.example.grocery_app;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.R;

public class Login extends AppCompatActivity
{
    public static final String SHARED_PREFS_NAME = "sharedprefsp";
    public static final String SHARED_PREFS_EMAIL = "sharedprefsc";
    public static final String SHARED_PREFS_PHONE = "sharedprefsr";
    public static final String SHARED_PREFS_ADDRESS = "sharedprefsr";
    public static final String NAME = "0";
    public static final String ADDRESS = "0";
    public static final String EMAIL = "0";
    public static final String PHONE = "0";
    String n = "", a = "", p = "", e ="";
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
        n = (String) name.getText();
        a = (String) address.getText();
        p = (String) mobile.getText();
        e = (String) email.getText();
        save();
    }


    public void save()
    {
        SharedPreferences sp1 = getSharedPreferences(SHARED_PREFS_NAME, MODE_PRIVATE);
        SharedPreferences sp2 = getSharedPreferences(SHARED_PREFS_ADDRESS, MODE_PRIVATE);
        SharedPreferences sp3 = getSharedPreferences(SHARED_PREFS_EMAIL, MODE_PRIVATE);
        SharedPreferences sp4 = getSharedPreferences(SHARED_PREFS_PHONE, MODE_PRIVATE);
        SharedPreferences.Editor e1 = sp1.edit();
        SharedPreferences.Editor e2 = sp2.edit();
        SharedPreferences.Editor e3 = sp3.edit();
        SharedPreferences.Editor e4 = sp4.edit();
        e1.putString(NAME, n);
        e2.putString(ADDRESS, a);
        e3.putString(EMAIL, e);
        e4.putString(PHONE, p);
        e1.apply();
        e2.apply();
        e3.apply();
        e4.apply();
    }


    public void load()
    {
        SharedPreferences sp1 = getSharedPreferences(SHARED_PREFS_NAME, MODE_PRIVATE);
        SharedPreferences sp2 = getSharedPreferences(SHARED_PREFS_ADDRESS, MODE_PRIVATE);
        SharedPreferences sp3 = getSharedPreferences(SHARED_PREFS_EMAIL, MODE_PRIVATE);
        SharedPreferences sp4 = getSharedPreferences(SHARED_PREFS_PHONE, MODE_PRIVATE);
        n = sp1.getString(NAME, "0");
        a = sp2.getString(ADDRESS, "0");
        e = sp3.getString(EMAIL, "0");
        p = sp4.getString(PHONE, "0");
    }
}
