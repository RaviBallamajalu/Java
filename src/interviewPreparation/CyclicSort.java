package interviewPreparation;

import com.ravi.Array;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] a = new int[]{3, 4, 5, 1, 2};
        sort(a);
        System.out.println(Arrays.toString(a));

        int[] b = {1, 2, 3, 5};
        missingNumber(b);
    }

    public static void sort(int[] a) {
        int i = 0;
        while (i < a.length) {
            int correct = a[i] - 1;
            if (a[correct] != a[i]) {
                swap(i, correct, a);
            } else {
                i++;
            }
        }
    }

    public static void swap(int f, int s, int[] a) {
        int temp = a[f];
        a[f] = a[s];
        a[s] = temp;
    }

    //Missing Number
    public static void missingNumber(int[]b){
        int i=0;
        while(i<b.length){
        //    if()
        }
    }
}
