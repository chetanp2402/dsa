package com.chetan.sorting;

import java.util.Arrays;

public class CyclicSort {

	public static void main(String[] args) {

		int[] arr = {3,2,5,7,6,4,1};
		System.out.println(Arrays.toString(cyclicSort(arr)));
	}
	
	static int[] cyclicSort(int[] arr) {
		
		for (int i = 0; i < arr.length; i++) {
			while(arr[i] != i+1) {
				swap(arr, i, arr[i]-1);
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
