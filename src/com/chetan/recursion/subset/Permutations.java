package com.chetan.recursion.subset;

import java.util.ArrayList;
import java.util.List;

public class Permutations {

    public static void main(String[] args) {

       // permutations("", "abc");
        System.out.println(permutationsGetList("", "abc"));

    }

    static void permutations(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        for (int i = 0; i <= p.length(); i++) {
            String first = p.substring(0,i);
            String second = p.substring(i,p.length());
            permutations(first + ch + second, up.substring(1));
        }
    }


    static List<String> permutationsGetList(String p, String up){
        if(up.isEmpty()){
            List<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);
        List<String> ans = new ArrayList<>();
        for (int i = 0; i <= p.length(); i++) {
            String first = p.substring(0,i);
            String second = p.substring(i,p.length());
            ans.addAll(permutationsGetList(first + ch + second, up.substring(1)));
        }
        return  ans;
    }
}
