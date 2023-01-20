package interviewPreparation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

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

    }
}
