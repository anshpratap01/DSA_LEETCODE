class Solution {
    public int[][] rangeAddQueries(int n, int[][] queries) {
        int arr[][] = new int[n][n];
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                arr[i][j] = 0;
            }
        }

        for(int q[] : queries){
            int r1 = q[0];
            int c1 = q[1];
            int r2 = q[2];
            int c2 = q[3];

        for (int i = r1; i <= r2; i++) {
        for (int j = c1; j <= c2; j++) {
            arr[i][j] = arr[i][j] + 1;
        }
        }
        
        
    }
    return arr;
}
}