package com.ravi;

public class DivideStringToEqualParts {
    public static void main(String[] args) {
        String s = "qwerty";
        int a = 2;
        if (s.length() % a == 0) {
            for (int i = 0; i < s.length(); i = i + a) {
                System.out.println(s.substring(i, i + a
                ));
            }
        }
        else{
            System.out.println("Not able to split the Strings in equal parts");
        }
    }
}