package com.example.guiaculinariosorocaba;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class CarneadaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carneada);
    }

    public void btnTelefonarCarneadaClick(View view){
        Uri uri = Uri.parse("tel: 015998292301");
        Intent intent = new Intent(Intent.ACTION_DIAL, uri);
        //startActivity(intent);

        int permissionCheck = ContextCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE);

        if(permissionCheck != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.CALL_PHONE}, 1);
        } else {
            startActivity(intent);
        }
    }

    public void btnAbrirCarneadaMapa(View view){
        //Praça Nova York, 53 - Jardim America, Sorocaba - SP, 18046-775
        Uri uri = Uri.parse("geo:0,0?q=Praça+nova+york+53+jardim+america+Sorocaba+SP+18046775");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        intent.setPackage("com.google.android.apps.maps");
        startActivity(intent);
    }

    public void btnCarneadaClick(View view){
        Uri uri = Uri.parse("https://www.instagram.com/carneada_/");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    public void btnVoltarClick(View view) {
        finish();
    }

}