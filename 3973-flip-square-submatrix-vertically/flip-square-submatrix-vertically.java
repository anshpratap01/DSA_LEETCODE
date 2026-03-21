class Solution {
    public int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {
        for (int i = 0; i < k / 2; i++) {
            int topRow = x + i;
            int bottomRow = x + k - 1 - i;
            
            // Un rows ke columns (y se y + k - 1) par iterate karenge
            for (int j = 0; j < k; j++) {
                int col = y + j;
                
                // Elements ko swap karenge top aur bottom rows ke beech
                int temp = grid[topRow][col];
                grid[topRow][col] = grid[bottomRow][col];
                grid[bottomRow][col] = temp;
            }
        }
        
        return grid;
        
    }
}