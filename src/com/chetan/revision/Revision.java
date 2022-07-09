package com.chetan.revision;

import java.util.Arrays;

public class Revision {

    public static void main(String[] args) {
        int[] sortedArr = {1, 3, 5, 9, 11};
        int[] unsortedArr = {3,5,1,2,9,6};

        System.out.println(binarySearch(sortedArr, 11));

        System.out.println(Arrays.toString(bubbleSort(unsortedArr)));

        System.out.println(Arrays.toString(selectionSort(unsortedArr)));
    }

    static int binarySearch(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid -1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    static int[] bubbleSort(int[] arr){

        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length-i; j++) {
                if(arr[j] < arr[j-1]){
                   swap(arr, j,j-1);
                }
            }

        }
        return arr;
    }

    static int [] selectionSort(int [] arr){
        for (int i = 0; i < arr.length; i++) {
            int max = 0;

            for (int j = 0; j < arr.length-i; j++) {
                if(arr[max] < arr[j]){
                    max = j;
                }
            }
            int last = arr.length-1-i;
            swap(arr, max, last);
        }
        return arr;
    }

    static int[] swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
        return arr;
    }
}
