class Solution {
    int r = 0;

    private long h(int f, int g, List<List<Integer>> e, int[] c, int d) {
        long s = c[f];
        for (int i : e.get(f)) {
            if (i != g) {
                s += h(i, f, e, c, d);
            }
        }
        if (s % d == 0) {
            r++;
            return 0;
        }
        return s;
    }

    public int maxKDivisibleComponents(int a, int[][] b, int[] c, int d) {
        List<List<Integer>> e = new ArrayList<>();
        for (int i = 0; i < a; i++) {
            e.add(new ArrayList<>());
        }
        for (int[] x : b) {
            e.get(x[0]).add(x[1]);
            e.get(x[1]).add(x[0]);
        }
        h(0, -1, e, c, d);
        return r;
    }
}