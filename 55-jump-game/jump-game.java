class Solution {
    int n;
    int dp[];
    public  boolean solve(int arr[] , int idx){
        if(idx >= n-1){
            return true;
        }
        if(dp[idx] != -1){
            return dp[idx] == 1;
        }
        for(int i = 1; i<=arr[idx]; i++){
        if(solve(arr , idx+i)) {
        dp[idx] = 1;
         return true;
        }
        }
        dp[idx] = 0;
        return false;
    }
    public boolean canJump(int[] nums) {
        n = nums.length;
        dp = new int[n+1];
        for(int i= 0; i<=n; i++){
            dp[i] = -1;
        }
        return solve(nums , 0);
        
    }
}