package com.chetan.recursion.subset;

public class SkipCharacter {

    public static void main(String[] args) {
        String input = "baccad";
//        System.out.println(skipCharacter(input, new String()));
        String ans = skipCharacterWithOneInput(input);
        System.out.println(ans);

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
        char ch = input.charAt(0);
        if( ch != 'a'){
            String ans = ch + skipCharacterWithOneInput(input.substring(1));
            return  ans;
        }
        String ans = skipCharacterWithOneInput(input.substring(1));
        return ans  ;

    }
}
