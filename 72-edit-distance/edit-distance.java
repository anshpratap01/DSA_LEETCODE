class Solution {
    int dp[][];
    public int solve(String s1, String s2,int i , int j){
        if(i<0) return j+1;
        if(j<0) return i+1;
        if(dp[i][j] != -1){
            return dp[i][j];
        }
        if(s1.charAt(i) == s2.charAt(j)){
            dp[i][j] = solve(s1,s2,i-1,j-1);
        }else{
        int insert = solve(s1,s2,i-1,j);
        int delete = solve(s1,s2,i,j-1);
        int replace = solve(s1,s2,i-1,j-1);

        dp[i][j] = 1+ Math.min(insert,Math.min(delete,replace));
        }
        return dp[i][j];
    }
    public int minDistance(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();

         dp = new int[n][m];
        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                dp[i][j] = -1;
            }
        }
         return solve(word1,word2,n-1,m-1);
        
    }
}