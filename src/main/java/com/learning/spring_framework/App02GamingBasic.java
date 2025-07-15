package com.learning.spring_framework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.learning.spring_framework.game.ContraGame;
import com.learning.spring_framework.game.GamingConsole;
import com.learning.spring_framework.game.gameRunner;
import com.learning.spring_framework.game.marioGame;

@Configuration
@ComponentScan("com.learning.spring_framework.game")
public class App02GamingBasic {

	
	
	public static void main(String[] args) throws Exception {

		
		
		var context = new AnnotationConfigApplicationContext(App02GamingBasic.class);
		context.getBean(GamingConsole.class).up(); 
		
		context.getBean(gameRunner.class).run();
		
		
		
//		//var marioGame = new marioGame();
//		var ContraGame = new ContraGame();
//		var gameRunner = new gameRunner(ContraGame);
//		gameRunner.run();
//		

	}

}
