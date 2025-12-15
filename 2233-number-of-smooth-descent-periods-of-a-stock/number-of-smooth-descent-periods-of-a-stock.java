class Solution {
    public long getDescentPeriods(int[] prices) {
        long ans = 1;
        long st = 1;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] == prices[i - 1] - 1) {
                st++;
            } else {
                st = 1;
            }
            ans += st;
        }
        return ans;
        
    }
}