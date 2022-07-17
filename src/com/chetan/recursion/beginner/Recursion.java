package com.chetan.recursion.beginner;

public class Recursion {

    public static void main(String[] args) {
        printNos(5);
    }
    static void printNos(int n){
        if(n== 0){
            return;
        }
        System.out.println(n);
        printNos(n-1);
        System.out.println(n);
    }
}
