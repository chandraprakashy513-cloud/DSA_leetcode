class Solution {
    public static int digit(int n)
    {
        int square=0,temp;
        while(n>0)
        {
            temp=n%10;
            square = square+(temp*temp);
            n=n/10;
        }
        return square;
    }
    public boolean isHappy(int n) {
            while (n != 1) {
            n = digit(n);
            if (n == 4) {
                return false;
            }
        }

        return true;
    }
}