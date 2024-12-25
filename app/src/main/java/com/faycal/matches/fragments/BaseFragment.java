package com.faycal.matches.fragments;

import androidx.fragment.app.Fragment;

import com.faycal.matches.events.EventObserver;
import com.faycal.matches.events.engine.FlipDownCardsEvent;
import com.faycal.matches.events.engine.GameWonEvent;
import com.faycal.matches.events.engine.HidePairCardsEvent;
import com.faycal.matches.events.ui.BackGameEvent;
import com.faycal.matches.events.ui.FlipCardEvent;
import com.faycal.matches.events.ui.NextGameEvent;
import com.faycal.matches.events.ui.ResetBackgroundEvent;
import com.faycal.matches.events.ui.ThemeSelectedEvent;
import com.faycal.matches.events.ui.DifficultySelectedEvent;
import com.faycal.matches.events.ui.StartEvent;

public class BaseFragment extends Fragment implements EventObserver {

	@Override
	public void onEvent(FlipCardEvent event) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void onEvent(DifficultySelectedEvent event) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void onEvent(HidePairCardsEvent event) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void onEvent(FlipDownCardsEvent event) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void onEvent(StartEvent event) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void onEvent(ThemeSelectedEvent event) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void onEvent(GameWonEvent event) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void onEvent(BackGameEvent event) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void onEvent(NextGameEvent event) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void onEvent(ResetBackgroundEvent event) {
		throw new UnsupportedOperationException();
	}

}
