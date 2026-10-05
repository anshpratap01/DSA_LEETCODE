class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Integer> st = new Stack<>();
        st.push(0);

        for (char ch : s.toCharArray()) {

            if (ch == '(') {
                st.push(0);
            } else {
                int v = st.pop();

                int score = 1;
                if (v == 0) {
                    score = 1;
                } else {
                    score = 2 * v;
                }

                st.push(st.pop() + score);
            }
        }

        return st.pop();
    }
}