class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int idx = 0;
        int ans  = Integer.MAX_VALUE;
        for(int i = 0; i<nums.length; i++){
            if(nums[i] == target){
                idx = i;
             ans = Math.min(Math.abs(idx - start) , ans);
            }
        }
        return ans;
        
    }
}