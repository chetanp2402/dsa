package com.chetan.recursion.sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int [] arr = {7, 3, 1, 5, 2};
//        int[] loopSorted = loopSort(arr);
//        System.out.println(Arrays.toString(loopSorted));
        int[] recursionSorted = recursionSort(arr, 0, 1);
        System.out.println(Arrays.toString(recursionSorted));
    }

    static int[] recursionSort(int[] arr, int i, int j){
        if(i == arr.length){
            return arr;
        }
        if(j<arr.length - i){
            if(arr[j]< arr[j-1]){
                swap(arr, j, j-1);
            }
            return recursionSort(arr, i, ++j);
        }
        return recursionSort(arr, ++i, 1);

    };

    static int[] loopSort(int[] arr){
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 1; j < arr.length-i; j++) {
                if(arr[j]< arr[j-1]){
                 swap(arr, j, j-1);
                }
            }
        }
        return arr;
    }

    static int[] swap(int [] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;

        return arr;
    }
}
