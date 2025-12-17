class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i = 0;
        int j = 0;
        int max = 0;
        HashMap<Character,Integer> mp = new HashMap<>();

        while (j < s.length()) {
            char ch = s.charAt(j);
            mp.put(ch, 1 + mp.getOrDefault(ch, 0));

            
            while (mp.size() < j - i + 1) {
                char left = s.charAt(i);
                mp.put(left, mp.get(left) - 1);
                if (mp.get(left) == 0) {
                    mp.remove(left);
                }
                i++;
            }
            
             if (mp.size() == j - i + 1) {
                max = Math.max(max, j - i + 1);
                j++;
            }
        }
        return max;
    }
}
