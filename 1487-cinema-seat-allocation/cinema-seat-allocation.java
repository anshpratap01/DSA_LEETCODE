class Solution {
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {
        Arrays.sort(reservedSeats, (int[] a, int[] b) -> {
            if (a[0] != b[0]) {
                return a[0] - b[0];
            }
            return a[1] - b[1];
        });

        int m = reservedSeats.length;
        int ans = 0;
        int count = 0;
        int index = 0;

        while (index < m) {
            boolean[] b = new boolean[11];

            int row = reservedSeats[index][0];

            // Mark all reserved seats in this row.
            while (index < m && row == reservedSeats[index][0]) {
                b[reservedSeats[index][1]] = true;
                index++;
            }

            // Family in seats 2, 3, 4, 5
            if (!b[2] && !b[3] && !b[4] && !b[5]) {
                ans++;

                // Seats 4 and 5 overlap with the middle group.
                b[4] = true;
                b[5] = true;
            }

            // Family in seats 4, 5, 6, 7
            if (!b[4] && !b[5] && !b[6] && !b[7]) {
                ans++;

                // Seats 6 and 7 overlap with the right group.
                b[6] = true;
                b[7] = true;
            }

            // Family in seats 6, 7, 8, 9
            if (!b[6] && !b[7] && !b[8] && !b[9]) {
                ans++;
            }

            count++;
        }

        // Rows with no reserved seats can fit 2 families each.
        ans += 2 * (n - count);

        return ans;
    }
}