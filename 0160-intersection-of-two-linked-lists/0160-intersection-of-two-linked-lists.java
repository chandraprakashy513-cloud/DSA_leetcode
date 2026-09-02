/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp=headA;
        int lenA=0;
        while(temp!=null)
        {
            lenA++;
            temp=temp.next;
        }


        ListNode temp1=headB;
        int lenB=0;
        while(temp1!=null)
        {
            lenB++;
            temp1=temp1.next;
        }

        int k=Math.abs(lenA-lenB);
        ListNode temp2=headA;
        ListNode temp3=headB;
       
        if(lenA>lenB)
        {
            for(int i=0;i<k;i++)
            {
                temp2=temp2.next;
            }
        }
        else
        {
             for(int i=0;i<k;i++)
            {
                temp3=temp3.next;
            }
        }

        while(temp2!=null && temp3!=null)
        {
            if(temp2==temp3)
            {
                return temp3;
            }
            temp3 = temp3.next;
            temp2 = temp2.next;
        }
        return null;
    }
}