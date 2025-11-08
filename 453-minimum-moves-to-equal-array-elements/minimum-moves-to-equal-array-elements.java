class Solution {
    public int minMoves(int[] nums) {
        int min = nums[0];
        for(int i = 1; i<nums.length; i++){
             min = Math.min(nums[i],min);
        }
        int res = 0;
        for(int i = 0; i<nums.length; i++){
            res = res + nums[i] - min;
        }
        return res;

        
    }
}