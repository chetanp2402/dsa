package com.chetan.recursion.beginner;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorial(2));
    }

    static int factorial(int n){
        if(n==1){
            return 1;
        }
        return n * factorial(n-1);
    }
}
