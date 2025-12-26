class Solution {
    public int bestClosingTime(String s) {
        int y = 0;
        for (char c : s.toCharArray()) {
        if (c == 'Y') y++;
        }

        int p = y; 
        int m = y; 
        int a = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'Y') p--;
            else p++;
            if (p < m) {
                m = p;
                a = i + 1;
            }
        }
        return a;
    }
}
