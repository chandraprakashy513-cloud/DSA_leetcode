class Solution {
    public static boolean sameAs(char a, char b)
    {
        return a==b ;
    }
    
    public static String reverse(Stack<Character> st1, Stack<Character> st2)
    {
        while(st1.size()!=0)
        {
            char top=st1.pop();
            st2.push(top);
        }
        StringBuilder ans = new StringBuilder();
        while(st2.size() != 0)
        {
            ans.append(st2.pop());
        }
        return ans.toString();
    }
    public String removeDuplicates(String s) {
        int n = s.length();
        Stack<Character> st = new Stack<>();
        for(int i=0;i<n;i++)
        {
            char ch = s.charAt(i);
            if(st.size()==0) st.push(ch);
            else
            {
                char top=st.peek();
                if(sameAs(top,ch))
                {
                    st.pop();
                }
                else
                {
                    st.push(ch);
                }
            }
        }
        Stack<Character> st1=new Stack<>();
        return reverse(st,st1);
    }
}