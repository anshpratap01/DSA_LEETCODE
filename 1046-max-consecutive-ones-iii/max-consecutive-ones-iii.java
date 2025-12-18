class Solution {
    public int longestOnes(int[] nums, int k) {
        
        int i = 0;
        int j = 0;
        int zero = 0;
        int max = 0;

        while(j<nums.length){
            if(nums[j]== 0){
                zero++;
            }else if(zero > k){
                while(zero >k){
                    if(nums[i] == 0){
                        zero--;
                    }
                    i++;
                }
            }
            if(zero<=k){
                max = Math.max(j-i+1,max);
            }
            j++;
        }
        return max;
    }
}