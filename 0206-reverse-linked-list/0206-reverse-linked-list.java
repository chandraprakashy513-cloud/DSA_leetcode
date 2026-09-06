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
    public ListNode reverseList(ListNode head) {

        if(head == null || head.next == null) {
            return head;
        }
        ListNode temp=head;
        ArrayList<ListNode> ans= new ArrayList<>();
        while(temp!=null)
        {
            ans.add(temp);
            temp=temp.next;
        }

        int n = ans.size();
        for(int i=n-1;i>=1;i--)
        {
            ListNode temp1=ans.get(i);
            ListNode temp2=ans.get(i-1);

            temp1.next=temp2;   
        }
        ans.get(0).next=null;
        return ans.get(n-1);
    }
}