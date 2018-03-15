package com.example.android.musicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button badanamu = (Button) findViewById(R.id.badanamu_button);
        Button disney = (Button) findViewById(R.id.disney_button);

        badanamu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent badanamuIntent = new Intent(MainActivity.this, Badanamu.class);
                startActivity(badanamuIntent);
            }
        });

        disney.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent disneyIntent = new Intent(MainActivity.this, Disney.class);
                startActivity(disneyIntent);
            }
        });

    }
}
