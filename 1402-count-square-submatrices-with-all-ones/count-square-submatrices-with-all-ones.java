class Solution {
    int[][] dp;

    public int solve(int[][] matrix, int i, int j){
        if(i < 0 || j < 0) return 0;

        if(matrix[i][j] == 0) return 0;

        if(dp[i][j] != -1) return dp[i][j];

        int top = solve(matrix, i-1, j);
        int left = solve(matrix, i, j-1);
        int diag = solve(matrix, i-1, j-1);

        return dp[i][j] = 1 + Math.min(top, Math.min(left, diag));
    }

    public int countSquares(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        dp = new int[m][n];
        for(int[] row : dp) Arrays.fill(row, -1);

        int total = 0;

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                total += solve(matrix, i, j);
            }
        }

        return total;
    }
}