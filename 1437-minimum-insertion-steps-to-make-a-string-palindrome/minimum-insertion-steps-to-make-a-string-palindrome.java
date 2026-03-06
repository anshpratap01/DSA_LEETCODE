class Solution {
    int dp[][];
    public int lcs(String s , String rev , int n , int m){
        if(m == 0 ||  n == 0){
            return 0;
        }
        if(dp[n][m]  != -1){
            return dp[n][m];
        }
        if(s.charAt(n-1) == rev.charAt(m-1)){
            dp[n][m] = 1 + lcs(s, rev,n-1,m-1);
        }else{
        int take = lcs(s,rev,n-1,m);
        int notake = lcs(s,rev,n,m-1);
        dp[n][m] =  Math.max(take , notake);
        }
        return dp[n][m];
    }
    public int minInsertions(String s) {
    String rev = "";
    for(int i = 0; i<s.length(); i++){
        char ch = s.charAt(i);
        rev =  ch + rev;
    }
     int n = s.length();
     int m = rev.length();
     dp = new int[n+1][m+1];
     for(int i= 0; i<=n; i++){
         for(int j = 0;j<=m; j++){
             dp[i][j]  = -1;
         }
     }
     // same as finding the lps(longest palandromic subsequences)
     int len =  lcs(s,rev,n,m);
     //  main part for insertaion ans well as deletion 
     return n-len;
        
    }
}