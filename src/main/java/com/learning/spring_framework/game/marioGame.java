package com.learning.spring_framework.game;

public class marioGame implements GamingConsole{
	public void up() {
		System.out.println("Jump");
	}
	public void down() {
		System.out.println("go into hole");
	}
	public void left() {
		System.out.println("go left");
	}
	public void right() {
		System.out.println("go right");
	}
	

}
