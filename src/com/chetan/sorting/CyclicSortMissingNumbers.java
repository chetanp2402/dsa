package com.chetan.sorting;

import java.util.ArrayList;
import java.util.List;

public class CyclicSortMissingNumbers {

	public static void main(String[] args) {

		int [] arr = {4,2,1,4,2,8,5,8,8};
		System.out.println(cyclicSortFindMissingNumbers(arr));
		
	}
	
	static List<Integer> cyclicSortFindMissingNumbers(int[] arr) {
		
		int i = 0;
		 while (i< arr.length) {
			 int correct = arr[i] - 1 ;
			 if(arr[i] != arr[correct]) {
				 swap(arr, i, correct);
			 } else {
				 i++;
				}
			 }
		 
		 List<Integer> ans = new ArrayList<>();
		 for (int index = 0; index < arr.length; index++) {
			if(arr[index] != index +1) {
				ans.add(index+1);
			}
		}
		 
		 
	 return ans;
		 
	}
	

	
	static int[] swap(int [] arr, int first, int second) {
		int temp = arr[first];
		arr[first] = arr[second];
		arr[second]= temp;
		
		return arr;
	}

}
