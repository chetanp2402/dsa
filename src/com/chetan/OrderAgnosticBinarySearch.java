package com.chetan;

public class OrderAgnosticBinarySearch {

	public static void main(String[] args) {
		int[] arrAsc = {1,2,4,6,8,10};
		int[] arrDsc = {10, 9, 7, -1, -6, -10};
		System.out.println(findElement(arrAsc, 10));
		
		System.out.println(findElement(arrDsc, 10));
	}

	static int findElement(int[] arr, int target) {
		int start = 0;
		int end = arr.length -1;
		
		boolean isAsc;
				if(arr[start] < arr[end]) {
					isAsc = true;
				} else {
					isAsc= false;
				}
		
		
		while(start <= end) {
			int mid = (start + end)/2;
			
			if(arr[mid] == target) {
				return mid;
			}
			
			if(isAsc) {
			if(target < arr[mid] ) {
				end= mid-1;
			} else {
				start = mid +1;
			} 
		}else {
			
			if(target > arr[mid] ) {
				end= mid-1;
			} else {
				start = mid +1;
			} 
		}
		}
		return -1;
	
	}
}
