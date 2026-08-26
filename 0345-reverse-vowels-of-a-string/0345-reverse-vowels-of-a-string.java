class Solution {
    public boolean isvowel(char c)
    {
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
        {
            return true;
        }
        return false;
    }
    public String reverseVowels(String s) {
        char arr[]=s.toCharArray();
        int start=0;
        int last=arr.length-1;
        while(start<last)
        {
            while(start<last && !isvowel(arr[start]))
            {
                start++;
            }
            while(start<last && !isvowel(arr[last]))
            {
                last--;
            }
            if(start<last)
            {
                char temp = arr[start];
                arr[start] = arr[last];
                arr[last] = temp;
                start++;
                last--;
            }
        }
        return new String(arr);
    }
}