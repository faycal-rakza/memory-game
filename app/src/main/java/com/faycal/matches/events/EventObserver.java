package com.faycal.matches.events;

import com.faycal.matches.events.ui.BackGameEvent;
import com.faycal.matches.events.engine.FlipDownCardsEvent;
import com.faycal.matches.events.engine.GameWonEvent;
import com.faycal.matches.events.engine.HidePairCardsEvent;
import com.faycal.matches.events.ui.DifficultySelectedEvent;
import com.faycal.matches.events.ui.FlipCardEvent;
import com.faycal.matches.events.ui.NextGameEvent;
import com.faycal.matches.events.ui.ResetBackgroundEvent;
import com.faycal.matches.events.ui.StartEvent;
import com.faycal.matches.events.ui.ThemeSelectedEvent;


public interface EventObserver {

	void onEvent(FlipCardEvent event);

	void onEvent(DifficultySelectedEvent event);

	void onEvent(HidePairCardsEvent event);

	void onEvent(FlipDownCardsEvent event);

	void onEvent(StartEvent event);

	void onEvent(ThemeSelectedEvent event);

	void onEvent(GameWonEvent event);

	void onEvent(BackGameEvent event);

	void onEvent(NextGameEvent event);

	void onEvent(ResetBackgroundEvent event);

}
