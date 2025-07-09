package com.learning.spring_framework;

import com.learning.spring_framework.game.ContraGame;
import com.learning.spring_framework.game.gameRunner;
import com.learning.spring_framework.game.marioGame;

public class AppGamingBasic {

	public static void main(String[] args) {
		
		//var marioGame = new marioGame();
		var ContraGame = new ContraGame();
		var gameRunner = new gameRunner(ContraGame);
		gameRunner.run();

	}

}
