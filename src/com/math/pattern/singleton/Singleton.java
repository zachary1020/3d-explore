package com.math.pattern.singleton;

//����ʽ
public final class Singleton {
	
	private static Singleton newInstance = new Singleton();
	
	private Singleton(){}

	public static Singleton newIntance(){
		return newInstance;
	}
}
