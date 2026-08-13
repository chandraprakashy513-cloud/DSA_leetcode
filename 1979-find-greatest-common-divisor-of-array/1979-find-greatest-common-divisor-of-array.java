class Solution {
    public static int gcd(int a,int b)
    {
        if(b==0) return a;
        return gcd(b,a%b);
    }
    public int findGCD(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        int min = arr[0];
        int max=arr[n-1];
        return gcd(min,max);
        
    }
}