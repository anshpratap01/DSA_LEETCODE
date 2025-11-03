class Solution {
        public int lastRemaining(int n) {
        Stack<Integer> st = new Stack<>();
        while (n > 1) {
            n = n/ 2;
            st.push(n);
        }
        int result = 1;
        while (!st.isEmpty()) {
            result = 2 * (1 + st.pop() - result);
        }
        return result;
    }
}