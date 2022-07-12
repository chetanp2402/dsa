package com.chetan.recursion.array;

public class RBS {
    public static void main(String[] args) {
        int[] arr = {7, 9, 11, 15,16,17, 2, 3, 5, 6};
        int ans = rbs(arr, 7, 0, arr.length - 1);

        System.out.println(ans);
    }

    static int rbs(int[] arr, int target, int start, int end) {

        if (start > end) {
            return -1;
        }
        int mid = start + (end - start) / 2;
        if (arr[mid] == target) {
            return mid;
        }
        if (arr[start] <= arr[mid]) {
            if (target <= arr[mid] && target >= arr[start]) {
                return rbs(arr, target, start, mid - 1);
            } else {
                return rbs(arr, target, mid + 1, end);
            }
        }
        if (target >= arr[mid] && target <= arr[end]) {
            return rbs(arr, target, mid + 1, end);
        } else {
            return rbs(arr, target, start, mid - 1);
        }
    }
}
