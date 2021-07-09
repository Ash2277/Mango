package com.example.grocery_app;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;

import java.util.List;
import java.util.Locale;

public class RetailerSignup extends AppCompatActivity {
    Button btLocation,btsignup;
    TextView textView;
    FusedLocationProviderClient fusedLocationProviderClient;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_retailer_signup);

        btLocation = findViewById(R.id.bt_location);
        textView = findViewById(R.id.text_location);
        btsignup = findViewById(R.id.sign_up);

        fusedLocationProviderClient = LocationServices.getFusedLocationProviderClient(this);

        btsignup.setOnClickListener(v -> openhomepage());

        btLocation.setOnClickListener(v -> {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                if (getApplicationContext().checkSelfPermission(Manifest.permission.ACCESS_FINE_LOCATION)
                        == PackageManager.PERMISSION_GRANTED) {
                    fusedLocationProviderClient.getLastLocation()
                            .addOnSuccessListener(location -> {

                                if (location != null) {
                                    Double lat = location.getLatitude();
                                    Double longt = location.getLongitude();
                                    textView.setText(lat + "," + longt);
                                    Toast.makeText(RetailerSignup.this, "Success", Toast.LENGTH_SHORT).show();

                                }
                            });
                } else {
                    requestPermissions(new String[]{Manifest.permission.ACCESS_FINE_LOCATION}, 44);
                }

            }
        });
    }

    private void openhomepage() {
        Intent intent = new Intent(this, Homepage.class);
        startActivity(intent);
    }
}