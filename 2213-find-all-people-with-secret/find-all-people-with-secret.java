import java.util.*;

class Solution {
    int[] p;

    public List<Integer> findAllPeople(int n, int[][] m, int f) {
        p = new int[n];
        for (int i = 0; i < n; i++) p[i] = i;

        union(0, f);

        Arrays.sort(m, (a, b) -> a[2] - b[2]);

        int i = 0, l = m.length;
        while (i < l) {
            int t = m[i][2];
            List<Integer> q = new ArrayList<>();
            while (i < l && m[i][2] == t) {
                union(m[i][0], m[i][1]);
                q.add(m[i][0]);
                q.add(m[i][1]);
                i++;
            }
            for (int x : q) {
                if (find(x) != find(0)) p[x] = x;
            }
        }

        List<Integer> res = new ArrayList<>();
        for (int j = 0; j < n; j++) {
            if (find(j) == find(0)) res.add(j);
        }
        return res;
    }

    int find(int i) {
        if (p[i] == i) return i;
        return p[i] = find(p[i]);
    }

    void union(int i, int j) {
        int r1 = find(i);
        int r2 = find(j);
        if (r1 != r2) {
            if (r1 == find(0)) p[r2] = r1;
            else p[r1] = r2;
        }
    }
}