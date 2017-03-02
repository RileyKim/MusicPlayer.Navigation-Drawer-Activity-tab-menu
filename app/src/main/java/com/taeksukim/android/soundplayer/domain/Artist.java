package com.taeksukim.android.soundplayer.domain;

import android.net.Uri;

import java.util.List;

/**
 * Created by TaeksuKim on 2017. 2. 28..
 */

public class Artist extends Common{
    public int id;
    public String artist;
    public String artist_key;
    public int number_of_tracks;
    public int number_of_albums;
    public List<Sound> sounds;

    @Override
    public String getTitle() {
        return artist;
    }

    @Override
    public String getArtist() {
        return null;
    }

    @Override
    public String getDuration() {
        return "";
    }

    @Override
    public Uri getImageUri() {
        return null;
    }
}
