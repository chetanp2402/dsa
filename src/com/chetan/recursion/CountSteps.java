package com.chetan.recursion;

public class CountSteps {
    public static void main(String[] args) {
        System.out.println(countSteps(14));
    }

    static int countSteps(int n){
        return helperCountSteps(n, 0);
    }

    private static int helperCountSteps(int n, int noOfSteps) {

        if(n==0){
            return noOfSteps;
        }
        if(n%2 == 0){
            n = n/2;
        }else{
            n = n-1;
        }
        return  helperCountSteps(n, ++noOfSteps);

    }
}
