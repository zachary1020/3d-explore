package com.math.sort;

public class BubbleSort extends Sort{
	
	public int[] sort (int[] nums){
		arr = nums;
		for(int j=0;j<arr.length;j++){
			for(int i=0;i<arr.length-1;i++){
				if(arr[i] < arr[i+1]){
					swap(i,i+1);
				}
			}
		}
		return arr;
	}
	
	//optimize
	public int[] sort (int[] nums,boolean flag){		
		arr = nums;
		for(int j=0;j<arr.length;j++){
			for(int i=0;i<arr.length-1-j;i++){
				if(arr[i] > arr[i+1]){
					swap(i, i+1);
				}	
			}
		}
		return arr;
	}
	
	public static void main(String[] args) {
		
		RandomArray randomArray = new RandomArray(20,10); 
		//BubbleSort asort = new BubbleSort();
		//Sort asort = new InsertSort();
		Sort asort = new QuickSort();
		//Sort asort = new SelectSort();
		asort.printArray(randomArray.array);
		
        int[] a = asort.sort(randomArray.array);
        
        asort.printArray(a);
        asort.printStep();
        
	}

}
