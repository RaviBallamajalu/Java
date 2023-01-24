package com.ravi;

import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NumberOfOccurrenceOfLetterInString {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String");
        String inputString = scanner.next();
        System.out.println("Enter the Char");
        char c = scanner.next().charAt(0);

        findTheOccurrenceOfChar(inputString, c);

        findtheOccuranceOfEachChar(inputString);
    }

    private static void findtheOccuranceOfEachChar(String inputString) {
        char[] in=inputString.toCharArray();
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < in.length; i++) {
            if (hashMap.containsKey(in[i])==true) {
                hashMap.put(in[i], hashMap.get(in[i]) + 1);
            } else {
                hashMap.put(in[i], 1);
            }
        }

        for (Map.Entry<Character, Integer> characterIntegerEntry : hashMap.entrySet()){
            System.out.println(characterIntegerEntry.getKey()+" "+characterIntegerEntry.getValue());
        }

    }

    private static void findTheOccurrenceOfChar(String inputString, char c) {
        int count = 0;
        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.charAt(i) == c) {
                count++;
            }

        }
        System.out.println(c + ":" + " " + count);
    }


}