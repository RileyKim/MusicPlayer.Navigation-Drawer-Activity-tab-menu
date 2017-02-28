package com.taeksukim.android.soundplayer.domain;

import android.net.Uri;

/**
 * Created by TaeksuKim on 2017. 2. 28..
 */

public class Sound {

    //Sound info.
    public int id;
    public String title;
    public String artist;
    public int album_id;
    public int genre_id;
    public Uri album_image_uri;
    public int duration;
    public boolean is_music;
    public String composer;
    public String content_type;
    public String year;

    // add info.
    public int order;
    public boolean favor;


}
