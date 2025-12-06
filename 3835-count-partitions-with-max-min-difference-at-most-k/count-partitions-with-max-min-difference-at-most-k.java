class Solution {
    public int countPartitions(int[] nums, int k) {
        int n = nums.length;
        int m = 1_000_000_007;
        long[] d = new long[n + 2];
        long[] s = new long[n + 2];
        
        d[0] = 1;
        s[1] = 1;
        
        Deque<Integer> mn = new ArrayDeque<>();
        Deque<Integer> mx = new ArrayDeque<>();
        int l = 0;
        
        for (int i = 0; i < n; i++) {
            while (!mn.isEmpty() && nums[mn.peekLast()] >= nums[i]) mn.pollLast();
            mn.offerLast(i);
            
            while (!mx.isEmpty() && nums[mx.peekLast()] <= nums[i]) mx.pollLast();
            mx.offerLast(i);
            
            while (nums[mx.peekFirst()] - nums[mn.peekFirst()] > k) {
                if (mn.peekFirst() == l) mn.pollFirst();
                if (mx.peekFirst() == l) mx.pollFirst();
                l++;
            }
            
            long cur = (s[i + 1] - s[l] + m) % m;
            d[i + 1] = cur;
            s[i + 2] = (s[i + 1] + cur) % m;
        }
        
        return (int) d[n];
        
    }
}