class Solution {
    public int absDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int small = 0;
        int large  = 0;
        int n = nums.length;
        if(nums.length == 1) return 0;

        for(int i= 0; i<k; i++){
            small = small+nums[i];
        }
        for(int i = n-1; i>=n-k; i--){
            large = large+nums[i];
        }
        return Math.abs(large-small);

        
    }
}