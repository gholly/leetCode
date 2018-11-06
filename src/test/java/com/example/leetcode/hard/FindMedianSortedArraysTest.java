package com.example.leetcode.hard;

import org.junit.Assert;
import org.junit.Test;

import static com.example.leetcode.hard.FindMedianSortedArrays.findMedianSortedArrays;

public class FindMedianSortedArraysTest {


    @Test
    public void should_return_median_when_nums1_and_nums2() {
        int[] nums1 = new int[]{1, 2};
        int[] nums2 = {3, 4};
        /**
         * delta参数是误差参数，在delta允许的范围内是则认为两者是相等的
         */
        Assert.assertEquals("如果打印本信息, 证明参数不相等",2.5f,findMedianSortedArrays(nums1,nums2),0);

    }


}
