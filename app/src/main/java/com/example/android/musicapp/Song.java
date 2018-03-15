package com.example.android.musicapp;

public class Song {
    private String mnameOfSong, martistOfSong;

    public Song(String nameOfSong, String artistOfSong){
        mnameOfSong = nameOfSong;
        martistOfSong = artistOfSong;
    }

    public String getNameOfSong(){
        return mnameOfSong;
    }


    public String getArtistOfSong(){
        return martistOfSong;
    }
}