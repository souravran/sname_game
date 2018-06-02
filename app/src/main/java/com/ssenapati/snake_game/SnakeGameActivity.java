package com.ssenapati.snake_game;

import android.os.Bundle;

public class SnakeGameActivity extends com.ssenapati.game_platform.GameActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) { 
		super.onCreate(savedInstanceState);
		switchFullscreen();
		setContentView(new SnakeGamePanel(this));
	}
}
