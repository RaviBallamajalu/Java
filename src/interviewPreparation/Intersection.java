package interviewPreparation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Intersection {

    /**
     * @param args
     */

    static int i, j, k, c = 0, w;

    public static void main(String[] args) {

        int[] x = {2, 5, 3, 7};
        System.out.println("The first array is " + "  ");
        for (int i = 0; i < x.length;
             i++) {
            System.out.print(x[i] + "  ");
        }
        System.out.println("");
        int[] y = {5, 2, 9, 0, 1};
        System.out.println("The second array is " + "  ");
        for (int j = 0; j < y.length;
             j++) {
            System.out.print(y[j] + "  ");
        }
        System.out.println("");
        intersection(x, y);
    }


    static void intersection(int x[], int y[]) {
        int[] z = new int[x.length + y.length];
        List<Integer> list=new ArrayList<Integer>();
        for (i = 0; i < (x.length); i++) {
            for (j = 0; j < y.length; j++) {
                if (x[i] == y[j]) {
                    z[c] = x[i];
                    list.add(x[i]);

                    c++;
                } else
                    continue;

            }
        }

        int[] abc=list.stream().mapToInt(value -> value.intValue()).toArray();
        System.out.println(Arrays.toString(abc));
        //Object[] abc=list.toArray();

        System.out.println("Intersection of two  array is " + "  ");
        for (k = 0; k < c; k++) {
            System.out.print("  " + z[k] + " ");
        }
        System.out.println("            ");
    }

}