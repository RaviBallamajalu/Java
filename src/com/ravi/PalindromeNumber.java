package com.ravi;

import java.util.Scanner;

public class PalindromeNumber {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Number");
        int number = scan.nextInt();
        int temp = number;
        int revOfNumber = 0;
        while (number > 0) {
            int rem = number % 10;
            number = number / 10;
            revOfNumber = revOfNumber * 10 + rem;
        }
        System.out.println(revOfNumber);
        if (revOfNumber == temp) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }
}
