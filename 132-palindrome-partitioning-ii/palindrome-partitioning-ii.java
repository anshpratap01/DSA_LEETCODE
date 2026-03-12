class Solution {
     int dp[][];
    
    public  boolean ispalindrom(char ch[], int i, int j) {
        while(i < j) {
            if(ch[i] != ch[j]) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    
    public  int solve(char ch[], int i, int j) {
        if(i >= j) return 0;
        
        if(ispalindrom(ch, i, j)) {
            return 0;
        }
        
        if(dp[i][j] != -1) {
            return dp[i][j];
        }
        
        int min = Integer.MAX_VALUE;
        
        for(int k = i; k <= j - 1; k++) {
            // OPTIMIZATION: Sirf aage badho agar left part (i to k) palindrome hai
            if(ispalindrom(ch, i, k)) {
                int right;

                // Hum sirf right part calculate karenge kyunki left part already palindrome hai
                if(dp[k + 1][j] != -1) {
                    right = dp[k + 1][j];
                } else {
                    right = solve(ch, k + 1, j);
                    dp[k + 1][j] = right;
                }

                // Total cuts = 1 (current cut at k) + right cuts 
                // (Left cuts 0 hain kyunki wo palindrome hai)
                int temp = 1 + right;

                min = Math.min(min, temp);
            }
        }
        
        dp[i][j] = min;
        return dp[i][j];
    }
    public int minCut(String s) {
        int i = 0;
        int j = s.length() - 1;
        char ch[] = s.toCharArray();
        dp = new int[s.length()][s.length()];
        
        for(int ii = 0; ii < s.length(); ii++) {
            for(int jj = 0; jj < s.length(); jj++) {
                dp[ii][jj] = -1;
            }
        }
        
        int cut = solve(ch, i, j);
        return cut;
        
    }
}