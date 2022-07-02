package com.chetan.sorting;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr = { 3, 1, 5, 44, 2, 7, 4, 15, 35 };

		System.out.println(Arrays.toString(selectionSort(arr)));
		

	}

	private static int[] selectionSort(int[] arr) {
		
		
		for (int j = 0; j < arr.length; j++) {
			int max = arr[0];
			int maxIndex = 0;
			for (int i = 0; i < arr.length - j; i++) {
				if(max<arr[i]) {
					max = arr[i];
					maxIndex = i;
				}
			}
			//swap
			int temp = arr[arr.length-1 -j];
			arr[arr.length-1 -j] = max;
			arr[maxIndex] =temp;
		}
		
		return arr;
	}	
	

}
