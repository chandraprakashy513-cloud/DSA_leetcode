class Solution {
    public static void swap(int arr[],int idx,int i)
    {
        int temp =arr[i];
         arr[i] = arr[idx];
        arr[idx] = temp;
    }
    public int[] findErrorNums(int[] arr) {
    int ans[] = new int[2];
    int n= arr.length;
    int i=0;
    while(i<n)
    {
        int idx = arr[i]-1;
        if(arr[i] == arr[idx]) i++;
        else
        {
           if (arr[i] == arr[idx]) {
            ans[1]=arr[i];
           }
            swap(arr,idx,i);
        }
    }
    for(int j=0;j<n;j++)
    {
        if(arr[j] != j+1) 
        {
            ans[0] = arr[j]; 
            ans[1]= j+1;
            break;
        }
    }
    return ans;
    }
}