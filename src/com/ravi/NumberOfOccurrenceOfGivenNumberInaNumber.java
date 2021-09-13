package com.ravi;

import java.util.Scanner;

public class NumberOfOccurrenceOfGivenNumberInaNumber {
    public static void main(String arr[]) {
        Scanner sc = new Scanner(System.in);
        Integer number;
        Integer count;
        Integer n = 0;
        Integer temp;
        System.out.println("Enter the Number");
        number = sc.nextInt();

        System.out.println("Enter the number for which the number of repetition has to obtained");
        Integer num1 = sc.nextInt();
        temp = number;
        count = 0;
        while (temp > 0) {
            n = temp % 10;
            if (n == num1) {
                count++;
            }
            temp = temp / 10;
        }
        if (count > 0) {
            System.out.println("Number of " + num1 + " is : " + count);
        }
        else{
            System.out.println("Number of " + num1 + " is : " + count);
        }
    }
}
