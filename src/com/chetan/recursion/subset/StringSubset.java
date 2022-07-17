package com.chetan.recursion.subset;

public class StringSubset {
    public static void main(String[] args) {

        printSubsets("", "abc");

    }

    static void printSubsets(String p , String up){

        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);

        printSubsets(p + ch, up.substring(1) );
        printSubsets(p, up.substring(1));
    }

}
