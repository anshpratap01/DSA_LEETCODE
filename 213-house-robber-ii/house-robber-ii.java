class Solution {
    int dp[];
    int dp2[];
    public int solver2(int nums[] , int n){
        if(n <=0 ){
            return 0;
            
        }
         if(dp2[n] != -1){
            return dp2[n];
         }

        int x = nums[n-1]  + solver2(nums,n-2);
        int y = solver2(nums , n-1);
        dp2[n] =  Math.max(x,y);
        return dp2[n];

    }
    public int solver(int nums[] , int n){
        if(n <= 1){
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
        if (n == 1) {
            return nums[0];
        }
        dp = new int[n+1];
        dp2 =  new int[n+1];
        
        for(int i = 0; i<=n; i++){
            dp[i] = -1;
            dp2[i] = -1;
        }

        int first = solver2(nums , n-1);
        int second = solver(nums , n);
         return Math.max(first, second);
        
    }
}