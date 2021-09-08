package com.ravi;

import java.util.Scanner;

public class NumberOfOccuranceOfLetterInString {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String");
        String inputString = scanner.next();
        System.out.println("Enter the Char");
        char c = scanner.next().charAt(0);

        findTheOccuranceOfChar(inputString, c);
    }

    private static void findTheOccuranceOfChar(String inputString, char c) {
        int count = 0;
        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.charAt(i) == c) {
                count++;
            }

        }
        System.out.println(c+":"+" "+count);
    }
}