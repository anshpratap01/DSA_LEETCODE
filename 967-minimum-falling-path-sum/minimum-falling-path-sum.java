class Solution {
    
    int n;
    Integer[][] dp;

    public int solve(int arr[][] , int row , int col){
        if(col < 0 || col >= n) return Integer.MAX_VALUE;

        if(row == n-1){
            return arr[row][col];
        }

        if(dp[row][col] != null) return dp[row][col];

        int sum = arr[row][col];

        int left = solve(arr, row + 1, col - 1);
        int down = solve(arr, row + 1, col);
        int right = solve(arr, row + 1, col + 1);

        return dp[row][col] = sum + Math.min(left, Math.min(down, right));
    }

    public int minFallingPathSum(int[][] arr) {
        n = arr.length;
        dp = new Integer[n][n];

        int min = Integer.MAX_VALUE;
        for(int col = 0; col < n; col++){
            min = Math.min(min, solve(arr, 0, col));
        }

        return min;
    }
}