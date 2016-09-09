package com.math.pattern.strategy;

public abstract class Duck {
	
	public IFlyBehavior iFlyBehavior;
	
	public IQuackBehavior iQuackBehavior;
	
	public void performFly(){
		iFlyBehavior.fly();
	}
	
	public void performQuack(){
		iQuackBehavior.quack();
	}
	

}
