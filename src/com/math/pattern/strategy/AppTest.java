package com.math.pattern.strategy;

public class AppTest {
	
	public static void main(String[] args) {
		
	//	Duck duck = new WoodDuck();
		Duck duck = new MallardDuck();
		duck.performFly();
		
		duck.performQuack();
	}

}
