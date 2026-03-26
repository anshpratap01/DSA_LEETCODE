class Solution {
    
    int[][] dp;
    int max;

    public int solve(char[][] matrix, int i, int j){
        if(i < 0 || j < 0) return 0;

        if(matrix[i][j] == '0') return 0;

        if(dp[i][j] != -1) return dp[i][j];

        int top = solve(matrix, i-1, j);
        int left = solve(matrix, i, j-1);
        int diag = solve(matrix, i-1, j-1);

        dp[i][j] = 1+  Math.min(top ,Math.min(left , diag));
        
        return dp[i][j];
        
    }
    public int maximalSquare(char[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int max = Integer.MIN_VALUE;

        dp = new int[m][n];
        for(int[] row : dp) Arrays.fill(row, -1);

        int maxside = 0;

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                maxside = Math.max(solve(matrix, i, j), maxside);
                //maxside = Math.max(maxside*maxside , maxside);

            }
        }


        return maxside*maxside;
        
    }
}