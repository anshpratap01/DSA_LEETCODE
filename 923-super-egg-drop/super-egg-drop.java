class Solution {
    int[][] dp;
    
    public int solve(int e, int f) {
        if (f == 0 || f == 1) return f;
        if (e == 1) return f;
        
        if (dp[e][f] != -1) return dp[e][f];
        
        int min = Integer.MAX_VALUE;
        int low = 1, high = f;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            
            int left = solve(e - 1, mid - 1);
            int right = solve(e, f - mid);
            
            int temp = 1 + Math.max(left, right);
            min = Math.min(min, temp);
            
            if (left < right) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        
        dp[e][f] = min;
        return dp[e][f];
    }
    
    public int superEggDrop(int k, int n) {
        dp = new int[k + 1][n + 1];
        
        for (int i = 0; i <= k; i++) {
            for (int j = 0; j <= n; j++) {
                dp[i][j] = -1;
            }
        }
        
        return solve(k, n);
    }
}