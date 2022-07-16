package com.chetan.recursion.pattern;

public class Triangle {

    public static void main(String[] args) {
       // pattern1(5, 0);
        pattern2(5,0,5);
    }

    static void pattern1(int row, int col) {

        if (row == 0) {
            return;
        }
        if (col < row) {
            System.out.print("*");
            pattern1(row, ++col);
        } else {
            System.out.println();
            pattern1(--row, 0);
        }

    }

    static void pattern2(int row, int col, int n) {

        if (row == 0) {
            return;
        }
        if (col <= n-row) {
            System.out.print("*");
            pattern2(row, ++col, n--);
        } else {
            System.out.println();
            pattern2(--row, 0,n);
        }

    }
}
