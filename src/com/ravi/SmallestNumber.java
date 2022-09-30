package com.ravi;

public class SmallestNumber {
    public static void main(String[] args) {



        int n = 14;
        smallestNumber(n);
    }

    private static void smallestNumber(int n) {
        int i=getSum(n);
        int d=i*2;



      for(int k=n;k<10000;k++){
            if(getSum(k)==d){
                System.out.println(k);
                break;
            }
        }
    }

    private static int getSum(int n) {
        int sum=0;
        while(n!=0){
            sum=sum+(n%10);
                n=n/10;

        }
        return sum;
    }
}
