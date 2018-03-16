package com.example.android.musicapp;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;

public class Play extends AppCompatActivity implements View.OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.play);


        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.play);
        ListView listView = (ListView) findViewById(R.id.list);

        Button returnToMain = (Button) findViewById(R.id.play_main);
        Button badanamu = (Button) findViewById(R.id.play_badanamu);
        Button play = (Button) findViewById(R.id.play_disney);

        onClick(returnToMain);

        onClick(badanamu);

        onClick(play);
    }

    @Override
    public void onClick(View v) {

        Button button = (Button) v;
        String name = button.getText().toString();

        if (name.equalsIgnoreCase("main")) {
            v.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent vIntent = new Intent(Play.this, MainActivity.class);
                    startActivity(vIntent);
                }
            });
        }
        else if (name.equalsIgnoreCase("badanamu")) {
            v.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent vIntent = new Intent(Play.this, Badanamu.class);
                    startActivity(vIntent);
                }
            });
        }
        else if (name.equalsIgnoreCase("disney")) {
            v.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent vIntent = new Intent(Play.this, Disney.class);
                    startActivity(vIntent);
                }
            });
        }
    }

}
