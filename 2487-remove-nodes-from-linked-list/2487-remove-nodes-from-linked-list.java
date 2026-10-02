import java.util.Stack;

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
    public ListNode removeNodes(ListNode head) {
        Stack st = new Stack<>();
        ListNode temp = head;
        
        while (temp != null) {
            st.push(temp.val);
            temp = temp.next;
        }
        
        ListNode newHead = null;
        int maxVal = Integer.MIN_VALUE;
        
        while (!st.isEmpty()) {
            int val = (int)st.pop();
            if (val >= maxVal) {
                maxVal = val;
                ListNode newNode = new ListNode(val, newHead);
                newHead = newNode;
            }
        }
        
        return newHead;
    }
}