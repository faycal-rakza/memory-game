package com.snatik.matches.common;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;

import com.snatik.matches.R;

public class Music {

	public static void playCorrent() {
		MediaPlayer mp = MediaPlayer.create(Shared.context, R.raw.correct_answer);
		mp.setOnCompletionListener(new OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mp.reset();
                mp.release();
                mp=null;
            }

        });
        mp.start();
	}
	
	public static void showStar() {
		MediaPlayer mp = MediaPlayer.create(Shared.context, R.raw.star);
		mp.setOnCompletionListener(new OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mp.reset();
                mp.release();
                mp=null;
            }

        });
        mp.start();
	}
}