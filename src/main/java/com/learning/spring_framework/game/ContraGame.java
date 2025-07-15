package com.learning.spring_framework.game;

import org.springframework.stereotype.Component;

@Component
public class ContraGame implements GamingConsole{
	public void up() {
		System.out.println("up");
	}
	public void down() {
		System.out.println("sit");
	}
	public void left() {
		System.out.println("go left");
	}
	public void right() {
		System.out.println("shoot");
	}
	

}
