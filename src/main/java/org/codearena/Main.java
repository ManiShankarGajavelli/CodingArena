package org.codearena;

public class Main {
    public static void main(String[] args) {
        AddTwoNumbers solution = new AddTwoNumbers();

        AddTwoNumbers.ListNode l1 = new AddTwoNumbers.ListNode(2, new AddTwoNumbers.ListNode(4, new AddTwoNumbers.ListNode(3)));
        AddTwoNumbers.ListNode l2 = new AddTwoNumbers.ListNode(5, new AddTwoNumbers.ListNode(6, new AddTwoNumbers.ListNode(4)));

        AddTwoNumbers.ListNode result = solution.addTwoNumbers(l1, l2);

        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
        // Output: 7 0 8
    }
}