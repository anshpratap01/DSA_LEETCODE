class StockSpanner {
   Stack<Integer> st = new Stack();
   ArrayList<Integer> prices;
   int index;
    public StockSpanner() {
        prices = new ArrayList<>();
        index = 0;
        
    }
    
    public int next(int price) {
        prices.add(price);
        while (!st.isEmpty() &&  prices.get(st.peek())<=price){
            st.pop();
        }
        int span;
        if (st.isEmpty()) {
                span = index + 1;
            } else {
                span = index - st.peek();
            }

            
            st.push(index);
            index++;
            return span;
        }
        
    }


/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */