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
    public ListNode reverse(ListNode head)
    {
        ListNode current=head;
        ListNode prev=null;
        ListNode farword=null;
        while(current!=null)
        {
            farword=current.next;
            current.next=prev;

            prev=current;
            current=farword;
        }
        return prev;
    }

    public ListNode margerAlternet(ListNode head1,ListNode head2)
    {
        ListNode dummy= new ListNode(-1);
        ListNode current=dummy;
        ListNode a=head1;
        ListNode b = head2;
        while(a!=null || b!=null)
        {
            if(a!=null)
            {
                current.next=a;
                a=a.next;
                current=current.next;
            }
            if(b!=null)
            {
                current.next=b;
                b=b.next;
                current=current.next;
            }
        }
        return dummy.next;
    }
    public void reorderList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next!=null && fast.next.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode b=slow.next;
        slow.next=null;
        ListNode a=head;
        ListNode head2=reverse(b);
         margerAlternet(a,head2);
    }
}