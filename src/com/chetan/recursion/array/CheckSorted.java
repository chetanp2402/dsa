package com.chetan.recursion.array;

public class CheckSorted {
    public static void main(String[] args) {
        int [] arr = {8,2,3,5};
        System.out.println(checkSorted(arr));
    }

    private static boolean checkSorted(int[] arr) {
        return checkSortedHelper(arr, 0);
    }

    private static boolean checkSortedHelper(int[] arr, int index) {

        if(index == arr.length-1){
            return true;
        }
        if(arr[index] > arr[index+1]){
            return false;
        }

        return checkSortedHelper(arr, ++index);
    }


}
