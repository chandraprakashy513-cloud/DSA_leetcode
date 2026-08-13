class Solution {
    public int maxProduct(int[] arr) {
        int n = arr.length;
        // for(int i=0;i<n;i++)
        // {
        //     for(int j=0;j<n-1-i;j++)
        //     {
        //         if(arr[i]> arr[j])
        //         {
        //             int temp=arr[i];
        //             arr[i] = arr[j];
        //             arr[j] = temp;
        //         }
        //     }
        // }
        Arrays.sort(arr);
        // int largest=arr[n-1];
        // int sec_largest=arr[n-2];
        return ((arr[n-1]-1)*(arr[n-2]-1));
    }
}