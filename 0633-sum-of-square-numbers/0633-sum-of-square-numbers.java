class Solution {
    public boolean judgeSquareSum(int c) {
        int n = (int)Math.sqrt(c);
        int[] arr = new int[n + 1];
        for (int k = 0; k <= n; k++)
        {
            arr[k] = k;
        }
        int i=0,j=n;
        while(i<=j)
        {
           long sum = (long)arr[i]*arr[i] + (long)arr[j]*arr[j];
            if(sum == c) return true;
            else if(sum > c) j--;
            else i++;
        }
        return false;
    }
}