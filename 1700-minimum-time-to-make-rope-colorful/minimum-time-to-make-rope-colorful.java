class Solution {
    public int minCost(String colors, int[] time) {
        char s[] = colors.toCharArray();
        int n = s.length;
        int sum = 0;
        int min = Integer.MAX_VALUE;

        for(int i = 1;i<n;i++){
            char c = s[i-1];
            if( c == s[i]){
                min = Math.min(time[i-1],time[i]);
                sum = sum+min;
                time[i] = Math.max(time[i], time[i - 1]);
            }
        }
        return sum;
        
    }
}