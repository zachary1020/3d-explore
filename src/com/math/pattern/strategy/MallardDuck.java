package com.math.pattern.strategy;

public class MallardDuck extends Duck{

	public MallardDuck() {
		this.iFlyBehavior = new FlyWithWings();
		this.iQuackBehavior = new Quack();
	}
	
	
}
