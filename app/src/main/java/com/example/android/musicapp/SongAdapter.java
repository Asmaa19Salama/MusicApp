package com.example.android.musicapp;


import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class SongAdapter extends ArrayAdapter<Song> {

    private static final String x = SongAdapter.class.getSimpleName();

    public SongAdapter(Badanamu badanamu, ArrayList<Song> songs) {
        super(badanamu, 0, songs);
    }

    public SongAdapter(Disney disney, ArrayList<Song> songs) {
        super(disney, 0, songs);
    }

    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        Song currentSong = getItem(position);

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        TextView firstView = (TextView) listItemView.findViewById(R.id.name_text_view);
        firstView.setText(currentSong.getNameOfSong());

        TextView secondView = (TextView) listItemView.findViewById(R.id.artist_text_view);
        secondView.setText(currentSong.getArtistOfSong());

        //return super.getView(position, convertView, parent);
        return listItemView;
    }
}
