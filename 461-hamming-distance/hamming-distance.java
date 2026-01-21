class Solution {
    public int hammingDistance(int x, int y) {
        int s = x^y;
        int cnt = 0;
        for(int i = 0; i<32;i++){
            if((s&(1<<i)) != 0) cnt++;
        }
        return cnt;
        
    }
}