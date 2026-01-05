class Solution {
    public long maxMatrixSum(int[][] matrix) {
        int n = matrix.length, 
            smallestNumber = Integer.MAX_VALUE, 
            totalNegatives = 0;
        long sumOfMatrix = 0;

       

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int cell = matrix[i][j];

                if (cell < 0) {
                    cell *= (-1);
                    totalNegatives++;
                }

                
                smallestNumber = min(smallestNumber, cell);

                sumOfMatrix += cell;
            }
        }
        
        if (totalNegatives % 2 == 0) {
            
            return sumOfMatrix;
        }

        
        return sumOfMatrix - smallestNumber - smallestNumber;
    }

    public int min(int a, int b) {
        return a < b ? a : b;
    }
}