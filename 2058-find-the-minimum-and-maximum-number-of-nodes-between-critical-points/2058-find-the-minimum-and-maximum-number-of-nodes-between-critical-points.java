class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int[] ans = {-1, -1};

        int idx = 1;
        int fidx = -1;
        int lidx = -1;
        int mindis = Integer.MAX_VALUE;

        ListNode a = head;
        ListNode b = head.next;
        ListNode c = b.next;

        while(c != null) {
            if((b.val > a.val && b.val > c.val) ||
               (b.val < a.val && b.val < c.val)) {

                if(fidx == -1) {
                    fidx = idx;
                }

                if(lidx != -1) {
                    int dis = idx - lidx;
                    mindis = Math.min(dis, mindis);
                }

                lidx = idx;
            }

            idx++;
            a = a.next;
            b = b.next;
            c = c.next;
        }

        if(fidx != -1 && lidx != fidx) {
            ans[0] = mindis;
            ans[1] = lidx - fidx;
        }

        return ans;
    }
}