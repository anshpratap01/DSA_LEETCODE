class Solution {
    public int countCollisions(String d) {
        int l = 0, r = d.length() - 1, c = 0;
        
        while (l <= r && d.charAt(l) == 'L') {
            l++;
        }
        
        while (r >= l && d.charAt(r) == 'R') {
            r--;
        }
        
        for (int i = l; i <= r; i++) {
            if (d.charAt(i) != 'S') {
                c++;
            }
        }
        
        return c;
        
    }
}