package com.ravi;

import java.util.Scanner;

public class PatternProgram {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of rows & columns");
        int n = s.nextInt();

        pattern1(n);
        pattern2(n);
        pattern3(n);
        pattern4(n);
    }

    private static void pattern1(int n) {
        /*
        1. * * * * *
           * * * * *
           * * * * *
           * * * * *
           * * * * *
         */
        System.out.println("--Pattern1--");
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println("--End Of Pattern1--");
    }

    private static void pattern2(int n) {
     /*
     2. *
        * *
        * * *
        * * * *
        * * * * *
         */
        System.out.println("--Pattern2--");

        for (int row = 0; row < n; row++) {
            for (int col = 0; col <= row; col++) {
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println("--End Of Pattern2--");
    }
    private static void pattern3(int n) {
        /*
        3. * * * * *
           * * * *
           * * *
           * *
           *
         */
        System.out.println("Pattern3");
        for (int row = 0; row < n; row++) {
            for (int col = 0; col <= n-row; col++) {
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println("--End Of Pattern3--");
    }
    private static void pattern4(int n) {
    /*
    4. *
       * *
       * * *
       * * * *
       * * * * *
       * * * *
       * * *
       * *
       *
     */
        System.out.println("--Pattern4--");
        for (int row = 0; row < n * 2; row++) {
            int abc = row > n ? 2 * n - row : row;
            for (int col = 0; col < abc; col++) {
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println(" ");
        }
        System.out.println("--End Of Pattern4--");
    }
}
