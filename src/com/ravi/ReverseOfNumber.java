package com.ravi;

import java.util.Scanner;

public class ReverseOfNumber {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Number");
        int number = scan.nextInt();
        int revOfNumber = 0;
        while (number > 0) {
            int rem = number % 10;
            number = number / 10;
            revOfNumber = revOfNumber * 10 + rem;
        }
        System.out.println(revOfNumber);
    }
}
