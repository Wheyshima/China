package com.example.karproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ImageButton StartImageButton = (ImageButton) findViewById(R.id.imageButton2);
        StartImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Intent intent = new Intent(MainActivity.this,Introduction.class); startActivity(intent);finish();
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        });
    }
}