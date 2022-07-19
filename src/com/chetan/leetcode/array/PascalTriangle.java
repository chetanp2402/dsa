package com.chetan.leetcode.array;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {

    public static void main(String[] args) {
        System.out.println(generate(5));
    }

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> resultList = new ArrayList<>();
        List<Integer> curr , pre = null;

        for (int i = 0; i < numRows; i++) {
            curr = new ArrayList<>();
            for (int j = 0; j <= i ; j++) {
                if(j == 0 || j ==i){
                    curr.add(1);
                }else{
                    curr.add(pre.get(j-1) + pre.get(j));
                }
            }
            pre = curr;
            resultList.add(pre);
        }
        return  resultList;
    }
}
