package com.ravi;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        char[] ab=a.toCharArray();
        char[] cd=b.toCharArray();

        System.out.println(ab);
        System.out.println(cd);
        Arrays.sort(ab);
        Arrays.sort(cd);

        if(Arrays.equals(ab, cd)){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {

        //Scanner scan = new Scanner(System.in);
//        String a = scan.next();
//        String b = scan.next();
//        scan.close();
        String a = "anagram";
        String b = "margana";
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
