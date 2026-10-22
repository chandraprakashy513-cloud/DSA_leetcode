
class Solution {
    public int[] maxSlidingWindow(int[] arr, int k) {
        int n = arr.length;
        int[] ans = new int[n - k + 1];
        Deque<Integer> q = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            while (q.size()>0 && q.peekFirst() <= i - k) {
                q.pollFirst();
            }

            while (q.size()>0 && arr[q.peekLast()] <= arr[i]) {
                q.pollLast();
            }

            q.offerLast(i);

            if (i >= k - 1) {
                ans[i - k + 1] = arr[q.peekFirst()];
            }
        }

        return ans;
    }
}
