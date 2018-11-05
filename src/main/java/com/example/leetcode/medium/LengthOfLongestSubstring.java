package com.example.leetcode.medium;

public class LengthOfLongestSubstring {


    public static int lengthOfLongestSubstring(String s) {
        if (s == null||s.length()==0) {
            return 0;
        }
        int max = 1;
        int medium = 1;
        for (int i = 0, j = 1,k=1; k < s.length(); ) {
            String a = s.substring(i, j);
//            System.out.println(a);

            String b = s.substring(k, k+1);
//            System.out.println(b);
            if (a.contains(b)) {
                i++;
                j=i+1;
                k =i+1;
                medium=1;
            } else {
                j++;
                k++;
                medium++;
                if (medium > max) {
                    max = medium;
                }
            }

        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("bbbb"));
    }
}
