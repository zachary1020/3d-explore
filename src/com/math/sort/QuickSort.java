package com.math.sort;

public class QuickSort extends Sort{

	@Override
	public int[] sort(int[] nums) {
		arr = nums;
		quickSort(0,arr.length-1);
		return arr;
	}

	private void quickSort(int start,int end){
		int mid = arr[end];
		int left = start;
		int right = end-1;
		if(right < 0){
			return;
		}
		
		if(left >= right){	
			if(arr[left] > arr[end]){
				swap(left,end);
			}
			return;
		}
		while(left < right){
			while(arr[left] < mid && left < right){
				left++;
			}
			while(arr[right] >= mid && left < right){
				right--;
			}
			if(left < right){
				swap(left,right);
				step++;
			}
		}
		if(arr[left] > arr[end]){
			swap(left,end);
			step++;
		}else{
			left++;
		}
	//	printArray(arr);
		if(left != start){
			quickSort(start,left-1);
		}
		quickSort(right+1,end);
	}
}

class DivideConquer extends Sort{

	
	@Override
	public int[] sort(int[] nums) {
		
		arr = nums;
		if(arr.length > 1){
			sort(0,arr.length-1);
		}
		return arr;
	}
	
	private void sort(int start,int end){
		
		int left = start;
		int right = end-1;
		
		if(left >= right){
			if(arr[left] > arr[end]){
				swap(left,end);
			}
			return;
		}
		while(left < right){
			while(arr[left] < arr[end] && left < right){
				left++;
			}
			while(arr[right] >= arr[end] && left < right){
				right--;
			}
			swap(left,right);						
		}
		
		if(arr[left] > arr[end]){
			swap(left,end);
			if(left-1 > start){
				sort(start,left-1);
			}
		}else{
			sort(start,left);
			return;
		}		
		printArray(arr);
		if(right+1 < end){
			sort(right+1,end);
		}
		
	}
	
	
}
