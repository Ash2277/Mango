package com.example.grocery_app;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.R;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;

import java.util.List;
import java.util.Locale;

public class RetailerSignup extends AppCompatActivity {
    Button btLocation,btsignup, items;
    TextView textView;
    FusedLocationProviderClient fusedLocationProviderClient;
    int LOCATION_REQUEST_CODE = 10001;
    private static final String TAG = "RetailerSignup";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_retailer_signup);

        //btLocation = findViewById(R.id.bt_location);
        //textView = findViewById(R.id.text_location);
        btsignup = findViewById(R.id.sign_up);
        items = findViewById(R.id.button5);
        items.setOnClickListener(v -> choose());
//
        fusedLocationProviderClient = LocationServices.getFusedLocationProviderClient(this);
//
        btsignup.setOnClickListener(v -> openhomepage());
//
//        btLocation.setOnClickListener(v -> {
//            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
//                if (getApplicationContext().checkSelfPermission(Manifest.permission.ACCESS_FINE_LOCATION)
//                        == PackageManager.PERMISSION_GRANTED) {
//                    fusedLocationProviderClient.getLastLocation()
//                            .addOnSuccessListener(location -> {
//
//                                if (location != null) {
//                                    Double lat = location.getLatitude();
//                                    Double longt = location.getLongitude();
//                                    textView.setText(lat + "," + longt);
//                                    Toast.makeText(RetailerSignup.this, "Success", Toast.LENGTH_SHORT).show();
//
//                                }
//                            });
//                } else {
//                    requestPermissions(new String[]{Manifest.permission.ACCESS_FINE_LOCATION}, 44);
//                }
//
//            }
//        });
    }


    public void choose()
    {
        Intent intent = new Intent(this, ItemsRegistration.class);
        startActivity(intent);
    }

    private void openhomepage() {
        Intent intent = new Intent(this, Homepage.class);
        startActivity(intent);
    }

    @Override
    protected void onStart() {
        super.onStart();
        if(ContextCompat.checkSelfPermission(this,Manifest.permission.ACCESS_FINE_LOCATION) == PackageManager
        .PERMISSION_GRANTED){
            getLastLocation();
        }else{
        }
    }
    private void getLastLocation(){
        @SuppressLint("MissingPermission") Task<Location> locationTask = fusedLocationProviderClient.getLastLocation();

        locationTask.addOnSuccessListener(new OnSuccessListener<Location>() {
            @Override
            public void onSuccess(Location location) {
                if(location != null){
                    Log.d(TAG, "onSuccess: " + location.toString());
                    Log.d(TAG, "onSuccess: " + location.getLatitude());
                    Log.d(TAG, "onSuccess: " + location.getLongitude());
                    Double lat = location.getLatitude();
                    Double longt = location.getLongitude();
                    textView.setText(lat + "," + longt);
                }else{
                    Log.d(TAG, "onSuccess: Location was null...");
                }
            }
        });

        locationTask.addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                Log.e(TAG, "onFailure: " + e.getLocalizedMessage() );
            }
        });
        
    }
    private void askLocationPermission(){
        if(ContextCompat.checkSelfPermission(this,Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager
                .PERMISSION_GRANTED){
            if(ActivityCompat.shouldShowRequestPermissionRationale(this,Manifest.permission
            .ACCESS_FINE_LOCATION)){
                Log.d(TAG, "askLocationPermission: you should show an alert dialog...");
                ActivityCompat.requestPermissions(this,new String[]{Manifest.permission.ACCESS_FINE_LOCATION},
                        LOCATION_REQUEST_CODE);
            }else{
                ActivityCompat.requestPermissions(this,new String[]{Manifest.permission.ACCESS_FINE_LOCATION},
                        LOCATION_REQUEST_CODE);
            }
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if(requestCode==LOCATION_REQUEST_CODE){
            if(grantResults.length>0 && grantResults[0] == PackageManager.PERMISSION_GRANTED){
                //PERMISSION GRANTED
                getLastLocation();
            }else{
                //PERMISSION DENIED
            }
        }
    }
}