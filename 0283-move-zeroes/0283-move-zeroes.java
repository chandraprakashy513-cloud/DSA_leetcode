class Solution {
    public void moveZeroes(int[] nums) {
         int n = nums.length;

        // for(int i=0;i<n-1;i++)
        // {
        //     for(int j=0;j<n-i-1;j++)
        //     {
        //         if(nums[j]== 0)
        //         {
        //               int temp = nums[j];
        //               nums[j]= nums[j+1];
        //               nums[j+1] = temp;
        //         }
        //     }
        // }
        int i=0;
        int j=1;
        while(j<n)
        {
            if(nums[i]!=0)
            {
                j++;
                i++;

            }
           else if(nums[j]!=0)
            {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j++;
            }
            else{
                j++;
            }
        }
    }
}