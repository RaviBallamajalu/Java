package oOps;

import java.util.ArrayList;

public class PolyMorph {
    public static void main(String args[]){
        Manipulation addition = new Addition();//Manipulation is reference type and Addition is reference type
        addition.add();
        Manipulation manipulation=new Manipulation();
        manipulation.add();

        ArrayList<Integer> integers=new ArrayList<>();
        ArrayList<Integer> integers1=new ArrayList<>();
        ArrayList<Integer> integers2=new ArrayList<>();

        integers.add(1);
        integers.add(2);
        integers1.addAll(integers);
        integers2.addAll(integers1);
        System.out.println(integers2);
        System.out.println(integers1);
        System.out.println(integers);
        integers2.addAll(0,integers1);
        System.out.println(integers2);

       // integers2.co

    }
}

