class Solution {
    int dp[];
    public boolean perfect(int n){
        int sqrt = (int)Math.sqrt(n);
        return (sqrt*sqrt == n);
    }
    public int solve(int n){
        if(perfect(n)) return 1;
        int min= Integer.MAX_VALUE;
        if(dp[n] != -1){
            return dp[n];
        }

        for(int i= 1; i*i<=n; i++){
            int cnt = solve(i*i) + solve(n-i*i); 
            min = Math.min(min , cnt);
            dp[n] = min;

        }
        return dp[n];
    }
    public int numSquares(int n) {
        //if(perfect(n)) return 1;
        
        dp = new int[n+1];
        for(int i = 0; i<=n; i++){
            dp[i] = -1;
        }
    
        
        return solve(n);
        
    }
}