class Solution {
    public List<Integer> targetIndices(int[] arr, int target) {
        int n = arr.length;
        List<Integer> ans = new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(int i=0;i<n;i++)
        {
            if(arr[i]==target)
            {
                ans.add(i);
            }
        }
        return ans;
    }
}