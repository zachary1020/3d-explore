package com.math.pattern.singleton;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

//����ʽ
public class Singleton_ {
	
	private static Singleton_ singleton;
	
	//��������
	private final static Lock lock = new ReentrantLock();
	
	private Singleton_(){}

	public static Singleton_ newIntance(){
		
		//˫���������ж��ټ�������֤��ȫͬʱ��������
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
