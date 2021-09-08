package com.ravi;

import java.util.*;

public class CollectionPrograms {
    public static void main(String[] args) {
        System.out.println("Array List");
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Ravi");
        arrayList.add("Ramaa");
        arrayList.add("Ravi");
        arrayList.add("Arundhathi");
        Iterator itr = arrayList.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        Collections.sort(arrayList);


        System.out.println("List In Order :"+arrayList);

//Linked List
        System.out.println("Linked List");
        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.add("Ravi");
        linkedList.add("Ramaa");
        linkedList.add("Ravi");
        linkedList.add("Arundhathi");
        Iterator<String> itr1 = linkedList.iterator();
        while (itr1.hasNext()) {
            System.out.println(itr1.next());
        }
        Collections.sort(linkedList);
        System.out.println("List In Order :"+linkedList);
//TODO
    }
}

