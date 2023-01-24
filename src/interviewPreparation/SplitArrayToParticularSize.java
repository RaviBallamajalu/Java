package interviewPreparation;

import java.util.*;

public class SplitArrayToParticularSize {
    public static void main(String[] args) {
        int[] original = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int splitSize = 11;
		
		/* expected Output 
		[0, 1, 2]
		[3, 4, 5]
		[6, 7, 8]
		[9]
		*/

        List<int[]> list = splitArray(original, splitSize);
        list.forEach(splitArray -> System.out.println(Arrays.toString(splitArray)));
    }

    public static List<int[]> splitArray(int[] array, int splitSize) {


        List<int[]> list = new ArrayList<int[]>();
        ArrayList<Integer> integers = new ArrayList<>();
        if (splitSize <= array.length && splitSize > 1) {
            for (int i = 0; i < array.length; i++) {
                integers.add(array[i]);
                if (integers.size() == splitSize || i == array.length - 1) {
                    //   list.add(convertToArray(integers));

                    //using streams
                    list.add(integers.stream().mapToInt(value -> value.intValue()).toArray());
                    integers = new ArrayList<>();
                }
            }
        } else {
            System.out.println("Split not within specified range");
        }

        return list;

    }

    private static int[] convertToArray(ArrayList<Integer> integers) {
        int[] a = new int[integers.size()];
        for (int i = 0; i < integers.size(); i++) {
            a[i] = integers.get(i);
        }
        return a;
    }
}


