package com.chetan.bs;

public class RotatedSortedArray {

	public static void main(String[] args) {
		int[] arr = {18,35,1,3,7,10, 16};

		System.out.println(rotatedBinarySearch(arr, 10));
		
	}
	
	static int rotatedBinarySearch(int[] arr, int target) {
		
		int pivot = findPivot(arr);
		if(target > arr[pivot]) {
			return binarySearch(arr, target, 0, pivot);
		} else {
			return binarySearch(arr, target, pivot+1, arr.length-1);
		}
		
	}
	
	static int findPivot(int[] arr) {
		int start = 0;
		int end = arr.length -1;
		
		while(start<end) {
			int mid = start + (end-start)/2;
			
			if(mid < end && arr[mid]> arr[mid+1]) {
				return mid;
			}
			if(mid > start && arr[mid]< arr[mid-1]) {
				return mid-1;
			}
			if(arr[start]>= arr[mid]) {
				end = mid-1;
			} else {
				start = mid+1;
			}
		}
		return -1;
	}
	
	static int binarySearch(int[] arr, int target, int start, int end) {
		
		while(start<=end) {
			int mid = start + (end-start)/2;
			if(target<arr[mid]) {
				end=mid-1;		
			}else if(target>arr[mid]) {
				start = mid+1;
			} else {
				return mid;
			}
		}
		return -1;
	}

}
