package com.ravi;

import java.util.*;

public class CollectionPrograms {
    public static void main(String[] args) {
        System.out.println("Array List");
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Ravi");
        arrayList.add(null);
        arrayList.add("Ramaa");
        arrayList.add("Ravi");
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add("Arundhathi");
        Iterator itr = arrayList.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        //Collections.sort(arrayList);


        System.out.println("List In Order :"+arrayList);


        System.out.println("Linked List");
        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.add("Ravi");
        linkedList.add(null);
        linkedList.add("Ramaa");
        linkedList.add("Ravi");
        linkedList.add(null);
        linkedList.add(null);
        linkedList.add("Arundhathi");
        Iterator<String> itr1 = linkedList.iterator();
        while (itr1.hasNext()) {
            System.out.println(itr1.next());
        }

        String s1="abc";

        System.out.println("List In Order :"+linkedList);
//TODO
    }
}

