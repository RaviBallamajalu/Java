package interviewPreparation;

import java.util.Arrays;

public class CheckIfArrayContainsOnlyOdd {
    public static void main(String[] args) {
        int[] a=new int[]{1,1,3,3,5,5};

        boolean b=false;
        for(int i=0;i<a.length;i++){
            if(a[i]%2==0){
                System.out.println("Array contains Even Numbers");
                b=true;
                break;
            }
        }
        if(b==false){
            System.out.println("Array contains Odd Numbers");
        }

        boolean res= Arrays.stream(a).anyMatch(value -> value%2==0);

        System.out.println(res);
    }


}
