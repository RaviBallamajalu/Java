package com.ravi;

import java.util.Scanner;

public class Fun {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("Hello, Enter a choice that you want to do \n 1 for addition \n 2 for sub \n 3 for mul \n 4 for div");


        Integer a=scan.nextInt();
        switch (a) {
            case 1: sum();
            break;

            case 2: sub();
            break;

            case 3 : mul();
            break;

            case 4: div();
            break;
            default:
                System.out.println("Tata");
        }
    }

    private static void sum() {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the first Number");
        Integer n1=scan.nextInt();
        System.out.println("Enter the Second Number");
        Integer n2=scan.nextInt();
        if(n1>0 && n2 >0)
        {
            Integer s=n1+n2;
            System.out.println("Sum : "+ s);
        }
    }

    private static void sub() {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the first Number");
        Integer n1=scan.nextInt();
        System.out.println("Enter the Second Number");
        Integer n2=scan.nextInt();
        if(n1>n2)
        {
            Integer s=n1-n2;
            System.out.println("value of sub : "+ s);
        }
    }
    private static void mul() {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the first Number");
        Integer n1=scan.nextInt();
        System.out.println("Enter the Second Number");
        Integer n2=scan.nextInt();
        if(n1>0 && n2 >0)
        {
            Integer s=n1*n2;
            System.out.println("value of mul : "+ s);
        }
    }
    private static void div() {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the first Number");
        Integer n1=scan.nextInt();
        System.out.println("Enter the Second Number");
        Integer n2=scan.nextInt();
        if(n1>0 && n2 >0 && n1>n2)
        {
            Integer s=n1/n2;
            System.out.println("value of div : "+ s);
        }
    }
}
