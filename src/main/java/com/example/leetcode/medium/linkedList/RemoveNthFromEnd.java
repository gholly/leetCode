package com.example.leetcode.medium.linkedList;

import com.example.leetcode.medium.linkedList.model.ListNode;

import java.util.ArrayList;
import java.util.List;

public class RemoveNthFromEnd {

    public static ListNode removeNthFromEnd(ListNode head, int n) {

        List<ListNode> listNodeList = new ArrayList<>();
        while (head != null) {
            listNodeList.add(new ListNode(head.val));
            head = head.next;
        }
        listNodeList.remove(listNodeList.size() - n);
        for (int i = 0; i < listNodeList.size() - 1; i++) {
            listNodeList.get(i).next = listNodeList.get(i + 1);
        }
        return listNodeList.size() > 0 ? listNodeList.get(0) : null;
    }

    public static void main(String[] args) {

        ListNode listNode1 = new ListNode(5);
        ListNode listNode2 = new ListNode(8);
//        ListNode listNode3 = new ListNode(3);
//        listNode2.next = listNode3;
        listNode1.next = listNode2;
        ListNode listNode = removeNthFromEnd(listNode1, 1);
        while (listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }

    }
}
