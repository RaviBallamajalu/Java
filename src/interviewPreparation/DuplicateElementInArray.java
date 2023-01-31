package interviewPreparation;

import java.util.HashSet;
import java.util.Iterator;

public class DuplicateElementInArray {
    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3, 4, 5, 2, 2, 4, 6, 6, 6, 8, 8, 8, 0, 9};
        HashSet<Integer> integers = new HashSet<>();

        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    integers.add(a[j]);
                    // System.out.println(a[j]);
                }
            }
        }

        Iterator iterator = integers.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        //System.out.println();
    }
}
