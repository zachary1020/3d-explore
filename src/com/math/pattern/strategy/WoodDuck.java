package com.math.pattern.strategy;

public class WoodDuck extends Duck{
	
	public WoodDuck(){
		this.iFlyBehavior = new FlyNoWay();
		this.iQuackBehavior = new MuteQuack();
	}

}
