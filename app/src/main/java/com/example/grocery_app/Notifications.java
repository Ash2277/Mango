package com.example.grocery_app;

import androidx.appcompat.app.AppCompatActivity;

import android.app.NotificationManager;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;

import com.R;

public class Notifications extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notifications);

        textView = findViewById(R.id.text_view);
        NotificationManager manager = (NotificationManager) getApplicationContext()
                .getSystemService(NOTIFICATION_SERVICE);
        manager.cancelAll();
        if (getIntent().hasExtra("yes")) {
            textView.setText("You accepted request");
            textView.setTextColor(Color.GREEN);
        }
        else if(getIntent().hasExtra("no")){
            textView.setText("You rejected request");
            textView.setTextColor(Color.RED);

        }


    }
}