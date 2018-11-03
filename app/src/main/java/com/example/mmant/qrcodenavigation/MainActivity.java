package com.example.mmant.qrcodenavigation;

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

    public void openInformation(View view){
        Intent i = new Intent(this, OpenInformation.class);
        startActivity(i);
    }

    public void openCamera(View view){
        Intent i = new Intent(this, OpenCamera.class);
        startActivity(i);
    }



    public void Exit(View view){
        finish();
    }

}
