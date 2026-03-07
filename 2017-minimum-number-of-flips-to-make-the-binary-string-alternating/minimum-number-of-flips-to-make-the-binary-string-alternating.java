class Solution {
    public int minFlips(String s) {
        int n = s.length();
        
        int[][] counts = new int[2][2]; 
        
        for (int i = 0; i < n; i++) {
            counts[i % 2][s.charAt(i) - '0']++;
        }
        
        
        int ans = Math.min(counts[0][1] + counts[1][0], counts[0][0] + counts[1][1]);
        
        
        if (n % 2 == 0) return ans;

        
        for (int i = 0; i < n; i++) {
            int val = s.charAt(i) - '0';
           
            counts[i % 2][val]--;
            
            
            counts[(i + n) % 2][val]++;
            
           
            int currentFlips = Math.min(counts[0][1] + counts[1][0], 
                                        counts[0][0] + counts[1][1]);
            ans = Math.min(ans, currentFlips);
        }
        
        return ans;
    }
}