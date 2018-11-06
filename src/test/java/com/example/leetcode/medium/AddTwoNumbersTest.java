package com.example.leetcode.medium;

import com.example.leetcode.medium.linkedList.AddTwoNumbers;
import com.example.leetcode.medium.linkedList.model.ListNode;
import org.junit.Assert;
import org.junit.Test;

public class AddTwoNumbersTest {


    @Test
    public void should_return_0_1_when_5_add_5() {
        ListNode listNode1 = new ListNode(5);
        ListNode listNode2 = new ListNode(5);
        ListNode listNodeResult = AddTwoNumbers.addTwoNumbers(listNode1, listNode2);
        Assert.assertEquals(0,listNodeResult.val);
        Assert.assertEquals(1,listNodeResult.next.val);
    }



}
