import java.util.*;

class Solution {
    private int x;
    private long tot = 0L;
    private Map<Integer, Integer> f;
    private final TreeSet<int[]> hi = new TreeSet<>((a, b) -> a[0] == b[0] ? a[1] - b[1] : a[0] - b[0]);
    private final TreeSet<int[]> lo = new TreeSet<>((a, b) -> a[0] == b[0] ? a[1] - b[1] : a[0] - b[0]);

    public long[] findXSum(int[] a, int k, int x) {
        int n = a.length;
        this.x = x;
        f = new HashMap<>(n);
        long[] ans = new long[n - k + 1];
        for (int i = 0; i < n; i++) {
            int c = f.merge(a[i], 1, Integer::sum);
            rem(c - 1, a[i]);
            add(c, a[i]);
            if (i + 1 >= k) {
                ans[i - k + 1] = tot;
                c = f.merge(a[i - k + 1], -1, Integer::sum);
                rem(c + 1, a[i - k + 1]);
                add(c, a[i - k + 1]);
            }
        }
        return ans;
    }

    private void add(int c, int v) {
        if (c == 0) return;
        int[] p = new int[]{c, v};
        if (hi.size() < x) {
            hi.add(p);
            tot += 1L * c * v;
            return;
        }
        int[] t = hi.first();
        if (t[0] > c || (t[0] == c && t[1] >= v)) {
            lo.add(p);
            return;
        }
        tot += 1L * c * v - 1L * t[0] * t[1];
        lo.add(hi.pollFirst());
        hi.add(p);
    }

    private void rem(int c, int v) {
        if (c == 0) return;
        int[] p = new int[]{c, v};
        if (lo.remove(p)) return;
        if (hi.remove(p)) tot -= 1L * c * v;
        if (lo.isEmpty()) return;
        int[] t = lo.pollLast();
        tot += 1L * t[0] * t[1];
        hi.add(t);
    }
}
