package com.example.patyalves.logger;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void start(View v){
        Intent intent =new Intent(this,Logger.class);
        startService(intent);
    }
    public void parar(View v){
        Intent intent =new Intent(this,Logger.class);
        stopService(intent);
    }
}