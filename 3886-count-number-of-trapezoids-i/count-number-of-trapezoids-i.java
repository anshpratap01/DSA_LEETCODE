class Solution {
    public int countTrapezoids(int[][] p) {
        long M = 1_000_000_007;
        Map<Integer, Integer> m = new HashMap<>();
        
        for (int[] i : p) {
            m.put(i[1], m.getOrDefault(i[1], 0) + 1);
        }

        long s = 0, sq = 0;

        for (int c : m.values()) {
            if (c < 2) continue;
            long w = (long) c * (c - 1) / 2 % M;
            s = (s + w) % M;
            sq = (sq + w * w) % M;
        }

        return (int) (((s * s - sq + M) % M) * 500000004 % M);
        
    }
}