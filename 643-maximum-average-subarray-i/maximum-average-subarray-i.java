class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double avg = 0;
        int i = 0;
        int j = 0;
        double max = Integer.MIN_VALUE;
        int sum = 0;
        

        while(j<nums.length){
            sum = sum+nums[j];
            if(j-i+1 < k){
                j++;
            }else if(j-i+1 == k){
                double  ans = sum+avg;
                ans = ans/k;
                max = Math.max(ans,max);

                sum = sum-nums[i];
                i++;
                j++;

            }

        }
        return max;

        
    }
}