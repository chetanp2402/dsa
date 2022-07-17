package com.chetan.recursion.subset;

public class SkipCharacter {

    public static void main(String[] args) {
        String input = "baccad";
//        System.out.println(skipCharacter(input, new String()));

        System.out.println(skipCharacterWithOneInput(input));

    }

    static String skipCharacter(String input, String output){

        if(input.isEmpty()){
            return output;
        }

        if(input.charAt(0) != 'a'){
            return skipCharacter(input.substring(1),output+input.charAt(0));
        }

        return skipCharacter(input.substring(1),output);

    }


    static String skipCharacterWithOneInput(String input){

        if(input.isEmpty()){
            return "";
        }

        if(input.charAt(0) != 'a'){
            return input.charAt(0) + skipCharacterWithOneInput(input.substring(1));
        }

        return skipCharacterWithOneInput(input.substring(1));

    }
}
