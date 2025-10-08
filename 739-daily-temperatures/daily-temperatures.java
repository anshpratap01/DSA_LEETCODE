class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack <Integer> st = new Stack<>();
        int n = temperatures.length;
        int res[] = new int[temperatures.length];

        for(int i = 0; i<n; i++){
            while(!st.isEmpty() && temperatures[i]>temperatures[st.peek()]){
                int index = st.pop();
                res[index] = i-index;
            }
            st.push(i);
        }
        return res;
        
    }
}