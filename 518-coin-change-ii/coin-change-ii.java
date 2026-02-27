class Solution {
    int dp[][];
    public int cnt(int coins[] , int sum , int n){
        if(n == 0){
            if(sum == 0) return 1;
            return 0;
        }
        if(dp[n][sum]  != -1){
            return dp[n][sum];
        }
        
        if(coins[n-1] <= sum){
            int take = cnt(coins , sum - coins[n-1] , n);
            int notake = cnt(coins , sum , n-1);
            dp[n][sum] = take +  notake;
        }else{
        dp[n][sum] = cnt(coins , sum , n-1);
        }
        return dp[n][sum];
    }
    public int change(int sum, int[] coins) {
        int n = coins.length;
        dp = new int[n+1][sum+1];
        
        for(int i = 0; i<=n; i++){
            for(int j = 0; j<=sum; j++){
                dp[i][j] = -1;
            }
        }
        return cnt(coins,sum, n);
        
    }
}