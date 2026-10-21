class Solution {
    public int minElement(int[] arr) {
        int n = arr.length;
        ArrayList<Integer> ans = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        for(int i=0;i<n;i++)
        {
            int sum =0;
            int num = arr[i];
            while(num>0)
            {
                int rem = num%10;
                sum = sum+rem;
                num /=10;
            }
            ans.add(sum);
        }
        for(int i=0;i<n;i++)
        {
            if(ans.get(i)< min)
            {
                min = ans.get(i);
            }
        }
        return min;
       
    }
}