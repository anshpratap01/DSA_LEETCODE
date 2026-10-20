
class Solution {
    public String removeDuplicateLetters(String s) {
        int[] last = new int[26];
        boolean[] seen = new boolean[26];

        for (int i = 0; i < s.length(); i++) {
            last[s.charAt(i) - 'a'] = i;
        }

        StringBuilder st = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int idx = ch - 'a';

            if (seen[idx]) {
                continue;
            }

            while (st.length() > 0
                    && st.charAt(st.length() - 1) > ch
                    && last[st.charAt(st.length() - 1) - 'a'] > i) {

                seen[st.charAt(st.length() - 1) - 'a'] = false;
                st.deleteCharAt(st.length() - 1);
            }

            st.append(ch);
            seen[idx] = true;
        }

        return st.toString();
    }
}
