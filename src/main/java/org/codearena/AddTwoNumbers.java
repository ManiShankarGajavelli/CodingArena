package org.codearena;

import org.codearena.annnotations.ProblemMetadata;

@ProblemMetadata(tags = {"Linked List","Math","Recursion"},title = "Add Two Numbers",difficulty = "Easy",link = "https://leetcode.com/problems/add-two-numbers/description/",problemId = "2")
public class AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode Dummy = new ListNode(0);
        ListNode currentNode = Dummy;
        int carry = 0;
        while (l1 != null || l2 != null) {

            int val1 = l1 != null ? l1.val : 0;
            int val2 = l2 != null ? l2.val : 0;
            int sum = val1 + val2 + carry;
            carry = sum / 10;
            int digit = sum % 10;
            currentNode.next = new ListNode(digit);
            currentNode = currentNode.next;

            if (l1 != null)
                l1 = l1.next;
            if (l2 != null)
                l2 = l2.next;

        }
        if (carry > 0) {
            currentNode.next = new ListNode(carry);
            currentNode = currentNode.next;
        }
        return Dummy.next;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
