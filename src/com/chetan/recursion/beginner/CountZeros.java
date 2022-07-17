package com.chetan.recursion.beginner;

public class CountZeros {
    public static void main(String[] args) {
        System.out.println(countZeros(2030));
    }

    static int countZeros(int n){
        return countZerosHelperFunction(n,0);
    }

    private static int countZerosHelperFunction(int n, int count) {
        if(n == 0){
            return count;
        }
        if(n % 10 == 0){
            count++;
        }

        return countZerosHelperFunction(n/10, count);
    }
}
