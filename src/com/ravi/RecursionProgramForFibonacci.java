package com.ravi;

import java.util.Scanner;

public class RecursionProgramForFibonacci {
    //This cod will give the fibonacci number at the location that has been entered as the input in the program
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the location for which the fibonacci number has to be printed");
        int a=s.nextInt();
        int ans=fibo(a);
        System.out.println(ans);

    }

    private static int fibo(Integer a) {
        if(a<2){
            return a;
        }
        return fibo(a-1)+fibo(a-2);
    }
}
