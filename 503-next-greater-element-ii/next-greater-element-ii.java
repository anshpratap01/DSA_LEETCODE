class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        Stack<Integer> st = new Stack<>();

        // Traverse twice (simulate circular array)
        for (int i = 2 * n - 1; i >= 0; i--) {
            int num = nums[i % n];

            // Pop smaller or equal elements
            while (!st.isEmpty() && st.peek() <= num) {
                st.pop();
            }

            // Only fill results in first pass
            if (i < n) {
                if (st.isEmpty()) res[i] = -1;
                else res[i] = st.peek();
            }

            st.push(num);
        }

        return res;
    }
}
