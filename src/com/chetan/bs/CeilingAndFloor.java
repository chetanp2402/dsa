package com.chetan.bs;

public class CeilingAndFloor {

	public static void main(String[] args) {
		int[] arr1 = {1,2,4,6,8,10};
		System.out.println(findCeiling(arr1, 3));
		
		int[] arr2 = {1,2,4,6,8,10};
		System.out.println(findFloor(arr2, 0));
	}
	
	static int findCeiling(int[] arr, int target) {
		int start = 0;
		int end = arr.length -1;
	
		if(target > arr[end]) {
			return -1;
		}
		
		while(start <= end) {
			int mid = (start + end)/2;
			
			if(target < arr[mid] ) {
				end= mid-1;
			} else if(target > arr[mid]) {
				start = mid +1;
			} else if(target == arr[mid]) {
				return mid;
			}
		}
		
		return start;
		
	}
	
	static int findFloor(int[] arr, int target) {
		int start = 0;
		int end = arr.length -1;
				
		while(start <= end) {
			int mid = (start + end)/2;
			
			if(target < arr[mid] ) {
				end= mid-1;
			} else if(target > arr[mid]) {
				start = mid +1;
			} else if(target == arr[mid]) {
				return mid;
			}
		}
		
		return end;
		
	}

}
