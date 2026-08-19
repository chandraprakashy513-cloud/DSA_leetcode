class Solution {
    public static int subarray(int []arr,int start,int k)
    {
        if(start == arr.length) return 0;
        int sum =0;
        int count=0;
        for(int i=start;i<arr.length;i++)
        {
            sum+=arr[i];
            if(sum == k)
            {
                count++;
            }
        }
        return count+subarray(arr,start+1,k);
    }
    public int subarraySum(int[] arr, int k) {
        return subarray(arr,0,k);
    }
}