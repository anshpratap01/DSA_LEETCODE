class Solution {
    int dp[];
    public int solve(int cost[] , int idx){
        if(idx == 1 || idx == 0){
            return cost[idx];

        }
        if(dp[idx] != -1){
            return dp[idx];
        }
        dp[idx] = cost[idx] + Math.min(solve(cost , idx-1) , solve(cost, idx-2));
        return dp[idx];
    }
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        dp = new int[n+1];
        for(int i = 0; i<=n; i++){
            dp[i] = -1;
        }
        return Math.min(solve(cost , n-1) , solve(cost , n-2));
        
    }
}