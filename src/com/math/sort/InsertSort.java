package com.math.sort;

public class InsertSort extends Sort {

	@Override
	public int[] sort(int[] nums) {
		arr = nums;
		for(int i=0;i<arr.length-1;i++){
			for(int j=i;j>=0;j--){
				if(arr[j+1] < arr[j]){
					swap(j+1, j);
					step++;
				}
			}	
		}		
		return arr;
	}
}