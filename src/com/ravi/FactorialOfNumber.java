package com.ravi;

public class FactorialOfNumber {
    public static void main(String[] args) {
        Integer a=5;

        Integer res=1;
        for(int i=1;i<=a;i++){
            res=res*i;
        }

        System.out.println(res);

        int factRes=fact(a);//using separtae method
        System.out.println("FactRes : "+factRes);


        int recFcatores=factorial(a);//using rescursion

        System.out.println(recFcatores);
    }

    private static int factorial(Integer a) {
        if(a==0){
            return 1;
        }
        return a*factorial(a-1);
    }

    private static int fact(Integer a) {
        int res=1;
        while(a>=1){
            res=res*a;
            a--;
        }
        return res;
    }
}
