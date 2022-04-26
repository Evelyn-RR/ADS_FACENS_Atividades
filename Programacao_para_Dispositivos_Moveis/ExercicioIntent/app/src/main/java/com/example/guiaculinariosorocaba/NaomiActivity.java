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

public class NaomiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_naomi);
    }

    public void btnTelefonarNaomiClick(View view){
        Uri uri = Uri.parse("tel: 01530371111");
        Intent intent = new Intent(Intent.ACTION_DIAL, uri);
        //startActivity(intent);

        int permissionCheck = ContextCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE);

        if(permissionCheck != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.CALL_PHONE}, 1);
        } else {
            startActivity(intent);
        }
    }

    public void btnAbrirNaomiMapa(View view){
        //Av. Pres. Kennedy, 179 - Jardim Paulistano, Sorocaba - SP, 18040-550
        Uri uri = Uri.parse("geo:0,0?q=Avenida+press+kennedy+179+jardim+paulistano+Sorocaba+SP+18040550");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        intent.setPackage("com.google.android.apps.maps");
        startActivity(intent);
    }

    public void btnNaomiClick(View view){
        Uri uri = Uri.parse("https://www.instagram.com/naomirestaurante/");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    public void btnVoltarClick(View view) {
        finish();
    }


}