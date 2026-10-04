class StockSpanner {

    class Pair {
        int val;
        int index;

        Pair(int val, int index) {
            this.val = val;
            this.index = index;
        }
    }

    Stack<Pair> st;
    int index;

    public StockSpanner() {
        st = new Stack<>();
        index = 0;
    }

    public int next(int price) {

        while (st.size() > 0 && price >= st.peek().val) {
            st.pop();
        }

        int span;

        if (st.size() == 0) {
            span = index + 1;
        } else {
            span = index - st.peek().index;
        }

        st.push(new Pair(price, index));
        index++;

        return span;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */