package com.ravi;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 1st number");
        int a = scan.nextInt();
        System.out.println("Enter 2nd number");
        int b = scan.nextInt();
        System.out.println("Enter 3rd number");
        int c = scan.nextInt();

        /* 1st method*/
        int max = a;
        if (max < b) {
            max = b;
        }
        if (max < c) {
            max = c;
        }
        System.out.println("1st method output : " + max);

        /*2nd method*/
        if (a > b) {
            max = a;
        } else {
            max = b;
        }
        if (max < c) {
            max = c;
        }
        System.out.println("2nd method output : "+max);

        /* using math.max */
        int max1=Math.max(c,Math.max(a,b));
        System.out.println("Math.max output : "+max1);

    }
}

