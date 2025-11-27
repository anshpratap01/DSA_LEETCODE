class Solution {
    public long maxSubarraySum(int[] nums, int k) {
        long[] minS = new long[k];
        for (int i = 0; i < k; i++) minS[i] = Long.MAX_VALUE;
        minS[0] = 0;

        long curr = 0;
        long max = Long.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            curr += nums[i];
            int rem = (i + 1) % k;

            if (minS[rem] != Long.MAX_VALUE) {
                max = Math.max(max, curr - minS[rem]);
            }
            minS[rem] = Math.min(minS[rem], curr);
        }
        
        return max;
        
    }
}