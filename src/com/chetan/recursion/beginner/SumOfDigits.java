package com.chetan.recursion.beginner;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(sumOfDigits(13425));
        System.out.println(productOfDigits(13425));
    }

    static int sumOfDigits(int number){
        if(number < 10){
            return number;
        }
        return (number%10) + sumOfDigits(number/10);

    }

    static int productOfDigits(int number){
        if(number < 10){
            return number;
        }
        return (number%10) * productOfDigits(number/10);

    }
}
