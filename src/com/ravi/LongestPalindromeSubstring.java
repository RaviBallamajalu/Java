package com.ravi;

import java.util.ArrayList;

public class LongestPalindromeSubstring {

    public static void main(String[] args) {
        String str = "abad";
        SubString(str, str.length());
    }

    //Generating the Substring and adding to the list
    public static void SubString(String str, int n) {
        ArrayList<String> strings = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {

                strings.add(str.substring(i, j));
            }
        }

        //    strings.stream().forEach(System.out::println);

        int initialLength = 0;
        int finalLength = 0;
        String initialString = "";
        String finalString = "";
        for (String a : strings) {
            finalLength = palindrome(a);//Function to get the final max length of substring which is palindrome -> returns int
            finalString = palindromee(a); //Function to get the final substring which is palindrome-> returns a string

            if (finalLength > initialLength) {
                initialLength = finalLength;
            }
            if (finalString.length() > initialString.length()) {
                initialString = finalString;
            }
        }
        System.out.println(initialString);
        System.out.println(initialLength + " Longest Substring");
    }

    private static String palindromee(String a) {
        String a1 = "";
        for (int i = a.length() - 1; i >= 0; i--) {
            a1 = a1 + a.charAt(i);
        }
        if (a1.equalsIgnoreCase(a)) {
            return a1;
        } else {
            return "";
        }
    }

    private static int palindrome(String a) {
        String a1 = "";
        for (int i = a.length() - 1; i > 0; i--) {
            a1 = a1 + a.charAt(i);
        }
        if (a1.equalsIgnoreCase(a)) {
            return a1.length();
        }
        return a1.length();
    }
}