package com.example.leetcode.medium;


import java.util.ArrayList;
import java.util.List;

/**
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 * Explanation: 342 + 465 = 807.
 */
public class AddTwoNumbers {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        List<ListNode> listNodeList = new ArrayList<>();
        int nextValue = 0;
        //两个链接相加遍历过程，只有两个链表都已经遍历完了而且最后一位相加不大于10
        for (; l1 != null || l2 != null || nextValue != 0; ) {
            int value1 = l1 == null ? 0 : l1.val;
            int value2 = l2 == null ? 0 : l2.val;
            listNodeList.add(new ListNode((value1 + value2 + nextValue) % 10));
            nextValue = (value1 + value2 + nextValue) / 10;
            l1 = (l1 == null) ? null : l1.next;
            l2 = (l2 == null) ? null : l2.next;
        }
        //给链表增加链接
        for (int i = 0; i < listNodeList.size() - 1; i++) {
            listNodeList.get(i).next = listNodeList.get(i + 1);
        }
        return listNodeList.get(0);
    }

    /**
     * 我的误区，由于无知，把注意力全部放到链表的初始化构建上面，导致不知道该如何去解题
     * 个人理解：链表，首先是个list，其次才是有指向的链表，或者指针
     * 此题像是两个字符串的相加
     * @param args
     */
    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(5);
//        ListNode listNode2 = new ListNode(8);
//        ListNode listNode3 = new ListNode(3);
//        listNode2.next = listNode3;
//        listNode1.next = listNode2;

//        ListNode listNode4 = new ListNode(5);
//        ListNode listNode5 = new ListNode(6);
//        ListNode listNode6 = new ListNode(4);
//        listNode5.next = listNode6;
//        listNode4.next = listNode5;

        ListNode listNode = addTwoNumbers(listNode1, null);
        while (listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }

    }
}
