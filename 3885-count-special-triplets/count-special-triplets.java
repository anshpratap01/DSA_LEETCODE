class Solution {
    public int specialTriplets(int[] nums) {
        
        int[] l = new int[100001];
        int[] r = new int[100001];
        for (int x : nums) r[x]++;
        long a = 0;
        int m = 1000000007;
        for (int x : nums) {
            r[x]--;
            int t = x * 2;
            if (t <= 100000) {
                a = (a + (long)l[t] * r[t]) % m;
            }
            l[x]++;
        }
        return (int) a;
    }
}