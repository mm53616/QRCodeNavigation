package com.example.mmant.qrcodenavigation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class OpenInformation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information);
    }

    public void Back(View view)
    {
        finish();
    }
}
