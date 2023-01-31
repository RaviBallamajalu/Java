package interviewPreparation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class FlattenTheArrayOfObjects {
    public static void main(String[] args) throws Exception {
        Object[] array = {1, 2, new Object[]{3, 4, new Object[]{5}, 6, 7}, 8, 9, 10};

        Integer[] flattenedArray = flatten(array);

        System.out.println(Arrays.toString(flattenedArray));
    }

    public static Integer[] flatten(Object[] inputArray) throws Exception {

        List<Integer> integers = new ArrayList<>();

        for (Object o : inputArray) {
            if (o instanceof Integer) {
                integers.add((Integer) o);
            } else if (o instanceof Object) {
                try {
                    integers.addAll(Arrays.asList(flatten((Object[]) o)));
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        }
       return integers.toArray(new Integer[integers.size()]);
    }
}