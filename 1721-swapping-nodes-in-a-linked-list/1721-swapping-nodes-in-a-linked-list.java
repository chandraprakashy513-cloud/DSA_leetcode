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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode temp = head;
        int length=0;
        while(temp!=null)
        {
            length++;
            temp=temp.next;
        }
        ListNode start=head;
        for(int i=1;i<k;i++)
        {
            start=start.next;
        }
      
        ListNode end=head;
        for(int i=1;i<=length-k;i++)
        {
            end=end.next;
        }
        

        int temp1=start.val;
        start.val=end.val;
        end.val=temp1;

        return head;
    }
}