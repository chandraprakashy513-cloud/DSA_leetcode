class Solution {
    public static void swap(int []arr,int i,int idx)
    {
        int temp=arr[i];
        arr[i] =arr[idx];
        arr[idx] = temp;
    }
    public int findDuplicate(int[] arr) {
        // int n = arr.length;
        //  HashSet<Integer> set = new HashSet<>();
        //  for(int i=0;i<n;i++)
        // {
        //     if(set.contains(arr[i]))
        //     {
        //         return arr[i];
        //     }
        //     else
        //     {
        //         set.add(arr[i]);
        //     }
        // }
        // return -1;
        int n=arr.length;
        int i=0;
        while(i<n)
        {
            if(arr[i] ==i+1)
            {
                i++;
            }
            else
            {
                int idx = arr[i]-1;
                if (arr[i] == arr[idx]) {
                    return arr[i];
                }

                swap(arr,i,idx);
            }
        }
        return -1;
        
    }
}