package com.chetan.sorting;

import java.util.ArrayList;
import java.util.List;

public class CyclicSortDuplicate {

	public static void main(String[] args) {
		int[] arr1 = {3,2,1,4,4};
		System.out.println(findDuplicate(arr1));
		
		int[] arr2 = {2,2,1,3,4,4};
		
		System.out.println(findDuplicates(arr2));
	}
	
	static List<Integer> findDuplicates(int [] arr) {
		int i = 0;
		while(i<arr.length) {
			int correct = arr[i] -1;
			if(arr[i] != arr[correct]) {
				swap(arr, i, correct);
			}else {
				i++;
			}
		}
		
		List<Integer> ans = new ArrayList<>(); 
		for (int j = 0; j < arr.length; j++) {
			if(arr[j] != j+1) {
				ans.add(arr[j]);
			}
		}
		return ans;
	}
	
	static int findDuplicate(int [] arr) {
		int i = 0;
		while(i<arr.length) {
			int correct = arr[i] -1;
			if(arr[i] != arr[correct]) {
				swap(arr, i, correct);
			}else {
				i++;
			}
		}
		
		for (int j = 0; j < arr.length; j++) {
			if(arr[j] != j+1) {
				return arr[j];
			}
		}
		return -1;
	}	

	private static void swap(int[] arr, int i, int correct) {
		int temp = 0;
		temp = arr[i];
		arr[i]=  arr[correct];
		arr[correct] = temp;
	}

}
