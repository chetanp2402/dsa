package com.chetan.recursion.subset;

public class SkipWord {

    public static void main(String[] args) {
        System.out.println(skipWord("abcdappledcvfapplevbn"));
    }

    static String skipWord(String input) {

        if (input.isEmpty()) {
            return "";
        }

        if (input.startsWith("apple")) {
            return  skipWord(input.substring(5));

        }
        return input.charAt(0) + skipWord(input.substring(1));
    }
}
