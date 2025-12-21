class Solution {
    
    public int mirrorDistance(int n) {

        int rev = 0;
        int original = n;

        while(n>0){
            int d = n%10;
            rev = rev*10+d;
            n= n/10;
        }

        int ans = Math.abs(original-rev);
        return ans;
        
    }
}