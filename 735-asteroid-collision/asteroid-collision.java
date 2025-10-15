class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();

        for (int a : asteroids) {
            boolean destroyed = false;

            while (!st.isEmpty() && st.peek() > 0 && a < 0) {
                int top = st.peek();
                if (top < -a) {
                    st.pop(); // top asteroid explodes
                    continue; // keep checking for more collisions
                } else if (top == -a) {
                    st.pop(); // both explode
                }
                destroyed = true; // current one destroyed
                break;
            }

            if (!destroyed) {
                st.push(a);
            }
        }

        // convert stack to array
        int[] result = new int[st.size()];
        for (int i = st.size() - 1; i >= 0; i--) {
            result[i] = st.pop();
        }
        return result;
    }
}
