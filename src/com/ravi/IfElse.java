package com.ravi;

import java.util.Arrays;

public class IfElse {
    public static void main(String[] args) {
        Integer number1 = 10;

        if (number1 > 5) {
            System.out.println("number1 is greater");
        } else {
            System.out.println("number1 is lesser");
        }

        double m = (double) (2 + 3) / 2;
        System.out.println(m);

        int[] a = {1, 2};
        int[] b = {3, 4};

        double abc = median(a, b);
        System.out.println(abc);
    }

    public static double median(int[] nums1, int[] nums2) {
        int[] nums = new int[nums1.length + nums2.length];

        int count = 0;

        for (int i = 0; i < nums1.length; i++) {
            nums[count] = nums1[i];
            count++;
        }
        for (int i = 0; i < nums2.length; i++) {
            nums[count] = nums2[i];
            count++;
        }
        Arrays.sort(nums);
        double median = 0;
        System.out.println(nums.length);
        if ((nums.length % 2) == 0) {
            median = (double) (nums[nums.length / 2] + nums[(nums.length / 2) - 1]) / 2;

            System.out.println(median);

            System.out.println(nums[nums.length / 2] + " " + nums[(nums.length / 2) - 1]);

        } else {
            median = nums[nums.length / 2];
            System.out.println(median);
        }
        return median;
    }
}

