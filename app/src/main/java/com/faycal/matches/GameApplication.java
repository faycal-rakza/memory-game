package com.faycal.matches;

import android.app.Application;

import com.faycal.matches.utils.FontLoader;

public class GameApplication extends Application {

	@Override
	public void onCreate() {
		super.onCreate();
		FontLoader.loadFonts(this);

	}
}
