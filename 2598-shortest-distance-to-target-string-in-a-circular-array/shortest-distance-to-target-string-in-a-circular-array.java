class Solution {
    public int closestTarget(String[] words, String target, int idx) {
        int n = words.length;

        int rightmin = Integer.MAX_VALUE;
        int leftmin = Integer.MAX_VALUE;

        // Move right (clockwise)
        for (int step = 0; step < n; step++) {
            int i = (idx + step) % n;
            if (words[i].equals(target)) {
                rightmin = step;
                break;
            }
        }

        // Move left (anticlockwise)
        for (int step = 0; step < n; step++) {
            int i = (idx - step + n) % n;
            if (words[i].equals(target)) {
                leftmin = step;
                break;
            }
        }

        int ans = Math.min(leftmin, rightmin);
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}