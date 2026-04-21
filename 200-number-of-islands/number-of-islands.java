class Solution {
    class pair{
        int row;
        int col;
        pair(int row , int col){
            this.row = row;
            this.col = col;
        }
    }

    public void bfs(int i , int j, char grid[][] , boolean visited[][]){
        int n = grid.length;
        int m = grid[0].length;
        Queue<pair> q = new LinkedList<>();
        q.add(new pair(i,j));
        visited[i][j] = true;

        while(q.size() > 0){
            pair front = q.remove();
            int row = front.row;
            int col = front.col;

            //top
            if(row>0){
                if(visited[row-1][col] == false && grid[row-1][col] == '1'){
                    q.add(new pair(row-1 , col));
                    visited[row-1][col] = true;
                }
            }
            // bottom
            if(row+1 < n){
                if(visited[row+1][col] == false && grid[row+1][col] == '1'){
                    q.add(new pair(row+1 , col));
                    visited[row+1][col] = true;
                }
            }
            // left
            if(col-1 >= 0){
                if(visited[row][col-1] == false && grid[row][col-1] == '1'){
                    q.add(new pair(row , col-1));
                    visited[row][col-1] = true;
                }
            }
            // right
            if(col+1 < m){
                if(visited[row][col+1] == false && grid[row][col+1] == '1'){
                    q.add(new pair(row , col+1));
                    visited[row][col+1] = true;
                }
            }


        }

    }
    public int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int cnt = 0;
        boolean visited[][] = new boolean[n][m];
        for(int i = 0; i<n; i++){
            for(int j= 0; j<m; j++){
                if(grid[i][j] == '1' && visited[i][j] == false){
                    bfs(i ,j ,grid , visited);
                    cnt++;
                }
            }
        }
        return cnt;

        
    }
}