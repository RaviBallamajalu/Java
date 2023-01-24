package com.ravi;

public class LockerProblem {
    public static void main(String[] args) {
        boolean [] b=new boolean[100];

        for(int i=0;i<=b.length-1;i++){
            for(int j=i;j<b.length-1;j++){
                b[j]=true;
            }
        }

        for (int i=0;i<b.length;i++){
            System.out.println(b[i]+" "+i );
        }
    }
}
