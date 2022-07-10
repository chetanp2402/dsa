package com.chetan.recursion.array;

public class CheckSorted {
    public static void main(String[] args) {
        int[] arr = {8, 2, 3, 5};
        System.out.println(checkSorted(arr, 0));
    }

    private static boolean checkSorted(int[] arr, int index) {

        if (index == arr.length - 1) {
            return true;
        }
        if (arr[index] > arr[index + 1]) {
            return false;
        }

        return checkSorted(arr, ++index);
    }


}
