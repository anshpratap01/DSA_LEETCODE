import java.util.*;

class Solution {

    public void markGuarded(int row, int col, int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        // Up
        for (int i = row - 1; i >= 0; i--) {
            if (grid[i][col] == 2 || grid[i][col] == 3) break;
            grid[i][col] = 1; // Mark as guarded
        }

        // Down
        for (int i = row + 1; i < m; i++) {
            if (grid[i][col] == 2 || grid[i][col] == 3) break;
            grid[i][col] = 1;
        }

        // Left
        for (int j = col - 1; j >= 0; j--) {
            if (grid[row][j] == 2 || grid[row][j] == 3) break;
            grid[row][j] = 1;
        }

        // Right
        for (int j = col + 1; j < n; j++) {
            if (grid[row][j] == 2 || grid[row][j] == 3) break;
            grid[row][j] = 1;
        }
    }

    public int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
        int[][] grid = new int[m][n];

        // Mark guard positions
        for (int[] vec : guards) {
            int i = vec[0], j = vec[1];
            grid[i][j] = 2; // guard
        }

        // Mark wall positions
        for (int[] vec : walls) {
            int i = vec[0], j = vec[1];
            grid[i][j] = 3; // wall
        }

        // Mark all guarded areas
        for (int[] guard : guards) {
            int i = guard[0], j = guard[1];
            markGuarded(i, j, grid);
        }

        // Count unguarded cells
        int count = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 0) count++;
            }
        }

        return count;
    }
}