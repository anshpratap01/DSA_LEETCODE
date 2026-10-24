class Solution {
    public int countDaysTogether(String a1, String l1, String a2, String l2) {
        int[] d = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int s1 = g(a1, d);
        int e1 = g(l1, d);
        int s2 = g(a2, d);
        int e2 = g(l2, d);
        int s = Math.max(s1, s2);
        int e = Math.min(e1, e2);
        return Math.max(0, e - s + 1);
    }

    private int g(String s, int[] d) {
        int m = Integer.parseInt(s.substring(0, 2));
        int day = Integer.parseInt(s.substring(3));
        int r = 0;
        for (int i = 1; i < m; i++) {
            r += d[i];
        }
        return r + day;
    }
}