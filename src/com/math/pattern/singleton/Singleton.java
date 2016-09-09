package com.math.pattern.singleton;

//¶öººÊ½
public final class Singleton {
	
	private static Singleton newInstance = new Singleton();
	
	private Singleton(){}

	public static Singleton newIntance(){
		return newInstance;
	}
}
