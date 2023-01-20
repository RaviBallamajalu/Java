package interviewPreparation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList arrayList=new ArrayList();

        arrayList.add("abc");
        arrayList.add(1);
        arrayList.add("defg");

        for (Object o:arrayList){
            System.out.println(o);
        }

        System.out.println("Iterator");

        Iterator iterator=arrayList.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        //Convert List to Array

        Object[] a=arrayList.toArray();
        System.out.println(Arrays.toString(a));

        for (Object o:a
             ) {
            System.out.println(o);

        }
    }
}
