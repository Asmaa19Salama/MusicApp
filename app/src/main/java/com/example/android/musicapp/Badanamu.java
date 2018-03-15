package com.example.android.musicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;

import java.util.ArrayList;

public class Badanamu extends AppCompatActivity implements View.OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song("Fun Run", "Badanamu"));
        songs.add(new Song("Hoola Hoola Hooping", "Badanamu"));
        songs.add(new Song("Sing the Alphabet", "Badanamu"));

        SongAdapter adapters = new SongAdapter(this, songs);

        //ListView listView = (ListView) findViewById(R.id.list_and_button);

        //listView.setAdapter(adapters);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.list_and_button);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapters);

        Button badanamu = (Button) findViewById(R.id.change_class);

        onClick(badanamu);
    }

    @Override
    public void onClick(View v) {

        v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent vIntent = new Intent(new Badanamu(), Play.class);
                startActivity(vIntent);
            }
        });
    }
}
