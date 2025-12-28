class Solution {
    public int countNegatives(int[][] g) {
        int cnt = 0;
        for(int i = 0; i<g.length; i++){
            for(int j = 0; j<g[0].length; j++){
                if(g[i][j] < 0){
                    cnt++;
                }
            }
        }
        return cnt;
        
    }
}