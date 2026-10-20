class Solution {
    public String smallestSubsequence(String s) {
         int[] last = new int[26];

        for (int i = 0; i < s.length(); i++) {
            last[s.charAt(i) - 'a'] = i;
        }

        Stack<Character> st = new Stack<>();
        HashSet<Character> set = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (set.contains(ch)) {
                continue;
            }

            while (!st.isEmpty()
                    && st.peek() > ch
                    && last[st.peek() - 'a'] > i) {
                set.remove(st.pop());
            }

            st.push(ch);
            set.add(ch);
        }

        StringBuilder ans = new StringBuilder();

        for (char c : st) {
            ans.append(c);
        }

        return ans.toString();
        
    }
}