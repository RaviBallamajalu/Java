package interviewPreparation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FlattenTheArrayOfObjects {
    public static void main(String[] args) throws Exception {
        Object[] array = {1, 2, new Object[]{3, 4, new Object[]{5}, 6, 7}, 8, 9, 10};

        Integer[] flattenedArray = flatten(array);

        System.out.println(Arrays.toString(flattenedArray));


    }

    public static Integer[] flatten(Object[] inputArray) throws Exception {

        if (inputArray == null)
            return null;

        List<Integer> myList = new ArrayList<Integer>();

        for (Object element : inputArray) {
            if (element instanceof Integer) {
                myList.add((Integer) element);
                //System.out.println(myList+" : inside if");
            } else if (!(element instanceof Integer)) {
                myList.addAll(Arrays.asList(flatten((Object[]) element)));
                //System.out.println(myList+" : inside else if");
            } else {
                System.out.println("Cannot be flattened");
            }
        }

        //System.out.println(myList);
        return myList.toArray(new Integer[myList.size()]);
    }
}