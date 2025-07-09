package com.learning.spring_framework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.learning.spring_framework.game.ContraGame;
import com.learning.spring_framework.game.gameRunner;
import com.learning.spring_framework.game.marioGame;

public class AppGamingBasic02 {

	public static void main(String[] args) {
		
		//launch the spring context
		var context = new AnnotationConfigApplicationContext(HelloWorldConfigrution.class);
		System.out.println(context.getBean("name"));
		System.out.println("for github repo");
	}

}
