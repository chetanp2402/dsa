package com.chetan.bs;

public class InfiniteArray {

	public static void main(String[] args) {
		int [] arr = {1,3,4, 6, 8, 9, 12,14,17,22,25,29,45,56,65,68};
		System.out.println(findElementInInfiniteArray(arr, 68));
	}
	
	static int findElementInInfiniteArray(int arr[], int target) {
		
		int start = 0;
		int end = 1;
		
		while (target > arr[end]) {
			start = end +1;
			end= 2 * start +1;	
		}
		
        while (target > arr[end]) {
            int temp = end + 1; // this is my new start
            // double the box value
            // end = previous end + sizeofbox*2
            end = end + (end - start + 1) * 2;
            start = temp;
        }
        
		return findElement(arr, target, start, end);
	}
	
	static int findElement(int[] arr, int target, int start, int end) {
				
		while(start <= end) {
			int mid = start + (end-start)/2;
			
			if(target < arr[mid] ) {
				end= mid-1;
			} else if(target > arr[mid]) {
				start = mid +1;
			} else {
				return mid;
			}
		}
		return -1;
		
	}
	
	

}
