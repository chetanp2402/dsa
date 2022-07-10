package com.chetan.recursion.array;

import java.util.ArrayList;
import java.util.List;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {8, 5, 2, 3, 5};
        System.out.println(search(arr, 5, 0));
        System.out.println(searchAll(arr, 5, 0));
    }


    private static int search(int[] arr, int target, int index) {

        if (index == arr.length) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        }

        return search(arr, target, ++index);
    }


    private static List<Integer> searchAll(int[] arr, int target, int index) {
        List<Integer> list = new ArrayList<>();

        if (index == arr.length) {
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
        }

        List<Integer> integers = searchAll(arr, target, ++index);
        list.addAll(integers);
        return  list;

    }
}
