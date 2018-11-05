package com.example.leetcode.medium;

import org.junit.Assert;
import org.junit.Test;

public class AddTwoNumbersTest {


    @Test
    public void should_return_0_1_when_5_add_5() {
        AddTwoNumbers.ListNode listNode1 = new AddTwoNumbers.ListNode(5);
        AddTwoNumbers.ListNode listNode2 = new AddTwoNumbers.ListNode(5);
        AddTwoNumbers.ListNode listNodeResult = AddTwoNumbers.addTwoNumbers(listNode1, listNode2);
        Assert.assertEquals(0,listNodeResult.val);
        Assert.assertEquals(1,listNodeResult.next.val);
    }



}
