class Solution {
     int dp[];
     public int ans(int n){
         if(n == 1 || n==2) {
            return n;
            
        }
        if(dp[n] != -1){
            return dp[n];
        }
        dp[n] = ans(n-1) + ans(n-2);
        return dp[n];

     }
    public int climbStairs(int n) {

        dp = new int[n+1];
        for(int i = 0; i<=n; i++){
            dp[i] = -1;
        }

        return ans(n);
        
    }
}