package interviewPreparation;

import java.util.Arrays;
import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }

        System.out.println("Enter how much rotations must be done");
        int rotate = scan.nextInt();
        System.out.println("Enter 1 for left roatation 2 for right rotation");

        int leftOrRight = scan.nextInt();
        rotateByRotateNumber(a, rotate, leftOrRight);

        System.out.println(Arrays.toString(a));
    }

    private static void rotateByRotateNumber(int[] a, int rotate, int leftOrRight) {
        if (leftOrRight == 1)
            for (int i = 0; i < rotate; i++)
                rotateByOnetoleft(a);
        else if (leftOrRight == 2)
            for (int i = 0; i < rotate; i++)
                rotateByOnetoRight(a);
        //rotateByOnetoRight(a);
    }

    private static void rotateByOnetoRight(int[] a) {
        int temp = a[a.length - 1];
        for (int i = a.length - 1; i >= 1; i--) {
            a[i] = a[i - 1];
        }
        a[0] = temp;
    }

    private static void rotateByOnetoleft(int[] a) {
        int temp = a[0];
        for (int i = 0; i < a.length - 1; i++) {
            a[i] = a[i + 1];
        }
        a[a.length - 1] = temp;
    }
}
