package com.chetan.sorting;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {

		int[] arr = { 3, 1, 5, 44, 2, 7, 4, 15, 35 };

		System.out.println(Arrays.toString(insertionSort(arr)));
	}

	private static int[] insertionSort(int[] arr) {
		
		for (int i = 0; i < arr.length-1 ; i++) {
			for (int j = i+1; j >0; j--) {
				if(arr[j]< arr[j-1]) {
				swap(arr, j-1, j);
				}
			}
			
		}
		return arr;
	}
	
	static int[] swap(int [] arr, int first, int second) {
		int temp = arr[first];
		arr[first] = arr[second];
		arr[second]= temp;
		
		return arr;
	}
}
