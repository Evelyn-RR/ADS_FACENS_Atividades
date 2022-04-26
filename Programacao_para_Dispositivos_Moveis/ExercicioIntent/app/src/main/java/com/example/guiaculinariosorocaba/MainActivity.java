package com.example.guiaculinariosorocaba;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnCarneadaClick(View view) {
        Intent intent = new Intent(this, CarneadaActivity.class);
        startActivity(intent);
    }

    public void btnNaomiClick(View view) {
        Intent intent = new Intent(this, NaomiActivity.class);
        startActivity(intent);
    }

    public void btnPadariaRealClick(View view) {
        Intent intent = new Intent(this, PadariaRealActivity.class);
        startActivity(intent);
    }

    public void btnSorocabanicesClick(View view){
        Uri uri = Uri.parse("https://www.instagram.com/sorocabanices/");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
}