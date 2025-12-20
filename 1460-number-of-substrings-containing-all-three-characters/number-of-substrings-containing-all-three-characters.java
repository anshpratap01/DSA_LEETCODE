class Solution {
    public int numberOfSubstrings(String s) {

        int i = 0;
        int cnt = 0;
        int n = s.length();
        HashMap<Character, Integer> mp = new HashMap<>();

        for (int j = 0; j < s.length(); j++) {

            char ch = s.charAt(j);
            mp.put(ch, mp.getOrDefault(ch, 0) + 1);

            
            while (mp.getOrDefault('a', 0) > 0 &&
                   mp.getOrDefault('b', 0) > 0 &&
                   mp.getOrDefault('c', 0) > 0) {

                cnt += n - j;

                char left = s.charAt(i);
                mp.put(left, mp.get(left) - 1);
                i++;
            }
        }

        return cnt;
    }
}
