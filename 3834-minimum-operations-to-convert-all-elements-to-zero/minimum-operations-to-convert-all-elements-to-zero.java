class Solution {
    public int minOperations(int[] nums) {
        Stack<Integer> st = new Stack<>();
        int cnt = 0;
        // st.push(nums[0]);
        // cnt = 1;

        for(int i = 0; i<nums.length; i++){
            while(st.size()>0 && nums[i]<st.peek()){
                st.pop();
            }
            if(nums[i] == 0) continue;
            if(st.size() == 0 ||  st.peek()<nums[i]){
                cnt++;
                st.push(nums[i]);
            }
        }
        return cnt;
        
    }
}