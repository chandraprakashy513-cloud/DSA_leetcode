class Solution {
    public String toHex(int num) {

        if (num == 0)
            return "0";

        StringBuilder ans = new StringBuilder();

        char[] hex = "0123456789abcdef".toCharArray();

        while (num != 0) {
            int rem = num & 15;   // num % 16
            ans.append(hex[rem]);
            num = num >>> 4;      // unsigned right shift
        }

        return ans.reverse().toString();
    }
}