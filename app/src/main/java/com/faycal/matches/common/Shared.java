package com.faycal.matches.common;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;

import com.faycal.matches.engine.Engine;
import com.faycal.matches.events.EventBus;

public class Shared {

	public static Context context;
	public static FragmentActivity activity; // it's fine for this app, but better move to weak reference
	public static Engine engine;
	public static EventBus eventBus;

}
