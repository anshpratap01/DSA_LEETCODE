class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        
        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a, b) -> a[0] - b[0]
    );

        for (int i = 0; i < nums.length; i++) {
            pq.add(new int[]{nums[i], i});
            if (pq.size() > k) {
                pq.poll();
            }
        }

        
        int[][] selected = new int[k][2];
        int idx = 0;
        while (!pq.isEmpty()) {
            selected[idx] = pq.poll();
            idx++;
        }

        
        Arrays.sort(selected, (a, b) -> a[1] - b[1]);

       
        int[] ans = new int[k];
        for (int i = 0; i < k; i++) {
            ans[i] = selected[i][0];
        }

        return ans;
    }
}
