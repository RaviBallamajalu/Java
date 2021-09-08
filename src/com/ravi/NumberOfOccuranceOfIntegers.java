package com.ravi;

import java.util.Scanner;

public class NumberOfOccuranceOfIntegers {
    public static void main(String arr[]) {
        Scanner sc = new Scanner(System.in);
        Integer number;
        Integer count;
        Integer n = 0;
        Integer temp;
        System.out.println("Enter the Number : ");
        number = sc.nextInt();

        for (int i = 0; i <= 9; i++) {
            count = 0;
            temp = number;
            while (temp > 0) {
                n = temp % 10;
                if (n == i) {
                    count++;
                }
                temp = temp / 10;
            }
            if (count > 0) {
                System.out.println("Number of " + i + " is : " + count);
            }
        }
    }
}
