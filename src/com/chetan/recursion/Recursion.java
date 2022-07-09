package com.chetan.recursion;

public class Recursion {

    public static void main(String[] args) {
        System.out.println(fib(6));

        int[] arr = {2,6,8,9,13,18,23,34,56};
        System.out.println(search(arr, 34, 0, arr.length-1));
    }

    //fibonacci
    static int fib(int n) {
        if (n < 2) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
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
