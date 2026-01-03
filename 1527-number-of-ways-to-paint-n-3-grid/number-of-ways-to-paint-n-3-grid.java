class Solution {
    public int numOfWays(int n) {
        long a = 6;
        long b = 6;
        long M = 1_000_000_007;
        for (int i = 2; i <= n; i++) {
            long t = a;
            a = (2 * a + 2 * b) % M;
            b = (2 * t + 3 * b) % M;
        }
        return (int) ((a + b) % M);
    }
}