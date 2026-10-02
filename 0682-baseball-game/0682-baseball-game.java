import java.util.Stack;

class Solution {
    public int calPoints(String[] arr) {
        int n = arr.length;
        Stack st = new Stack<>();
        
        for (int i = 0; i < n; i++) {
            String s = arr[i];
            if (s.equals("C")) {
                st.pop();
            } else if (s.equals("D")) {
                st.push(2 * (int) st.peek());
            } else if (s.equals("+")) {
                int top = (int) st.pop();
                int secondTop = (int) st.peek();
                int sum = top + secondTop;
                st.push(top);
                st.push(sum);
            } else {
                st.push(Integer.parseInt(s));
            }
        }
        
        int totalSum = 0;
        while (!st.isEmpty()) {
            totalSum += (int) st.pop();
        }
        return totalSum;
    }
}