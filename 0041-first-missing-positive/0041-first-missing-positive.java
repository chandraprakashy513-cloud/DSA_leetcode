class Solution {
    public static void swap(int arr[],int i,int idx)
    {
        int temp=arr[i];
        arr[i]= arr[idx];
        arr[idx] = temp;
    }
    public int firstMissingPositive(int[] arr) {
        int n=arr.length;
        int i=0;
        while(i<n)
        {
            if(arr[i]<=0 || arr[i]>n || arr[i]==i+1 || arr[i]==arr[arr[i]-1]) i++;
            else
            {
                swap(arr,i,arr[i]-1);
            }
        }
        for(int j=0;j<n;j++)
        {
            if(arr[j]!=j+1) return j+1;
        }
        return n+1;
    }
}