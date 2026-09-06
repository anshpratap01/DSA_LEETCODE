
class Solution {
    public int numDistinct(String s, String t) {
        int n = s.length();
        int m = t.length();

        // dp[j] = number of ways to form t[0...j-1]
        int[] dp = new int[m + 1];

        // Empty t can always be formed in exactly one way.
        dp[0] = 1;

        for (int i = 0; i < n; i++) {
            // Traverse backwards so s[i] is used at most once.
            for (int j = m; j >= 1; j--) {
                if (s.charAt(i) == t.charAt(j - 1)) {
                    dp[j] += dp[j - 1];
                }
            }
        }

        return dp[m];
    }
}