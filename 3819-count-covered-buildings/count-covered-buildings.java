class Solution {
    public int countCoveredBuildings(int n, int[][] buildings) {
        int[] minColInRow = new int[n + 1];
        int[] maxColInRow = new int[n + 1];
        int[] minRowInCol = new int[n + 1];
        int[] maxRowInCol = new int[n + 1];

        Arrays.fill(minColInRow, Integer.MAX_VALUE);
        Arrays.fill(maxColInRow, Integer.MIN_VALUE);
        Arrays.fill(minRowInCol, Integer.MAX_VALUE);
        Arrays.fill(maxRowInCol, Integer.MIN_VALUE);

        for (int[] b : buildings) {
            int r = b[0];
            int c = b[1];

            if (c < minColInRow[r]) minColInRow[r] = c;
            if (c > maxColInRow[r]) maxColInRow[r] = c;

            if (r < minRowInCol[c]) minRowInCol[c] = r;
            if (r > maxRowInCol[c]) maxRowInCol[c] = r;
        }

        int count = 0;

        for (int[] b : buildings) {
            int r = b[0];
            int c = b[1];

            boolean hasLeft = c > minColInRow[r];
            boolean hasRight = c < maxColInRow[r];
            boolean hasAbove = r > minRowInCol[c];
            boolean hasBelow = r < maxRowInCol[c];

            if (hasLeft && hasRight && hasAbove && hasBelow) {
                count++;
            }
        }

        return count;
        
    }
}