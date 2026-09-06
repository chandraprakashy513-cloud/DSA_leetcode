/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode oddEvenList(ListNode head) {

        if (head == null || head.next == null) {
            return head;
        }

        ListNode dummy1 = new ListNode(-1); // odd
        ListNode dummy2 = new ListNode(-1); // even

        ListNode temp1 = dummy1;
        ListNode temp2 = dummy2;

        ListNode temp = head;
        int count = 1;

        while (temp != null) {

            ListNode next = temp.next;
            temp.next = null;

            if (count % 2 != 0) {
                temp1.next = temp;
                temp1 = temp1.next;
            }
            else {
                temp2.next = temp;
                temp2 = temp2.next;
            }

            temp = next;
            count++;
        }

        temp1.next = dummy2.next;

        return dummy1.next;
    }
}