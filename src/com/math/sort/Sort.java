package com.math.sort;

public abstract class Sort {
	
	int arr[];
	
	double step =0 ;
	
	public abstract int[] sort(int[] nums);
	
	public void swap(int index,int index_){		
		int temp = 0;
		temp = arr[index];
		arr[index] = arr[index_];
		arr[index_] = temp;
		
	}
	
	public void printArray(int[] nums){	
		for(int k : nums){
			System.out.print(k);
			System.out.print(",");
		}
		System.out.println("");
	}
	
	public void printStep(){
		System.out.println("Total step is: "+step);
	}

}
