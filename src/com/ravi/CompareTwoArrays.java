package com.ravi;

import java.util.Arrays;

public class CompareTwoArrays {
    public static void main(String[] args) {
        int []a={1,2,3};
        int []b={1,2,3};

        if(a==b){
            System.out.println("References are equal");
        }
        else
        {
            System.out.println("References are not equal");
        }

        if(Arrays.equals(a,b)){
            System.out.println("Arrays are equal");
        }
        else
        {
            System.out.println("Arrays are not equal");
        }


    }
}
