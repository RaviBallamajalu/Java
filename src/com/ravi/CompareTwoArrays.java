package com.ravi;

import java.util.Arrays;

public class CompareTwoArrays {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] b = {1, 2, 3};
        String aa1 = "ravi";
        char[] a1 = {'d', 'a', 'a', 'b'};
        Arrays.sort(a1);
        char[] a12 = aa1.toCharArray();
        Arrays.sort(a12);
        System.out.println(a12);
        System.out.println(a1);

        if (a == b) {
            System.out.println("References are equal");
        } else {
            System.out.println("References are not equal");
        }

        if (Arrays.equals(a, b)) {
            System.out.println("Arrays are equal");
        } else {
            System.out.println("Arrays are not equal");
        }


    }
}
