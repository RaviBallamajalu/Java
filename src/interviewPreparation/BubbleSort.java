package interviewPreparation;

import com.ravi.Array;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int [] a={3,4,2,1,5};

        for(int i=0;i<a.length-1;i++){
            for (int j=i+1;j<a.length;j++){
                if(a[i]>a[j]){
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
