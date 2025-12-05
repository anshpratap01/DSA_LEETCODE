class Solution {
    public int countPartitions(int[] nums) {
        int total = 0;
        for(int x : nums) total += x;

        
        if(total % 2 != 0) return 0;

        int lsum = 0;
        int count = 0;

      
        for(int i = 0; i < nums.length - 1; i++){
            lsum += nums[i];
            count++;   
        }
        return count;
    }
}
