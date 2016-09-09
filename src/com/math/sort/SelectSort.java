package com.math.sort;

public class SelectSort extends Sort{

	@Override	
	public int[] sort(int[] nums){		
		arr = nums;
		for(int i=0;i<arr.length;i++){
			int index = i;
			for(int j=i+1;j<arr.length;j++){				
				if(arr[index] > arr[j]){
					index = j;
				}	
			}
			swap(i,index);
		}
		return arr;
	}

}
