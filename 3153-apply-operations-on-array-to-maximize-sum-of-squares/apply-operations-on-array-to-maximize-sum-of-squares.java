class Solution {
    /**
     3 3 0 2
     */
    public int maxSum(List<Integer> nums, int k) {
        int[] ar = new int[32];
        for (int num: nums) {
            int index = 31;
            while (num > 0) {
                int bit = num & 1;
                if (bit == 1) ar[index]++;
                --index;
                num >>= 1;
            }
            
        }
        long res = 0L;
        int mod = 1_000_000_007;
        for (int i = 0; i < k; ++i) {
            long num = 0L;
            for (int j = 0; j < 32; ++j) {
                int bit = 0;
                if (ar[j] > 0) bit = 1;
                num = (num << 1) | bit;
                if (ar[j] > 0) ar[j]--;
            }
            res = (res + (num * num) % mod) % mod;
        }
        return (int)res;
    }
}