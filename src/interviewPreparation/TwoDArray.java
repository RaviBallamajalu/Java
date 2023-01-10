package interviewPreparation;

import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        int[][] a = new int[2][2];
        int [][] b=new int[2][2];
        Scanner s = new Scanner(System.in);

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = s.nextInt();

            }
        }

        System.out.println("Enter the second matrix");

        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                b[i][j] = s.nextInt();

            }
        }


        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");

            }
            System.out.println();
        }

        //Add Two Array

        int res[][]=new int[2][2];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                res[i][j]=a[i][j]+b[i][j];
            }
        }

        System.out.println("Result of the Addition");
        for(int i=0;i<res.length;i++){
            for(int j=0;j<res[i].length;j++){
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }



        //Transpose of Matrix
        /*
        original  -     Result
        1 2       -     1 3
        3 4       -     2 4
         */
        int[][] t = new int[2][2];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++)
                t[i][j] = a[j][i];
        }

        System.out.println("Transpose of Matrix");

        for(int i=0;i<t.length;i++){
            for(int j=0;j<t[i].length;j++){
                System.out.print(t[i][j]+" ");
            }
            System.out.println();
        }








    }

}
