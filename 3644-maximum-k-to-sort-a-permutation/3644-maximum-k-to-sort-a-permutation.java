class Solution {
    public int sortPermutation(int[] nums) {
        int n = nums.length;
        int ans = -1;
        boolean misplaced = false;

        for (int i = 0; i < n; ++i) {
            if (nums[i] != i) {
                ans &= nums[i];
                misplaced = true;
            }
        }

        return misplaced ? ans : 0;
    }
}
