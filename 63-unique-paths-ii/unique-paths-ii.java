class Solution {
    int dp[][];
    public int solve(int grid[][] , int n ,int m){
         if(m < 0 || n < 0){
            return 0;
        }
        if(grid[n][m] == 1){
            return 0;
        }
       
        if(m == 0 && n == 0){
            return 1;
        }
        if(dp[n][m] != -1){
            return dp[n][m];
        }
        
        dp[n][m] =  solve(grid , n-1 , m) + solve(grid , n , m-1);
        return dp[n][m];
    }
    public int uniquePathsWithObstacles(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        dp = new int[n+1][m+1];
        for(int i = 0; i<=n; i++){
            for(int j = 0; j<=m; j++){
              dp[i][j] = -1;
            }
        }
        return solve(grid , n-1 , m-1);

        
    }
}