class Solution {
    public int mostBooked(int n, int[][] meetings) {
        Arrays.sort(meetings, (a, b) -> Integer.compare(a[0], b[0]));
        
        PriorityQueue<Integer> free = new PriorityQueue<>();
        PriorityQueue<long[]> busy = new PriorityQueue<>((a, b) -> 
            a[0] == b[0] ? Long.compare(a[1], b[1]) : Long.compare(a[0], b[0])
        );
        
        
        for (int i = 0; i < n; i++) free.offer(i);
        
        int[] cnt = new int[n];
        
        for (int[] m : meetings) {
            long start = m[0], end = m[1];
            
            while (!busy.isEmpty() && busy.peek()[0] <= start) {
                free.offer((int)busy.poll()[1]);
            }
            
            if (free.isEmpty()) {
                long[] next = busy.poll();
                cnt[(int)next[1]]++;
                busy.offer(new long[]{next[0] + (end - start), next[1]});
            } else {
                int r = free.poll();
                cnt[r]++;
                busy.offer(new long[]{end, r});
            }
        }
        
        int max = 0, res = 0;
        for (int i = 0; i < n; i++) {
            if (cnt[i] > max) {
                max = cnt[i];
                res = i;
            }
        }
        
        return res;
        
    }
}