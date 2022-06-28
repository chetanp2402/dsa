package com.chetan;

public class LinearSearch {

	public static void main(String[] args) {
		
		int[] inputArr= {1,  3, 5, 8, 9, 1, 3};
		System.out.println(findElement(inputArr , 25 ));

	}
	
	static int findElement(int [] inputArr, int element) {
		
		int resultIndex = -1;
		
		for(int i=0; i< inputArr.length; i++) {
			if(inputArr[i] == element) {
				resultIndex = i;
				break;
			}
		}
		
		return resultIndex;
	}

}
