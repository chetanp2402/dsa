package com.chetan.recursion.beginner;

public class ReverseNumber {
    public static void main(String[] args) {
        int reverseNumber = reverseNumber(1212);
        System.out.println(reverseNumber);

        System.out.println(isPalindrome(1212));
    }

    static int reverseNumber(int n){
        return helperFunction(n, findNoOfDigits(n));
    }

    static boolean isPalindrome(int n){
        return n == reverseNumber(n);
    }
    static int helperFunction(int n, int noOfDigits) {

        if (n < 10){
            return n;
        }
        return (n%10) * (int)Math.pow(10,noOfDigits-1) + helperFunction(n/10,--noOfDigits);
    }

    static int findNoOfDigits(int n) {
        int noOfDigits = 0;
        while (n != 0) {
            noOfDigits++;
            n = n / 10;
        }
        return noOfDigits;
    }
}
