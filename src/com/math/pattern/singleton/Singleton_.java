package com.math.pattern.singleton;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

//懒汉式
public class Singleton_ {
	
	private static Singleton_ singleton;
	
	//可重入锁
	private final static Lock lock = new ReentrantLock();
	
	private Singleton_(){}

	public static Singleton_ newIntance(){
		
		//双重锁，先判断再加锁，保证安全同时提升性能
		if(singleton == null){			
			lock.lock();
			try {
				if(singleton == null){
					singleton = new Singleton_();
				}
			} finally {
				lock.unlock();
			}
		}
		return singleton;
	}

}
