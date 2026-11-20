class Solution {
public int maxSelectedElements(int[] nums) {
        Arrays.sort(nums);
        int ans = 1;
        int[] dp = new int[nums[nums.length - 1] + 3];
        for (int i : nums) {
            dp[i + 1] = Math.max(dp[i + 1], dp[i] + 1);
            dp[i] = Math.max(dp[i], dp[i - 1] + 1);
            ans = Math.max(ans, Math.max(dp[i], dp[i + 1]));
        }
        return ans;
    }
}