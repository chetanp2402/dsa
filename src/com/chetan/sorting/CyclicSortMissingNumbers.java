package com.chetan.sorting;

public class CyclicSortMissingNumbers {

	public static void main(String[] args) {

		int [] arr = {4,2,1,0};
		System.out.println(cyclicSortFindMissingNumber(arr));
		
	}
	

	static int cyclicSortFindMissingNumber(int[] arr) {
		int i = 0;
		 while (i< arr.length) {
			 int correct = arr[i];
			 if(arr[i]<arr.length && arr[i] != arr[correct]) {
				 swap(arr, i, correct);
			 } else {
				 i++;
				}
			 }
		 
		 for (int j = 0; j < arr.length; j++) {
			if(arr[j] != j) {
				return j;
			}
		}
		 
		 return arr.length;
	}
	
	static int[] swap(int [] arr, int first, int second) {
		int temp = arr[first];
		arr[first] = arr[second];
		arr[second]= temp;
		
		return arr;
	}

}
