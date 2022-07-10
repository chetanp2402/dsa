package com.chetan.recursion;

public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = {2,6,8,9,13,18,23,34,56};
        System.out.println(search(arr, 34, 0, arr.length-1));
    }
    //binary search
    static int search(int[] arr, int target, int start, int end) {
        if (start > end) {
            return -1;
        }
        int mid = start + (end - start) / 2;

        if (arr[mid] == target) {
            return mid;
        }
        if (target < arr[mid]) {
            return search(arr, target, start, mid-1);
        }else{
            return search(arr, target,mid+1, end);
        }
    }
}
