class Solution {
    public int maxScore(int[] nums, int k) {
        int rightsum = 0;
        int leftsum = 0;
        int n = nums.length;
        int maxsum = 0;
        int idx = nums.length-1;
        for(int i = 0; i<k; i++){
            leftsum = leftsum+nums[i];
        }
        maxsum = leftsum;

        for(int i = k-1; i>=0; i--){
            leftsum = leftsum-nums[i];
            rightsum = rightsum+nums[idx--];
            maxsum = Math.max(maxsum,leftsum+rightsum);
        }
        return maxsum;
    }
}