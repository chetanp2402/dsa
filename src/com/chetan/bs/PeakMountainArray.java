package com.chetan.bs;

public class PeakMountainArray {

	public static void main(String[] args) {
		int[] arr = {1,3,5,7,9,10,14,12,9,8,4,2};
		System.out.println(findPeak(arr));
	}
	
	static int findPeak(int [] arr){
		
		int start = 0;
		int end = arr.length-1;
		while(start < end) {
		int mid = start + (end-start)/2;
		if(arr[mid]>arr[mid+1]) {
			end = mid;	
		}
		else {
			start= mid+1;
		}
		}
		return start;
		
	}
}
