package com.learning.spring_framework.game;

import org.springframework.stereotype.Component;

@Component
public class gameRunner {
	private GamingConsole game;

	public gameRunner(GamingConsole game) {
		this.game=game;
	}

	public void run() {
		System.out.println("Running Game : "+game);
		game.up();
		game.down();
		game.left();
		game.right();
		
	}

}
