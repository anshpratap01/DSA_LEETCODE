class Solution {
    int dp[][];
    public int solve(String s1, String s2, int n , int m ){
        if( m == 0 ||  n== 0){
            return 0;
        }
        if(dp[n][m] != -1){
            return dp[n][m];
        }

        if(s1.charAt(n-1) == s2.charAt(m-1)){
            dp[n][m] = 1+  solve(s1, s2, n-1, m-1);

        }else{
            int first = solve(s1, s2, n-1 , m);
            int second = solve(s1, s2, n, m-1);
            dp[n][m] =  Math.max(first , second); 
        }
        return dp[n][m];
    

    }
    public int longestCommonSubsequence(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();
        dp = new int[n+1][m+1];
        for(int i = 0; i<=n; i++){
            for(int j = 0; j<=m; j++){
                dp[i][j] = -1;
            }
        }

        return solve(s1, s2, n, m);

        

        
    }
}