class Solution {
    public int intersectionSizeTwo(int[][] intervals) {
         Arrays.sort(intervals, (a, b) -> {
            if (a[1] == b[1]) return b[0] - a[0];
            return a[1] - b[1];
        });

        List<Integer> chosen = new ArrayList<>();

        for (int[] in : intervals) {
            int start = in[0], end = in[1];

            // Count how many chosen elements are inside this interval
            int count = 0;
            for (int i = chosen.size() - 1; i >= 0; i--) {
                int x = chosen.get(i);
                if (x >= start && x <= end) count++;
                if (x < start || count == 2) break;
            }

            // If interval has zero points → add two largest possible
            if (count == 0) {
                chosen.add(end - 1);
                chosen.add(end);
            }
            // If interval has one point → add largest possible
            else if (count == 1) {
                chosen.add(end);
            }
        }

        return chosen.size();
    }
}