package com.chetan.patterns;

public class Patterns {

    public static void main(String[] args) {
//        pattern1(5);
//        pattern2(5);
//        pattern3(5);
//        pattern4(5);
        pattern5(5);
    }

/*    1.    *****
            *****
            *****
            *****
            *****     */

    static void pattern1(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

/*      2.  *
            **
            ***
            ****
            *****   */

    static void pattern2(int n){

        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

/*      3.  *****
            ****
            ***
            **
            *       */

    static void pattern3(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

/*    4.    1
            1 2
            1 2 3
            1 2 3 4
            1 2 3 4 5  */

    static void pattern4(int n){

        for (int i = 1; i <= n  ; i++) {
            for (int j = 1; j < i+1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

/*      5.  *
            **
            ***
            ****
            *****
            ****
            ***
            **
            *       */

    static void pattern5(int n){
        for (int row = 0; row < 2* n; row++) {
            int totalColsInRow = row>n ? 2*n -row :row;
            for (int col = 0; col < totalColsInRow; col++) {
                    System.out.print("* ");
                }
            System.out.println();
            }

        }



}
