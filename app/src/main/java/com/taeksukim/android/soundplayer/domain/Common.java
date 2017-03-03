package com.taeksukim.android.soundplayer.domain;

import android.net.Uri;

/**
 * Created by TaeksuKim on 2017. 2. 28..
 */

public abstract class Common {

    public abstract String getTitle();
    public abstract String getArtist();
    public abstract int getDuration();
    public abstract String getDurationText();
    public abstract Uri getImageUri();


}
