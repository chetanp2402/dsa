package com.chetan.recursion.sorting;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int [] arr = {7, 3, 1, 5, 2};

        System.out.println(Arrays.toString(sort(arr, 0,0)));
    }

    static int[] sort(int [] arr, int i, int j){
        if(i == arr.length){
            return arr;
        }

        if(j< arr.length -1 -i){
            int last = arr.length -1 -i;
            int maxIndex = findMaxIndex(arr, last);
            swap(arr, maxIndex, last);
        }
        return sort(arr, ++i, 0);
    }

    private static int findMaxIndex(int[] arr, int last) {
        int maxIndex = 0;

        for (int i = 0; i <= last; i++) {
            if(arr[maxIndex]< arr[i]){
                maxIndex= i;
            }
        }
         return  maxIndex;
    }

    static int[] swap(int [] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;

        return arr;
    }
}
