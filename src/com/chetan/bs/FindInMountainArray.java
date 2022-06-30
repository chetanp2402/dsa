package com.chetan.bs;

public class FindInMountainArray {

	public static void main(String[] args) {
		int[] arr = {1,3,6,8,14,13,10,4};
		int peak = findPeak(arr);
		
		int ans= orderAgnosticBS(arr, 4, 0, peak);
		
		if(ans ==-1) {
			ans = orderAgnosticBS(arr, 4, peak, arr.length-1);
		}
		
		System.out.println(ans);
	}
	


	static int findPeak(int[] arr) {

		int start = 0;
		int end = arr.length - 1;
		while (start < end) {
			int mid = start + (end - start) / 2;
			if (arr[mid] > arr[mid + 1]) {
				end = mid;
			} else {
				start = mid + 1;
			}
		}
		return start;

	}

	static int orderAgnosticBS(int[] arr, int target, int start, int end) {

		boolean isAsc;
		if (arr[start] < arr[end]) {
			isAsc = true;
		} else {
			isAsc = false;
		}

		while (start <= end) {
			int mid = (start + end) / 2;

			if (arr[mid] == target) {
				return mid;
			}

			if (isAsc) {
				if (target < arr[mid]) {
					end = mid - 1;
				} else {
					start = mid + 1;
				}
			} else {

				if (target > arr[mid]) {
					end = mid - 1;
				} else {
					start = mid + 1;
				}
			}
		}
		return -1;

	}

}
