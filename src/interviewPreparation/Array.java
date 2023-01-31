package interviewPreparation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import static sun.swing.MenuItemLayoutHelper.max;

public class Array {
    public static void main(String[] args) {

        int [] a=new int[]{4};
        ArrayList<Integer> integers=new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);

        a= integers.stream().mapToInt(value -> value.intValue()).toArray();

        for (int a1:a) {
            System.out.println(a1);
        }


        int b= Arrays.stream(a).sorted().max().getAsInt();
        int c=Arrays.stream(a).sorted().min().getAsInt();
        int d=Arrays.stream(a).sum();


        System.out.println(b+" "+c+" sum "+d);

        System.out.println();
        int[] abc=new int[]{1,2,3,4,5,6,7,8,9,0};

        int[] thirdLargestinArray=new int[]{1,6,5,4,3};

        for(int i=0;i<thirdLargestinArray.length-1;i++){
            for (int j=i+1;j<thirdLargestinArray.length;j++) {
                if (thirdLargestinArray[i] > thirdLargestinArray[j]) {
                    int temp = thirdLargestinArray[j];
                    thirdLargestinArray[j] = thirdLargestinArray[i];
                    thirdLargestinArray[i] = temp;
                }
            }
        }
        System.out.println(thirdLargestinArray[thirdLargestinArray.length-3]);

        System.out.println("Sorted in Ascending");
        for (Integer i:thirdLargestinArray) {
            System.out.print(i+" ");
        }

        for(int i=0;i<thirdLargestinArray.length-1;i++){
            for (int j=i+1;j<thirdLargestinArray.length;j++) {
                if (thirdLargestinArray[i] < thirdLargestinArray[j]) {
                    int temp = thirdLargestinArray[j];
                    thirdLargestinArray[j] = thirdLargestinArray[i];
                    thirdLargestinArray[i] = temp;
                }
            }
        }
        System.out.println();
        System.out.println("Sorted in Descending");


        for (Integer i:thirdLargestinArray) {
            System.out.print(i+" ");
        }
        System.out.println();
        for (Integer abc1:
             abc) {
            System.out.print(abc1);
        }
    }
}
