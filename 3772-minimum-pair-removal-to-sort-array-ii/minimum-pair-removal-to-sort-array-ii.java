class Solution {
    public int minimumPairRemoval(int[] nums) {
        int n = nums.length;
        if (n < 2) return 0;

        long[] v = new long[n];
        int[] R = new int[n];
        int[] L = new int[n];
        boolean[] del = new boolean[n];

        PriorityQueue<long[]> pq = new PriorityQueue<>((a, b) -> {
            int cmp = Long.compare(a[0], b[0]);
            return cmp != 0 ? cmp : Long.compare(a[1], b[1]);
        });

        int bad = 0;

        for (int i = 0; i < n; i++) {
            v[i] = nums[i];
            R[i] = i + 1;
            L[i] = i - 1;
            if (i < n - 1) {
                if (v[i] > nums[i + 1]) bad++;
                pq.offer(new long[]{v[i] + nums[i + 1], i});
            }
        }
        R[n - 1] = -1;

        int ops = 0;

        while (bad > 0 && !pq.isEmpty()) {
            long[] top = pq.poll();
            long s = top[0];
            int i = (int) top[1];
            int j = R[i];

            if (del[i] || j == -1 || v[i] + v[j] != s) continue;

            if (L[i] != -1 && v[L[i]] > v[i]) bad--;
            if (v[i] > v[j]) bad--;
            if (R[j] != -1 && v[j] > v[R[j]]) bad--;

            v[i] = s;
            del[j] = true;
            R[i] = R[j];
            if (R[i] != -1) L[R[i]] = i;

            if (L[i] != -1 && v[L[i]] > v[i]) bad++;
            if (R[i] != -1 && v[i] > v[R[i]]) bad++;

            if (L[i] != -1) pq.offer(new long[]{v[L[i]] + v[i], L[i]});
            if (R[i] != -1) pq.offer(new long[]{v[i] + v[R[i]], i});

            ops++;
        }

        return ops;
        
    }
}