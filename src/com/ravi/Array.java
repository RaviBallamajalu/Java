package com.ravi;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Array {
    public static void main(String[] args) {
        // Initialize the Array with the size
        //Integer intArray[] = new Integer[8];
        Integer intArray[] = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8};


        Scanner scanner = new Scanner(System.in);
        //Enter the values to the Array
       /* System.out.println("Enter the values to the Array");
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = scanner.nextInt();
        }*/

        //print the values of the Array

        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i] + " ");
        }
        System.out.println();

        //Modify the values of the Array for the specific index;
        int index = 5;
        intArray[index] = 10;

        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i] + " ");
        }

        //Delete the value preset in index
        int index1 = 1;
       int a[]= IntStream.range(0, intArray.length).filter(value -> value != index1).map(value -> intArray[value]).toArray();


        System.out.println();
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

        //Reverse an Array and store it
        System.out.println();
       int[] rev =reverseArr(intArray);
        for (int i:rev
             ) {
            System.out.print(i + " ") ;

        }
    }

    private static int[] reverseArr(Integer[] intArray) {

        int[] rev=new int[intArray.length];
        int j=0;
        for(int i=intArray.length-1;i>=0;i--){
            rev[j]=intArray[i];
        j++;
        }
        return rev;
    }
}
