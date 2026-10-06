class Solution {
    public int[] asteroidCollision(int[] arr) {
        Stack<Integer> st = new Stack<>();

        for(int i = 0; i<arr.length; i++){
            while(st.size() > 0 && st.peek() > 0 && arr[i] < 0){
                int sum = arr[i] + st.peek();

                if(sum > 0){
                    arr[i] = 0;
                }else if(sum < 0){
                    st.pop();
                }else if(sum == 0){
                    arr[i] = 0;
                    st.pop();
                }
            }
            if(arr[i] != 0){
                st.push(arr[i]);
            }
        }

            int n = st.size();
            int ans[] = new int[n];
            for(int i = n-1; i>=0; i--){
            ans[i] = st.pop();

            }
        
        return ans;
        
    }
}