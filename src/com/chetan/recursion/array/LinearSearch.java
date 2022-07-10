package com.chetan.recursion.array;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {8, 2, 3, 5};
        System.out.println(search(arr,5));
    }

    private static int search(int[] arr, int target) {
        return searchHelper(arr, target, 0);
    }

    private static int searchHelper(int[] arr, int target, int index) {

        if (index == arr.length) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        }

        return searchHelper(arr, target, ++index);
    }


}
