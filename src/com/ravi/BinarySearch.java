package com.ravi;

public class BinarySearch {

    public static void main(String[] args) {

        int[] nums = {-1, 0, 3, 5, 9, 12};

        int key = 9;

        int s = search(nums, key);

        System.out.println(s);
    }

    public static int search(int[] nums, int key) {
        int res = -1;
        int first = 0;
        int last = nums.length - 1;

        int mid = (first + last) / 2;

        while (first <= last) {
            if (nums[mid] < key) {
                first = mid + 1;
            } else if (nums[mid] == key) {
                res = mid;
                break;
            } else {
                last = mid - 1;
            }

            mid = (first + last) / 2;
        }

        return res;

    }
}
