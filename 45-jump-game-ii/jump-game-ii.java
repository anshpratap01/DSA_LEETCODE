class Solution {
    int n;
    int[] dp;

    public int solve(int[] arr, int idx) {
        if (idx >= n - 1) return 0;

        if (dp[idx] != -1) return dp[idx];

        int minJumps = Integer.MAX_VALUE;

        for (int step = 1; step <= arr[idx]; step++) {
            int next = solve(arr, idx + step);

            if (next != Integer.MAX_VALUE) {
                minJumps = Math.min(minJumps, 1 + next);
            }
        }

        dp[idx] = minJumps;
        return dp[idx];
    }

    public int jump(int[] nums) {
        n = nums.length;
        dp = new int[n];

        for (int i = 0; i < n; i++) dp[i] = -1;

        return solve(nums, 0);
    }
}