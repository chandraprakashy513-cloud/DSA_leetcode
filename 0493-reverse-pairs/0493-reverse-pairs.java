class Solution {
    static int count;
    public static void inversion(int a[],int []b)
    {
        int i=0,j=0;
        while( i<a.length && j<b.length)
        {
            if((long)a[i] > ((long)2*(long)b[j]))
            {
                count+=(a.length - i);
                j++;
            }
            else 
            {
                i++;
            }
        }
    }
    public int reversePairs(int[] nums) {
       count =0;
       margeSort(nums);
       return (int)count;
    }
    private static void margeSort(int []arr)
    {
        int n = arr.length;
        if(n<=1) return;
        int []a = new int[n/2];
        int []b = new int[n-n/2];
        int idx=0;
        for(int i=0;i<a.length;i++)
        {
            a[i] = arr[idx];
            idx++;
        }
        for(int i=0;i<b.length;i++)
        {
            b[i] = arr[idx];
            idx++;
        }
        margeSort(a);
        margeSort(b);
        inversion(a,b);
        marge(arr,a,b);
    }
    public static void marge(int arr[],int a[],int b[])
    {
        int i=0,j=0,k=0;
        while(i< a.length && j<b.length)
        {
            if(a[i] <= b[j])
            {
                arr[k] = a[i];
                k++;
                i++;
            }
            else
            {
                arr[k]=b[j];
                k++;
                j++;
            }
        }
        while(i<a.length)
        {
            arr[k] = a[i];
            k++;
            i++;
        }
        while(j<b.length)
        {
            arr[k] = b[j];
            k++;
            j++;
        }
    } 
}