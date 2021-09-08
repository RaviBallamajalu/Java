package com.ravi;

import java.util.*;

public class HashMapCode {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
        hashMap.put(1, "Ravi");
        hashMap.put(2, "Ramaa");
        Integer findKey = scan.nextInt();

        System.out.println("The HashMap is: " + hashMap);

        for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

        for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
            if(hashMap.containsKey(findKey)){
                if(entry.getKey()==findKey){
                    System.out.println("The value for key is ");
                    System.out.println(entry.getValue());
                }
            }
        }

    }
}
