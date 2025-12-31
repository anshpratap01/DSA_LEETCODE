import java.util.*;

class Solution {
    public int latestDayToCross(int row, int col, int[][] cells) {
        int l = 1, r = cells.length, ans = 0;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (canCross(row, col, mid, cells)) {
                ans = mid;
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return ans;
    }

    private boolean canCross(int r, int c, int d, int[][] cells) {
        int[][] g = new int[r][c];
        for (int i = 0; i < d; i++) g[cells[i][0] - 1][cells[i][1] - 1] = 1;
        
        Queue<int[]> q = new LinkedList<>();
        for (int j = 0; j < c; j++) {
            if (g[0][j] == 0) {
                q.offer(new int[]{0, j});
                g[0][j] = 1; 
            }
        }

        int[] dir = {0, 1, 0, -1, 0};
        while (!q.isEmpty()) {
            int[] cur = q.poll();
            if (cur[0] == r - 1) return true;
            
            for (int i = 0; i < 4; i++) {
                int nr = cur[0] + dir[i], nc = cur[1] + dir[i + 1];
                if (nr >= 0 && nr < r && nc >= 0 && nc < c && g[nr][nc] == 0) {
                    g[nr][nc] = 1;
                    q.offer(new int[]{nr, nc});
                }
            }
        }
        return false;
    }
}