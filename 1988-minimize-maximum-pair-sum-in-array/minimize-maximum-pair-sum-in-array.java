class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int  start  = 0;
        int high = n-1;
        int maxsum = Integer.MIN_VALUE;
        while(start<high){
            int sum = nums[start] + nums[high];
            if(sum>maxsum){
                maxsum = sum;
                
            }
            high--;
            start++;
            System.out.println(maxsum);

        }
        return maxsum;
    }
}