class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int arr[] = new int[n];
        int product=1;
        for(int i=0;i<n;i++)
        {
            arr[i] = product;
            product = product*nums[i];
        }
        int suffix=1;
        for(int i=n-1;i>=0;i--)
        {
            arr[i] =arr[i]*suffix;
            suffix=suffix*nums[i];
        }
        return arr;
    }
}