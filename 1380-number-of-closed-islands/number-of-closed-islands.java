class Solution {
    public int closedIsland(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        boolean visited[][] = new boolean[n][m];
        int count = 0;
        int dx[] = {0, 1, 0, -1};
        int dy[] = {1, 0, -1, 0};
        for(int i = 1; i < n-1; i++)
        {
            for(int j = 1; j < m-1; j++)
            {
                if(!visited[i][j] && grid[i][j] == 0)
                {
                    boolean flag[] = {true};
                    for(int k = 0; k < 4; k++)
                        dfs(i, j, visited, grid, k, dx, dy, n, m, flag);
                    if(flag[0])
                        count++;
                }
            }
        }
        return count;
    }

    public void dfs(int i, int j, boolean visited[][], int grid[][], int k, int dx[], int dy[], int n, int m, boolean flag[])
    {
        visited[i][j] = true;

        if(k >= 4)
            return;

        int ni = i+dy[k];
        int nj = j+dx[k];

        if(ni < 0 || ni >= n || nj < 0 || nj >= m)
            return;

        if(grid[ni][nj] == 1)
            return;

        if(visited[ni][nj])
            return;

        if(ni == 0 || ni == n-1 || nj == 0 || nj == m-1)
            flag[0] = false;

        for(int d = 0; d < 4; d++)
            dfs(ni, nj, visited, grid, d, dx, dy, n, m, flag);
    }
}