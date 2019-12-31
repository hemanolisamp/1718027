package com.example.tugas1;

import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    ImageButton seting;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        seting = findViewById(R.id.setting);
        seting.setOnClickListener(this);
    }


    @Override
    public void onClick(View look) {

        if(look.getId()==R.id.setting){
            Intent intent = new Intent (Settings.ACTION_LOCALE_SETTINGS);
            startActivity(intent);
        }
    }
}