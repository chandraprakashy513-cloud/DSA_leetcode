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
    public boolean isPalindrome(ListNode head) {
        ListNode temp=head;
        ArrayList<Integer> ans=new ArrayList<>();
        while(temp!=null)
        {
            ans.add(temp.val);
            temp=temp.next;
        }
        int i=0,j=ans.size()-1;
        while(i<j)
        {
            int a=ans.get(i),b=ans.get(j);
            if(a!=b)
            {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}