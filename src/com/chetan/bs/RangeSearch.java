package com.chetan.bs;

import java.util.Arrays;

public class RangeSearch {

	public static void main(String[] args) {
		int [] arr = {5, 7, 7, 7,7, 8, 8, 10};
		
		System.out.println(Arrays.toString(searchRange(arr, 7)));

	}
	
	static int[] searchRange(int[] arr, int target) {
		
		int [] result= {-1,-1};
		
		result[0] = findElement(arr, target, true);
		result[1] = findElement(arr, target, false);
		
		return result;
		
	}
	
	static int findElement(int[] arr, int target, boolean isStartIndex) {
		
		int start = 0;
		int end = arr.length -1;
		int ans = -1;
		
		while(start <= end) {
			int mid = (start + end)/2;
			
			if(target < arr[mid] ) {
				end= mid-1;
			} else if(target > arr[mid]) {
				start = mid +1;
			} else {
				ans = mid;
				if(isStartIndex) {
					end= mid-1;
				}else {
					start = mid+1;
				}	
			}
		}
		return ans;
	}
	
}
