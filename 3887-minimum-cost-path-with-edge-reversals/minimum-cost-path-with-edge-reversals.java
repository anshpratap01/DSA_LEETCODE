// import java.util.*;

public class Solution {
    public int minCost(int n, int[][] es) {
        List<int[]>[] g = new ArrayList[n];
        Arrays.setAll(g, i -> new ArrayList<>());
        for (int[] e : es) {
            g[e[0]].add(new int[]{e[1], e[2]});
            g[e[1]].add(new int[]{e[0], e[2] * 2});
        }
        int[] d = new int[n];
        Arrays.fill(d, Integer.MAX_VALUE);
        d[0] = 0;
        PriorityQueue<int[]> q = new PriorityQueue<>((a, b) -> Integer.compare(a[1], b[1]));
        q.offer(new int[]{0, 0});
        while (!q.isEmpty()) {
            int[] c = q.poll();
            int u = c[0];
            if (c[1] > d[u]) continue;
            if (u == n - 1) return c[1];
            for (int[] v : g[u]) {
                if (d[u] + v[1] < d[v[0]]) {
                    d[v[0]] = d[u] + v[1];
                    q.offer(new int[]{v[0], d[v[0]]});
                }
            }
        }
        return -1;
    }
}