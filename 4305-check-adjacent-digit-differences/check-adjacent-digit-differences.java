class Solution {
    public boolean isAdjacentDiffAtMostTwo(String s) {

        int n = s.length();
        for(int i = 1; i<n; i++){
            int s1 = s.charAt(i-1) - '0';
            int s2 = s.charAt(i) - '0';

            int diff = Math.abs(s1-s2);
            if(diff > 2){
                return false;
            }
            
        }
        return true;
        
    }
}