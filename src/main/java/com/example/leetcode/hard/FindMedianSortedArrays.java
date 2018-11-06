package com.example.leetcode.hard;

public class FindMedianSortedArrays {

    public static double findMedianSortedArrays(int[] num1, int[] num2) {

        int m = num1.length;
        int n = num2.length;
        int size = m + n;
        int[] result = new int[(m + n)];
        for (int i = 0, j = 0, k = 0; i < m || j < n; k++) {
            if(i==m){
                result[k]=num2[j];
                j++;
                continue;
            }
            if(j==n){
                result[k]=num1[i];
                i++;
                continue;
            }
            if (num1[i] < num2[j]) {
                result[k] = num1[i];
                i++;
            } else {
                result[k] = num2[j];
                j++;
            }
        }
        return  (size % 2 == 1) ? result[(size - 1) / 2] : (result[size / 2-1] + result[size / 2 ]) / 2.0;
    }


    public static void main(String[] args) {
        int[] num1 = {1, 2};
        int[] num2 = {3,4};
        System.out.println(findMedianSortedArrays(num1, num2));
    }
}
