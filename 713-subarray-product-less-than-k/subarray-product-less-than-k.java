class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k <= 1) return 0;
        int i = 0;
        int j = 0;
        int pro = 1;
        int cnt = 0;
         
        while(j<nums.length){
            pro *= nums[j];

            
            while(pro >= k){
                pro /= nums[i];
                i++;
            }

            cnt += (j-i+1);
            j++;
           

        }
        return cnt;
    }
}