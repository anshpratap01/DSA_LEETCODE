class Solution {
    public int countPalindromicSubsequence(String s) {
        int a = 0;
        for(char b = 'a'; b <= 'z'; b++) {
            int c = s.indexOf(b);
            int d = s.lastIndexOf(b);
            
            if(c != -1 && d != -1 && c < d) {
                Set<Character> e = new HashSet<>();
                for(int f = c + 1; f < d; f++) {
                    e.add(s.charAt(f));
                }
                a += e.size();
            }
        }
        return a;
    }
}