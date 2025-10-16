class Solution {
    public int[] asteroidCollision(int[] arr) {
        Stack <Integer> st = new Stack<>();
        for(int i = 0; i<arr.length; i++){
            while(st.size()>0 && arr[i]<0 && st.peek()>0){
                int sum = arr[i]+st.peek();

                if(sum<0){
                    st.pop();
                }
                else if(sum>0){
                    arr[i] = 0;
                }else{
                    arr[i] = 0;
                    st.pop();
                }
            }
            if(arr[i] !=  0){
                st.push(arr[i]);
            }
        }
        int n = st.size();
        int res[] = new int[n];
        for(int i = n-1;i>=0; i--){
            res[i] = st.pop();
        }
        return res;
    }
}