class Solution {
    public int findFinalValue(int[] nums, int original) {
        HashSet<Integer> st = new HashSet<>();
        for(int i = 0; i<nums.length; i++){
            st.add(nums[i]);
        }
        int ans = original;

        while(st.contains(ans)){
        
            ans = ans*2;
            
        }
        return ans;
        
    }
}