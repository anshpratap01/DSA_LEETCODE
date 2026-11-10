class Solution {
    int n;
    int func(int step,int[] costs,int[] dp){
        if(step==n) return 0;
        if(dp[step]!=-2) return dp[step];
        int mini=Integer.MAX_VALUE;
        int one=-1,two=-1,three=-1;
        if((step+1)<=n) one = func(step+1,costs,dp);
        if((step+2)<=n) two = func(step+2,costs,dp);
        if((step+3)<=n) three = func(step+3,costs,dp);
        if(one==-1 && two==-1 && three==-1) return dp[step]=-1;
        if(one!=-1) mini=Math.min(mini,costs[step]+1+one);
        if(two!=-1) mini=Math.min(mini,costs[step+1]+4+two);
        if(three!=-1) mini=Math.min(mini,costs[step+2]+9+three);
        return dp[step]=mini;
    }
    public int climbStairs(int n, int[] costs) {
        //1 indexed array
        //start from step 0 with cost 0 i-1 gives
        this.n=n; 
        int[] dp=new int[n+1];
        Arrays.fill(dp,-2);
        return func(0,costs,dp);

    }
}