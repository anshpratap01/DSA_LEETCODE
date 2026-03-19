class Solution {
    int dp[][];
    public int solve(int grid[][] , int n , int m){
        if( n == 0 && m == 0){
            return grid[0][0];

        }
        if(m < 0  ||  n < 0){
            return Integer.MAX_VALUE;
        }
        if(dp[n][m] != -1){
            return dp[n][m];
        }
        dp[n][m ]=  grid[n][m] +  Math.min(solve(grid, n-1, m), solve(grid, n, m-1));
        return dp[n][m];
    }
    public int minPathSum(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        dp = new int[n+1][m+1];
        for(int i = 0; i<=n; i++){
            for(int j = 0;j<=m; j++){
                dp[i][j] = -1;
            }
        }

        return solve(grid,n-1, m-1);
        
    }
}