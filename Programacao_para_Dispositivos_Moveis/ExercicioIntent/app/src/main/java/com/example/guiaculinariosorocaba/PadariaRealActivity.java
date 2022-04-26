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

public class PadariaRealActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_padaria_real);
    }

    public void btnTelefonarPadariaRealClick(View view){
        Uri uri = Uri.parse("tel: 01532349474");
        Intent intent = new Intent(Intent.ACTION_DIAL, uri);
        //startActivity(intent);

        int permissionCheck = ContextCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE);

        if(permissionCheck != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.CALL_PHONE}, 1);
        } else {
            startActivity(intent);
        }
    }

    public void btnAbrirPadariaRealMapa(View view){
        //R. da Penha, 1373 - Centro, Sorocaba - SP, 18010-010
        Uri uri = Uri.parse("geo:0,0?q=Rua+da+penha+1373+centro+Sorocaba+SP+18010010");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        intent.setPackage("com.google.android.apps.maps");
        startActivity(intent);
    }

    public void btnPadariaRealClick(View view){
        Uri uri = Uri.parse("https://www.instagram.com/padariareal_oficial/");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    public void btnVoltarClick(View view) {
        finish();
    }

}