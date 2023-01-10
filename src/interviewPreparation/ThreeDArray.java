package interviewPreparation;

import java.util.Scanner;

public class ThreeDArray {
    public static void main(String[] args) {
        int[][][] a=new int[1][3][3];

        Scanner s=new Scanner(System.in);
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                for(int k=0;k<a[i][j].length;k++){
                    a[i][j][k]=s.nextInt();
                }
            }
        }

        for(int i=0;i<a.length;i++) {
            for (int j = 0; j < a[i].length; j++) {
                for (int k = 0; k < a[i][j].length; k++) {
                    System.out.print(a[i][j][k] + " ");
                }
                System.out.println();
            }
        }
        System.out.println();

        int [][][] t=new int[1][3][3];
        for(int i=0;i<a.length;i++) {
            for (int j = 0; j < a[i].length; j++) {
                for (int k = 0; k < a[i][j].length; k++) {
                    t[i][k][j]=a[i][j][k];
                }
                System.out.println();
            }
        }

        for(int i=0;i<t.length;i++) {
            for (int j = 0; j < t[i].length; j++) {
                for (int k = 0; k < t[i][j].length; k++) {
                    System.out.print(t[i][j][k] + " ");
                }
                System.out.println();
            }
        }
        System.out.println();
    }
}
