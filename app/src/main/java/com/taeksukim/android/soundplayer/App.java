package com.taeksukim.android.soundplayer;

import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;

/**
 * Created by TaeksuKim on 2017. 2. 28..
 */

public class App {


    // 서비스 플레이 액션 정의
    public static final String ACTION_PLAY = "com.taeksukim.android.soundplayer.action.play";
    public static final String ACTION_PAUSE = "com.taeksukim.android.soundplayer.action.pause";
    public static final String ACTION_RESTART = "com.taeksukim.android.soundplayer.action.restart";
    public static final String ACTION_STOP = "com.taeksukim.android.soundplayer.action.stop";

    //플레이어
    public static MediaPlayer soundPlayer;

    public static void initSound(Context context){
        Uri soundUri = null; //TODO Uri 설정
        soundPlayer = MediaPlayer.create(context, soundUri);
    }

    public static void playSound(){
        soundPlayer.start();
    }

    public static void pauseSound(){
        soundPlayer.pause();
    }

    public static void restartSound(){
        soundPlayer.start();
    }

    public static void stop(){
        if(soundPlayer!=null){
            soundPlayer.release();
            soundPlayer = null;
        }
    }
}
