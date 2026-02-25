class Solution {
    int dp[][];
    public int issubset(int arr[] , int subsetsum , int n){
        if(n==0){
            if(subsetsum == 0) return 1;
            else return 0;
        }
        if(dp[n][subsetsum] != -1){
            return dp[n][subsetsum];
        }
        
        if(arr[n-1] <= subsetsum){
            int take = issubset(arr,subsetsum-arr[n-1],n-1);
            int notake = issubset(arr,subsetsum , n-1);
            dp[n][subsetsum] = take + notake;
            
        }else{
        dp[n][subsetsum]  = issubset(arr,subsetsum ,n-1);
        }
        return dp[n][subsetsum];
    }
    public int findTargetSumWays(int[] arr, int diff /* target tha idhr pr wo mindiffsechange kiya*/) {
        int sum = 0;
        // if(arr[0] == 1000) return 1;
        // if(diff < 0 ) return 0;
        int n = arr.length;
        
        for(int i = 0; i<arr.length; i++){
            sum = sum+arr[i];
        }
        
        int subsetsum = (sum+diff)/2;
        if (Math.abs(diff) > sum) return 0;
        if((sum+diff)%2 != 0) return 0;
        dp = new int[n+1][subsetsum+1];
        for(int i = 0; i<=n; i++){
            for(int j = 0; j<=subsetsum; j++){
                dp[i][j] = -1;
            }
        }
        
        return issubset(arr,subsetsum,n);
        
    }
}