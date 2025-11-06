import java.util.*;

class Solution {
    public int[] processQueries(int c, int[][] connections, int[][] queries) {
        // DSU init (1-based)
        int[] parent = new int[c + 1];
        int[] size = new int[c + 1];
        for (int i = 1; i <= c; i++) {
            parent[i] = i;
            size[i] = 1;
        }

        // union all connections
        for (int[] e : connections) {
            union(e[0], e[1], parent, size);
        }

        // build a TreeSet of online nodes for each component root
        Map<Integer, TreeSet<Integer>> comp = new HashMap<>();
        for (int i = 1; i <= c; i++) {
            int r = find(i, parent);
            comp.computeIfAbsent(r, k -> new TreeSet<>()).add(i);
        }

        boolean[] online = new boolean[c + 1];
        Arrays.fill(online, true);

        ArrayList<Integer> out = new ArrayList<>();
        for (int[] q : queries) {
            int type = q[0], x = q[1];
            int r = find(x, parent);

            if (type == 1) { // maintenance check
                if (online[x]) {
                    out.add(x);
                } else {
                    TreeSet<Integer> set = comp.get(r);
                    if (set == null || set.isEmpty()) out.add(-1);
                    else out.add(set.first());
                }
            } else { // type == 2 -> go offline
                if (online[x]) {
                    online[x] = false;
                    TreeSet<Integer> set = comp.get(r);
                    if (set != null) set.remove(x);
                }
            }
        }

        // convert to int[]
        int[] ans = new int[out.size()];
        for (int i = 0; i < out.size(); i++) ans[i] = out.get(i);
        return ans;
    }

    private int find(int x, int[] parent) {
        if (parent[x] != x) parent[x] = find(parent[x], parent);
        return parent[x];
    }

    private void union(int a, int b, int[] parent, int[] size) {
        a = find(a, parent);
        b = find(b, parent);
        if (a == b) return;
        if (size[a] < size[b]) {
            int tmp = a; a = b; b = tmp;
        }
        parent[b] = a;
        size[a] += size[b];
    }
}
