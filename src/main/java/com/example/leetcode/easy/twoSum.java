package com.example.leetcode.easy;

public class twoSum {
    public static int[] twoSum(int[] nums, int target) {
        for (int i=0; i < nums.length; i++) {
            for (int j=i+1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i,j};
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args) {
        int[] nums = {3,2,3};
        int[] result=twoSum(nums,6);
        for(int i=0;i<result.length;i++){
            System.out.println(result[i]);
        }
    }
}
