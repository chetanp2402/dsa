package com.chetan.sorting;

import java.util.Arrays;

public class CyclicSort {

	public static void main(String[] args) {

		int[] arr = {3,2,5,7,6,4,1};
		System.out.println(Arrays.toString(cyclicSort(arr)));

	}
	

	static int[] swap(int [] arr, int first, int second) {
		int temp = arr[first];
		arr[first] = arr[second];
		arr[second]= temp;
		
		return arr;
	}
	
	static int[] cyclicSort(int[] arr){
		int i = 0;
		while(i<arr.length) {
			int correct = arr[i] -1;
			if(arr[i] != arr[correct]) {
				swap(arr, i, correct);
			}else {
			i++;
			}
		}
		return arr;		
	}
	
	
}
