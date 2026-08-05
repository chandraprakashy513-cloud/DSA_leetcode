class Solution {
    public static void marge(int[]arr,int l,int mid ,int r)
    {
        int n1=mid-l+1;
        int n2=r-mid;
        int left[] = new int[n1];
        int right[] = new int[n2];
        for(int i=0;i<n1;i++)
        {
            left[i] = arr[l+i];
        }
        for(int i=0;i<n2;i++)
        {
            right[i] = arr[mid+1+i];
        }
        int i=0;
        int j=0;
        int k=l;
        while(i<n1 && j<n2)
        {
            if(left[i]<right[j])
            {
                arr[k] = left[i];
                i++;
                k++;
            }
            else
            {
                arr[k] = right [j];
                k++;
                j++;
            }
        }
        while(i<n1)
        {
            arr[k] = left[i];
            k++;
            i++;
        }
        while(j<n2)
        {
            arr[k]=right[j];
            k++;
            j++;
        }
    }
    
    public void mergeSort(int arr[], int l, int r) {
        if(l>=r) return ;
        int mid = l+(r-l)/2;
        mergeSort(arr,l,mid);
        mergeSort(arr,mid+1,r);
        marge(arr,l,mid,r);
    }

    public int[] sortArray(int[] nums) {
        mergeSort(nums,0,nums.length-1);
        return nums;
    }
}