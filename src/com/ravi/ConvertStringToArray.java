package com.ravi;

public class ConvertStringToArray {
    public static void main(String[] args) {
        String test="This is a Test STring";
        char []stringToChar=new char[test.length()];

        for(int i=0;i<test.length();i++){
            stringToChar[i]=test.charAt(i);
        }

        System.out.println(stringToChar);
    }
}
