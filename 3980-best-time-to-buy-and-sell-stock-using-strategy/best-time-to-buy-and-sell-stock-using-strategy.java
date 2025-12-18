class Solution {
    public long maxProfit(int[] prices, int[] strategy, int k) {
        int n = prices.length;
        long op = 0;
        for (int i = 0; i < n; i++) {
            op += (long) strategy[i] * prices[i];
        }

        int h = k / 2;
        long sa = 0;
        long sb = 0;

        for (int i = 0; i < h; i++) {
            sa += -(long) strategy[i] * prices[i];
        }
        for (int i = h; i < k; i++) {
            sb += (1L - strategy[i]) * prices[i];
        }

        long mg = sa + sb;

        for (int i = 1; i <= n - k; i++) {
            sa = sa - (-(long) strategy[i - 1] * prices[i - 1]) + (-(long) strategy[i + h - 1] *            prices[i + h - 1]);
            sb = sb - ((1L - strategy[i + h - 1]) * prices[i + h - 1]) + ((1L - strategy[i + k -             1]) * prices[i + k - 1]);
            mg = Math.max(mg, sa + sb);
        }

        return op + Math.max(0, mg);
    }
}