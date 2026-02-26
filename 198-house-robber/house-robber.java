class Solution {
    int dp[];
    public int solver(int nums[] , int n){
        if(n <= 0){
            return 0;
            
        }
         if(dp[n] != -1){
            return dp[n];
         }

        int x = nums[n-1]  +solver(nums,n-2);
        int y = solver(nums , n-1);
        dp[n] =  Math.max(x,y);
        return dp[n];

    }
    public int rob(int[] nums) {
        int n = nums.length;
        dp = new int[n+1];
        for(int i = 0; i<=n; i++){
            dp[i] = -1;
        }
        return solver(nums , n);
        
    }
}