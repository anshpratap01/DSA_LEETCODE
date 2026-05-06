class Solution {
    public char[][] rotateTheBox(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        char[][] newGrid = new char[n][m];

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                newGrid[j][m-i-1] = grid[i][j];
            }
        }
        m = newGrid.length;
        n = newGrid[0].length;
        for(int i = m-1; i >= 0; i--){
            for(int j = 0; j < n; j++){
                int temp = i;
                if(newGrid[i][j] == '#'){
                    
                    while(temp < m-1 && (newGrid[temp+1][j] != '*' && newGrid[temp+1][j] != '#')){
                        temp++;
                    }
                    if(temp != i){
                     newGrid[temp][j] = '#';
                    newGrid[i][j] = '.';   
                    }
                    
                }
            }
        }

        return newGrid;
    }
}