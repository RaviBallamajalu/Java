package com.ravi;

import java.util.Scanner;

public class FibonacciNumber {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the value till which the Fibonacci Number Should Be Printed");
        Integer n= scan.nextInt();
        int a=0;
        int b=1;

        if(n==1){
            System.out.println(a);
        }
        else if(n==2) {
            System.out.println(a + " " + b);
        }
        else {
            System.out.println(a);
            System.out.println(b);
            for (int i = 2; i < n; i++) {
                int temp = a + b;
                System.out.println(temp);
                a = b;
                b = temp;
            }
        }
    }
}
