package com.chetan.recursion;

public class ReverseNumber {
    public static void main(String[] args) {
        int reverseNumber = reverseNumber(123456, findNoOfDigits(123456));
        System.out.println(reverseNumber);
    }

    static int reverseNumber(int n, int noOfDigits) {

        if (n < 10){
            return n;
        }

            return (n%10) * (int)Math.pow(10,noOfDigits-1) + reverseNumber(n/10,--noOfDigits);
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
