class Solution {
    int n;
    Integer[][] dp;
    public int solve(List<List<Integer>> arr, int row , int col){
        if(row == n-1){
            return arr.get(row).get(col);
        }
        if (dp[row][col] != null) return dp[row][col];
        //int min = Integer.MAX_VALUE;
        int curr = arr.get(row).get(col) ;
        int first = solve(arr , row+1 , col);
        int second = solve(arr , row+1 , col+1);
        int min = Math.min(first, second);
         
        dp[row][col] =  min+curr;
        return dp[row][col];
        

    }
    public int minimumTotal(List<List<Integer>> arr) {
        n = arr.size();
        dp = new Integer[n][n];
        
        return solve(arr ,0, 0);
        
    }
}