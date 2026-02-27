class Solution {
    int dp[][];
    public int cnt(int coins[] , int sum , int n){
        if(sum == 0) return 0;
        if( n == 0 && sum > 0){
            return Integer.MAX_VALUE - 1;
        }
        if(dp[n][sum] != -1){
            return dp[n][sum];
        }

        if(coins[n-1] <= sum){
            int take = 1+ cnt(coins , sum - coins[n-1] , n);
            int notake = cnt(coins , sum , n-1);
           dp[n][sum] =  Math.min( take ,  notake);
          
           
        }else{
        dp[n][sum] =  cnt(coins , sum , n-1);
        }
        return dp[n][sum];
        
        
    }
    public int coinChange(int[] coins, int sum) {
        int n = coins.length;
        dp = new int[n+1][sum+1];
        for(int i = 0; i<=n; i++){
            for(int j = 0; j<=sum; j++){
                dp[i][j]  = -1;
            }
        }
       
        
        int ans  =  cnt(coins , sum , n);
        // System.out.println(ans);
        // System.out.print(Integer.MAX_VALUE);
        if(ans >= Integer.MAX_VALUE-1) return -1;
            
        
        return ans;
    }
}